package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6c4  reason: invalid class name and case insensitive filesystem */
public final class C135066c4 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C134436b2();
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public AnonymousClass3S2 A04;
    public Integer A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public String[] A0O;

    public final C135066c4 A00() {
        C135066c4 r3 = new C135066c4((Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String[]) null, 0, 0, 0, false, false, false, false, false, false);
        r3.A0E = this.A0E;
        r3.A0H = this.A0H;
        r3.A07 = this.A07;
        r3.A00 = this.A00;
        r3.A03 = this.A03;
        r3.A02 = this.A02;
        r3.A04 = this.A04;
        r3.A08 = this.A08;
        r3.A0M = this.A0M;
        r3.A0B = this.A0B;
        r3.A0L = this.A0L;
        r3.A0I = this.A0I;
        r3.A0N = this.A0N;
        r3.A06 = this.A06;
        r3.A09 = this.A09;
        r3.A0C = this.A0C;
        r3.A0D = this.A0D;
        r3.A0J = this.A0J;
        r3.A0K = this.A0K;
        r3.A0O = this.A0O;
        String str = this.A0A;
        if (str != null) {
            r3.A02(str, this.A01);
        }
        return r3;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int intValue;
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0D);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A03);
        parcel.writeString(this.A0G);
        parcel.writeString(this.A08);
        parcel.writeInt(this.A0M ? 1 : 0);
        parcel.writeInt(this.A0L ? 1 : 0);
        parcel.writeInt(this.A0J ? 1 : 0);
        parcel.writeInt(this.A0K ? 1 : 0);
        parcel.writeStringArray(this.A0O);
        parcel.writeInt(this.A0I ? 1 : 0);
        parcel.writeInt(this.A0N ? 1 : 0);
        parcel.writeString(this.A06);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A0H);
        parcel.writeString(this.A07);
        parcel.writeString(this.A0A);
        Integer num = this.A05;
        if (num == null) {
            intValue = 0;
        } else {
            parcel.writeInt(1);
            intValue = num.intValue();
        }
        parcel.writeInt(intValue);
    }

    public final C108045Ry A01() {
        if (this.A0N) {
            return C108045Ry.LOTTIE;
        }
        return C108045Ry.WEBP;
    }

    public final void A02(String str, int i) {
        this.A0A = str;
        this.A01 = i;
    }

    public final boolean A03() {
        if (this.A0A == null || this.A01 == 1) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("Sticker{");
        stringBuffer.append(", mimeType='");
        stringBuffer.append(this.A0D);
        stringBuffer.append('\'');
        stringBuffer.append(", height=");
        stringBuffer.append(this.A02);
        stringBuffer.append(", width=");
        stringBuffer.append(this.A03);
        stringBuffer.append(", metadata=");
        stringBuffer.append(this.A04);
        stringBuffer.append(", saltedFileHash='");
        stringBuffer.append(this.A0F);
        stringBuffer.append('\'');
        stringBuffer.append(", fileSize=");
        stringBuffer.append(this.A00);
        stringBuffer.append(", isLottie=");
        stringBuffer.append(this.A0N);
        stringBuffer.append('}');
        return C36381kD.A0y(stringBuffer);
    }

    public C135066c4(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String[] strArr, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A0E = str;
        this.A09 = str2;
        this.A0B = str3;
        this.A0C = str4;
        this.A0D = str5;
        this.A02 = i;
        this.A03 = i2;
        this.A0G = str6;
        this.A08 = str7;
        this.A0M = z;
        this.A0L = z2;
        this.A0J = z3;
        this.A0K = z4;
        this.A0O = strArr;
        this.A0I = z5;
        this.A0N = z6;
        this.A06 = str8;
        this.A00 = i3;
        this.A0H = str9;
        this.A07 = str10;
        this.A0A = str11;
        this.A05 = num;
    }

    public C135066c4() {
        this((Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String[]) null, 0, 0, 0, false, false, false, false, false, false);
    }
}
