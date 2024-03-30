package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.0Y3  reason: invalid class name */
public final class AnonymousClass0Y3 {
    public static final AtomicIntegerFieldUpdater A01;
    public static final AtomicIntegerFieldUpdater A02;
    public static final AtomicIntegerFieldUpdater A03;
    public static final AtomicReferenceFieldUpdater A04;
    public final AtomicReferenceArray A00 = new AtomicReferenceArray(128);
    public volatile int blockingTasksInBuffer;
    public volatile int consumerIndex;
    public volatile Object lastScheduledTask;
    public volatile int producerIndex;

    static {
        Class<AnonymousClass0Y3> cls = AnonymousClass0Y3.class;
        A04 = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "lastScheduledTask");
        A03 = AtomicIntegerFieldUpdater.newUpdater(cls, "producerIndex");
        A02 = AtomicIntegerFieldUpdater.newUpdater(cls, "consumerIndex");
        A01 = AtomicIntegerFieldUpdater.newUpdater(cls, "blockingTasksInBuffer");
    }

    public static final AnonymousClass0AB A00(AnonymousClass0Y3 r5) {
        AnonymousClass0AB r2;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A02;
            int i = atomicIntegerFieldUpdater.get(r5);
            r2 = null;
            if (i - A03.get(r5) == 0) {
                break;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(r5, i, i + 1) && (r2 = (AnonymousClass0AB) r5.A00.getAndSet(i2, (Object) null)) != null) {
                if (r2.A01.A00 == 1) {
                    A01.decrementAndGet(r5);
                }
            }
        }
        return r2;
    }
}
