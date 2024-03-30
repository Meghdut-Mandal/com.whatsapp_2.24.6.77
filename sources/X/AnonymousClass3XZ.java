package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3XZ  reason: invalid class name */
public class AnonymousClass3XZ implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C89864Ye(0);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A03);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }

    public AnonymousClass3XZ(Parcel parcel) {
        this.A03 = parcel.readInt();
        String readString = parcel.readString();
        C18740tg.A06(readString);
        this.A05 = readString;
        this.A06 = AnonymousClass000.A1O(parcel.readInt());
        String readString2 = parcel.readString();
        C18740tg.A06(readString2);
        this.A04 = readString2;
        this.A02 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
    }

    public AnonymousClass3XZ(String str, String str2, int i, int i2, int i3, int i4, boolean z) {
        this.A03 = i;
        this.A05 = str;
        this.A06 = z;
        this.A04 = str2;
        this.A02 = i2;
        this.A00 = i3;
        this.A01 = i4;
    }
}
