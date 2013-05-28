package ironpeace.modelgen.dmdl.model;
import com.asakusafw.runtime.model.DataModel;
import com.asakusafw.runtime.model.DataModelKind;
import com.asakusafw.runtime.model.ModelInputLocation;
import com.asakusafw.runtime.model.ModelOutputLocation;
import com.asakusafw.runtime.model.PropertyOrder;
import com.asakusafw.runtime.value.LongOption;
import com.asakusafw.runtime.value.StringOption;
import ironpeace.modelgen.dmdl.io.OriginalDataInput;
import ironpeace.modelgen.dmdl.io.OriginalDataOutput;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
/**
 * OriginalDataを表すデータモデルクラス。
 */
@DataModelKind("DMDL")@ModelInputLocation(OriginalDataInput.class)@ModelOutputLocation(OriginalDataOutput.class)@
        PropertyOrder({"userid", "data1_0", "data1_1", "data2_0", "data2_1"}) public class OriginalData implements 
        DataModel<OriginalData>, Writable {
    private final StringOption userid = new StringOption();
    private final LongOption data10 = new LongOption();
    private final LongOption data11 = new LongOption();
    private final LongOption data20 = new LongOption();
    private final LongOption data21 = new LongOption();
    @Override@SuppressWarnings("deprecation") public void reset() {
        this.userid.setNull();
        this.data10.setNull();
        this.data11.setNull();
        this.data20.setNull();
        this.data21.setNull();
    }
    @Override@SuppressWarnings("deprecation") public void copyFrom(OriginalData other) {
        this.userid.copyFrom(other.userid);
        this.data10.copyFrom(other.data10);
        this.data11.copyFrom(other.data11);
        this.data20.copyFrom(other.data20);
        this.data21.copyFrom(other.data21);
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
    @Override public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("{");
        result.append("class=original_data");
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
        OriginalData other = (OriginalData) obj;
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
    }
    @Override public void readFields(DataInput in) throws IOException {
        userid.readFields(in);
        data10.readFields(in);
        data11.readFields(in);
        data20.readFields(in);
        data21.readFields(in);
    }
}