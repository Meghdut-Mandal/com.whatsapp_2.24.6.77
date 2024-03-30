package X;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.6JO  reason: invalid class name */
public class AnonymousClass6JO {
    public final Map A00 = AnonymousClass001.A0J();

    public static int A00(AnonymousClass6JO r2, String str) {
        AtomicInteger atomicInteger;
        synchronized (r2) {
            Map map = r2.A00;
            atomicInteger = (AtomicInteger) map.get(str);
            if (atomicInteger == null) {
                atomicInteger = new AtomicInteger();
                map.put(str, atomicInteger);
            }
        }
        return atomicInteger.get();
    }

    public static void A01(AnonymousClass6JO r2, String str) {
        AtomicInteger atomicInteger;
        synchronized (r2) {
            Map map = r2.A00;
            atomicInteger = (AtomicInteger) map.get(str);
            if (atomicInteger == null) {
                atomicInteger = new AtomicInteger();
                map.put(str, atomicInteger);
            }
        }
        atomicInteger.incrementAndGet();
    }
}
