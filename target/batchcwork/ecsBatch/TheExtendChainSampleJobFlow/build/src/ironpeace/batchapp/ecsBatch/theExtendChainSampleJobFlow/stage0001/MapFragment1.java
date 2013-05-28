package ironpeace.batchapp.ecsBatch.theExtendChainSampleJobFlow.stage0001;
import com.asakusafw.runtime.core.Result;
import ironpeace.modelgen.dmdl.model.Middata1;
import ironpeace.modelgen.dmdl.model.OriginalData;
import ironpeace.operator.ExtendChainSampleOperatorImpl;
/**
 * {@code [in->extend(operator#263851830)]}の処理を担当するマッププログラムの断片。
 */
@SuppressWarnings("deprecation") public final class MapFragment1 implements Result<OriginalData> {
    private final Result<Middata1> original;
    private final Result<Middata1> out;
    private Middata1 cache = new Middata1();
    private ExtendChainSampleOperatorImpl op = new ExtendChainSampleOperatorImpl();
    /**
     * インスタンスを生成する。
     * @param original {@code ExtendChainSampleOperator.convert1#original}への出力
     * @param out {@code ExtendChainSampleOperator.convert1#out}への出力
     */
    public MapFragment1(Result<Middata1> original, Result<Middata1> out) {
        this.original = original;
        this.out = out;
    }
    @Override public void add(OriginalData result) {
        this.cache.reset();
        this.cache.setData21Option(result.getData21Option());
        this.cache.setData20Option(result.getData20Option());
        this.cache.setData11Option(result.getData11Option());
        this.cache.setData10Option(result.getData10Option());
        this.cache.setUseridOption(result.getUseridOption());
        Middata1 v = this.op.convert1(this.cache);
        this.original.add(this.cache);
        this.out.add(v);
    }
}