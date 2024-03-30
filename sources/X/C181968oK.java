package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.8oK  reason: invalid class name and case insensitive filesystem */
public final class C181968oK extends C206239sw {
    public static final Parcelable.Creator CREATOR = new C206159so();
    public C206259sy A00;
    public final String A01;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C181968oK) {
                C181968oK r5 = (C181968oK) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
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
        parcel.writeParcelable(this.A00, i);
    }

    public int hashCode() {
        return C36401kF.A02(this.A00, C36421kH.A04(this.A01));
    }

    public C181968oK(C206259sy r1, String str) {
        C36321k7.A0x(str, r1);
        this.A01 = str;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Rating(id=");
        A0u.append(this.A01);
        A0u.append(", ratingType=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
