package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.UserJid;

/* renamed from: X.8e6  reason: invalid class name and case insensitive filesystem */
public final class C177628e6 extends UserJid implements Parcelable {
    public static final C177628e6 A00 = new C177628e6();
    public static final Parcelable.Creator CREATOR = new C205729s7();

    public int describeContents() {
        return 0;
    }

    public String getServer() {
        return "s.whatsapp.net";
    }

    public int getType() {
        return 8;
    }

    public C177628e6() {
        super("Server");
    }

    public String getObfuscatedString() {
        return getRawString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C165567td.A0m(parcel);
    }
}
