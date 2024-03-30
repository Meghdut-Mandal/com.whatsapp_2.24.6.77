package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.8bC  reason: invalid class name and case insensitive filesystem */
public class C175868bC extends C175888bE {
    public static final Parcelable.Creator CREATOR = new C23181B8p(0);
    public int A00 = 0;
    public int A01 = -1;
    public String A02;
    public String A03;
    public String A04;
    public String A05;

    public int describeContents() {
        return 0;
    }

    public void A06(String str) {
        if (str != null) {
            try {
                JSONObject A1C = C36441kJ.A1C(str);
                A0B(A1C);
                this.A01 = A1C.optInt("state", 0);
                this.A09 = A1C.optString("merchantId", (String) null);
                this.A0E = A1C.optBoolean("p2mEligible", false);
                this.A0F = A1C.optBoolean("p2pEligible", false);
                this.A0C = A1C.optString("supportPhoneNumber", (String) null);
                this.A06 = A1C.optString("dashboardUrl", (String) null);
                this.A04 = A1C.optString("notificationType", (String) null);
                this.A03 = A1C.optString("gatewayName", (String) null);
                this.A0B = A1C.optString("providerContactWebsite", (String) null);
                this.A08 = A1C.optString("logoUri", (String) null);
                this.A00 = A1C.optInt("maxInstallmentCount");
                this.A05 = A1C.optString("providerType", (String) null);
                this.A01 = A1C.optInt("pixOnboardingState");
            } catch (JSONException e) {
                C36321k7.A1L(e, "PAY: BrazilMerchantMethodData fromDBString threw: ", AnonymousClass000.A0u());
            }
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A03);
        parcel.writeString(this.A03);
        parcel.writeString(this.A07);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeLong(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A06);
        parcel.writeString(this.A04);
        parcel.writeByte(this.A0E ? (byte) 1 : 0);
        parcel.writeByte(this.A0F ? (byte) 1 : 0);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A08);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A01);
    }

    public String A05() {
        JSONObject A0A = A0A();
        try {
            A0A.put("v", 1);
            if (!TextUtils.isEmpty(this.A06)) {
                A0A.put("dashboardUrl", this.A06);
            }
            if (!TextUtils.isEmpty(this.A04)) {
                A0A.put("notificationType", this.A04);
            }
            if (!TextUtils.isEmpty(this.A03)) {
                A0A.put("gatewayName", this.A03);
            }
            if (!TextUtils.isEmpty(this.A0B)) {
                A0A.put("providerContactWebsite", this.A0B);
            }
            A0A.put("p2mEligible", this.A0E);
            A0A.put("p2pEligible", this.A0F);
            A0A.put("logoUri", this.A08);
            A0A.put("maxInstallmentCount", this.A00);
            if (!TextUtils.isEmpty(this.A05)) {
                A0A.put("providerType", this.A05);
            }
            A0A.put("pixOnboardingState", this.A01);
            return A0A.toString();
        } catch (JSONException e) {
            C36321k7.A1L(e, "PAY: BrazilMerchantMethodData toDBString threw: ", AnonymousClass000.A0u());
            return null;
        }
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[ merchantId: ");
        String str = this.A09;
        A0u.append(str);
        A0u.append(" p2mEligible: ");
        A0u.append(this.A0E);
        A0u.append(" p2pEligible: ");
        A0u.append(this.A0F);
        A0u.append(" state: ");
        A0u.append(this.A01);
        A0u.append(" supportPhoneNumber: ");
        A0u.append(this.A0C);
        A0u.append(" dashboardUrl: ");
        A0u.append(this.A06);
        A0u.append(" merchantId: ");
        A0u.append(str);
        A0u.append(" businessName: ");
        A0u.append(this.A03);
        A0u.append(" displayState: ");
        A0u.append(this.A07);
        A0u.append(" providerContactWebsite: ");
        A0u.append(this.A0B);
        A0u.append(" logoUri: ");
        A0u.append(this.A08);
        A0u.append("maxInstallmentCount: ");
        A0u.append(this.A00);
        A0u.append("providerType: ");
        A0u.append(this.A05);
        A0u.append("pixOnboardingState: ");
        A0u.append(this.A01);
        return C90474aD.A0g(A0u);
    }
}
