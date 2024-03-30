package X;

import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.1JM  reason: invalid class name */
public final class AnonymousClass1JM extends AnonymousClass00R implements AnonymousClass00S {
    public static final AnonymousClass1JM A00 = new AnonymousClass1JM();

    public AnonymousClass1JM() {
        super(0);
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        if (C201089ip.A03 == null) {
            ReentrantLock reentrantLock = C201089ip.A02;
            reentrantLock.lock();
            try {
                if (C201089ip.A03 == null) {
                    C201089ip.A03 = new C201089ip();
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        C201089ip r0 = C201089ip.A03;
        AnonymousClass00C.A0B(r0);
        return r0;
    }
}
