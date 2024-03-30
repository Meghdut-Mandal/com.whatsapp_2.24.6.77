package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7z4  reason: invalid class name and case insensitive filesystem */
public class C167837z4 extends C166227vN {
    public static final Parcelable.Creator CREATOR = C23179B8n.A00(11);
    public String A00;

    public C167837z4(Parcel parcel) {
        super(parcel);
        this.A00 = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A00);
    }

    public C167837z4(Parcelable parcelable) {
        super(parcelable);
    }
}
