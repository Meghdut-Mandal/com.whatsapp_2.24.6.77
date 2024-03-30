package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.9Y4  reason: invalid class name */
public abstract class AnonymousClass9Y4 {
    public boolean A00(C197829cR r3, C197829cR r4, A6T a6t) {
        boolean z;
        if (this instanceof C1684180n) {
            synchronized (a6t) {
                if (a6t.listeners == r3) {
                    a6t.listeners = r4;
                    z = true;
                } else {
                    z = false;
                }
            }
            return z;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ((C1684280o) this).A00;
        while (!atomicReferenceFieldUpdater.compareAndSet(a6t, r3, r4)) {
            if (atomicReferenceFieldUpdater.get(a6t) != r3) {
                return false;
            }
        }
        return true;
    }

    public boolean A01(C200839iK r3, C200839iK r4, A6T a6t) {
        boolean z;
        if (this instanceof C1684180n) {
            synchronized (a6t) {
                if (a6t.waiters == r3) {
                    a6t.waiters = r4;
                    z = true;
                } else {
                    z = false;
                }
            }
            return z;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ((C1684280o) this).A04;
        while (!atomicReferenceFieldUpdater.compareAndSet(a6t, r3, r4)) {
            if (atomicReferenceFieldUpdater.get(a6t) != r3) {
                return false;
            }
        }
        return true;
    }

    public boolean A02(A6T a6t, Object obj, Object obj2) {
        boolean z;
        if (this instanceof C1684180n) {
            synchronized (a6t) {
                if (a6t.value == obj) {
                    a6t.value = obj2;
                    z = true;
                } else {
                    z = false;
                }
            }
            return z;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ((C1684280o) this).A01;
        while (!atomicReferenceFieldUpdater.compareAndSet(a6t, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(a6t) != obj) {
                return false;
            }
        }
        return true;
    }
}
