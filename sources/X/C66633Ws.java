package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3Ws  reason: invalid class name and case insensitive filesystem */
public final class C66633Ws implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        AnonymousClass00C.A0D(parcel, 0);
        C65533Sl r0 = AnonymousClass147.A01;
        return new AnonymousClass147(parcel.readString());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass147[i];
    }
}
