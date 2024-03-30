package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.3CV  reason: invalid class name */
public final class AnonymousClass3CV {
    public final C21010yW A00;

    public AnonymousClass3CV(C21010yW r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public final void A00(UserJid userJid, String str) {
        Long l;
        String str2;
        AnonymousClass2PS r1 = new AnonymousClass2PS();
        r1.A00 = 1;
        r1.A02 = str;
        if (userJid == null || (str2 = userJid.user) == null) {
            l = null;
        } else {
            l = C36431kI.A15(str2);
        }
        r1.A01 = l;
        this.A00.Bly(r1);
    }
}
