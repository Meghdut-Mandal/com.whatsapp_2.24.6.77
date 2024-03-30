package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.13z  reason: invalid class name and case insensitive filesystem */
public final class C223613z extends UserJid implements Parcelable {
    public static final C223613z A00 = new C223613z();
    public static final Parcelable.Creator CREATOR = new AnonymousClass140();

    public int describeContents() {
        return 0;
    }

    public String getServer() {
        return "status_me";
    }

    public int getType() {
        return 11;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeInt(1);
    }

    public C223613z() {
        super("");
    }

    public DeviceJid getPrimaryDevice() {
        throw new UnsupportedOperationException("getPrimaryDevice() must not be called for MeJid");
    }

    public String getObfuscatedString() {
        return getRawString();
    }
}
