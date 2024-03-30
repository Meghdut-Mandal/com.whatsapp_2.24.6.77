package X;

import com.whatsapp.jid.UserJid;
import java.util.Map;

/* renamed from: X.61j  reason: invalid class name and case insensitive filesystem */
public final class C1258161j {
    public String A00;
    public Map A01;

    public final synchronized Map A00(UserJid userJid) {
        Map map;
        AnonymousClass00C.A0D(userJid, 0);
        if (this.A01 == null || !AnonymousClass00C.A0J(userJid.getRawString(), this.A00)) {
            this.A00 = userJid.getRawString();
            this.A01 = AnonymousClass001.A0J();
        }
        map = this.A01;
        if (map == null) {
            throw AnonymousClass001.A09("sessionState must not be null");
        }
        return map;
    }
}
