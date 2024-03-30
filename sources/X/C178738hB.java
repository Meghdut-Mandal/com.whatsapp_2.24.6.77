package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.8hB  reason: invalid class name and case insensitive filesystem */
public class C178738hB extends C206269sz {
    public static final Parcelable.Creator CREATOR = new C23181B8p(2);

    public int describeContents() {
        return 0;
    }

    public C178738hB(String str) {
        super(str, "DOC_UPLOAD");
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
    }
}
