package ironpeace.batchapp.ecsBatch.theExtendChainSampleJobFlow.stage0001;
import com.asakusafw.runtime.core.Result;
import ironpeace.modelgen.dmdl.model.Middata1;
import ironpeace.modelgen.dmdl.model.Middata2;
import ironpeace.modelgen.dmdl.model.OriginalData;
import ironpeace.operator.ExtendChainSampleOperatorImpl;
/**
 * {@code [in->extend(operator#2057870563)]}の処理を担当するマッププログラムの断片。
 */
@SuppressWarnings("deprecation") public final class MapFragment1 implements Result<OriginalData> {
    private final Result<ironpeace.modelgen.dmdl.model.Result> out;
    private Middata1 cache = new Middata1();
    private ExtendChainSampleOperatorImpl op = new ExtendChainSampleOperatorImpl();
    private Middata2 cache0 = new Middata2();
    private ExtendChainSampleOperatorImpl op0 = new ExtendChainSampleOperatorImpl();
    private ironpeace.modelgen.dmdl.model.Result cache1 = new ironpeace.modelgen.dmdl.model.Result();
    /**
     * インスタンスを生成する。
     * @param out {@code project#out}への出力
     */
    public MapFragment1(Result<ironpeace.modelgen.dmdl.model.Result> out) {
        this.out = out;
    }
    @Override public void add(OriginalData result) {
        this.cache.reset();
        this.cache.setData21Option(result.getData21Option());
        this.cache.setData20Option(result.getData20Option());
        this.cache.setData11Option(result.getData11Option());
        this.cache.setData10Option(result.getData10Option());
        this.cache.setUseridOption(result.getUseridOption());
        this.op.updatedMid1(this.cache);
        this.cache0.reset();
        this.cache0.setData21Option(this.cache.getData21Option());
        this.cache0.setData20Option(this.cache.getData20Option());
        this.cache0.setData11Option(this.cache.getData11Option());
        this.cache0.setData10Option(this.cache.getData10Option());
        this.cache0.setMid2Option(this.cache.getMid2Option());
        this.cache0.setMid1Option(this.cache.getMid1Option());
        this.cache0.setUseridOption(this.cache.getUseridOption());
        this.op0.updatedMid2(this.cache0);
        this.cache1.reset();
        this.cache1.setData21Option(this.cache0.getData21Option());
        this.cache1.setData20Option(this.cache0.getData20Option());
        this.cache1.setData11Option(this.cache0.getData11Option());
        this.cache1.setData10Option(this.cache0.getData10Option());
        this.cache1.setMid2Option(this.cache0.getMid2Option());
        this.cache1.setAlertOption(this.cache0.getAlertOption());
        this.cache1.setMid1Option(this.cache0.getMid1Option());
        this.cache1.setUseridOption(this.cache0.getUseridOption());
        this.out.add(this.cache1);
    }
}