package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6bn  reason: invalid class name and case insensitive filesystem */
public class C134906bn implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C163937r0(29);
    public long A00;
    public String A01;
    public boolean A02;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeLong(this.A00);
        parcel.writeInt(this.A02 ? 1 : 0);
    }

    public C134906bn(long j, String str, boolean z) {
        this.A01 = str;
        this.A00 = j;
        this.A02 = z;
    }

    public C134906bn(Parcel parcel) {
        String readString = parcel.readString();
        this.A01 = readString == null ? "UNKNOWN" : readString;
        this.A00 = parcel.readLong();
        this.A02 = AnonymousClass000.A1O(parcel.readInt());
    }
}
