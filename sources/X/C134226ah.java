package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6ah  reason: invalid class name and case insensitive filesystem */
public final class C134226ah implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        AnonymousClass00C.A0D(parcel, 0);
        C130946Nb r0 = C223313w.A01;
        return new C223313w(parcel.readString());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C223313w[i];
    }
}
