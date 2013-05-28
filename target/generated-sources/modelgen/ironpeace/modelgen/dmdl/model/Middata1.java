package ironpeace.modelgen.dmdl.model;
import com.asakusafw.runtime.model.DataModel;
import com.asakusafw.runtime.model.DataModelKind;
import com.asakusafw.runtime.model.ModelInputLocation;
import com.asakusafw.runtime.model.ModelOutputLocation;
import com.asakusafw.runtime.model.PropertyOrder;
import com.asakusafw.runtime.value.LongOption;
import com.asakusafw.runtime.value.StringOption;
import ironpeace.modelgen.dmdl.io.Middata1Input;
import ironpeace.modelgen.dmdl.io.Middata1Output;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
/**
 * middata1を表すデータモデルクラス。
 */
@DataModelKind("DMDL")@ModelInputLocation(Middata1Input.class)@ModelOutputLocation(Middata1Output.class)@PropertyOrder({
            "userid", "data1_0", "data1_1", "data2_0", "data2_1", "mid1", "mid2"}) public class Middata1 implements 
        DataModel<Middata1>, Writable {
    private final StringOption userid = new StringOption();
    private final LongOption data10 = new LongOption();
    private final LongOption data11 = new LongOption();
    private final LongOption data20 = new LongOption();
    private final LongOption data21 = new LongOption();
    private final LongOption mid1 = new LongOption();
    private final LongOption mid2 = new LongOption();
    @Override@SuppressWarnings("deprecation") public void reset() {
        this.userid.setNull();
        this.data10.setNull();
        this.data11.setNull();
        this.data20.setNull();
        this.data21.setNull();
        this.mid1.setNull();
        this.mid2.setNull();
    }
    @Override@SuppressWarnings("deprecation") public void copyFrom(Middata1 other) {
        this.userid.copyFrom(other.userid);
        this.data10.copyFrom(other.data10);
        this.data11.copyFrom(other.data11);
        this.data20.copyFrom(other.data20);
        this.data21.copyFrom(other.data21);
        this.mid1.copyFrom(other.mid1);
        this.mid2.copyFrom(other.mid2);
    }
    /**
     * useridを返す。
     * @return userid
     * @throws NullPointerException useridの値が<code>null</code>である場合
     */
    public Text getUserid() {
        return this.userid.get();
    }
    /**
     * useridを設定する。
     * @param value 設定する値
     */
    @SuppressWarnings("deprecation") public void setUserid(Text value) {
        this.userid.modify(value);
    }
    /**
     * <code>null</code>を許すuseridを返す。
     * @return userid
     */
    public StringOption getUseridOption() {
        return this.userid;
    }
    /**
     * useridを設定する。
     * @param option 設定する値、<code>null</code>の場合にはこのプロパティが<code>null</code>を表すようになる
     */
    @SuppressWarnings("deprecation") public void setUseridOption(StringOption option) {
        this.userid.copyFrom(option);
    }
    /**
     * data1_0を返す。
     * @return data1_0
     * @throws NullPointerException data1_0の値が<code>null</code>である場合
     */
    public long getData10() {
        return this.data10.get();
    }
    /**
     * data1_0を設定する。
     * @param value 設定する値
     */
    @SuppressWarnings("deprecation") public void setData10(long value) {
        this.data10.modify(value);
    }
    /**
     * <code>null</code>を許すdata1_0を返す。
     * @return data1_0
     */
    public LongOption getData10Option() {
        return this.data10;
    }
    /**
     * data1_0を設定する。
     * @param option 設定する値、<code>null</code>の場合にはこのプロパティが<code>null</code>を表すようになる
     */
    @SuppressWarnings("deprecation") public void setData10Option(LongOption option) {
        this.data10.copyFrom(option);
    }
    /**
     * data1_1を返す。
     * @return data1_1
     * @throws NullPointerException data1_1の値が<code>null</code>である場合
     */
    public long getData11() {
        return this.data11.get();
    }
    /**
     * data1_1を設定する。
     * @param value 設定する値
     */
    @SuppressWarnings("deprecation") public void setData11(long value) {
        this.data11.modify(value);
    }
    /**
     * <code>null</code>を許すdata1_1を返す。
     * @return data1_1
     */
    public LongOption getData11Option() {
        return this.data11;
    }
    /**
     * data1_1を設定する。
     * @param option 設定する値、<code>null</code>の場合にはこのプロパティが<code>null</code>を表すようになる
     */
    @SuppressWarnings("deprecation") public void setData11Option(LongOption option) {
        this.data11.copyFrom(option);
    }
    /**
     * data2_0を返す。
     * @return data2_0
     * @throws NullPointerException data2_0の値が<code>null</code>である場合
     */
    public long getData20() {
        return this.data20.get();
    }
    /**
     * data2_0を設定する。
     * @param value 設定する値
     */
    @SuppressWarnings("deprecation") public void setData20(long value) {
        this.data20.modify(value);
    }
    /**
     * <code>null</code>を許すdata2_0を返す。
     * @return data2_0
     */
    public LongOption getData20Option() {
        return this.data20;
    }
    /**
     * data2_0を設定する。
     * @param option 設定する値、<code>null</code>の場合にはこのプロパティが<code>null</code>を表すようになる
     */
    @SuppressWarnings("deprecation") public void setData20Option(LongOption option) {
        this.data20.copyFrom(option);
    }
    /**
     * data2_1を返す。
     * @return data2_1
     * @throws NullPointerException data2_1の値が<code>null</code>である場合
     */
    public long getData21() {
        return this.data21.get();
    }
    /**
     * data2_1を設定する。
     * @param value 設定する値
     */
    @SuppressWarnings("deprecation") public void setData21(long value) {
        this.data21.modify(value);
    }
    /**
     * <code>null</code>を許すdata2_1を返す。
     * @return data2_1
     */
    public LongOption getData21Option() {
        return this.data21;
    }
    /**
     * data2_1を設定する。
     * @param option 設定する値、<code>null</code>の場合にはこのプロパティが<code>null</code>を表すようになる
     */
    @SuppressWarnings("deprecation") public void setData21Option(LongOption option) {
        this.data21.copyFrom(option);
    }
    /**
     * mid1を返す。
     * @return mid1
     * @throws NullPointerException mid1の値が<code>null</code>である場合
     */
    public long getMid1() {
        return this.mid1.get();
    }
    /**
     * mid1を設定する。
     * @param value 設定する値
     */
    @SuppressWarnings("deprecation") public void setMid1(long value) {
        this.mid1.modify(value);
    }
    /**
     * <code>null</code>を許すmid1を返す。
     * @return mid1
     */
    public LongOption getMid1Option() {
        return this.mid1;
    }
    /**
     * mid1を設定する。
     * @param option 設定する値、<code>null</code>の場合にはこのプロパティが<code>null</code>を表すようになる
     */
    @SuppressWarnings("deprecation") public void setMid1Option(LongOption option) {
        this.mid1.copyFrom(option);
    }
    /**
     * mid2を返す。
     * @return mid2
     * @throws NullPointerException mid2の値が<code>null</code>である場合
     */
    public long getMid2() {
        return this.mid2.get();
    }
    /**
     * mid2を設定する。
     * @param value 設定する値
     */
    @SuppressWarnings("deprecation") public void setMid2(long value) {
        this.mid2.modify(value);
    }
    /**
     * <code>null</code>を許すmid2を返す。
     * @return mid2
     */
    public LongOption getMid2Option() {
        return this.mid2;
    }
    /**
     * mid2を設定する。
     * @param option 設定する値、<code>null</code>の場合にはこのプロパティが<code>null</code>を表すようになる
     */
    @SuppressWarnings("deprecation") public void setMid2Option(LongOption option) {
        this.mid2.copyFrom(option);
    }
    @Override public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("{");
        result.append("class=middata1");
        result.append(", userid=");
        result.append(this.userid);
        result.append(", data10=");
        result.append(this.data10);
        result.append(", data11=");
        result.append(this.data11);
        result.append(", data20=");
        result.append(this.data20);
        result.append(", data21=");
        result.append(this.data21);
        result.append(", mid1=");
        result.append(this.mid1);
        result.append(", mid2=");
        result.append(this.mid2);
        result.append("}");
        return result.toString();
    }
    @Override public int hashCode() {
        int prime = 31;
        int result = 1;
        result = prime * result + userid.hashCode();
        result = prime * result + data10.hashCode();
        result = prime * result + data11.hashCode();
        result = prime * result + data20.hashCode();
        result = prime * result + data21.hashCode();
        result = prime * result + mid1.hashCode();
        result = prime * result + mid2.hashCode();
        return result;
    }
    @Override public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj == null) {
            return false;
        }
        if(this.getClass() != obj.getClass()) {
            return false;
        }
        Middata1 other = (Middata1) obj;
        if(this.userid.equals(other.userid) == false) {
            return false;
        }
        if(this.data10.equals(other.data10) == false) {
            return false;
        }
        if(this.data11.equals(other.data11) == false) {
            return false;
        }
        if(this.data20.equals(other.data20) == false) {
            return false;
        }
        if(this.data21.equals(other.data21) == false) {
            return false;
        }
        if(this.mid1.equals(other.mid1) == false) {
            return false;
        }
        if(this.mid2.equals(other.mid2) == false) {
            return false;
        }
        return true;
    }
    /**
     * useridを返す。
     * @return userid
     * @throws NullPointerException useridの値が<code>null</code>である場合
     */
    public String getUseridAsString() {
        return this.userid.getAsString();
    }
    /**
     * useridを設定する。
     * @param userid0 設定する値
     */
    @SuppressWarnings("deprecation") public void setUseridAsString(String userid0) {
        this.userid.modify(userid0);
    }
    @Override public void write(DataOutput out) throws IOException {
        userid.write(out);
        data10.write(out);
        data11.write(out);
        data20.write(out);
        data21.write(out);
        mid1.write(out);
        mid2.write(out);
    }
    @Override public void readFields(DataInput in) throws IOException {
        userid.readFields(in);
        data10.readFields(in);
        data11.readFields(in);
        data20.readFields(in);
        data21.readFields(in);
        mid1.readFields(in);
        mid2.readFields(in);
    }
}