package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0bE  reason: invalid class name and case insensitive filesystem */
public class C08730bE implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C18440tA(2);
    public int A00;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
    }

    public C08730bE(Parcel parcel) {
        this.A00 = parcel.readInt();
    }

    public C08730bE() {
    }
}
