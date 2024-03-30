package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.8C6  reason: invalid class name */
public final class AnonymousClass8C6 extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C205189rF();
    public final int A00;
    public final boolean A01;
    public final boolean A02;

    public AnonymousClass8C6(int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A01 = z;
        this.A02 = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A08(parcel, 2, this.A00);
        AnonymousClass0Z9.A0A(parcel, 3, this.A01);
        AnonymousClass0Z9.A0A(parcel, 4, this.A02);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}
