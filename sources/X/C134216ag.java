package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6ag  reason: invalid class name and case insensitive filesystem */
public final class C134216ag implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        AnonymousClass00C.A0D(parcel, 0);
        Parcelable.Creator creator = AnonymousClass14A.CREATOR;
        return new AnonymousClass14A((AnonymousClass148) AnonymousClass148.CREATOR.createFromParcel(parcel), parcel.readInt());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass14A[i];
    }
}
