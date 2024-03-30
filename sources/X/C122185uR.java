package X;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.5uR  reason: invalid class name and case insensitive filesystem */
public final class C122185uR {
    public final Executor A00;
    public final Executor A01;
    public final AtomicInteger A02 = new AtomicInteger();
    public final AtomicLong A03 = new AtomicLong(-1);

    public C122185uR(Executor executor, Executor executor2) {
        this.A01 = executor;
        this.A00 = executor2;
    }
}
