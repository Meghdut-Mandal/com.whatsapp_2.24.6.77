package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9t6  reason: invalid class name and case insensitive filesystem */
public class C206309t6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C23179B8n.A00(34);
    public final double A00;
    public final double A01;
    public final double A02;
    public final double A03;
    public final double A04;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.A00);
        parcel.writeDouble(this.A01);
        parcel.writeDouble(this.A02);
        parcel.writeDouble(this.A03);
        parcel.writeDouble(this.A04);
    }

    public C206309t6(Parcel parcel) {
        this.A00 = parcel.readDouble();
        this.A01 = parcel.readDouble();
        this.A02 = parcel.readDouble();
        this.A03 = parcel.readDouble();
        this.A04 = parcel.readDouble();
    }
}
