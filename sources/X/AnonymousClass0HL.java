package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0HL  reason: invalid class name */
public class AnonymousClass0HL extends C08840bP {
    public static final Parcelable.Creator CREATOR = new C18580tO(10);
    public boolean A00;

    public AnonymousClass0HL(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            getClass().getClassLoader();
        }
        this.A00 = AnonymousClass000.A1O(parcel.readInt());
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A00 ? 1 : 0);
    }

    public AnonymousClass0HL(Parcelable parcelable) {
        super(parcelable);
    }
}
