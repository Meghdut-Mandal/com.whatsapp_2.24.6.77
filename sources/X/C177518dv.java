package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.8dv  reason: invalid class name and case insensitive filesystem */
public final class C177518dv extends C177618e5 {
    public static final C177518dv A00 = new C177518dv();
    public static final Parcelable.Creator CREATOR = new C205759sA();

    public int describeContents() {
        return 0;
    }

    public String getServer() {
        return "broadcast";
    }

    public int getType() {
        return 6;
    }

    public C177518dv() {
        super("location");
    }

    public void writeToParcel(Parcel parcel, int i) {
        C165567td.A0m(parcel);
    }
}
