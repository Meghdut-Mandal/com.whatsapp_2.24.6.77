package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.0nQ  reason: invalid class name and case insensitive filesystem */
public abstract class C15490nQ extends AnonymousClass0A7 {
    public static final AtomicReferenceFieldUpdater A00 = AtomicReferenceFieldUpdater.newUpdater(C15490nQ.class, Object.class, "_consensus");
    public volatile Object _consensus = C05780Ra.A00;

    public abstract Object A01(Object obj);

    public final Object A00(Object obj) {
        boolean z;
        C008303o r1;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A00;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        Object obj3 = C05780Ra.A00;
        if (obj2 == obj3) {
            Object A01 = A01(obj);
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 == obj3) {
                if (!AnonymousClass0A8.A00(this, obj3, A01, atomicReferenceFieldUpdater)) {
                    A01 = atomicReferenceFieldUpdater.get(this);
                }
                obj2 = A01;
            }
        }
        C15450nM r3 = (C15450nM) this;
        if (obj2 == null) {
            z = true;
            r1 = r3.A01;
        } else {
            z = false;
            r1 = r3.A00;
        }
        if (r1 != null && AnonymousClass0A8.A00(obj, r3, r1, C008303o.A00) && z) {
            C008303o r12 = r3.A01;
            C008303o r0 = r3.A00;
            AnonymousClass00C.A0B(r0);
            C008303o.A01(r12, r0);
        }
        return obj2;
    }
}
