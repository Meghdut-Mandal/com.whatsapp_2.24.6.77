package X;

import java.lang.Thread;
import java.lang.ref.WeakReference;

public class AX3 implements Thread.UncaughtExceptionHandler {
    public WeakReference A00;

    public void uncaughtException(Thread thread, Throwable th) {
        C204349pr r0 = (C204349pr) this.A00.get();
        if (r0 != null) {
            r0.A03.A00(AnonymousClass001.A0B(th));
        }
    }

    public AX3(WeakReference weakReference) {
        this.A00 = weakReference;
    }
}
