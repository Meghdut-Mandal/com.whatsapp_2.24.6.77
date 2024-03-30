package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.8Bz  reason: invalid class name and case insensitive filesystem */
public final class C170108Bz extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C205309rR();
    public final int A00;
    public final C170198Ci A01;

    public C170108Bz(C170198Ci r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A08(parcel, 2, this.A00);
        C165577te.A0y(parcel, this.A01, i, A002);
    }
}
