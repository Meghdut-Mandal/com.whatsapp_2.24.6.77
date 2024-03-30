package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.8CD  reason: invalid class name */
public final class AnonymousClass8CD extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C204689qP();
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public AnonymousClass8CD(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A00 = z;
        this.A01 = z2;
        this.A02 = z3;
        this.A03 = z4;
        this.A04 = z5;
        this.A05 = z6;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A0A(parcel, 1, this.A00);
        AnonymousClass0Z9.A0A(parcel, 2, this.A01);
        AnonymousClass0Z9.A0A(parcel, 3, this.A02);
        AnonymousClass0Z9.A0A(parcel, 4, this.A03);
        AnonymousClass0Z9.A0A(parcel, 5, this.A04);
        AnonymousClass0Z9.A0A(parcel, 6, this.A05);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}
