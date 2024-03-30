package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0HP  reason: invalid class name */
public class AnonymousClass0HP extends C08840bP {
    public static final Parcelable.Creator CREATOR = new C18580tO(1);
    public int A00;
    public boolean A01;

    public AnonymousClass0HP(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.A00 = parcel.readInt();
        this.A01 = AnonymousClass000.A1P(parcel.readInt());
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01 ? 1 : 0);
    }

    public AnonymousClass0HP(Parcelable parcelable) {
        super(parcelable);
    }
}
