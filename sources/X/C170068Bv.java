package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.8Bv  reason: invalid class name and case insensitive filesystem */
public final class C170068Bv extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C205249rL();
    public final int A00;
    public final AnonymousClass8CF A01;

    public C170068Bv(AnonymousClass8CF r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A08(parcel, 2, this.A00);
        C165577te.A0y(parcel, this.A01, i, A002);
    }
}
