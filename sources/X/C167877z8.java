package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7z8  reason: invalid class name and case insensitive filesystem */
public class C167877z8 extends C166227vN {
    public static final Parcelable.Creator CREATOR = C23179B8n.A00(15);
    public int A00;
    public int A01;
    public int A02;

    public C167877z8(Parcel parcel) {
        super(parcel);
        this.A02 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
    }

    public C167877z8(Parcelable parcelable) {
        super(parcelable);
    }
}
