package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.77I  reason: invalid class name */
public final class AnonymousClass77I implements ThreadFactory {
    public final String A00;
    public final AtomicInteger A01 = new AtomicInteger(1);

    public AnonymousClass77I(String str) {
        this.A00 = str;
    }

    public Thread newThread(Runnable runnable) {
        AnonymousClass00C.A0D(runnable, 0);
        AnonymousClass75C r2 = new AnonymousClass75C((Object) this, (Object) runnable, 42);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(this.A00);
        A0u.append('-');
        return new Thread(r2, C36381kD.A10(A0u, this.A01.getAndIncrement()));
    }
}
