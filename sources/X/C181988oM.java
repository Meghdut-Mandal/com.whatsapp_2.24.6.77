package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.8oM  reason: invalid class name and case insensitive filesystem */
public final class C181988oM extends C206259sy {
    public static final Parcelable.Creator CREATOR = new C206179sq();
    public final int A00;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C181988oM) && this.A00 == ((C181988oM) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeInt(this.A00);
    }

    public C181988oM(int i) {
        super(Integer.valueOf(i));
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Stars(value=");
        return C36321k7.A0G(A0u, this.A00);
    }

    public C181988oM() {
        this(0);
    }
}
