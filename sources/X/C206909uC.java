package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9uC  reason: invalid class name and case insensitive filesystem */
public class C206909uC implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C23181B8p(12);
    public final B5M A00;
    public final String A01;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
    }

    public C206909uC(B5M b5m, String str) {
        this.A01 = str;
        this.A00 = b5m;
    }

    public C206909uC(Parcel parcel) {
        this.A01 = C90514aH.A0u(parcel);
        this.A00 = (B5M) C36411kG.A0H(parcel, B5M.class);
    }
}
