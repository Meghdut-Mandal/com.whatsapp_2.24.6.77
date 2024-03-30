package X;

import android.os.Parcel;
import org.json.JSONObject;

/* renamed from: X.8bH  reason: invalid class name and case insensitive filesystem */
public final class C175918bH extends C175708av {
    public static final C205859sK CREATOR = new C205859sK();
    public int A00;
    public int A01;
    public long A02;
    public String A03;
    public String A04;

    public String A05() {
        throw null;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
    }

    public void A06(String str) {
        super.A06(str);
        JSONObject A1C = C36441kJ.A1C(str);
        this.A04 = A1C.optString("pspTransactionId", this.A04);
        this.A03 = A1C.optString("pspReceiptURL", this.A03);
    }

    public void A0O(C175708av r2) {
        super.A0O(r2);
        C175918bH r22 = (C175918bH) r2;
        String str = r22.A04;
        if (str != null) {
            this.A04 = str;
        }
        String str2 = r22.A03;
        if (str2 != null) {
            this.A03 = str2;
        }
    }
}
