package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* renamed from: X.6cC  reason: invalid class name and case insensitive filesystem */
public final class C135136cC implements Parcelable, AnonymousClass7g1 {
    public static final Parcelable.Creator CREATOR = new C134066aR();
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
        C135136cC r4 = (C135136cC) obj;
        return this == r4 || (AnonymousClass00C.A0J(this.A02, r4.A02) && AnonymousClass00C.A0J(this.A01, r4.A01));
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
        parcel.writeLong(this.A00);
    }

    public C135136cC(long j, String str, String str2, String str3) {
        C36321k7.A0x(str, str2);
        this.A02 = str;
        this.A01 = str2;
        this.A03 = str3;
        this.A00 = j;
    }

    public long BIJ() {
        return this.A00;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass001.A0M();
        A0M[0] = this.A01;
        A0M[1] = this.A02;
        return Objects.hash(A0M);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("DirectoryRecentCategorySearch(categoryName=");
        A0u.append(this.A02);
        A0u.append(", categoryId=");
        A0u.append(this.A01);
        A0u.append(", parentCategory=");
        A0u.append(this.A03);
        A0u.append(", timeAdded=");
        return C36331k8.A0j(A0u, this.A00);
    }
}
