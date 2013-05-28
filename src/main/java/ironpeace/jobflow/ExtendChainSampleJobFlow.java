package ironpeace.jobflow;

import ironpeace.modelgen.dmdl.model.Middata1;
import ironpeace.modelgen.dmdl.model.Middata2;
import ironpeace.modelgen.dmdl.model.OriginalData;
import ironpeace.modelgen.dmdl.model.Result;
import ironpeace.operator.ExtendChainSampleOperatorFactory;
import ironpeace.operator.ExtendChainSampleOperatorFactory.UpdatedMid1;
import ironpeace.operator.ExtendChainSampleOperatorFactory.UpdatedMid2;

import com.asakusafw.vocabulary.flow.Export;
import com.asakusafw.vocabulary.flow.FlowDescription;
import com.asakusafw.vocabulary.flow.Import;
import com.asakusafw.vocabulary.flow.In;
import com.asakusafw.vocabulary.flow.JobFlow;
import com.asakusafw.vocabulary.flow.Out;
import com.asakusafw.vocabulary.flow.util.CoreOperatorFactory;
import com.asakusafw.vocabulary.flow.util.CoreOperatorFactory.Extend;
import com.asakusafw.vocabulary.flow.util.CoreOperatorFactory.Project;

@JobFlow(name="TheExtendChainSampleJobFlow")
public class ExtendChainSampleJobFlow extends FlowDescription {

	final In<OriginalData> originaldata;
	final Out<Result> result;
	final CoreOperatorFactory coreOp = new CoreOperatorFactory();
	
	public ExtendChainSampleJobFlow(
			@Import(name="orignaldata", description=OriginaldataFromCsv.class)
			In<OriginalData> originaldata,
			@Export(name="result", description=ResultToCsv.class)
			Out<Result> result
			) {
		this.originaldata = originaldata;
		this.result = result;
	}

	@Override
	protected void describe() {
		ExtendChainSampleOperatorFactory op
			= new ExtendChainSampleOperatorFactory();
		
		Extend<Middata1> mid1
			= coreOp.extend(originaldata, Middata1.class);
		
		UpdatedMid1 updatedMid1 = op.updatedMid1(mid1);

		Extend<Middata2> mid2
			= coreOp.extend(updatedMid1.out, Middata2.class);
		
		UpdatedMid2 updatedMid2 = op.updatedMid2(mid2);
		
		Project<Result> ret
			= coreOp.project(updatedMid2.out, Result.class);
		
		result.add(ret);
	}
}
