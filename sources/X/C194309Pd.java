package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.9Pd  reason: invalid class name and case insensitive filesystem */
public class C194309Pd {
    public final AnonymousClass1KK A00;

    public void A00(C177058d8 r4, C207109uZ r5, UserJid userJid) {
        if (r5 == null || !r5.A0X) {
            r4.A06();
            return;
        }
        C206609tg r0 = r5.A02;
        if (r0 != null) {
            AnonymousClass1KK r1 = this.A00;
            String str = r0.A00;
            AnonymousClass00C.A0D(str, 1);
            r1.A07.A1i(userJid.getRawString(), str);
        }
        this.A00.A0D(r4, userJid, true);
    }

    public C194309Pd(AnonymousClass1KK r1) {
        this.A00 = r1;
    }
}
