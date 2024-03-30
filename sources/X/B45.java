package X;

import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public interface B45 {
    public static final ExecutorService A00;

    static {
        int i;
        C21741AYv aYv;
        int max = Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4));
        AnonymousClass9N4 r4 = new AnonymousClass9N4();
        r4.A00 = max;
        r4.A04 = Integer.valueOf(max);
        r4.A02 = 128;
        r4.A03 = AnonymousClass6X5.A0L;
        r4.A01 = 10;
        r4.A05 = "Background #";
        Objects.requireNonNull("Background #");
        int i2 = r4.A00;
        if (i2 > 0) {
            long j = r4.A03;
            if (j >= 0) {
                Integer num = r4.A04;
                if (num != null) {
                    i = num.intValue();
                    if (i < i2) {
                        throw C165617ti.A0U();
                    }
                } else {
                    i = i2;
                }
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(r4.A02);
                String str = r4.A05;
                int i3 = r4.A01;
                if (i > 1) {
                    aYv = new C21741AYv((AnonymousClass004) new C21745AYz(str, new AtomicInteger(1)), i3);
                } else {
                    aYv = new C21741AYv(str, i3);
                }
                A00 = new AnonymousClass79V(r4, linkedBlockingQueue, aYv, timeUnit, i2, i, j);
                return;
            }
            throw C165617ti.A0U();
        }
        throw C165617ti.A0U();
    }
}
