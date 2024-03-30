package X;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.Abh  reason: case insensitive filesystem */
public final class C21857Abh extends PhantomReference {
    public static final ReferenceQueue A03 = new ReferenceQueue();
    public static final ConcurrentHashMap A04 = C90524aI.A0s();
    public final AtomicBoolean A00 = C36431kI.A1H();
    public final AtomicLong A01 = new AtomicLong(0);
    public final C006302t A02;

    public C21857Abh(Object obj, C006302t r7, long j) {
        super(obj, A03);
        this.A02 = r7;
        A04.put(this, true);
        boolean compareAndSet = this.A00.compareAndSet(false, true);
        AtomicLong atomicLong = this.A01;
        if (compareAndSet) {
            atomicLong.set(j);
        } else if (atomicLong.get() == 0) {
            throw AnonymousClass001.A09("Native instance has been released and must not be used anymore");
        } else {
            throw AnonymousClass001.A09("Native instance is already initialized");
        }
    }

    public final long A00() {
        long j = this.A01.get();
        if (!this.A00.get()) {
            throw AnonymousClass001.A09("Native instance has not been initialized");
        } else if (j != 0) {
            return j;
        } else {
            throw AnonymousClass001.A09("Native instance has been released and must not be used anymore");
        }
    }
}
