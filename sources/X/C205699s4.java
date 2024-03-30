package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9s4  reason: invalid class name and case insensitive filesystem */
public final class C205699s4 implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        AnonymousClass00C.A0D(parcel, 0);
        Parcelable.Creator creator = C177598e3.CREATOR;
        return new C177598e3(parcel.readString());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C177598e3[i];
    }
}
