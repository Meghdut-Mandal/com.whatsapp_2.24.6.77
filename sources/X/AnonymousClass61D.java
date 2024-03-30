package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.61D  reason: invalid class name */
public final class AnonymousClass61D {
    public final C119475ps A00;

    public final void A00(UserJid userJid, AnonymousClass7hL r7, boolean z) {
        int i;
        AnonymousClass00C.A0D(userJid, 0);
        if (z) {
            C119475ps r4 = this.A00;
            AnonymousClass3L0 A02 = r4.A01.A02(userJid);
            if (A02 != null) {
                if (A02.A02()) {
                    i = 1;
                } else if (A02.A01()) {
                    r4.A00.A0B(new AnonymousClass7e5(r7, 1), userJid);
                    return;
                }
            }
            r7.Ba6((Integer) null);
            return;
        }
        i = null;
        r7.Ba6(i);
    }

    public AnonymousClass61D(C119475ps r1) {
        this.A00 = r1;
    }
}
