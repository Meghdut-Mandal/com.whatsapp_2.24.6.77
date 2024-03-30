package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3X4  reason: invalid class name */
public final class AnonymousClass3X4 implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        AnonymousClass00C.A0D(parcel, 0);
        long readLong = parcel.readLong();
        return new AnonymousClass3XD(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), readLong, parcel.readLong(), parcel.readLong());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass3XD[i];
    }
}
