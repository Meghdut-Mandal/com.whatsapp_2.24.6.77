package X;

import java.util.concurrent.Executor;

/* renamed from: X.70K  reason: invalid class name */
public final /* synthetic */ class AnonymousClass70K implements C25711Hj {
    public final /* synthetic */ C146506vi A00;
    public final /* synthetic */ C1265764o A01;
    public final /* synthetic */ C123925xJ A02;

    public /* synthetic */ AnonymousClass70K(C146506vi r1, C1265764o r2, C123925xJ r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }

    public final void accept(Object obj) {
        Executor executor;
        Runnable avx;
        C1265764o r1 = this.A01;
        C146506vi r0 = this.A00;
        C123925xJ r4 = this.A02;
        C146506vi.A00(r0);
        C123865xD A04 = r0.A04();
        if (A04 == null || A04.A00 != 0) {
            executor = r1.A02.A04;
            avx = new AVX(r4, 9);
        } else {
            executor = r1.A02.A04;
            avx = new AnonymousClass752(A04, r4);
        }
        executor.execute(avx);
    }
}
