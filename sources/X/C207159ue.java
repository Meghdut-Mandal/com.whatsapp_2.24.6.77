package X;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONObject;

/* renamed from: X.9ue  reason: invalid class name and case insensitive filesystem */
public class C207159ue implements Parcelable {
    public static final Parcelable.Creator CREATOR = C23180B8o.A00(30);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
        parcel.writeString(this.A00);
    }

    public C207159ue(String str, String str2, String str3, String str4) {
        this.A02 = str;
        this.A01 = str2;
        this.A03 = str3;
        this.A00 = str4;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PaymentIncentiveData{offerId='");
        A0u.append(this.A02);
        A0u.append('\'');
        A0u.append(", offerClaimId='");
        A0u.append(this.A01);
        A0u.append('\'');
        A0u.append(", parentTransactionId='");
        A0u.append(this.A03);
        A0u.append('\'');
        A0u.append(", incentiveTransactionId='");
        A0u.append(this.A00);
        A0u.append('\'');
        return AnonymousClass000.A0s(A0u);
    }

    public C207159ue(JSONObject jSONObject) {
        this.A02 = jSONObject.optString("offer-id");
        this.A01 = jSONObject.optString("offer-claim-id");
        this.A03 = jSONObject.optString("parent-transaction-id");
        this.A00 = jSONObject.optString("incentive-payment-id");
    }

    public C207159ue(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
        this.A03 = parcel.readString();
    }
}
