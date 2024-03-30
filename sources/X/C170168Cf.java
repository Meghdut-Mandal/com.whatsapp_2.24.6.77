package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.8Cf  reason: invalid class name and case insensitive filesystem */
public final class C170168Cf extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C204619qI();
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;

    public C170168Cf(int i, int i2, int i3, long j, int i4) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A04 = j;
        this.A03 = i4;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A08(parcel, 2, this.A00);
        AnonymousClass0Z9.A08(parcel, 3, this.A01);
        AnonymousClass0Z9.A08(parcel, 4, this.A02);
        AnonymousClass0Z9.A09(parcel, 5, this.A04);
        AnonymousClass0Z9.A08(parcel, 6, this.A03);
        AnonymousClass0Z9.A07(parcel, A002);
    }

    public C170168Cf() {
    }
}
