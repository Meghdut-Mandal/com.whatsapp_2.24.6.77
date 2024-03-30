package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6ae  reason: invalid class name and case insensitive filesystem */
public final class C134196ae implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C36411kG.A02(parcel);
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        String readString = parcel.readString();
        boolean z = false;
        boolean A1P = AnonymousClass000.A1P(parcel.readInt());
        if (parcel.readInt() != 0) {
            z = true;
        }
        return new C135036c1(readString, A02, readInt, readInt2, A1P, z);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C135036c1[i];
    }
}
