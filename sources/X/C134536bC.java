package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6bC  reason: invalid class name and case insensitive filesystem */
public final class C134536bC implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C163937r0(0);
    public final int A00;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C134536bC) && this.A00 == ((C134536bC) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
    }

    public C134536bC(int i) {
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("DefaultLazyKey(index=");
        return C36321k7.A0G(A0u, this.A00);
    }
}
