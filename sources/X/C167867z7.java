package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7z7  reason: invalid class name and case insensitive filesystem */
public class C167867z7 extends C166227vN {
    public static final Parcelable.Creator CREATOR = C23179B8n.A00(16);
    public boolean A00;

    public C167867z7(Parcel parcel) {
        super(parcel);
        this.A00 = AnonymousClass000.A1O(parcel.readInt());
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A00 ? 1 : 0);
    }

    public C167867z7(Parcelable parcelable) {
        super(parcelable);
    }
}
