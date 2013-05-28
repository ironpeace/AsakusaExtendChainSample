package ironpeace.operator;
import com.asakusafw.vocabulary.flow.Operator;
import com.asakusafw.vocabulary.flow.Source;
import com.asakusafw.vocabulary.flow.graph.FlowElementResolver;
import com.asakusafw.vocabulary.flow.graph.ObservationCount;
import com.asakusafw.vocabulary.flow.graph.OperatorDescription;
import com.asakusafw.vocabulary.operator.Convert;
import ironpeace.modelgen.dmdl.model.Middata1;
import ironpeace.modelgen.dmdl.model.Middata2;
import ironpeace.modelgen.dmdl.model.Result;
import javax.annotation.Generated;
/**
 * {@link ExtendChainSampleOperator}に関する演算子ファクトリークラス。
 * @see ExtendChainSampleOperator
 */
@Generated("OperatorFactoryClassGenerator:0.0.1") public class ExtendChainSampleOperatorFactory {
    /**
     */
    public static final class Convert1 implements Operator {
        private final FlowElementResolver $;
        /**
         * 入力された内容
         */
        public final Source<Middata1> original;
        /**
         */
        public final Source<Middata1> out;
        Convert1(Source<Middata1> mid1) {
            OperatorDescription.Builder builder = new OperatorDescription.Builder(Convert.class);
            builder.declare(ExtendChainSampleOperator.class, ExtendChainSampleOperatorImpl.class, "convert1");
            builder.declareParameter(Middata1.class);
            builder.addInput("mid1", mid1);
            builder.addOutput("original", mid1);
            builder.addOutput("out", Middata1.class);
            builder.addAttribute(ObservationCount.DONT_CARE);
            this.$ = builder.toResolver();
            this.$.resolveInput("mid1", mid1);
            this.original = this.$.resolveOutput("original");
            this.out = this.$.resolveOutput("out");
        }
        /**
         * この演算子の名前を設定する。
         * @param newName 設定する名前
         * @return この演算子オブジェクト (this)
         * @throws IllegalArgumentException 引数に{@code null}が指定された場合
         */
        public ExtendChainSampleOperatorFactory.Convert1 as(String newName) {
            this.$.setName(newName);
            return this;
        }
    }
    /**
     * @param mid1
     * @return 生成した演算子オブジェクト
     * @see ExtendChainSampleOperator#convert1(Middata1)
     */
    public ExtendChainSampleOperatorFactory.Convert1 convert1(Source<Middata1> mid1) {
        return new ExtendChainSampleOperatorFactory.Convert1(mid1);
    }
    /**
     */
    public static final class Convert2 implements Operator {
        private final FlowElementResolver $;
        /**
         * 入力された内容
         */
        public final Source<Middata2> original;
        /**
         */
        public final Source<Result> out;
        Convert2(Source<Middata2> mid2) {
            OperatorDescription.Builder builder0 = new OperatorDescription.Builder(Convert.class);
            builder0.declare(ExtendChainSampleOperator.class, ExtendChainSampleOperatorImpl.class, "convert2");
            builder0.declareParameter(Middata2.class);
            builder0.addInput("mid2", mid2);
            builder0.addOutput("original", mid2);
            builder0.addOutput("out", Result.class);
            builder0.addAttribute(ObservationCount.DONT_CARE);
            this.$ = builder0.toResolver();
            this.$.resolveInput("mid2", mid2);
            this.original = this.$.resolveOutput("original");
            this.out = this.$.resolveOutput("out");
        }
        /**
         * この演算子の名前を設定する。
         * @param newName0 設定する名前
         * @return この演算子オブジェクト (this)
         * @throws IllegalArgumentException 引数に{@code null}が指定された場合
         */
        public ExtendChainSampleOperatorFactory.Convert2 as(String newName0) {
            this.$.setName(newName0);
            return this;
        }
    }
    /**
     * @param mid2
     * @return 生成した演算子オブジェクト
     * @see ExtendChainSampleOperator#convert2(Middata2)
     */
    public ExtendChainSampleOperatorFactory.Convert2 convert2(Source<Middata2> mid2) {
        return new ExtendChainSampleOperatorFactory.Convert2(mid2);
    }
}