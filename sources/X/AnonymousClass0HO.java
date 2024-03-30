package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* renamed from: X.0HO  reason: invalid class name */
public class AnonymousClass0HO extends C08840bP {
    public static final Parcelable.Creator CREATOR = new C18580tO(14);
    public final int A00;

    public AnonymousClass0HO(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.A00 = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A00);
    }

    public AnonymousClass0HO(Parcelable parcelable, SideSheetBehavior sideSheetBehavior) {
        super(parcelable);
        this.A00 = sideSheetBehavior.A05;
    }
}
