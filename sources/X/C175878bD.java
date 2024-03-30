package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.8bD  reason: invalid class name and case insensitive filesystem */
public class C175878bD extends C175888bE {
    public static final Parcelable.Creator CREATOR = C23180B8o.A00(24);
    public C135086c7 A00;
    public C175818b6 A01;
    public String A02;

    public int describeContents() {
        return 0;
    }

    public void A06(String str) {
        if (str != null) {
            try {
                A0B(C36441kJ.A1C(str));
            } catch (JSONException unused) {
                Log.e("PAY: IndiaUpiMerchantMethodData fromDBString threw JSONException");
            }
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A09);
        parcel.writeString(this.A03);
        parcel.writeString(this.A07);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A01, i);
    }

    public String A05() {
        return A0A().toString();
    }

    public JSONObject A0A() {
        JSONObject A0A = super.A0A();
        try {
            C135086c7 r1 = this.A00;
            if (!C202349ld.A03(r1)) {
                C165607th.A1D(r1, "vpaHandle", A0A);
            }
            String str = this.A02;
            if (str != null) {
                A0A.put("vpaId", str);
            }
            if (this.A01 != null) {
                JSONObject A1B = C36441kJ.A1B();
                C135086c7 r12 = this.A01.A02;
                if (r12 != null) {
                    C165607th.A1D(r12, "accountNumber", A1B);
                }
                C135086c7 r13 = this.A01.A01;
                if (r13 != null) {
                    C165607th.A1D(r13, "bankName", A1B);
                }
                A0A.put("bank", A1B);
                return A0A;
            }
        } catch (JSONException unused) {
            Log.e("PAY: IndiaUpiMerchantMethodData toJSONObject threw JSONException");
        }
        return A0A;
    }

    public void A0B(JSONObject jSONObject) {
        super.A0B(jSONObject);
        this.A00 = C202349ld.A01(jSONObject.optString("vpaHandle"), "upiHandle");
        this.A02 = jSONObject.optString("vpaId");
        JSONObject optJSONObject = jSONObject.optJSONObject("bank");
        if (optJSONObject != null) {
            C175818b6 r2 = new C175818b6();
            this.A01 = r2;
            r2.A02 = C202349ld.A01(optJSONObject.optString("accountNumber", (String) null), "bankAccountNumber");
            this.A01.A01 = C202349ld.A01(optJSONObject.optString("bankName"), "bankName");
        }
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("IndiaUpiMerchantMethodData{version=");
        A0u.append(1);
        A0u.append(", vpaId='");
        A0u.append(this.A02);
        A0u.append('\'');
        A0u.append(", vpaHandle=");
        A0u.append(this.A00);
        A0u.append("} ");
        return AnonymousClass000.A0q(super.toString(), A0u);
    }
}
