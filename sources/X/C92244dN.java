package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: X.4dN  reason: invalid class name and case insensitive filesystem */
public class C92244dN extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new C163937r0(17);
    public float A00;
    public float A01;

    public C92244dN(Parcel parcel) {
        super(parcel);
        this.A01 = parcel.readFloat();
        this.A00 = parcel.readFloat();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.A01);
        parcel.writeFloat(this.A00);
    }

    public C92244dN(Parcelable parcelable) {
        super(parcelable);
    }
}
