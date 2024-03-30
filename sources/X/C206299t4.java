package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9t4  reason: invalid class name and case insensitive filesystem */
public class C206299t4 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C23179B8n.A00(41);
    public final long A00;
    public final long A01;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
    }

    public C206299t4(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }
}
