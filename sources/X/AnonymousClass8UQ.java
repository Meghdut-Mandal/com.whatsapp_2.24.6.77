package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.8UQ  reason: invalid class name */
public final class AnonymousClass8UQ extends C206209st {
    public static final Parcelable.Creator CREATOR = new C205509rl();
    public final String A00;
    public final int A01;
    public final C52522pZ A02;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass8UQ) {
                AnonymousClass8UQ r5 = (AnonymousClass8UQ) obj;
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
        parcel.writeString(this.A00);
        C36391kE.A1E(parcel, this.A02);
        parcel.writeInt(this.A01);
    }

    public int hashCode() {
        return C36351kA.A05(this.A02, C36421kH.A04(this.A00)) + this.A01;
    }

    public AnonymousClass8UQ(C52522pZ r1, String str, int i) {
        C36321k7.A0x(str, r1);
        this.A00 = str;
        this.A02 = r1;
        this.A01 = i;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PromoteStatusParams(id=");
        A0u.append(this.A00);
        A0u.append(", entryPointSource=");
        A0u.append(this.A02);
        A0u.append(", lwiEntryPoint=");
        return C36321k7.A0G(A0u, this.A01);
    }
}
