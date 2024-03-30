package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.8hC  reason: invalid class name and case insensitive filesystem */
public class C178748hC extends C206269sz {
    public static final Parcelable.Creator CREATOR = new C23181B8p(3);
    public final boolean A00;

    public int describeContents() {
        return 0;
    }

    public C178748hC(String str, boolean z) {
        super(str, "WEBVIEW");
        this.A00 = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeByte(this.A00 ? (byte) 1 : 0);
    }
}
