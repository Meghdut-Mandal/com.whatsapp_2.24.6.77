package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: X.7vR  reason: invalid class name and case insensitive filesystem */
public class C166267vR extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = C23180B8o.A00(19);
    public final String A00;
    public final String A01;

    public C166267vR(Parcelable parcelable, String str, String str2) {
        super(parcelable);
        this.A00 = str;
        this.A01 = str2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public C166267vR(Parcel parcel) {
        super(parcel);
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }
}
