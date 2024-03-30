package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.8Bi  reason: invalid class name */
public final class AnonymousClass8Bi extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C204879qi();
    public final int A00;
    public final boolean A01;

    public AnonymousClass8Bi(int i, boolean z) {
        this.A00 = i;
        this.A01 = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A08(parcel, 2, this.A00);
        AnonymousClass0Z9.A0A(parcel, 3, this.A01);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}
