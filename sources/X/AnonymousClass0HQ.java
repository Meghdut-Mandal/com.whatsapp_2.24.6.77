package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0HQ  reason: invalid class name */
public class AnonymousClass0HQ extends C08840bP {
    public static final Parcelable.Creator CREATOR = new C18580tO(8);
    public float A00;
    public int A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;

    public AnonymousClass0HQ(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        boolean z = true;
        this.A04 = AnonymousClass000.A1P(parcel.readByte());
        this.A03 = AnonymousClass000.A1P(parcel.readByte());
        this.A01 = parcel.readInt();
        this.A00 = parcel.readFloat();
        this.A02 = parcel.readByte() == 0 ? false : z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.A04 ? (byte) 1 : 0);
        parcel.writeByte(this.A03 ? (byte) 1 : 0);
        parcel.writeInt(this.A01);
        parcel.writeFloat(this.A00);
        parcel.writeByte(this.A02 ? (byte) 1 : 0);
    }

    public AnonymousClass0HQ(Parcelable parcelable) {
        super(parcelable);
    }
}
