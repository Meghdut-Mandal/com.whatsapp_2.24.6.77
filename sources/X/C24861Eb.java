package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.PaymentConfiguration;
import java.util.Map;

/* renamed from: X.1Eb  reason: invalid class name and case insensitive filesystem */
public class C24861Eb {
    public PaymentConfiguration A00;
    public Map A01;
    public final AnonymousClass16S A02;
    public final AnonymousClass1EV A03;

    public C193429Lk A00(UserJid userJid, String str) {
        B66 A012 = this.A00.A01();
        C175728ax r0 = null;
        if (A012 == null) {
            return null;
        }
        Map map = this.A01;
        if (map != null) {
            r0 = (C175728ax) map.get(userJid);
        }
        return A012.BIl(r0, userJid, str);
    }

    public C24861Eb(AnonymousClass16S r1, AnonymousClass1EV r2) {
        this.A02 = r1;
        this.A03 = r2;
    }
}
