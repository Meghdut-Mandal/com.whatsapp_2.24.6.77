package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6cA  reason: invalid class name and case insensitive filesystem */
public final class C135116cA implements Parcelable, AnonymousClass7g1 {
    public static final Parcelable.Creator CREATOR = new C134076aS();
    public long A00;
    public final String A01;

    public C135116cA(String str, long j) {
        AnonymousClass00C.A0D(str, 1);
        this.A01 = str;
        this.A00 = j;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null || !C36381kD.A1Y(obj, this)) {
            return false;
        }
        C135116cA r4 = (C135116cA) obj;
        return this == r4 || AnonymousClass00C.A0J(this.A01, r4.A01);
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeLong(this.A00);
    }

    public int hashCode() {
        return this.A01.hashCode();
    }

    public long BIJ() {
        return this.A00;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("DirectoryRecentSearchQuery(searchQuery=");
        A0u.append(this.A01);
        A0u.append(", timeAdded=");
        return C36331k8.A0j(A0u, this.A00);
    }
}
