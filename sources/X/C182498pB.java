package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.8pB  reason: invalid class name and case insensitive filesystem */
public class C182498pB extends ABS {
    public final C19730wQ A00;

    public C182498pB(C19730wQ r1) {
        this.A00 = r1;
    }

    public void A00(AnonymousClass8NG r2, AnonymousClass2bO r3) {
        super.A00(r2, r3);
        r2.A0Y(false);
        if (r3.A0L() != null) {
            r2.A0W(r3.A0L().getRawString());
        }
    }

    public AnonymousClass3T1 BlH(AnonymousClass9YL r7) {
        if (AnonymousClass97T.A00(r7) != AnonymousClass91G.REVOKE || r7.A01 != 8) {
            return null;
        }
        AnonymousClass8SQ A0L = C170918Hz.A0L(r7);
        C18740tg.A06(A0L);
        AnonymousClass8SW r0 = A0L.key_;
        if (r0 == null) {
            r0 = AnonymousClass8SW.DEFAULT_INSTANCE;
        }
        AnonymousClass11F A0N = C36421kH.A0N(r0.remoteJid_);
        C64933Qa r5 = r7.A0C;
        AnonymousClass11F r3 = r5.A00;
        if (C1901797e.A00(r3, A0N)) {
            AnonymousClass8SW r02 = A0L.key_;
            AnonymousClass8SW r1 = r02;
            if (r02 == null) {
                r02 = AnonymousClass8SW.DEFAULT_INSTANCE;
            }
            if (!r02.fromMe_) {
                if (r1 == null) {
                    r1 = AnonymousClass8SW.DEFAULT_INSTANCE;
                }
                UserJid A0l = C36431kI.A0l(r1.participant_);
                C1899196c.A00(AZB.A00, AnonymousClass000.A1V(A0l));
                C18740tg.A06(A0l);
                AnonymousClass2c8 r12 = new AnonymousClass2c8(C165617ti.A0R(r3, r5.A01, this.A00.A0M(A0l)), r7.A04);
                UserJid A002 = C222813r.A00(r7.A07);
                C18740tg.A06(A002);
                r12.A00 = A002;
                AnonymousClass8SW r03 = A0L.key_;
                if (r03 == null) {
                    r03 = AnonymousClass8SW.DEFAULT_INSTANCE;
                }
                r12.A01 = r03.id_;
                return r12;
            }
        }
        throw C165567td.A0J(27);
    }
}
