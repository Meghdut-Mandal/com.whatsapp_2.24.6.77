package X;

/* renamed from: X.67R  reason: invalid class name */
public final class AnonymousClass67R {
    public final C19770wU A00;
    public final AnonymousClass005 A01;
    public final AnonymousClass005 A02;
    public final AnonymousClass005 A03;

    public final void A00(C160057kO r5, C128936Ee r6, AnonymousClass5V6 r7, Runnable runnable, int i) {
        C36331k8.A1G(r6, 2, r5);
        if (!(i == 400 || i == 405)) {
            if (!(i == 408 || i == 429)) {
                if (i != 481) {
                    if (i != 500) {
                        if (i != 503) {
                            return;
                        }
                    }
                } else if (r6.A04()) {
                    this.A00.Bp1(new C81133wW((Object) runnable, 2));
                    return;
                }
            }
            Long A012 = r6.A01();
            if (A012 != null) {
                this.A00.BpM(runnable, "AvatarUserIqErrorHelper/retryOperationWithBackoff", A012.longValue());
                return;
            }
        }
        r5.BWk(r7);
    }

    public final void A01(C160057kO r10, C128936Ee r11, AnonymousClass5V6 r12, Runnable runnable, AnonymousClass00S r14, C006302t r15) {
        C160057kO r4 = r10;
        C128936Ee r5 = r11;
        C36321k7.A0y(r11, r10);
        AnonymousClass5V6 r6 = r12;
        int A002 = AnonymousClass3ME.A00(r12.node);
        if (A002 == 401 || A002 == 409) {
            C90524aI.A0M(this.A02).A05(new C164057rC(r10, r12, r14, 2), C113335fN.A00, (C128936Ee) null, (String) null);
        } else if (A002 != 480) {
            A00(r4, r5, r6, runnable, A002);
        } else {
            C110385aa r2 = new C110385aa(r10, r15, 2);
            if (!r11.A04() || r11.A03()) {
                r2.BWk(r12);
                return;
            }
            r11.A02();
            AnonymousClass6P0 r1 = C113335fN.A00;
            ((C132196Sp) this.A01.get()).A02(r1);
            ((AnonymousClass6Mw) this.A03.get()).A01(r1, r2);
        }
    }

    public AnonymousClass67R(C19770wU r1, AnonymousClass005 r2, AnonymousClass005 r3, AnonymousClass005 r4) {
        C36321k7.A18(r1, r2, r3, r4);
        this.A00 = r1;
        this.A02 = r2;
        this.A03 = r3;
        this.A01 = r4;
    }
}
