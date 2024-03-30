package X;

import com.whatsapp.jid.UserJid;
import java.util.Iterator;

/* renamed from: X.2ZO  reason: invalid class name */
public final class AnonymousClass2ZO extends C19590wC {
    public final void A00(UserJid userJid) {
        Iterator A0s = C36361kB.A0s(this);
        while (A0s.hasNext()) {
            C69393dS r1 = (C69393dS) A0s.next();
            if (C1901797e.A00(r1.A04.A06, userJid)) {
                r1.BXq(userJid);
            }
        }
    }
}
