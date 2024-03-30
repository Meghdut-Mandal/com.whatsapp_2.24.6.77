package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9si  reason: invalid class name and case insensitive filesystem */
public final class C206099si implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        AnonymousClass00C.A0D(parcel, 0);
        return new C206669tm(parcel.createByteArray(), parcel.readString(), AnonymousClass000.A1P(parcel.readInt()));
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C206669tm[i];
    }
}
