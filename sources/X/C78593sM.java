package X;

import java.util.List;

/* renamed from: X.3sM  reason: invalid class name and case insensitive filesystem */
public final class C78593sM implements C17810s4 {
    public final AnonymousClass005 A00;
    public final AnonymousClass005 A01;
    public final AnonymousClass005 A02;
    public final AnonymousClass005 A03;
    public final AnonymousClass005 A04;
    public final AnonymousClass005 A05;
    public final AnonymousClass005 A06;
    public final AnonymousClass005 A07;

    public void BmI(AnonymousClass3T1 r2, C52942qQ r3) {
        AnonymousClass00C.A0D(r2, 0);
        A00(r2, r3);
    }

    public final void A00(AnonymousClass3T1 r5, C52942qQ r6) {
        AnonymousClass3JL r0;
        List list;
        C80113ur r02;
        if (C20800yB.A01(C21000yV.A01, ((C25681Hg) this.A07.get()).A01, 6358)) {
            C64933Qa r1 = r5.A1J;
            if (r1.A02) {
                return;
            }
            if ((C197029b1.A00(r1.A00) || ((r02 = r5.A0b) != null && r02.hostStorage == 2)) && (r0 = (AnonymousClass3JL) r5.A1K.A00) != null && (list = r0.A02) != null) {
                ((C19770wU) this.A06.get()).Bp6(new C1502474n(this, r5, list, 9), "BotMessagePromptsProcessor.STORE_PROMPTS_WORKER_TOKEN");
                if (r6 != null) {
                    throw C36321k7.A04(C78593sM.class);
                }
            }
        }
    }

    public C78593sM(AnonymousClass005 r1, AnonymousClass005 r2, AnonymousClass005 r3, AnonymousClass005 r4, AnonymousClass005 r5, AnonymousClass005 r6, AnonymousClass005 r7, AnonymousClass005 r8) {
        C36321k7.A1B(r1, r2, r3, r4, r5);
        C36321k7.A13(r6, r7, r8);
        this.A07 = r1;
        this.A01 = r2;
        this.A06 = r3;
        this.A03 = r4;
        this.A04 = r5;
        this.A05 = r6;
        this.A00 = r7;
        this.A02 = r8;
    }
}
