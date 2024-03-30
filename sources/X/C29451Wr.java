package X;

import com.whatsapp.jid.UserJid;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1Wr  reason: invalid class name and case insensitive filesystem */
public final class C29451Wr {
    public final Map A00 = new HashMap();
    public final Map A01 = new AnonymousClass166(500);

    public final void A00(UserJid userJid) {
        synchronized (this) {
            Map map = this.A00;
            map.get(userJid);
            map.remove(userJid);
        }
    }
}
