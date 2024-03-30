package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6bF  reason: invalid class name and case insensitive filesystem */
public final class C134566bF implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C134326ar();
    public boolean A00;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C134566bF) && this.A00 == ((C134566bF) obj).A00);
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeByte(this.A00 ? (byte) 1 : 0);
    }

    public int hashCode() {
        return C36341k9.A01(this.A00 ? 1 : 0);
    }

    public C134566bF(boolean z) {
        this.A00 = z;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PrivacyDisclosureNavBar(dimissButton=");
        return C36321k7.A0H(A0u, this.A00);
    }
}
