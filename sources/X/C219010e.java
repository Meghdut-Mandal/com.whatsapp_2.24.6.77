package X;

import java.lang.ref.PhantomReference;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.10e  reason: invalid class name and case insensitive filesystem */
public abstract class C219010e extends PhantomReference {
    public C219010e next;
    public C219010e previous;

    public abstract void destruct();

    public C219010e(Object obj) {
        super(obj, AnonymousClass14S.A02);
        AtomicReference atomicReference;
        C219010e r0;
        AnonymousClass14T r2 = AnonymousClass14S.A01;
        do {
            atomicReference = r2.A00;
            r0 = (C219010e) atomicReference.get();
            this.next = r0;
        } while (!atomicReference.compareAndSet(r0, this));
    }

    public C219010e() {
        super((Object) null, AnonymousClass14S.A02);
    }
}
