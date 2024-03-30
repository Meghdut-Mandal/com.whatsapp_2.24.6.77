package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.UserJid;

/* renamed from: X.8e7  reason: invalid class name and case insensitive filesystem */
public final class C177638e7 extends UserJid implements Parcelable {
    public static final C177638e7 A00 = new C177638e7();
    public static final Parcelable.Creator CREATOR = new C205799sE();

    public int describeContents() {
        return 0;
    }

    public String getServer() {
        return "s.whatsapp.net";
    }

    public int getType() {
        return 7;
    }

    public C177638e7() {
        super("0");
    }

    public String getObfuscatedString() {
        return getRawString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C165567td.A0m(parcel);
    }
}
