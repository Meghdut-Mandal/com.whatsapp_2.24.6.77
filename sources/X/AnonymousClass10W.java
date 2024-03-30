package X;

import java.lang.ref.PhantomReference;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.10W  reason: invalid class name */
public abstract class AnonymousClass10W extends PhantomReference {
    public AnonymousClass10W A00;
    public AnonymousClass10W A01;

    public abstract void destruct();

    public AnonymousClass10W(Object obj) {
        super(obj, AnonymousClass9B0.A02);
        AtomicReference atomicReference;
        AnonymousClass10W r0;
        AnonymousClass9CN r2 = AnonymousClass9B0.A01;
        do {
            atomicReference = r2.A00;
            r0 = (AnonymousClass10W) atomicReference.get();
            this.A00 = r0;
        } while (!atomicReference.compareAndSet(r0, this));
    }

    public AnonymousClass10W() {
        super((Object) null, AnonymousClass9B0.A02);
    }
}
