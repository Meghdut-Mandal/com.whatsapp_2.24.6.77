package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9tg  reason: invalid class name and case insensitive filesystem */
public final class C206609tg implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C205599ru();
    public final String A00;
    public final String A01;
    public final String A02;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    public boolean equals(Object obj) {
        Object obj2 = null;
        if (obj instanceof C206609tg) {
            obj2 = obj;
        }
        if (obj2 == null) {
            return false;
        }
        C206609tg r4 = (C206609tg) obj;
        if (!AnonymousClass14B.A0G(this.A00, r4.A00) || !AnonymousClass14B.A0G(this.A01, r4.A01) || !AnonymousClass00C.A0J(this.A02, r4.A02)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A06 = C165577te.A06(this.A00) * 31;
        String str = this.A01;
        if (str != null) {
            i = str.hashCode();
        }
        return A06 + i;
    }

    public C206609tg(String str, String str2, String str3) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BizDirectConnectionPostcode(code=");
        A0u.append(this.A00);
        A0u.append(", locationName=");
        A0u.append(this.A01);
        A0u.append(", postcodeType=");
        return C36321k7.A0E(this.A02, A0u);
    }
}
