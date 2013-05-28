package ironpeace.operator;

import ironpeace.modelgen.dmdl.model.Middata1;
import ironpeace.modelgen.dmdl.model.Middata2;

import com.asakusafw.vocabulary.operator.Update;

public abstract class ExtendChainSampleOperator {
	
	@Update
	public void updatedMid1(Middata1 mid1){
		mid1.setMid1(mid1.getData10() + mid1.getData20());
		mid1.setMid2(mid1.getData11() + mid1.getData21());
	}
	
	@Update
	public void updatedMid2(Middata2 mid2){
		if(mid2.getMid1() > mid2.getMid2()){
			mid2.setAlertAsString("A");
		}else{
			mid2.setAlertAsString("B");
		}
	}
}
