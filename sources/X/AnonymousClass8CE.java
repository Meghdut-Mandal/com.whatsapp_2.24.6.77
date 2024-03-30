package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.8CE  reason: invalid class name */
public class AnonymousClass8CE extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C205039qy();
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final float A06;
    public final float A07;
    public final float A08;
    public final float A09;
    public final float A0A;
    public final int A0B;
    public final AnonymousClass8CB[] A0C;
    public final C169948Bj[] A0D;
    public final int A0E;

    public AnonymousClass8CE(AnonymousClass8CB[] r1, C169948Bj[] r2, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, int i, int i2) {
        this.A0E = i;
        this.A0B = i2;
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
        this.A03 = f4;
        this.A04 = f5;
        this.A05 = f6;
        this.A06 = f7;
        this.A0C = r1;
        this.A07 = f8;
        this.A08 = f9;
        this.A09 = f10;
        this.A0D = r2;
        this.A0A = f11;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A08(parcel, 1, this.A0E);
        AnonymousClass0Z9.A08(parcel, 2, this.A0B);
        AnonymousClass0Z9.A06(parcel, this.A00, 3);
        AnonymousClass0Z9.A06(parcel, this.A01, 4);
        AnonymousClass0Z9.A06(parcel, this.A02, 5);
        AnonymousClass0Z9.A06(parcel, this.A03, 6);
        AnonymousClass0Z9.A06(parcel, this.A04, 7);
        AnonymousClass0Z9.A06(parcel, this.A05, 8);
        AnonymousClass0Z9.A0G(parcel, this.A0C, 9, i);
        AnonymousClass0Z9.A06(parcel, this.A07, 10);
        AnonymousClass0Z9.A06(parcel, this.A08, 11);
        AnonymousClass0Z9.A06(parcel, this.A09, 12);
        AnonymousClass0Z9.A0G(parcel, this.A0D, 13, i);
        AnonymousClass0Z9.A06(parcel, this.A06, 14);
        AnonymousClass0Z9.A06(parcel, this.A0A, 15);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}
