package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.3sp  reason: invalid class name and case insensitive filesystem */
public final class C78883sp implements AnonymousClass4S6 {
    public final AnonymousClass005 A00;
    public final AnonymousClass005 A01;

    public void BmK(AnonymousClass3T1 r9, C52942qQ r10, int i) {
        AnonymousClass00C.A0D(r9, 0);
        if (i == 5 || i == 6) {
            AnonymousClass005 r3 = this.A00;
            ((AnonymousClass17S) r3.get()).A04(r9, r9.A0I);
            AnonymousClass11F r1 = r9.A1J.A00;
            if (!(r1 instanceof UserJid)) {
                boolean A0G = AnonymousClass143.A0G(r1);
                if (A0G) {
                    AnonymousClass17S r12 = (AnonymousClass17S) r3.get();
                    C18740tg.A0C(A0G);
                    AnonymousClass1M0 A05 = r12.A04.A05();
                    try {
                        if (!AnonymousClass000.A1R(r9.A05)) {
                            C224114e r5 = A05.A02;
                            String[] A1R = C36441kJ.A1R();
                            C36351kA.A1V(A1R, 0, r9.A1N);
                            r5.A03("message_ephemeral", "message_row_id = ?", "DELETE_EPHEMERAL_MESSAGE_FOR_ROW_ID_SQL", A1R);
                        } else if (AnonymousClass17S.A00(r12, A05, r9) == 0) {
                            r12.A07(r9);
                        }
                        A05.close();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                        throw th;
                    }
                }
            } else if (AnonymousClass000.A1R(r9.A05)) {
                ((AnonymousClass17S) r3.get()).A07(r9);
            }
            Integer A04 = C36441kJ.A0g(this.A01).A04(r9);
            if (A04 == null) {
                A04 = 0;
            }
            if (A04.intValue() != r9.A05 && !AnonymousClass000.A1S(r9.A0A & 16384, 16384)) {
                r9.A0j(512);
            }
            if (r10 != null) {
                throw C36321k7.A04(C78883sp.class);
            }
        }
    }

    public C78883sp(AnonymousClass005 r1, AnonymousClass005 r2) {
        C36321k7.A0x(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
