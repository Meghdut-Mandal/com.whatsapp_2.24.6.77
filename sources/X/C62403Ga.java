package X;

import com.whatsapp.R;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3Ga  reason: invalid class name and case insensitive filesystem */
public final class C62403Ga {
    public AnonymousClass4PA A00;
    public final AnonymousClass17Y A01;
    public final C30061Zb A02;
    public final C62133Ex A03;

    public final void A00(C28981Uw r10, UserJid userJid, AnonymousClass4TP r12) {
        AnonymousClass8fW r1;
        C28981Uw r3 = r10;
        AnonymousClass00C.A0D(r10, 0);
        AnonymousClass4PA r0 = this.A00;
        if (r0 != null) {
            r0.cancel();
        }
        this.A01.A05(R.string.f12nameremoved, R.string.f12nameremoved);
        C62133Ex r13 = this.A03;
        UserJid userJid2 = userJid;
        C90454aB r5 = new C90454aB(userJid, r12, this, 1);
        if (!C36391kE.A1Z(r13.A06)) {
            r1 = null;
        } else {
            AnonymousClass30G r14 = r13.A02;
            if (r14 != null) {
                C19770wU A0Z = C36341k9.A0Z(r14.A00.A00);
                C18800tq r15 = r14.A00.A00;
                r1 = new AnonymousClass8fW(C36391kE.A0g(r15), r3, userJid2, r5, (AnonymousClass4OL) r15.A5l.get(), r15.Azc(), A0Z);
                r1.A01();
            } else {
                throw C36331k8.A0d("newsletterAdminInviteRevokeHandler");
            }
        }
        this.A00 = r1;
    }

    public C62403Ga(AnonymousClass17Y r1, C30061Zb r2, C62133Ex r3) {
        C36321k7.A11(r1, r3, r2);
        this.A01 = r1;
        this.A03 = r3;
        this.A02 = r2;
    }
}
