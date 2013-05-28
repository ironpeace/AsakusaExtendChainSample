package ironpeace.operator;
import com.asakusafw.vocabulary.flow.Operator;
import com.asakusafw.vocabulary.flow.Source;
import com.asakusafw.vocabulary.flow.graph.FlowElementResolver;
import com.asakusafw.vocabulary.flow.graph.ObservationCount;
import com.asakusafw.vocabulary.flow.graph.OperatorDescription;
import com.asakusafw.vocabulary.operator.Update;
import ironpeace.modelgen.dmdl.model.Middata1;
import ironpeace.modelgen.dmdl.model.Middata2;
import javax.annotation.Generated;
/**
 * {@link ExtendChainSampleOperator}に関する演算子ファクトリークラス。
 * @see ExtendChainSampleOperator
 */
@Generated("OperatorFactoryClassGenerator:0.0.1") public class ExtendChainSampleOperatorFactory {
    /**
     */
    public static final class UpdatedMid1 implements Operator {
        private final FlowElementResolver $;
        /**
         * 結果
         */
        public final Source<Middata1> out;
        UpdatedMid1(Source<Middata1> mid1) {
            OperatorDescription.Builder builder = new OperatorDescription.Builder(Update.class);
            builder.declare(ExtendChainSampleOperator.class, ExtendChainSampleOperatorImpl.class, "updatedMid1");
            builder.declareParameter(Middata1.class);
            builder.addInput("mid1", mid1);
            builder.addOutput("out", mid1);
            builder.addAttribute(ObservationCount.DONT_CARE);
            this.$ = builder.toResolver();
            this.$.resolveInput("mid1", mid1);
            this.out = this.$.resolveOutput("out");
        }
        /**
         * この演算子の名前を設定する。
         * @param newName 設定する名前
         * @return この演算子オブジェクト (this)
         * @throws IllegalArgumentException 引数に{@code null}が指定された場合
         */
        public ExtendChainSampleOperatorFactory.UpdatedMid1 as(String newName) {
            this.$.setName(newName);
            return this;
        }
    }
    /**
     * @param mid1
     * @return 生成した演算子オブジェクト
     * @see ExtendChainSampleOperator#updatedMid1(Middata1)
     */
    public ExtendChainSampleOperatorFactory.UpdatedMid1 updatedMid1(Source<Middata1> mid1) {
        return new ExtendChainSampleOperatorFactory.UpdatedMid1(mid1);
    }
    /**
     */
    public static final class UpdatedMid2 implements Operator {
        private final FlowElementResolver $;
        /**
         * 結果
         */
        public final Source<Middata2> out;
        UpdatedMid2(Source<Middata2> mid2) {
            OperatorDescription.Builder builder0 = new OperatorDescription.Builder(Update.class);
            builder0.declare(ExtendChainSampleOperator.class, ExtendChainSampleOperatorImpl.class, "updatedMid2");
            builder0.declareParameter(Middata2.class);
            builder0.addInput("mid2", mid2);
            builder0.addOutput("out", mid2);
            builder0.addAttribute(ObservationCount.DONT_CARE);
            this.$ = builder0.toResolver();
            this.$.resolveInput("mid2", mid2);
            this.out = this.$.resolveOutput("out");
        }
        /**
         * この演算子の名前を設定する。
         * @param newName0 設定する名前
         * @return この演算子オブジェクト (this)
         * @throws IllegalArgumentException 引数に{@code null}が指定された場合
         */
        public ExtendChainSampleOperatorFactory.UpdatedMid2 as(String newName0) {
            this.$.setName(newName0);
            return this;
        }
    }
    /**
     * @param mid2
     * @return 生成した演算子オブジェクト
     * @see ExtendChainSampleOperator#updatedMid2(Middata2)
     */
    public ExtendChainSampleOperatorFactory.UpdatedMid2 updatedMid2(Source<Middata2> mid2) {
        return new ExtendChainSampleOperatorFactory.UpdatedMid2(mid2);
    }
}