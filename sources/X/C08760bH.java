package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0bH  reason: invalid class name and case insensitive filesystem */
public class C08760bH implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C18440tA(18);
    public int A00;
    public AnonymousClass0ED A01;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A01, 0);
    }

    public C08760bH(Parcel parcel) {
        this.A00 = parcel.readInt();
        this.A01 = (AnonymousClass0ED) parcel.readParcelable(getClass().getClassLoader());
    }

    public C08760bH() {
    }
}
