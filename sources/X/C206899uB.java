package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9uB  reason: invalid class name and case insensitive filesystem */
public class C206899uB implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C23181B8p(6);
    public final long A00;
    public final String A01;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A00);
        parcel.writeString(this.A01);
    }

    public C206899uB(long j, String str) {
        this.A00 = j;
        this.A01 = str;
    }

    public C206899uB(Parcel parcel) {
        this.A00 = parcel.readLong();
        this.A01 = parcel.readString();
    }
}
