package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9uU  reason: invalid class name and case insensitive filesystem */
public final class C207059uU implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C205939sS();
    public final int A00;
    public final int A01;
    public final C187998ys A02;

    public C207059uU(C187998ys r2, int i, int i2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A02 = r2;
        this.A01 = i;
        this.A00 = i2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C207059uU) {
                C207059uU r5 = (C207059uU) obj;
                if (!(this.A02 == r5.A02 && this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        C36391kE.A1E(parcel, this.A02);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
    }

    public int hashCode() {
        return ((C36391kE.A0A(this.A02) + this.A01) * 31) + this.A00;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CheckoutErrorContent(code=");
        A0u.append(this.A02);
        A0u.append(", titleRes=");
        A0u.append(this.A01);
        A0u.append(", descriptionRes=");
        return C36321k7.A0G(A0u, this.A00);
    }

    public C207059uU() {
        this(C187998ys.NONE, -1, -1);
    }
}
