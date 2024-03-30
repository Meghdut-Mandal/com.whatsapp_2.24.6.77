package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0Kw  reason: invalid class name and case insensitive filesystem */
public final class C04500Kw extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C08170aJ();
    public final int A00;
    public final C04530Kz A01;
    public final String A02;

    public C04500Kw(C04530Kz r2, String str) {
        this.A00 = 1;
        this.A02 = str;
        this.A01 = r2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A08(parcel, 1, this.A00);
        AnonymousClass0Z9.A0B(parcel, this.A01, 3, i, C10440eF.A06(parcel, this.A02));
        AnonymousClass0Z9.A07(parcel, A002);
    }

    public C04500Kw(C04530Kz r1, String str, int i) {
        this.A00 = i;
        this.A02 = str;
        this.A01 = r1;
    }
}
