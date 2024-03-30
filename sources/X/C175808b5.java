package X;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.8b5  reason: invalid class name and case insensitive filesystem */
public class C175808b5 extends C175848bA {
    public static final Parcelable.Creator CREATOR = C23180B8o.A00(46);
    public int A00;
    public String A01;
    public String A02;
    public boolean A03;
    public int A04 = 1;

    public int describeContents() {
        return 0;
    }

    public void A06(String str) {
        if (str != null) {
            try {
                JSONObject A1C = C36441kJ.A1C(str);
                this.A03 = A1C.optString("bankImageURL", (String) null);
                this.A04 = A1C.optString("bankPhoneNumber", (String) null);
                this.A04 = A1C.optInt("v", 1);
                this.A01 = C202349ld.A00(A1C.optString("bankName"), "bankName");
                this.A01 = A1C.optString("bankCode");
                this.A00 = A1C.optInt("verificationStatus");
            } catch (JSONException e) {
                C36321k7.A1L(e, "PAY: BrazilBankAccountMethodData fromDBString threw: ", AnonymousClass000.A0u());
            }
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeParcelable(this.A02, i);
        parcel.writeLong(this.A00);
    }

    public String A05() {
        Object obj;
        try {
            JSONObject A0A = A0A();
            A0A.put("v", this.A04);
            C135086c7 r0 = this.A01;
            if (r0 == null || C202349ld.A02(r0)) {
                obj = "";
            } else {
                obj = this.A01.A00;
            }
            A0A.put("bankName", obj);
            A0A.put("bankCode", this.A01);
            A0A.put("verificationStatus", this.A00);
            return A0A.toString();
        } catch (JSONException e) {
            C36321k7.A1L(e, "PAY: BrazilBankAccountMethodData toDBString threw: ", AnonymousClass000.A0u());
            return null;
        }
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[ credentialId: ");
        A0u.append(this.A06);
        A0u.append("maskedAccountNumber: ");
        A0u.append(this.A02);
        A0u.append(" bankName: ");
        A0u.append(this.A01);
        A0u.append(" bankCode: ");
        A0u.append(this.A01);
        A0u.append(" verificationStatus: ");
        A0u.append(this.A00);
        A0u.append(" bankShortName: ");
        A0u.append(this.A02);
        A0u.append(" acceptSavings: ");
        A0u.append(this.A03);
        return C90474aD.A0g(A0u);
    }
}
