package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.8Bq  reason: invalid class name and case insensitive filesystem */
public final class C170018Bq extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C205199rG();
    public final int A00;
    public final boolean A01;

    public C170018Bq(int i, boolean z) {
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
