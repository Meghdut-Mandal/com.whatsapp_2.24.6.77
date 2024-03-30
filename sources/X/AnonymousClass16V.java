package X;

import android.os.Parcel;
import com.whatsapp.util.Log;
import java.math.BigDecimal;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.16V  reason: invalid class name */
public abstract class AnonymousClass16V implements AnonymousClass16U {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final int A04;
    public final int A05;

    public /* synthetic */ String B7d(C18820ts r7, AnonymousClass16X r8) {
        String str = this.A02;
        BigDecimal bigDecimal = r8.A00;
        return AnonymousClass6US.A01(r7, str, this.A03, bigDecimal, bigDecimal.scale(), true);
    }

    public /* synthetic */ String B7e(C18820ts r4, BigDecimal bigDecimal) {
        return AnonymousClass6US.A02(r4, this.A02, this.A03, bigDecimal, true);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass16V)) {
            return false;
        }
        AnonymousClass16V r4 = (AnonymousClass16V) obj;
        return this.A02.equals(r4.A02) && this.A03.equals(r4.A03) && this.A00 == r4.A00 && this.A04 == r4.A04 && this.A01 == r4.A01 && this.A05 == r4.A05;
    }

    public JSONObject Bvn() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", this.A02);
            jSONObject.put("symbol", this.A03);
            jSONObject.put("offset", this.A04);
            jSONObject.put("displayExponent", this.A01);
            jSONObject.put("weight", this.A05);
            jSONObject.put("currencyType", this.A00);
            return jSONObject;
        } catch (JSONException e) {
            Log.e("PAY: BasePaymentCurrency toJsonObject threw: ", e);
            return jSONObject;
        }
    }

    public int hashCode() {
        return (this.A02.hashCode() * 31) + (this.A03.hashCode() * 31) + this.A00 + this.A04 + this.A01 + this.A05;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A05);
    }

    public AnonymousClass16V(JSONObject jSONObject) {
        this.A02 = jSONObject.optString("code");
        this.A03 = jSONObject.optString("symbol");
        this.A00 = jSONObject.optInt("currencyType");
        this.A04 = jSONObject.optInt("offset");
        this.A05 = jSONObject.optInt("weight");
        this.A01 = jSONObject.optInt("displayExponent");
    }

    public AnonymousClass16V(String str, String str2, int i, int i2, int i3, int i4) {
        boolean z = false;
        C18740tg.A0D(i2 >= 1, "BasePaymentCurrency offset should be >= 1");
        C18740tg.A0D(i3 >= 0 ? true : z, "BasePaymentCurrency display exponent should be >= 0");
        this.A02 = str;
        this.A03 = str2;
        this.A00 = i;
        this.A04 = i2;
        this.A05 = i4;
        this.A01 = i3;
    }

    public AnonymousClass16V(Parcel parcel) {
        this.A00 = 0;
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A04 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A05 = parcel.readInt();
    }
}
