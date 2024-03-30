package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: X.0bC  reason: invalid class name and case insensitive filesystem */
public class C08710bC implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C18440tA(6);
    public final List A00;
    public final List A01;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.A01);
        parcel.writeTypedList(this.A00);
    }

    public C08710bC(Parcel parcel) {
        this.A01 = parcel.createStringArrayList();
        this.A00 = parcel.createTypedArrayList(C08790bK.CREATOR);
    }
}
