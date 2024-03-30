package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9s2  reason: invalid class name and case insensitive filesystem */
public final class C205679s2 implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        AnonymousClass00C.A0D(parcel, 0);
        Parcelable.Creator creator = C177538dx.CREATOR;
        return new C177538dx(parcel.readString());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C177538dx[i];
    }
}
