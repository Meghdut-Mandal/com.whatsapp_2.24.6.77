package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.13x  reason: invalid class name and case insensitive filesystem */
public final class C223413x extends DeviceJid implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C223513y();
    public final int A00;
    public final UserJid A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C223413x(UserJid userJid, int i) {
        super(userJid, i);
        AnonymousClass00C.A0D(userJid, 1);
        this.A01 = userJid;
        this.A00 = i;
    }

    public int describeContents() {
        return 0;
    }

    public String getServer() {
        return "s.whatsapp.net";
    }

    public int getType() {
        return 17;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A00);
    }

    public int getDevice() {
        return this.A00;
    }
}
