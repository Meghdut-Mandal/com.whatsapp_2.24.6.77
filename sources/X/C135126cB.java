package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6cB  reason: invalid class name and case insensitive filesystem */
public final class C135126cB implements Parcelable, AnonymousClass7g1 {
    public static final Parcelable.Creator CREATOR = new C134056aQ();
    public long A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null || !C36381kD.A1Y(obj, this)) {
            return false;
        }
        C135126cB r4 = (C135126cB) obj;
        return this == r4 || AnonymousClass00C.A0J(this.A03, r4.A03);
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeLong(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
    }

    public int hashCode() {
        return this.A03.hashCode();
    }

    public C135126cB(long j, String str, String str2, String str3) {
        C36321k7.A12(str, str2, str3);
        this.A00 = j;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
    }

    public long BIJ() {
        return this.A00;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("DirectoryBusinessProfileRecentSearch(timeAdded=");
        A0u.append(this.A00);
        A0u.append(", businessName=");
        A0u.append(this.A01);
        A0u.append(", categories=");
        A0u.append(this.A02);
        A0u.append(", jid=");
        return C36321k7.A0E(this.A03, A0u);
    }
}
