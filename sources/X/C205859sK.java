package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9sK  reason: invalid class name and case insensitive filesystem */
public final class C205859sK implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        AnonymousClass00C.A0D(parcel, 0);
        C175918bH r1 = new C175918bH();
        r1.A0N(parcel);
        r1.A04 = parcel.readString();
        r1.A03 = parcel.readString();
        return r1;
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C175918bH[i];
    }
}
