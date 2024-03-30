package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.9UA  reason: invalid class name */
public final class AnonymousClass9UA {
    public final AnonymousClass185 A00;
    public final C20810yC A01;
    public final AnonymousClass1KK A02;

    public final void A00(C22911AyN ayN, UserJid userJid) {
        AnonymousClass00C.A0D(userJid, 0);
        if (!this.A01.A0E(1867)) {
            ayN.BfK(false);
        } else {
            this.A02.A0B(new AnonymousClass961(ayN, 1), userJid);
        }
    }

    public final boolean A01(UserJid userJid) {
        if (userJid != null && AnonymousClass6W7.A00(this.A00.A01(userJid)) == 2) {
            C20810yC r1 = this.A01;
            if (!r1.A0E(4893) || !r1.A0E(5114)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public AnonymousClass9UA(AnonymousClass1KK r1, AnonymousClass185 r2, C20810yC r3) {
        C36321k7.A11(r1, r2, r3);
        this.A02 = r1;
        this.A00 = r2;
        this.A01 = r3;
    }
}
