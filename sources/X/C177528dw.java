package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.8dw  reason: invalid class name and case insensitive filesystem */
public final class C177528dw extends C177618e5 implements Parcelable {
    public static final C177528dw A00 = new C177528dw();
    public static final Parcelable.Creator CREATOR = new C205809sF();

    public int describeContents() {
        return 0;
    }

    public String getServer() {
        return "broadcast";
    }

    public int getType() {
        return 5;
    }

    public C177528dw() {
        super("status");
    }

    public void writeToParcel(Parcel parcel, int i) {
        C165567td.A0m(parcel);
    }
}
