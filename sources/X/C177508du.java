package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.UserJid;

/* renamed from: X.8du  reason: invalid class name and case insensitive filesystem */
public class C177508du extends AnonymousClass149 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C205739s8();
    public final int A00;
    public final UserJid A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C177508du(UserJid userJid, int i) {
        super(userJid, i);
        AnonymousClass00C.A0D(userJid, 1);
        this.A01 = userJid;
        this.A00 = i;
    }

    public int describeContents() {
        return 0;
    }

    public int getAgent() {
        return 1;
    }

    public String getServer() {
        return "lid";
    }

    public int getType() {
        return 19;
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
