package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.77J  reason: invalid class name */
public final class AnonymousClass77J implements ThreadFactory {
    public final String A00;
    public final AtomicInteger A01 = C90484aE.A0v();

    public Thread newThread(Runnable runnable) {
        C1497072l r2 = new C1497072l(runnable, 7);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(this.A00);
        return new C19950wm(r2, C36381kD.A10(A0u, this.A01.getAndIncrement()));
    }

    public AnonymousClass77J(String str) {
        this.A00 = str;
    }
}
