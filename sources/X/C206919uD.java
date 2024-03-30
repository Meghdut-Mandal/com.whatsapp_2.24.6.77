package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9uD  reason: invalid class name and case insensitive filesystem */
public class C206919uD implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C23181B8p(19);
    public final String A00;
    public final String A01;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public C206919uD(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public C206919uD(Parcel parcel) {
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }
}
