package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0HM  reason: invalid class name */
public class AnonymousClass0HM extends C08840bP {
    public static final Parcelable.Creator CREATOR = new C18580tO(11);
    public boolean A00;

    public AnonymousClass0HM(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.A00 = AnonymousClass000.A1O(parcel.readInt());
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A00 ? 1 : 0);
    }

    public AnonymousClass0HM(Parcelable parcelable) {
        super(parcelable);
    }
}
