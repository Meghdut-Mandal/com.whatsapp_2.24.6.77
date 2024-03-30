package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9s6  reason: invalid class name and case insensitive filesystem */
public final class C205719s6 implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        AnonymousClass00C.A0D(parcel, 0);
        Parcelable.Creator creator = C177608e4.CREATOR;
        return new C177608e4((C223313w) C223313w.CREATOR.createFromParcel(parcel), parcel.readInt());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C177608e4[i];
    }
}
