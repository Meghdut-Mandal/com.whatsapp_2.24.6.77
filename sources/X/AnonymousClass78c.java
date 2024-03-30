package X;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.78c  reason: invalid class name */
public class AnonymousClass78c extends Thread {
    public final ThreadPoolExecutor A00;
    public final AtomicInteger A01;
    public final AnonymousClass6OM A02;
    public final AnonymousClass6NH A03;

    public AnonymousClass78c(AtomicInteger atomicInteger, AnonymousClass6OM r11, AnonymousClass6NH r12, int i, int i2) {
        super("JobConsumer");
        this.A02 = r11;
        this.A03 = r12;
        this.A01 = atomicInteger;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i2, 60, TimeUnit.SECONDS, new SynchronousQueue(), new AnonymousClass77H());
        this.A00 = threadPoolExecutor;
        threadPoolExecutor.setRejectedExecutionHandler(new AnonymousClass77A(this, r11));
    }

    public void run() {
        while (true) {
            ThreadPoolExecutor threadPoolExecutor = this.A00;
            AnonymousClass6OM r1 = this.A02;
            Object obj = null;
            do {
                try {
                    obj = r1.A04.take();
                    continue;
                } catch (InterruptedException unused) {
                }
            } while (obj == null);
            threadPoolExecutor.execute(new C1498272x(this, obj, 18));
        }
    }
}
