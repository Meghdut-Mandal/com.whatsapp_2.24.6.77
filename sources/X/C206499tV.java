package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9tV  reason: invalid class name and case insensitive filesystem */
public final class C206499tV implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C206049sd();
    public boolean A00;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C206499tV) && this.A00 == ((C206499tV) obj).A00);
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeInt(this.A00 ? 1 : 0);
    }

    public int hashCode() {
        return C36341k9.A01(this.A00 ? 1 : 0);
    }

    public C206499tV(boolean z) {
        this.A00 = z;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("FormState(isDisabled=");
        return C36321k7.A0H(A0u, this.A00);
    }
}
