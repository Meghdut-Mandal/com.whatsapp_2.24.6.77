package X;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.8Cb  reason: invalid class name and case insensitive filesystem */
public class C170128Cb extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C204909ql();
    public int A00;
    public int A01;
    public AnonymousClass8CW A02;
    public AnonymousClass8CX A03;
    public C170118Ca A04;
    public AnonymousClass8CT A05;
    public AnonymousClass8CO A06;
    public AnonymousClass8CP A07;
    public AnonymousClass8CQ A08;
    public AnonymousClass8CR A09;
    public AnonymousClass8CS A0A;
    public String A0B;
    public String A0C;
    public boolean A0D;
    public byte[] A0E;
    public Point[] A0F;

    public C170128Cb(AnonymousClass8CW r2, AnonymousClass8CX r3, C170118Ca r4, AnonymousClass8CT r5, AnonymousClass8CO r6, AnonymousClass8CP r7, AnonymousClass8CQ r8, AnonymousClass8CR r9, AnonymousClass8CS r10, String str, String str2, byte[] bArr, Point[] pointArr, int i, int i2, boolean z) {
        this.A00 = i;
        this.A0C = str;
        this.A0E = bArr;
        this.A0B = str2;
        this.A01 = i2;
        this.A0F = pointArr;
        this.A0D = z;
        this.A05 = r5;
        this.A07 = r7;
        this.A08 = r8;
        this.A0A = r10;
        this.A09 = r9;
        this.A06 = r6;
        this.A02 = r2;
        this.A03 = r3;
        this.A04 = r4;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A08(parcel, 2, this.A00);
        AnonymousClass0Z9.A0C(parcel, this.A0C, 3, false);
        AnonymousClass0Z9.A0C(parcel, this.A0B, 4, false);
        AnonymousClass0Z9.A08(parcel, 5, this.A01);
        AnonymousClass0Z9.A0G(parcel, this.A0F, 6, i);
        AnonymousClass0Z9.A0B(parcel, this.A05, 7, i, false);
        AnonymousClass0Z9.A0B(parcel, this.A07, 8, i, false);
        AnonymousClass0Z9.A0B(parcel, this.A08, 9, i, false);
        AnonymousClass0Z9.A0B(parcel, this.A0A, 10, i, false);
        AnonymousClass0Z9.A0B(parcel, this.A09, 11, i, false);
        AnonymousClass0Z9.A0B(parcel, this.A06, 12, i, false);
        AnonymousClass0Z9.A0B(parcel, this.A02, 13, i, false);
        AnonymousClass0Z9.A0B(parcel, this.A03, 14, i, false);
        AnonymousClass0Z9.A0B(parcel, this.A04, 15, i, false);
        AnonymousClass0Z9.A0F(parcel, this.A0E, 16, false);
        AnonymousClass0Z9.A0A(parcel, 17, this.A0D);
        AnonymousClass0Z9.A07(parcel, A002);
    }

    public C170128Cb() {
    }
}
