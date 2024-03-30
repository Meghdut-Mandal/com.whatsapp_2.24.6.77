package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0HK  reason: invalid class name */
public class AnonymousClass0HK extends C08840bP {
    public static final Parcelable.Creator CREATOR = new C18580tO(5);
    public Parcelable A00;

    public AnonymousClass0HK(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.A00 = parcel.readParcelable(classLoader == null ? AnonymousClass0CP.class.getClassLoader() : classLoader);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.A00, 0);
    }

    public AnonymousClass0HK(Parcelable parcelable) {
        super(parcelable);
    }
}
