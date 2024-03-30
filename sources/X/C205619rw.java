package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9rw  reason: invalid class name and case insensitive filesystem */
public final class C205619rw implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object createFromParcel;
        Object obj = null;
        if (C36411kG.A02(parcel) == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = C134766bZ.CREATOR.createFromParcel(parcel);
        }
        C134766bZ r1 = (C134766bZ) createFromParcel;
        if (parcel.readInt() != 0) {
            obj = C134766bZ.CREATOR.createFromParcel(parcel);
        }
        return new C206549ta(r1, (C134766bZ) obj);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C206549ta[i];
    }
}
