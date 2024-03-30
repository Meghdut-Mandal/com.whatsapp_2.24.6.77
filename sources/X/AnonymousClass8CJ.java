package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.8CJ  reason: invalid class name */
public final class AnonymousClass8CJ extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C204519q8();
    public final long A00;
    public final long A01;
    public final boolean A02;

    public AnonymousClass8CJ(long j, boolean z, long j2) {
        this.A02 = z;
        this.A00 = j;
        this.A01 = j2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass8CJ) {
                AnonymousClass8CJ r8 = (AnonymousClass8CJ) obj;
                if (!(this.A02 == r8.A02 && this.A00 == r8.A00 && this.A01 == r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder A0i = C90524aI.A0i("CollectForDebugParcelable[skipPersistentStorage: ");
        A0i.append(this.A02);
        A0i.append(",collectForDebugStartTimeMillis: ");
        A0i.append(this.A00);
        A0i.append(",collectForDebugExpiryTimeMillis: ");
        A0i.append(this.A01);
        return C90474aD.A0g(A0i);
    }

    public final int hashCode() {
        Object[] A1Q = C36441kJ.A1Q();
        C165577te.A1V(A1Q, this.A02);
        C36421kH.A1P(A1Q, this.A00);
        C36361kB.A1W(A1Q, this.A01);
        return Arrays.hashCode(A1Q);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A0A(parcel, 1, this.A02);
        AnonymousClass0Z9.A09(parcel, 2, this.A01);
        AnonymousClass0Z9.A09(parcel, 3, this.A00);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}
