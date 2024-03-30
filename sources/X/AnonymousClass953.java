package X;

import java.lang.ref.Reference;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.953  reason: invalid class name */
public abstract class AnonymousClass953 {
    public static final void A00() {
        while (true) {
            Reference poll = C21857Abh.A03.poll();
            if (poll != null) {
                C21857Abh abh = (C21857Abh) poll;
                while (true) {
                    AtomicLong atomicLong = abh.A01;
                    long j = atomicLong.get();
                    if (j == 0) {
                        break;
                    } else if (atomicLong.compareAndSet(j, 0)) {
                        abh.A02.invoke(Long.valueOf(j));
                    }
                }
                C21857Abh.A04.remove(poll);
            } else {
                return;
            }
        }
    }
}
