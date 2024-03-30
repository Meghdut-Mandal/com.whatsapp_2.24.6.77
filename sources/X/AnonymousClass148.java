package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.148  reason: invalid class name */
public final class AnonymousClass148 extends C223213v implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C66603Wp();
    public final String A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass148(String str) {
        super(str);
        AnonymousClass00C.A0D(str, 1);
        this.A00 = str;
        throw new C19740wR("Invalid JID");
    }

    public int describeContents() {
        return 0;
    }

    public String getServer() {
        return "interop";
    }

    public int getType() {
        return 22;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeString(this.A00);
    }
}
