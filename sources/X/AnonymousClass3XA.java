package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.VoipActivityV2;

/* renamed from: X.3XA  reason: invalid class name */
public class AnonymousClass3XA implements Parcelable {
    public final /* synthetic */ UserJid A00;
    public final /* synthetic */ VoipActivityV2 A01;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
    }

    public AnonymousClass3XA(UserJid userJid, VoipActivityV2 voipActivityV2) {
        this.A01 = voipActivityV2;
        this.A00 = userJid;
    }
}
