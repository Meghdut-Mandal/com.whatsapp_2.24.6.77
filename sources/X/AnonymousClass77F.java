package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.77F  reason: invalid class name */
public class AnonymousClass77F implements ThreadFactory {
    public final AtomicInteger A00 = C90514aH.A17();

    public Thread newThread(Runnable runnable) {
        C1497072l r2 = new C1497072l(runnable, 11);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Google Drive Checksum Calculation Worker #");
        return new C19950wm(r2, C36381kD.A10(A0u, this.A00.getAndIncrement()));
    }
}
