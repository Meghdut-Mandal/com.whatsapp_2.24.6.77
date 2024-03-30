package X;

import java.util.concurrent.Executor;

/* renamed from: X.01b  reason: invalid class name and case insensitive filesystem */
public class C002601b extends C002501a {
    public static final Executor A02 = new C002701c();
    public static volatile C002601b A03;
    public C002501a A00;
    public C002501a A01;

    public static C002601b A00() {
        if (A03 == null) {
            synchronized (C002601b.class) {
                if (A03 == null) {
                    A03 = new C002601b();
                }
            }
        }
        return A03;
    }

    public void A01(Runnable runnable) {
        this.A01.A01(runnable);
    }

    public void A02(Runnable runnable) {
        this.A01.A02(runnable);
    }

    public boolean A03() {
        return this.A01.A03();
    }

    public C002601b() {
        C002801d r0 = new C002801d();
        this.A00 = r0;
        this.A01 = r0;
    }
}
