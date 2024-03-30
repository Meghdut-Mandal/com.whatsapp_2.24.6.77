package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: X.0EL  reason: invalid class name */
public class AnonymousClass0EL extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new C18580tO(7);
    public int A00;
    public int A01;
    public Parcelable A02;

    public AnonymousClass0EL(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A02 = parcel.readParcelable(classLoader);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A02, i);
    }

    public AnonymousClass0EL(Parcel parcel) {
        super(parcel);
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A02 = parcel.readParcelable((ClassLoader) null);
    }

    public AnonymousClass0EL(Parcelable parcelable) {
        super(parcelable);
    }
}
