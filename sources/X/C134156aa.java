package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6aa  reason: invalid class name and case insensitive filesystem */
public final class C134156aa implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean A01 = C111805cs.A01(parcel);
        return new C134886bl(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), A01);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C134886bl[i];
    }
}
