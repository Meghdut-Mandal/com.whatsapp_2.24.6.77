package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9q8  reason: invalid class name and case insensitive filesystem */
public final class C204519q8 implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass8CJ[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        long j = 0;
        long j2 = 0;
        boolean z = false;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                z = AnonymousClass000.A1P(AnonymousClass0ZA.A01(parcel, readInt));
            } else if (c == 2) {
                j2 = AnonymousClass0ZA.A03(parcel, readInt);
            } else if (c != 3) {
                AnonymousClass0ZA.A0D(parcel, readInt);
            } else {
                j = AnonymousClass0ZA.A03(parcel, readInt);
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new AnonymousClass8CJ(j, z, j2);
    }
}
