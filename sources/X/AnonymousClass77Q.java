package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.77Q  reason: invalid class name */
public final class AnonymousClass77Q implements ThreadFactory {
    public int A00 = 10;
    public final String A01;
    public final ThreadGroup A02 = Thread.currentThread().getThreadGroup();
    public final AtomicInteger A03 = C90514aH.A17();

    public Thread newThread(Runnable runnable) {
        ThreadGroup threadGroup = this.A02;
        AnonymousClass74N A002 = AnonymousClass74N.A00(this, runnable, 4);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(this.A01);
        Thread thread = new Thread(threadGroup, A002, C36381kD.A10(A0u, this.A03.getAndIncrement()), 0);
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        return thread;
    }

    public AnonymousClass77Q(Integer num) {
        String str;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("cask-");
        switch (num.intValue()) {
            case 0:
                str = "CONCURRENT";
                break;
            case 1:
                str = "SERIAL";
                break;
            default:
                str = "IDLE";
                break;
        }
        A0u.append(str);
        this.A01 = AnonymousClass000.A0q("-pool--thread-", A0u);
        if (num == C023109s.A0C) {
            this.A00 = 19;
        }
    }
}
