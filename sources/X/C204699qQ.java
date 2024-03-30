package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9qQ  reason: invalid class name and case insensitive filesystem */
public final class C204699qQ implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        long j = -1;
        long j2 = -1;
        int i = 1;
        int i2 = 1;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = AnonymousClass0ZA.A01(parcel, readInt);
            } else if (c == 2) {
                i2 = AnonymousClass0ZA.A01(parcel, readInt);
            } else if (c == 3) {
                j = AnonymousClass0ZA.A03(parcel, readInt);
            } else if (c != 4) {
                AnonymousClass0ZA.A0D(parcel, readInt);
            } else {
                j2 = AnonymousClass0ZA.A03(parcel, readInt);
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new AnonymousClass8CK(i, i2, j, j2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass8CK[i];
    }
}
