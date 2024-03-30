package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0Zm  reason: invalid class name and case insensitive filesystem */
public final class C07840Zm implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        long j = 0;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = AnonymousClass0ZA.A01(parcel, readInt);
            } else if (c == 2) {
                z = AnonymousClass000.A1P(AnonymousClass0ZA.A01(parcel, readInt));
            } else if (c == 3) {
                j = AnonymousClass0ZA.A03(parcel, readInt);
            } else if (c != 4) {
                AnonymousClass0ZA.A0D(parcel, readInt);
            } else {
                z2 = AnonymousClass000.A1P(AnonymousClass0ZA.A01(parcel, readInt));
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new AnonymousClass0KA(i, j, z, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass0KA[i];
    }
}
