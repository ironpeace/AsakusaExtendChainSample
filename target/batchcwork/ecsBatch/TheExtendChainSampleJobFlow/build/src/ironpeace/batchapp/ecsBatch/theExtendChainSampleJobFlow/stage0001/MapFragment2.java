package ironpeace.batchapp.ecsBatch.theExtendChainSampleJobFlow.stage0001;
import com.asakusafw.runtime.core.Result;
import ironpeace.modelgen.dmdl.model.Middata1;
import ironpeace.modelgen.dmdl.model.Middata2;
import ironpeace.operator.ExtendChainSampleOperatorImpl;
/**
 * {@code [in->extend(operator#3975755)]}の処理を担当するマッププログラムの断片。
 */
@SuppressWarnings("deprecation") public final class MapFragment2 implements Result<Middata1> {
    private final Result<Middata2> original;
    private final Result<ironpeace.modelgen.dmdl.model.Result> out;
    private Middata2 cache = new Middata2();
    private ExtendChainSampleOperatorImpl op = new ExtendChainSampleOperatorImpl();
    /**
     * インスタンスを生成する。
     * @param original {@code ExtendChainSampleOperator.convert2#original}への出力
     * @param out {@code ExtendChainSampleOperator.convert2#out}への出力
     */
    public MapFragment2(Result<Middata2> original, Result<ironpeace.modelgen.dmdl.model.Result> out) {
        this.original = original;
        this.out = out;
    }
    @Override public void add(Middata1 result) {
        this.cache.reset();
        this.cache.setData21Option(result.getData21Option());
        this.cache.setData20Option(result.getData20Option());
        this.cache.setData11Option(result.getData11Option());
        this.cache.setData10Option(result.getData10Option());
        this.cache.setMid2Option(result.getMid2Option());
        this.cache.setMid1Option(result.getMid1Option());
        this.cache.setUseridOption(result.getUseridOption());
        ironpeace.modelgen.dmdl.model.Result v = this.op.convert2(this.cache);
        this.original.add(this.cache);
        this.out.add(v);
    }
}