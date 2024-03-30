package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.0nN  reason: invalid class name and case insensitive filesystem */
public abstract class C15460nN extends AnonymousClass0XE implements C16560pR {
    public static final AtomicIntegerFieldUpdater A01 = AtomicIntegerFieldUpdater.newUpdater(C15460nN.class, "cleanedAndPointers");
    public final long A00;
    public volatile int cleanedAndPointers;

    public abstract int A04();

    public abstract void A06(Throwable th, C005102h r2, int i);

    public boolean A03() {
        if (A01.get(this) != A04() || A00() == null) {
            return false;
        }
        return true;
    }

    public final void A05() {
        if (A01.incrementAndGet(this) == A04()) {
            A02();
        }
    }

    public final boolean A07() {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A01;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            if (i == A04() && A00() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }

    public C15460nN(C15460nN r2, int i, long j) {
        super(r2);
        this.A00 = j;
        this.cleanedAndPointers = i << 16;
    }
}
