package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9u7  reason: invalid class name and case insensitive filesystem */
public class C206859u7 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C23180B8o.A00(29);
    public final String A00;
    public final String A01;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public C206859u7(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public C206859u7(Parcel parcel) {
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }
}
