package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9uE  reason: invalid class name and case insensitive filesystem */
public class C206929uE implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C23181B8p(7);
    public String A00;
    public final String A01;
    public final String A02;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }

    public C206929uE(String str, String str2, String str3) {
        this.A02 = str;
        this.A01 = str2;
        this.A00 = str3;
    }

    public C206929uE(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
    }
}
