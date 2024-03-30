package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.0nT  reason: invalid class name and case insensitive filesystem */
public final class C15520nT extends C15540nV {
    public static final AtomicIntegerFieldUpdater A00 = AtomicIntegerFieldUpdater.newUpdater(C15520nT.class, "_decision");
    public volatile int _decision;

    private final boolean A00() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A00;
        do {
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw AnonymousClass001.A09("Already resumed");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
        return true;
    }

    private final boolean A01() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A00;
        do {
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                throw AnonymousClass001.A09("Already suspended");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 1));
        return true;
    }

    public void A0y(Object obj) {
        if (!A00()) {
            C023509x A01 = AnonymousClass0AA.A01(this.A00);
            if (obj instanceof AnonymousClass0AT) {
                obj = AnonymousClass00C.A02(((AnonymousClass0AT) obj).A00);
            }
            AnonymousClass0AE.A00(obj, A01);
        }
    }

    public final Object A11() {
        if (A01()) {
            return AnonymousClass0AO.COROUTINE_SUSPENDED;
        }
        Object A01 = C007803i.A01(A0X());
        if (!(A01 instanceof AnonymousClass0AT)) {
            return A01;
        }
        throw ((AnonymousClass0AT) A01).A00;
    }

    public void A0h(Object obj) {
        A0y(obj);
    }

    public C15520nT(C023509x r1, C005102h r2) {
        super(r1, r2);
    }
}
