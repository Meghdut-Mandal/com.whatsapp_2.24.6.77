package X;

import android.os.Process;

/* renamed from: X.00K  reason: invalid class name */
public final class AnonymousClass00K implements Runnable {
    public final Runnable A00;

    public AnonymousClass00K(Runnable runnable) {
        this.A00 = runnable;
    }

    public final void run() {
        Process.setThreadPriority(0);
        this.A00.run();
    }
}
