package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: X.0EI  reason: invalid class name */
public class AnonymousClass0EI extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new C18440tA(3);
    public boolean A00;

    public AnonymousClass0EI(Parcel parcel) {
        super(parcel);
        this.A00 = AnonymousClass000.A1P(parcel.readByte());
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.A00 ? (byte) 1 : 0);
    }

    public AnonymousClass0EI(Parcelable parcelable) {
        super(parcelable);
    }
}
