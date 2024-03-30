package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0HN  reason: invalid class name */
public class AnonymousClass0HN extends C08840bP {
    public static final Parcelable.Creator CREATOR = new C18580tO(13);
    public Bundle A00;

    public AnonymousClass0HN(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.A00 = parcel.readBundle(classLoader == null ? getClass().getClassLoader() : classLoader);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeBundle(this.A00);
    }

    public AnonymousClass0HN(Parcelable parcelable) {
        super(parcelable);
    }
}
