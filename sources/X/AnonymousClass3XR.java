package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3XR  reason: invalid class name */
public final class AnonymousClass3XR implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass3X0();
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3XR) {
                AnonymousClass3XR r5 = (AnonymousClass3XR) obj;
                if (!AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
        parcel.writeString(this.A03);
        parcel.writeString(this.A01);
    }

    public int hashCode() {
        return C36381kD.A08(this.A03, C36381kD.A08(this.A00, C36421kH.A04(this.A02))) + this.A01.hashCode();
    }

    public AnonymousClass3XR(String str, String str2, String str3, String str4) {
        C36321k7.A18(str, str2, str3, str4);
        this.A02 = str;
        this.A00 = str2;
        this.A03 = str3;
        this.A01 = str4;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PaymentSupportFAQ(title=");
        A0u.append(this.A02);
        A0u.append(", description=");
        A0u.append(this.A00);
        A0u.append(", url=");
        A0u.append(this.A03);
        A0u.append(", id=");
        return C36321k7.A0E(this.A01, A0u);
    }
}
