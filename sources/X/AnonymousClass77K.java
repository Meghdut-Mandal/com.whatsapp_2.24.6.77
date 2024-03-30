package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.77K  reason: invalid class name */
public class AnonymousClass77K implements ThreadFactory {
    public final AtomicInteger A00 = C90484aE.A0v();
    public final /* synthetic */ C18850tv A01;
    public final /* synthetic */ boolean A02;

    public AnonymousClass77K(C18850tv r2, boolean z) {
        this.A01 = r2;
        this.A02 = z;
    }

    public Thread newThread(Runnable runnable) {
        String str;
        if (this.A02) {
            str = "WM.task-";
        } else {
            str = "androidx.work-";
        }
        return new Thread(runnable, C36381kD.A10(AnonymousClass000.A0v(str), this.A00.incrementAndGet()));
    }
}
