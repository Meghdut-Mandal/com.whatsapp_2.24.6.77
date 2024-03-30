package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.8UP  reason: invalid class name */
public final class AnonymousClass8UP extends C206209st {
    public static final Parcelable.Creator CREATOR = new C205499rk();
    public final C207269up A00;
    public final int A01;
    public final C52522pZ A02;

    public AnonymousClass8UP(C52522pZ r2, C207269up r3, int i) {
        AnonymousClass00C.A0D(r2, 2);
        this.A00 = r3;
        this.A02 = r2;
        this.A01 = i;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass8UP) {
                AnonymousClass8UP r5 = (AnonymousClass8UP) obj;
                if (!(AnonymousClass00C.A0J(this.A00, r5.A00) && this.A02 == r5.A02 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        C36391kE.A1E(parcel, this.A02);
        parcel.writeInt(this.A01);
    }

    public int hashCode() {
        return C36351kA.A05(this.A02, AnonymousClass000.A0H(this.A00) * 31) + this.A01;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PromoteCatalogParams(product=");
        A0u.append(this.A00);
        A0u.append(", entryPointSource=");
        A0u.append(this.A02);
        A0u.append(", lwiEntryPoint=");
        return C36321k7.A0G(A0u, this.A01);
    }
}
