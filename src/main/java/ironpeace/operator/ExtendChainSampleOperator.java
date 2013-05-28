package ironpeace.operator;

import ironpeace.modelgen.dmdl.model.Middata1;
import ironpeace.modelgen.dmdl.model.Middata2;
import ironpeace.modelgen.dmdl.model.Result;

import com.asakusafw.vocabulary.operator.Convert;

public abstract class ExtendChainSampleOperator {
	@Convert
	public Middata1 convert1(Middata1 mid1){
		Middata1 ret = mid1;
		ret.setMid1(mid1.getData10() + mid1.getData20());
		ret.setMid2(mid1.getData11() + mid1.getData21());
		return ret;
	}
	
	@Convert
	public Result convert2(Middata2 mid2){
		Result result = new Result();
		if(mid2.getMid1() > mid2.getMid2()){
			result.setAlertAsString("A");
		}else{
			result.setAlertAsString("B");
		}
		return result;
	}

}
