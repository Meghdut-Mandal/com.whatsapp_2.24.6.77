package X;

import com.whatsapp.jid.UserJid;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.9R1  reason: invalid class name */
public final class AnonymousClass9R1 {
    public final AnonymousClass6TX A00;
    public final ConcurrentHashMap A01 = C90524aI.A0s();

    public final void A00(UserJid userJid, int i) {
        Number number = (Number) C90484aE.A0j(this.A01, i);
        if (number != null) {
            this.A00.A03(new C122765vO(userJid, (String) null, false, false), number.intValue(), i);
        }
    }

    public AnonymousClass9R1(AnonymousClass6TX r2) {
        this.A00 = r2;
    }
}
