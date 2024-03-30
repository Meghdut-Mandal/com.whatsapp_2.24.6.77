package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: X.7vT  reason: invalid class name and case insensitive filesystem */
public class C166287vT extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = C23180B8o.A00(22);
    public int A00;
    public int A01;
    public boolean A02;

    public C166287vT(Parcel parcel) {
        super(parcel);
        this.A02 = AnonymousClass000.A1O(parcel.readInt());
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }

    public C166287vT(Parcelable parcelable) {
        super(parcelable);
    }
}
