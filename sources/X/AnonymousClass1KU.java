package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;

/* renamed from: X.1KU  reason: invalid class name */
public final class AnonymousClass1KU {
    public final AnonymousClass12O A00;

    public AnonymousClass1KU(AnonymousClass12O r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public String A00(Jid jid) {
        String str;
        if (jid instanceof PhoneUserJid) {
            return jid.user;
        }
        if (jid instanceof C223313w) {
            PhoneUserJid A0A = this.A00.A0A((C223313w) jid);
            if (A0A == null || (str = A0A.user) == null) {
                return "-1";
            }
            return str;
        } else if (jid instanceof DeviceJid) {
            return A00(((DeviceJid) jid).userJid);
        } else {
            return "-1";
        }
    }
}
