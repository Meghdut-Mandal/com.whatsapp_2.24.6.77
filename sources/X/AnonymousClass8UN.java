package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.8UN  reason: invalid class name */
public final class AnonymousClass8UN extends C206209st {
    public static final Parcelable.Creator CREATOR = new C205479ri();
    public final int A00;
    public final C52522pZ A01;

    public AnonymousClass8UN(C52522pZ r2, int i) {
        AnonymousClass00C.A0D(r2, 1);
        this.A01 = r2;
        this.A00 = i;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass8UN) {
                AnonymousClass8UN r5 = (AnonymousClass8UN) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        C36391kE.A1E(parcel, this.A01);
        parcel.writeInt(this.A00);
    }

    public int hashCode() {
        return C36391kE.A0A(this.A01) + this.A00;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BusinessProfileParams(entryPointSource=");
        A0u.append(this.A01);
        A0u.append(", lwiEntryPoint=");
        return C36321k7.A0G(A0u, this.A00);
    }
}
