package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.8CV  reason: invalid class name */
public final class AnonymousClass8CV extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C205049qz();
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public boolean A04;
    public boolean A05;

    public AnonymousClass8CV(float f, int i, int i2, int i3, boolean z, boolean z2) {
        this.A01 = i;
        this.A02 = i2;
        this.A03 = i3;
        this.A04 = z;
        this.A05 = z2;
        this.A00 = f;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A08(parcel, 2, this.A01);
        AnonymousClass0Z9.A08(parcel, 3, this.A02);
        AnonymousClass0Z9.A08(parcel, 4, this.A03);
        AnonymousClass0Z9.A0A(parcel, 5, this.A04);
        AnonymousClass0Z9.A0A(parcel, 6, this.A05);
        AnonymousClass0Z9.A06(parcel, this.A00, 7);
        AnonymousClass0Z9.A07(parcel, A002);
    }

    public AnonymousClass8CV() {
    }
}
