package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7z3  reason: invalid class name and case insensitive filesystem */
public class C167827z3 extends C166227vN {
    public static final Parcelable.Creator CREATOR = C23179B8n.A00(10);
    public String A00;

    public C167827z3(Parcel parcel) {
        super(parcel);
        this.A00 = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A00);
    }

    public C167827z3(Parcelable parcelable) {
        super(parcelable);
    }
}
