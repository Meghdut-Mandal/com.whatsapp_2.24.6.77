package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9qa  reason: invalid class name and case insensitive filesystem */
public final class C204799qa implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 3) {
                i2 = C165607th.A04(parcel, c, readInt, i2);
            } else {
                i = AnonymousClass0ZA.A01(parcel, readInt);
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new AnonymousClass8CI(i, i2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass8CI[i];
    }
}
