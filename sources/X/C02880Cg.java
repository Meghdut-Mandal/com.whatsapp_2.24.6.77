package X;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: X.0Cg  reason: invalid class name and case insensitive filesystem */
public final class C02880Cg {
    public static Executor A02;
    public static final Object A03 = new Object();
    public Executor A00;
    public final C02830Cb A01;

    public C02890Ch A00() {
        Executor executor = this.A00;
        if (executor == null) {
            synchronized (A03) {
                if (A02 == null) {
                    A02 = Executors.newFixedThreadPool(2);
                }
            }
            executor = A02;
            this.A00 = executor;
        }
        return new C02890Ch(this.A01, executor);
    }

    public C02880Cg(C02830Cb r1) {
        this.A01 = r1;
    }
}
