package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.8By  reason: invalid class name and case insensitive filesystem */
public final class C170098By extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C205279rO();
    public final int A00;
    public final C98834s6 A01;

    public C170098By(C98834s6 r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A08(parcel, 2, this.A00);
        C165577te.A0y(parcel, this.A01, i, A002);
    }
}
