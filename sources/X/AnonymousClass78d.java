package X;

import android.os.Process;

/* renamed from: X.78d  reason: invalid class name */
public class AnonymousClass78d extends Thread {
    public void run() {
        int myTid = Process.myTid();
        AnonymousClass6KR r2 = AnonymousClass6KR.A03;
        Integer valueOf = Integer.valueOf(myTid);
        synchronized (r2) {
            if (valueOf != null) {
                r2.A01.add(valueOf);
            }
        }
        super.run();
        synchronized (r2) {
            if (valueOf != null) {
                r2.A01.remove(valueOf);
                r2.A00.remove(valueOf);
            }
        }
    }

    public AnonymousClass78d(Runnable runnable) {
        super(runnable);
    }

    public AnonymousClass78d(Runnable runnable, String str) {
        super(runnable, str);
    }

    public AnonymousClass78d() {
    }
}
