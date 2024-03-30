package X;

import com.whatsapp.jid.PhoneUserJid;

/* renamed from: X.3ex  reason: invalid class name and case insensitive filesystem */
public final class C70313ex implements C87604Pl {
    public final AnonymousClass12O A00;

    public C70313ex(AnonymousClass12O r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public AnonymousClass11F Boe(AnonymousClass11F r4) {
        AnonymousClass11F r0;
        AnonymousClass00C.A0D(r4, 0);
        if ((r4 instanceof PhoneUserJid) || !(r4 instanceof C223313w)) {
            r0 = r4;
        } else {
            AnonymousClass11F A0A = this.A00.A0A((C223313w) r4);
            if (A0A == null) {
                A0A = r4;
            }
            r0 = A0A;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WaChatJidMapper/resolveChatJid ");
        A0u.append(r4);
        C36321k7.A1K(r0, " => ", A0u);
        return r0;
    }
}
