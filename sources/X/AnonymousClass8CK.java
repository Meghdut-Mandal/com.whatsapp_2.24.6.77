package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.8CK  reason: invalid class name */
public final class AnonymousClass8CK extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C204699qQ();
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;

    public final int hashCode() {
        Object[] objArr = new Object[4];
        AnonymousClass000.A1J(objArr, this.A01);
        AnonymousClass000.A1K(objArr, this.A00);
        C36361kB.A1W(objArr, this.A03);
        C165587tf.A1W(objArr, this.A02);
        return Arrays.hashCode(objArr);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AnonymousClass8CK) {
            AnonymousClass8CK r7 = (AnonymousClass8CK) obj;
            if (this.A00 == r7.A00 && this.A01 == r7.A01 && this.A02 == r7.A02 && this.A03 == r7.A03) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final String toString() {
        StringBuilder A0i = C90524aI.A0i("NetworkLocationStatus:");
        A0i.append(" Wifi status: ");
        A0i.append(this.A00);
        A0i.append(" Cell status: ");
        A0i.append(this.A01);
        A0i.append(" elapsed time NS: ");
        A0i.append(this.A03);
        A0i.append(" system time ms: ");
        return C36411kG.A11(A0i, this.A02);
    }

    public AnonymousClass8CK(int i, int i2, long j, long j2) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = j;
        this.A03 = j2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A08(parcel, 1, this.A00);
        AnonymousClass0Z9.A08(parcel, 2, this.A01);
        AnonymousClass0Z9.A09(parcel, 3, this.A02);
        AnonymousClass0Z9.A09(parcel, 4, this.A03);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}
