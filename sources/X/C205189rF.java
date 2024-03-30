package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9rF  reason: invalid class name and case insensitive filesystem */
public final class C205189rF implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                i = AnonymousClass0ZA.A01(parcel, readInt);
            } else if (c != 3) {
                z2 = C165607th.A1U(parcel, c, 4, readInt, z2);
            } else {
                z = AnonymousClass000.A1P(AnonymousClass0ZA.A01(parcel, readInt));
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new AnonymousClass8C6(i, z, z2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass8C6[i];
    }
}
