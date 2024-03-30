package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.8CZ  reason: invalid class name */
public class AnonymousClass8CZ extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C204919qm();
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public String A06;
    public boolean A07;

    public AnonymousClass8CZ(String str, int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        this.A05 = i;
        this.A03 = i2;
        this.A00 = i3;
        this.A01 = i4;
        this.A02 = i5;
        this.A04 = i6;
        this.A07 = z;
        this.A06 = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A08(parcel, 2, this.A05);
        AnonymousClass0Z9.A08(parcel, 3, this.A03);
        AnonymousClass0Z9.A08(parcel, 4, this.A00);
        AnonymousClass0Z9.A08(parcel, 5, this.A01);
        AnonymousClass0Z9.A08(parcel, 6, this.A02);
        AnonymousClass0Z9.A08(parcel, 7, this.A04);
        AnonymousClass0Z9.A0A(parcel, 8, this.A07);
        C165597tg.A11(parcel, this.A06, 9, A002);
    }

    public AnonymousClass8CZ() {
    }
}
