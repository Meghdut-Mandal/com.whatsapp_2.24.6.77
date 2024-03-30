package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.9Y6  reason: invalid class name */
public abstract class AnonymousClass9Y6 {
    public void A00(C200849iL r2, C200849iL r3) {
        if (this instanceof C170858Ht) {
            r2.next = r3;
        } else {
            ((C170868Hu) this).A02.lazySet(r2, r3);
        }
    }

    public void A01(C200849iL r2, Thread thread) {
        if (this instanceof C170858Ht) {
            r2.thread = thread;
        } else {
            ((C170868Hu) this).A03.lazySet(r2, thread);
        }
    }

    public boolean A02(C200879iP r3, C200879iP r4, C170888Hw r5) {
        boolean z;
        if (this instanceof C170858Ht) {
            synchronized (r5) {
                boolean z2 = C170888Hw.A01;
                if (r5.listeners == r3) {
                    r5.listeners = r4;
                    z = true;
                } else {
                    z = false;
                }
            }
            return z;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ((C170868Hu) this).A00;
        while (!atomicReferenceFieldUpdater.compareAndSet(r5, r3, r4)) {
            if (atomicReferenceFieldUpdater.get(r5) != r3) {
                return false;
            }
        }
        return true;
    }

    public boolean A03(C200849iL r3, C200849iL r4, C170888Hw r5) {
        boolean z;
        if (this instanceof C170858Ht) {
            synchronized (r5) {
                boolean z2 = C170888Hw.A01;
                if (r5.waiters == r3) {
                    r5.waiters = r4;
                    z = true;
                } else {
                    z = false;
                }
            }
            return z;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ((C170868Hu) this).A04;
        while (!atomicReferenceFieldUpdater.compareAndSet(r5, r3, r4)) {
            if (atomicReferenceFieldUpdater.get(r5) != r3) {
                return false;
            }
        }
        return true;
    }

    public boolean A04(C170888Hw r4, Object obj, Object obj2) {
        boolean z;
        if (this instanceof C170858Ht) {
            synchronized (r4) {
                boolean z2 = C170888Hw.A01;
                if (r4.value == null) {
                    r4.value = obj2;
                    z = true;
                } else {
                    z = false;
                }
            }
            return z;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ((C170868Hu) this).A01;
        while (!atomicReferenceFieldUpdater.compareAndSet(r4, (Object) null, obj2)) {
            if (atomicReferenceFieldUpdater.get(r4) != null) {
                return false;
            }
        }
        return true;
    }
}
