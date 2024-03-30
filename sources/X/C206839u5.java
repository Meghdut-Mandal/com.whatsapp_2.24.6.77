package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9u5  reason: invalid class name and case insensitive filesystem */
public class C206839u5 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C23181B8p(9);
    public final int A00;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
    }

    public C206839u5(Parcel parcel) {
        this.A00 = parcel.readInt();
    }

    public C206839u5(int i) {
        this.A00 = i;
    }
}
