package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.3Ex  reason: invalid class name and case insensitive filesystem */
public final class C62133Ex {
    public AnonymousClass30E A00;
    public AnonymousClass30F A01;
    public AnonymousClass30G A02;
    public AnonymousClass30H A03;
    public AnonymousClass30I A04;
    public final AnonymousClass164 A05;
    public final AnonymousClass1GQ A06;

    public final AnonymousClass8fV A00(C28981Uw r10, UserJid userJid, AnonymousClass4TM r12) {
        C28981Uw r3 = r10;
        UserJid userJid2 = userJid;
        C36321k7.A0w(r10, userJid);
        if (!C36391kE.A1Z(this.A06)) {
            return null;
        }
        AnonymousClass30E r1 = this.A00;
        if (r1 != null) {
            C19770wU A0Z = C36341k9.A0Z(r1.A00.A00);
            C18800tq r13 = r1.A00.A00;
            AnonymousClass8fV r14 = new AnonymousClass8fV(C36391kE.A0g(r13), r3, userJid2, r12, (AnonymousClass4OL) r13.A5l.get(), r13.Azc(), A0Z);
            r14.A01();
            return r14;
        }
        throw C36331k8.A0d("newsletterAdminDemoteHandler");
    }

    public C62133Ex(AnonymousClass164 r1, AnonymousClass1GQ r2) {
        C36321k7.A0x(r1, r2);
        this.A05 = r1;
        this.A06 = r2;
    }
}
