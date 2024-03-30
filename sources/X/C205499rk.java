package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9rk  reason: invalid class name and case insensitive filesystem */
public final class C205499rk implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        AnonymousClass00C.A0D(parcel, 0);
        return new AnonymousClass8UP(C52522pZ.valueOf(parcel.readString()), (C207269up) C36411kG.A0H(parcel, AnonymousClass8UP.class), parcel.readInt());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass8UP[i];
    }
}
