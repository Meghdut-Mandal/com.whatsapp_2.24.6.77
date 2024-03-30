package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0KE  reason: invalid class name */
public class AnonymousClass0KE extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C08070a9();
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final long A05;
    public final long A06;
    public final String A07;
    public final String A08;

    public AnonymousClass0KE(String str, String str2, int i, int i2, int i3, int i4, int i5, long j, long j2) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A05 = j;
        this.A06 = j2;
        this.A07 = str;
        this.A08 = str2;
        this.A03 = i4;
        this.A04 = i5;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A08(parcel, 1, this.A00);
        AnonymousClass0Z9.A08(parcel, 2, this.A01);
        AnonymousClass0Z9.A08(parcel, 3, this.A02);
        AnonymousClass0Z9.A09(parcel, 4, this.A05);
        AnonymousClass0Z9.A09(parcel, 5, this.A06);
        AnonymousClass0Z9.A0C(parcel, this.A07, 6, false);
        AnonymousClass0Z9.A0C(parcel, this.A08, 7, false);
        AnonymousClass0Z9.A08(parcel, 8, this.A03);
        AnonymousClass0Z9.A08(parcel, 9, this.A04);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}
