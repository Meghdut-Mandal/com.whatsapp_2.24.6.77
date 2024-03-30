package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0KA  reason: invalid class name */
public class AnonymousClass0KA extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C07840Zm();
    public long A00;
    public boolean A01;
    public final int A02;
    public final boolean A03;

    public AnonymousClass0KA(int i, long j, boolean z, boolean z2) {
        this.A02 = i;
        this.A01 = z;
        this.A00 = j;
        this.A03 = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A08(parcel, 1, this.A02);
        AnonymousClass0Z9.A0A(parcel, 2, this.A01);
        AnonymousClass0Z9.A09(parcel, 3, this.A00);
        AnonymousClass0Z9.A0A(parcel, 4, this.A03);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}
