package X;

import java.util.ArrayDeque;

/* renamed from: X.9U5  reason: invalid class name */
public final class AnonymousClass9U5 {
    public boolean A00;
    public final AnonymousClass81Q A01;
    public final ArrayDeque A02 = new ArrayDeque();

    public final void A00(C195999Xe r3) {
        AnonymousClass81Q r1 = this.A01;
        C195999Xe r0 = (C195999Xe) this.A02.peek();
        C166097v1 r12 = r1.A00;
        if (r0 == null) {
            r0 = null;
        }
        C166097v1.A00(r3, r0, r12);
    }

    public final void A01(C195999Xe r5, C006302t r6) {
        AnonymousClass81Q r0 = this.A01;
        ArrayDeque arrayDeque = this.A02;
        C195999Xe r1 = (C195999Xe) arrayDeque.peek();
        if (r1 == null) {
            C166097v1.A00(r5, (C195999Xe) null, r0.A00);
        } else {
            C166097v1.A00(r5, r1, r0.A00);
        }
        arrayDeque.push(r5);
        try {
            r6.invoke(this);
            if (!AnonymousClass00C.A0J(arrayDeque.pop(), r5)) {
                throw AnonymousClass001.A09("Check failed.");
            }
        } catch (Throwable th) {
            if (!AnonymousClass00C.A0J(arrayDeque.pop(), r5)) {
                throw AnonymousClass001.A09("Check failed.");
            }
            throw th;
        }
    }

    public AnonymousClass9U5(AnonymousClass81Q r2) {
        this.A01 = r2;
    }
}
