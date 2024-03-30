package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0HT  reason: invalid class name */
public class AnonymousClass0HT extends C08840bP {
    public static final Parcelable.Creator CREATOR = new C18580tO(6);
    public int A00;
    public Parcelable A01;
    public ClassLoader A02;

    public AnonymousClass0HT(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
        this.A00 = parcel.readInt();
        this.A01 = parcel.readParcelable(classLoader);
        this.A02 = classLoader;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("FragmentPager.SavedState{");
        AnonymousClass000.A1B(this, A0u);
        A0u.append(" position=");
        A0u.append(this.A00);
        return AnonymousClass000.A0q("}", A0u);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A01, i);
    }

    public AnonymousClass0HT(Parcelable parcelable) {
        super(parcelable);
    }
}
