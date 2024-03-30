package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9r0  reason: invalid class name and case insensitive filesystem */
public final class C205059r0 implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        float f = 0.0f;
        float f2 = 0.0f;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = AnonymousClass0ZA.A01(parcel, readInt);
            } else if (c == 2) {
                f = C165577te.A00(parcel, readInt);
            } else if (c != 3) {
                i2 = C165607th.A04(parcel, c, readInt, i2);
            } else {
                f2 = C165577te.A00(parcel, readInt);
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new AnonymousClass8CB(f, f2, i, i2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass8CB[i];
    }
}
