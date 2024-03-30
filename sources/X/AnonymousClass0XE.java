package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.0XE  reason: invalid class name */
public abstract class AnonymousClass0XE {
    public static final AtomicReferenceFieldUpdater A00;
    public static final AtomicReferenceFieldUpdater A01;
    public volatile Object _next;
    public volatile Object _prev;

    static {
        Class<AnonymousClass0XE> cls = AnonymousClass0XE.class;
        Class<Object> cls2 = Object.class;
        A00 = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_next");
        A01 = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_prev");
    }

    public abstract boolean A03();

    public final AnonymousClass0XE A00() {
        Object obj = A00.get(this);
        if (obj == C06980Vw.A00) {
            return null;
        }
        return (AnonymousClass0XE) obj;
    }

    public final void A01() {
        A01.lazySet(this, (Object) null);
    }

    public AnonymousClass0XE(AnonymousClass0XE r1) {
        this._prev = r1;
    }

    public final void A02() {
        AnonymousClass0XE r3;
        Object obj;
        AnonymousClass0XE r0;
        AnonymousClass0XE A002;
        if (A00() != null) {
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A01;
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    r3 = (AnonymousClass0XE) obj2;
                    if (r3 == null || !r3.A03()) {
                        AnonymousClass0XE A003 = A00();
                        AnonymousClass00C.A0B(A003);
                    } else {
                        obj2 = atomicReferenceFieldUpdater.get(r3);
                    }
                }
                AnonymousClass0XE A0032 = A00();
                AnonymousClass00C.A0B(A0032);
                while (A0032.A03() && (A002 = A0032.A00()) != null) {
                    A0032 = A002;
                }
                do {
                    obj = atomicReferenceFieldUpdater.get(A0032);
                    r0 = r3;
                    if (obj == null) {
                        r0 = null;
                    }
                } while (!AnonymousClass0A8.A00(A0032, obj, r0, atomicReferenceFieldUpdater));
                if (r3 != null) {
                    A00.set(r3, A0032);
                }
                if ((!A0032.A03() || A0032.A00() == null) && (r3 == null || !r3.A03())) {
                    return;
                }
            }
        }
    }
}
