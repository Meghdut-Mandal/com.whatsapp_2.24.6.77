package X;

import java.util.Iterator;
import java.util.Set;

/* renamed from: X.1Fb  reason: invalid class name and case insensitive filesystem */
public final class C25121Fb {
    public final AnonymousClass1F4 A00;
    public final C19650wI A01;
    public final AnonymousClass005 A02;
    public final C19770wU A03;

    public C25121Fb(AnonymousClass1F4 r2, C19650wI r3, C19770wU r4, AnonymousClass005 r5) {
        AnonymousClass00C.A0D(r4, 1);
        AnonymousClass00C.A0D(r3, 2);
        AnonymousClass00C.A0D(r5, 3);
        AnonymousClass00C.A0D(r2, 4);
        this.A03 = r4;
        this.A01 = r3;
        this.A02 = r5;
        this.A00 = r2;
    }

    public final void A01(AnonymousClass3IP r12, AnonymousClass3T1 r13, Runnable runnable) {
        AnonymousClass3IP r8;
        AnonymousClass3T1 r7;
        Runnable runnable2;
        AnonymousClass005 r4 = this.A02;
        Iterator it = ((Set) r4.get()).iterator();
        while (true) {
            r8 = r12;
            r7 = r13;
            runnable2 = runnable;
            if (it.hasNext()) {
                if (((AnonymousClass1EI) it.next()).BQ5(r12, r13)) {
                    break;
                }
            } else {
                AnonymousClass3T1 A0S = r13.A0S();
                if (A0S != null) {
                    AnonymousClass3IP r2 = new AnonymousClass3IP(r12.A00, true);
                    Iterator it2 = ((Set) r4.get()).iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (((AnonymousClass1EI) it2.next()).BQ5(r2, A0S)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                if (!this.A00.A03(r13)) {
                    this.A01.Bp3(runnable);
                    return;
                }
            }
        }
        this.A03.Boy(new C35371ia(this, r7, r8, runnable2, 16));
    }

    public final void A02(AnonymousClass3T1 r4) {
        AnonymousClass00C.A0D(r4, 0);
        A00(new AnonymousClass3IP(C004702c.A00, false), r4);
    }

    public final void A03(AnonymousClass3T1 r4, Runnable runnable) {
        AnonymousClass00C.A0D(r4, 0);
        A01(new AnonymousClass3IP(C004702c.A00, false), r4, runnable);
    }

    public final void A00(AnonymousClass3IP r7, AnonymousClass3T1 r8) {
        AnonymousClass005 r5 = this.A02;
        for (AnonymousClass1EI r1 : (Set) r5.get()) {
            if (r1.BQ5(r7, r8)) {
                r1.BON(r7, r8);
            }
        }
        AnonymousClass3T1 A0S = r8.A0S();
        if (A0S != null) {
            AnonymousClass3IP r3 = new AnonymousClass3IP(r7.A00, true);
            for (AnonymousClass1EI r12 : (Set) r5.get()) {
                if (r12.BQ5(r3, A0S)) {
                    r12.BON(r3, A0S);
                }
            }
        }
        this.A00.A01(r8);
    }
}
