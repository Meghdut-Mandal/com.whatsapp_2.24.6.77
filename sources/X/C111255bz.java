package X;

import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.5bz  reason: invalid class name and case insensitive filesystem */
public abstract class C111255bz {
    public static UserJid A00(AnonymousClass12O r2, C20810yC r3, UserJid userJid) {
        boolean z = userJid instanceof C223313w;
        if (r3.A0E(5143)) {
            if (!z) {
                return r2.A09((PhoneUserJid) userJid);
            }
        } else if (z) {
            return r2.A0A((C223313w) userJid);
        }
        return userJid;
    }
}
