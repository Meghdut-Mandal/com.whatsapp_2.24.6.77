package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.0my  reason: invalid class name and case insensitive filesystem */
public final class C15270my extends C008603r {
    public static final AtomicIntegerFieldUpdater A01 = AtomicIntegerFieldUpdater.newUpdater(C15270my.class, "_invoked");
    public final C006302t A00;
    public volatile int _invoked;

    public void A05(Throwable th) {
        if (A01.compareAndSet(this, 0, 1)) {
            this.A00.invoke(th);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A05((Throwable) obj);
        return AnonymousClass0AJ.A00;
    }

    public C15270my(C006302t r1) {
        this.A00 = r1;
    }
}
