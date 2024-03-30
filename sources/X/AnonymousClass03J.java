package X;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* renamed from: X.03J  reason: invalid class name */
public final class AnonymousClass03J extends AnonymousClass03I implements Runnable {
    public static final AnonymousClass03J A00;
    public static final long A01;
    public static volatile Thread _thread;
    public static volatile int debugStatus;

    private final synchronized void A00() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            AnonymousClass03I.A02.set(this, (Object) null);
            AnonymousClass03I.A01.set(this, (Object) null);
            notifyAll();
        }
    }

    public void A06() {
        debugStatus = 4;
        super.A06();
    }

    static {
        Long l;
        AnonymousClass03J r4 = new AnonymousClass03J();
        A00 = r4;
        r4.A00++;
        r4.A02 = true;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        A01 = timeUnit.toNanos(l.longValue());
    }

    public Thread A0A() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "X.03J");
                    _thread = thread;
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    public void A0B(C12090hU r3, long j) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public void A0C(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.A0C(runnable);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (r1 < 4611686018427387903L) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass03l BL6(java.lang.Runnable r6, X.C005102h r7, long r8) {
        /*
            r5 = this;
            r1 = 0
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x001c
            r1 = 9223372036854(0x8637bd05af6, double:4.5569512622224E-311)
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x002c
            r1 = 1000000(0xf4240, double:4.940656E-318)
            long r1 = r1 * r8
            r3 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x002c
        L_0x001c:
            long r3 = java.lang.System.nanoTime()
            long r1 = r1 + r3
            X.0mv r0 = new X.0mv
            r0.<init>(r6, r1)
            r5.A0D(r0, r3)
        L_0x0029:
            X.03l r0 = (X.AnonymousClass03l) r0
            return r0
        L_0x002c:
            X.03n r0 = X.C008203n.A00
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass03J.BL6(java.lang.Runnable, X.02h, long):X.03l");
    }

    public void run() {
        boolean z;
        AnonymousClass0AL.A00.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    z = false;
                } else {
                    z = true;
                    debugStatus = 1;
                    notifyAll();
                }
            }
            if (z) {
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long A05 = A05();
                    if (A05 == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = A01 + nanoTime;
                        }
                        long j2 = j - nanoTime;
                        if (j2 <= 0) {
                            break;
                        } else if (A05 > j2) {
                            A05 = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (A05 > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            break;
                        }
                        LockSupport.parkNanos(this, A05);
                    }
                }
            }
            _thread = null;
            A00();
            if (!A0E()) {
                A0A();
            }
        } catch (Throwable th) {
            _thread = null;
            A00();
            if (!A0E()) {
                A0A();
            }
            throw th;
        }
    }
}
