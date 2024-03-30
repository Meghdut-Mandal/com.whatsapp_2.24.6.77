package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.8dy  reason: invalid class name and case insensitive filesystem */
public final class C177548dy extends AnonymousClass11F implements Parcelable {
    public static final C177548dy A00 = new C177548dy();
    public static final Parcelable.Creator CREATOR = new C205689s3();

    public int describeContents() {
        return 0;
    }

    public String getServer() {
        return "s.whatsapp.net";
    }

    public int getType() {
        return 9;
    }

    public C177548dy() {
        super("gdpr");
    }

    public void writeToParcel(Parcel parcel, int i) {
        C165567td.A0m(parcel);
    }
}
