package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3Xa  reason: invalid class name and case insensitive filesystem */
public final class C66713Xa implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass3X3();
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public AnonymousClass3XC A05;
    public C52082or A06;
    public AnonymousClass3KJ A07;
    public AnonymousClass3KE A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public String A0Q;
    public String A0R;
    public boolean A0S;
    public boolean A0T;
    public int A0U;

    public C66713Xa(C52082or r23) {
        this((AnonymousClass3XC) null, r23, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, 0, false);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        C36391kE.A1E(parcel, this.A06);
        parcel.writeString(this.A0G);
        parcel.writeString(this.A0K);
        parcel.writeInt(this.A02);
        parcel.writeString(this.A0C);
        parcel.writeInt(this.A0U);
        parcel.writeInt(this.A0T ? 1 : 0);
        parcel.writeString(this.A0I);
        parcel.writeString(this.A0M);
        parcel.writeString(this.A0O);
        parcel.writeString(this.A0P);
        parcel.writeString(this.A0Q);
        parcel.writeLong(this.A04);
        parcel.writeString(this.A0H);
        parcel.writeInt(this.A03);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0E);
        AnonymousClass3XC r1 = this.A05;
        if (r1 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            r1.writeToParcel(parcel, i);
        }
        parcel.writeString(this.A0L);
        parcel.writeString(this.A0N);
    }

    public static long A00(C66713Xa r3) {
        return Long.parseLong(r3.A0K) * 1000;
    }

    public C66713Xa(AnonymousClass3XC r3, C52082or r4, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i, int i2, int i3, long j, boolean z) {
        AnonymousClass00C.A0D(r4, 1);
        this.A06 = r4;
        this.A0G = str;
        this.A0K = str2;
        this.A02 = i;
        this.A0C = str3;
        this.A0U = i2;
        this.A0T = z;
        this.A0I = str4;
        this.A0M = str5;
        this.A0O = str6;
        this.A0P = str7;
        this.A0Q = str8;
        this.A04 = j;
        this.A0H = str9;
        this.A03 = i3;
        this.A0B = str10;
        this.A0E = str11;
        this.A05 = r3;
        this.A0L = str12;
        this.A0N = str13;
    }
}
