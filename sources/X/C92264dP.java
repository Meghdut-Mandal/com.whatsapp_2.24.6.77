package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: X.4dP  reason: invalid class name and case insensitive filesystem */
public class C92264dP extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new C163937r0(15);
    public long A00;
    public long A01;
    public boolean A02;

    public C92264dP(Parcel parcel) {
        super(parcel);
        this.A01 = parcel.readLong();
        this.A00 = parcel.readLong();
        this.A02 = AnonymousClass000.A1O(parcel.readInt());
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
        parcel.writeInt(this.A02 ? 1 : 0);
    }

    public C92264dP(Parcelable parcelable) {
        super(parcelable);
    }
}
