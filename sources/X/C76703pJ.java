package X;

import java.util.List;

/* renamed from: X.3pJ  reason: invalid class name and case insensitive filesystem */
public final class C76703pJ implements C236119d {
    public final C19600wD A00;
    public final AnonymousClass19A A01;
    public final AnonymousClass3EI A02;
    public final List A03;

    public void BWw(C203399nx r3, String str) {
        AnonymousClass00C.A0D(r3, 1);
        int A002 = AnonymousClass3ME.A00(r3);
        if (A002 > 0) {
            this.A02.A00(A002);
        } else {
            this.A02.A00(0);
        }
    }

    public void BiM(C203399nx r4, String str) {
        AnonymousClass00C.A0D(r4, 1);
        AnonymousClass3EI r2 = this.A02;
        C64893Pv A002 = C55622uv.A00(r4);
        AnonymousClass1E9 r1 = r2.A02;
        r1.A02(A002);
        if (r2.A03) {
            AnonymousClass1EB r0 = r1.A06;
            C36341k9.A0v(C36351kA.A0A(r0.A01), "tos_fetch_iteration", r2.A01);
        }
    }

    public void BVN(String str) {
        this.A02.A00(-1);
    }

    public C76703pJ(C19600wD r1, AnonymousClass19A r2, AnonymousClass3EI r3, List list) {
        C36321k7.A0x(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = list;
    }
}
