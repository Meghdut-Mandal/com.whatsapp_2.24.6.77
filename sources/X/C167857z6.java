package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7z6  reason: invalid class name and case insensitive filesystem */
public class C167857z6 extends C166227vN {
    public static final Parcelable.Creator CREATOR = C23179B8n.A00(14);
    public int A00;

    public C167857z6(Parcelable parcelable, int i) {
        super(parcelable);
        this.A00 = i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A00);
    }

    public C167857z6(Parcel parcel) {
        super(parcel);
        this.A00 = parcel.readInt();
    }
}
