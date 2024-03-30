package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6aQ  reason: invalid class name and case insensitive filesystem */
public final class C134056aQ implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        AnonymousClass00C.A0D(parcel, 0);
        return new C135126cB(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C135126cB[i];
    }
}
