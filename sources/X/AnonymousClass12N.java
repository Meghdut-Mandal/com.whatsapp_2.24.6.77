package X;

import java.lang.ref.WeakReference;

/* renamed from: X.12N  reason: invalid class name */
public abstract class AnonymousClass12N implements AnonymousClass12L, AnonymousClass12M {
    public final C21400zB A00;
    public final C220012m A01;

    public AnonymousClass12N(C220112n r2) {
        AnonymousClass00C.A0D(r2, 1);
        C220012m r0 = r2.A01;
        AnonymousClass00C.A08(r0);
        this.A01 = r0;
        C21400zB r02 = r2.A00;
        AnonymousClass00C.A08(r02);
        this.A00 = r02;
    }

    public final void A08() {
        this.A01.registerObserver(this);
        C21400zB r2 = this.A00;
        synchronized (r2) {
            r2.A00.add(new WeakReference(this));
        }
    }
}
