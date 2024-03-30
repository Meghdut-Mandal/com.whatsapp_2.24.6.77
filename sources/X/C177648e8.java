package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.8e8  reason: invalid class name and case insensitive filesystem */
public final class C177648e8 extends UserJid implements Parcelable {
    public static final C177648e8 A00 = new C177648e8();
    public static final Parcelable.Creator CREATOR = new C205749s9();

    public int describeContents() {
        return 0;
    }

    public String getServer() {
        return "lid_me";
    }

    public int getType() {
        return 11;
    }

    public C177648e8() {
        super("");
    }

    public DeviceJid getPrimaryDevice() {
        throw AnonymousClass001.A0E("getPrimaryDevice() must not be called for LidMeJid");
    }

    public String getObfuscatedString() {
        return getRawString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C165567td.A0m(parcel);
    }
}
