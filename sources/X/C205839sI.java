package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9sI  reason: invalid class name and case insensitive filesystem */
public class C205839sI implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Bundle A0I = C165607th.A0I(parcel, getClass());
        C175718aw r0 = new C175718aw();
        r0.A00 = A0I;
        return r0;
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C175718aw[i];
    }
}
