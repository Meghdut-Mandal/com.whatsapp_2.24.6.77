package X;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* renamed from: X.02y  reason: invalid class name and case insensitive filesystem */
public final class C006802y extends C005602m {
    public static final C006802y A01 = new C006802y();
    public AnonymousClass034 A00 = new AnonymousClass034(C006902z.A01, C006902z.A02, C006902z.A05, C006902z.A03);

    public String toString() {
        return "Dispatchers.Default";
    }

    public void A02(Runnable runnable, C005102h r5) {
        AnonymousClass034 r2 = this.A00;
        AtomicLongFieldUpdater atomicLongFieldUpdater = AnonymousClass034.A09;
        r2.A04(runnable, C006902z.A07, true);
    }

    public void A03(Runnable runnable, C005102h r5) {
        AnonymousClass034 r2 = this.A00;
        AtomicLongFieldUpdater atomicLongFieldUpdater = AnonymousClass034.A09;
        r2.A04(runnable, C006902z.A07, false);
    }

    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    public C005502l A01(int i) {
        AnonymousClass03D.A00(i);
        if (i >= C006902z.A01) {
            return this;
        }
        AnonymousClass03D.A00(i);
        return new AnonymousClass03E(this, i);
    }
}
