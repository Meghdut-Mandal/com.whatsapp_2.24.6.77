package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.8C2  reason: invalid class name */
public final class AnonymousClass8C2 extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C205379rY();
    public final int A00;
    public final int A01;

    public AnonymousClass8C2(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A08(parcel, 2, this.A00);
        AnonymousClass0Z9.A08(parcel, 3, this.A01);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}
