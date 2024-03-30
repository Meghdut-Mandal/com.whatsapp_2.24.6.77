package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.8dz  reason: invalid class name and case insensitive filesystem */
public final class C177558dz extends DeviceJid implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C205709s5();
    public final int A00;
    public final UserJid A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C177558dz(UserJid userJid, int i) {
        super(userJid, i);
        AnonymousClass00C.A0D(userJid, 1);
        this.A01 = userJid;
        this.A00 = i;
        if (i != 99) {
            throw new C19740wR(AnonymousClass000.A0r("device_id should be 99 for hosted device, is ", AnonymousClass000.A0u(), i));
        }
    }

    public int describeContents() {
        return 0;
    }

    public String getServer() {
        return "hosted";
    }

    public int getType() {
        return 24;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A00);
    }

    public int getDevice() {
        return this.A00;
    }

    public String getRawString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(this.user);
        A0u.append(':');
        A0u.append(this.A00);
        A0u.append('@');
        return AnonymousClass000.A0q("hosted", A0u);
    }
}
