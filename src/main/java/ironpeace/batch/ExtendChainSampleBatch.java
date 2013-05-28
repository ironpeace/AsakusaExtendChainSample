package ironpeace.batch;

import ironpeace.jobflow.ExtendChainSampleJobFlow;

import com.asakusafw.vocabulary.batch.Batch;
import com.asakusafw.vocabulary.batch.BatchDescription;

@Batch(name="ecsBatch")
public class ExtendChainSampleBatch extends BatchDescription {

	@Override
	protected void describe() {
		run(ExtendChainSampleJobFlow.class).soon();
	}

}
