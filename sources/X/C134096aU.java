package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6aU  reason: invalid class name and case insensitive filesystem */
public final class C134096aU implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C36411kG.A02(parcel);
        return new C134756bY(parcel.readString(), parcel.readDouble(), parcel.readDouble(), A02);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C134756bY[i];
    }
}
