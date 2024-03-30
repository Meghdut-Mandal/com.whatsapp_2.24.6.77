package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0bP  reason: invalid class name and case insensitive filesystem */
public abstract class C08840bP implements Parcelable {
    public static final C08840bP A01 = new AnonymousClass0HI();
    public static final Parcelable.Creator CREATOR = new C18580tO(3);
    public final Parcelable A00;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
    }

    public C08840bP(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.A00 = readParcelable == null ? A01 : readParcelable;
    }

    public C08840bP(Parcelable parcelable) {
        if (parcelable != null) {
            this.A00 = parcelable == A01 ? null : parcelable;
            return;
        }
        throw AnonymousClass001.A08("superState must not be null");
    }

    public C08840bP() {
        this.A00 = null;
    }
}
