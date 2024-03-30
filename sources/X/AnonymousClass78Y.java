package X;

import android.os.Process;

/* renamed from: X.78Y  reason: invalid class name */
public final class AnonymousClass78Y extends Thread {
    public final /* synthetic */ C118505oA A00;

    public AnonymousClass78Y(C118505oA r1) {
        this.A00 = r1;
    }

    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                ((AnonymousClass75L) this.A00.A00.take()).run();
            } catch (InterruptedException unused) {
            }
        }
    }
}
