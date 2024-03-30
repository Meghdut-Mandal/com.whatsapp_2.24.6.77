package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3XB  reason: invalid class name */
public final class AnonymousClass3XB implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass3X7();
    public final long A00;
    public final String A01;
    public final String A02;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeLong(this.A00);
    }

    public AnonymousClass3XB(long j, String str, String str2) {
        C36321k7.A0x(str, str2);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = j;
    }
}
