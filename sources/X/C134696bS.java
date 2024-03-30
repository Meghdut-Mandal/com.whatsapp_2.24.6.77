package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6bS  reason: invalid class name and case insensitive filesystem */
public final class C134696bS implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C134286an();
    public final String A00;
    public final String A01;
    public final String A02;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C134696bS) {
                C134696bS r5 = (C134696bS) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
    }

    public int hashCode() {
        return C90504aG.A0B(this.A00, C36381kD.A08(this.A02, C36421kH.A04(this.A01)));
    }

    public C134696bS(String str, String str2, String str3) {
        C36321k7.A11(str, str2, str3);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = str3;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("MerchantSignatureData(signature=");
        A0u.append(this.A01);
        A0u.append(", signatureType=");
        A0u.append(this.A02);
        A0u.append(", payload=");
        return C36321k7.A0E(this.A00, A0u);
    }
}
