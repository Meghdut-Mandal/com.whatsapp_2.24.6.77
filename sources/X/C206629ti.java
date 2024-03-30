package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9ti  reason: invalid class name and case insensitive filesystem */
public final class C206629ti implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C205949sT();
    public final int A00;
    public final C207119ua A01;
    public final C207119ua A02;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C206629ti) {
                C206629ti r5 = (C206629ti) obj;
                if (this.A00 != r5.A00 || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A02, i);
    }

    public int hashCode() {
        return (((this.A00 * 31) + AnonymousClass000.A0H(this.A01)) * 31) + C36411kG.A09(this.A02);
    }

    public C206629ti(C207119ua r1, C207119ua r2, int i) {
        this.A00 = i;
        this.A01 = r1;
        this.A02 = r2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Installment(count=");
        A0u.append(this.A00);
        A0u.append(", dueAmount=");
        A0u.append(this.A01);
        A0u.append(", interest=");
        return AnonymousClass000.A0m(this.A02, A0u);
    }
}
