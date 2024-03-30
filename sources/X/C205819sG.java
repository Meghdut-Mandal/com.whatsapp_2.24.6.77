package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9sG  reason: invalid class name and case insensitive filesystem */
public final class C205819sG implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        AnonymousClass00C.A0D(parcel, 0);
        C175908bG r2 = new C175908bG();
        r2.A0N(parcel);
        r2.A00 = parcel.readLong();
        r2.A01 = parcel.readString();
        return r2;
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C175908bG[i];
    }
}
