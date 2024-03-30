package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* renamed from: X.9uI  reason: invalid class name and case insensitive filesystem */
public class C206949uI implements Parcelable {
    public static final Parcelable.Creator CREATOR = C23180B8o.A00(17);
    public final double A00;
    public final int A01;
    public final int A02;
    public final Double A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A0C);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A04.intValue());
        parcel.writeDouble(this.A00);
        parcel.writeInt(this.A02);
        parcel.writeString(this.A08);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0B);
        parcel.writeSerializable(this.A03);
        parcel.writeString(this.A09);
        parcel.writeString(this.A07);
        parcel.writeString(this.A06);
        parcel.writeInt(this.A01);
    }

    public C206949uI(Parcel parcel) {
        Double d;
        this.A0C = parcel.readString();
        this.A05 = parcel.readString();
        this.A04 = Integer.valueOf(parcel.readInt());
        this.A00 = parcel.readDouble();
        this.A02 = parcel.readInt();
        this.A08 = parcel.readString();
        this.A0A = parcel.readString();
        this.A0B = parcel.readString();
        Serializable readSerializable = parcel.readSerializable();
        if (readSerializable != null) {
            d = (Double) readSerializable;
        } else {
            d = null;
        }
        this.A03 = d;
        this.A09 = parcel.readString();
        this.A07 = parcel.readString();
        this.A06 = parcel.readString();
        this.A01 = parcel.readInt();
    }

    public C206949uI(Double d, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, double d2, int i, int i2) {
        this.A0C = str7;
        this.A04 = num;
        this.A05 = str8;
        this.A02 = i;
        this.A00 = d2;
        this.A03 = d;
        this.A08 = str;
        this.A0A = str2;
        this.A0B = str3;
        this.A09 = str4;
        this.A07 = str5;
        this.A06 = str6;
        this.A01 = i2;
    }
}
