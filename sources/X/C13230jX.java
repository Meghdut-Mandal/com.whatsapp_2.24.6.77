package X;

import android.os.Process;

/* renamed from: X.0jX  reason: invalid class name and case insensitive filesystem */
public class C13230jX extends Thread {
    public final int A00 = 10;

    public C13230jX(Runnable runnable) {
        super(runnable, "fonts-androidx");
    }

    public void run() {
        Process.setThreadPriority(this.A00);
        super.run();
    }
}
