package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.3h2  reason: invalid class name and case insensitive filesystem */
public final class C71603h2 implements AnonymousClass4QC {
    public final AnonymousClass1IN A00;
    public final AnonymousClass2aJ A01;
    public final AnonymousClass141 A02;

    public boolean BMk() {
        AnonymousClass141 r3 = this.A02;
        if (r3.A0C()) {
            Class<UserJid> cls = UserJid.class;
            UserJid userJid = (UserJid) r3.A06(cls);
            if (userJid != null && (this.A00.A00(userJid) instanceof C175418aS)) {
                UserJid userJid2 = (UserJid) r3.A06(cls);
                AnonymousClass2aJ r0 = this.A01;
                if (userJid2 == null || r0.A01(userJid2) == null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public C71603h2(AnonymousClass1IN r1, AnonymousClass2aJ r2, AnonymousClass141 r3) {
        C36321k7.A0x(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }
}
