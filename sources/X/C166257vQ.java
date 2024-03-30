package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: X.7vQ  reason: invalid class name and case insensitive filesystem */
public class C166257vQ extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = C23180B8o.A00(13);
    public int A00;

    public C166257vQ(Parcel parcel) {
        super(parcel);
        this.A00 = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A00);
    }

    public C166257vQ(Parcelable parcelable) {
        super(parcelable);
    }
}
