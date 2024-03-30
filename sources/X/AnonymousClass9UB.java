package X;

import com.whatsapp.jid.UserJid;
import java.util.Set;

/* renamed from: X.9UB  reason: invalid class name */
public final class AnonymousClass9UB {
    public final AnonymousClass1KP A00;
    public final AnonymousClass1KK A01;
    public final AnonymousClass9VW A02;

    public AnonymousClass9UB(AnonymousClass1KK r2, AnonymousClass1KP r3, AnonymousClass9VW r4) {
        AnonymousClass00C.A0D(r2, 1);
        this.A01 = r2;
        this.A00 = r3;
        this.A02 = r4;
    }

    public final AnonymousClass9W6 A00(C207109uZ r4, Set set) {
        if (!this.A00.A02(r4) || set == null) {
            return null;
        }
        AnonymousClass9VW r0 = this.A02;
        return new AnonymousClass9W6(set, r0.A01, r0.A00);
    }

    public final void A01(UserJid userJid, Set set, C006302t r6) {
        this.A01.A0C(new BAH(r6, this, set, 3), userJid);
    }
}
