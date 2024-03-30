package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9qI  reason: invalid class name and case insensitive filesystem */
public final class C204619qI implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        long j = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                i = AnonymousClass0ZA.A01(parcel, readInt);
            } else if (c == 3) {
                i2 = AnonymousClass0ZA.A01(parcel, readInt);
            } else if (c == 4) {
                AnonymousClass0ZA.A0F(parcel, readInt, 4);
                i3 = parcel.readInt();
            } else if (c == 5) {
                j = AnonymousClass0ZA.A03(parcel, readInt);
            } else if (c != 6) {
                AnonymousClass0ZA.A0D(parcel, readInt);
            } else {
                i4 = AnonymousClass0ZA.A01(parcel, readInt);
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new C170168Cf(i, i2, i3, j, i4);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C170168Cf[i];
    }
}
