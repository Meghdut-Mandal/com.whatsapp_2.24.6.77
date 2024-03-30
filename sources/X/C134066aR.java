package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6aR  reason: invalid class name and case insensitive filesystem */
public final class C134066aR implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new C135136cC(parcel.readLong(), C36341k9.A0g(parcel), parcel.readString(), parcel.readString());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C135136cC[i];
    }
}
