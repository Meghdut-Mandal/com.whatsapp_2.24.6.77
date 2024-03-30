package X;

import java.util.List;

public final class AI2 implements C236119d {
    public final C19600wD A00;
    public final AnonymousClass19A A01;
    public final AnonymousClass9IZ A02;
    public final List A03;

    public void BVN(String str) {
        this.A02.A00.A08.A01();
    }

    public void BiM(C203399nx r3, String str) {
        AnonymousClass1E9 r1 = this.A02.A00;
        r1.A00 = null;
        r1.A08.A01();
    }

    public AI2(C19600wD r2, AnonymousClass19A r3, AnonymousClass9IZ r4, List list) {
        C36321k7.A0x(r3, r2);
        AnonymousClass00C.A0D(list, 4);
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = r4;
        this.A03 = list;
    }

    public void BWw(C203399nx r6, String str) {
        Long A002;
        int A05 = C165597tg.A05(r6);
        if (A05 > 0) {
            AnonymousClass9IZ r2 = this.A02;
            AnonymousClass1E9 r3 = r2.A00;
            C24451Cm r1 = r3.A08;
            if (A05 != 500 || (A002 = r1.A00()) == null) {
                r1.A01();
            } else {
                AnonymousClass1E9.A00(r3, r2.A01, A002.longValue());
            }
        } else {
            this.A02.A00.A08.A01();
        }
    }
}
