package X;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0hT  reason: invalid class name and case insensitive filesystem */
public final class C12080hT implements Runnable {
    public static AnonymousClass0E3 A07;
    public static final Executor A08;
    public static final BlockingQueue A09;
    public static final ThreadFactory A0A;
    public static volatile Executor A0B;
    public final CountDownLatch A00;
    public final FutureTask A01;
    public final AtomicBoolean A02;
    public final AtomicBoolean A03;
    public final C12490i9 A04;
    public volatile Integer A05;
    public final /* synthetic */ C03760Hp A06;

    static {
        C17780s1 r7 = new C17780s1();
        A0A = r7;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
        A09 = linkedBlockingQueue;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1, TimeUnit.SECONDS, linkedBlockingQueue, r7);
        A08 = threadPoolExecutor;
        A0B = threadPoolExecutor;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C12080hT(C03760Hp r3) {
        this();
        this.A06 = r3;
        this.A00 = new CountDownLatch(1);
    }

    public void A00(Object obj) {
        AnonymousClass0E3 r3;
        synchronized (C12080hT.class) {
            r3 = A07;
            if (r3 == null) {
                r3 = new AnonymousClass0E3();
                A07 = r3;
            }
        }
        r3.obtainMessage(1, new C06050Sc(this, obj)).sendToTarget();
    }

    public void run() {
        this.A06.A07();
    }

    public C12080hT() {
        this.A05 = C023109s.A00;
        this.A02 = new AtomicBoolean();
        this.A03 = new AtomicBoolean();
        C12490i9 r1 = new C12490i9(this);
        this.A04 = r1;
        this.A01 = new C13430jr(this, r1);
    }
}
