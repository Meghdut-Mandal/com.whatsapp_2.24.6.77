package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.0AL  reason: invalid class name */
public abstract class AnonymousClass0AL {
    public static final ThreadLocal A00 = new ThreadLocal();

    public static final AnonymousClass03G A00() {
        ThreadLocal threadLocal = A00;
        AnonymousClass03G r1 = (AnonymousClass03G) threadLocal.get();
        if (r1 != null) {
            return r1;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AnonymousClass03I.A01;
        AnonymousClass0AM r12 = new AnonymousClass0AM(Thread.currentThread());
        threadLocal.set(r12);
        return r12;
    }
}
