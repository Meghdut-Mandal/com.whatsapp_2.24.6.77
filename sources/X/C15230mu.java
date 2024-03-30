package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.0mu  reason: invalid class name and case insensitive filesystem */
public final class C15230mu extends AnonymousClass0AT {
    public static final AtomicIntegerFieldUpdater A00 = AtomicIntegerFieldUpdater.newUpdater(C15230mu.class, "_resumed");
    public volatile int _resumed;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C15230mu(java.lang.Throwable r3, X.C023509x r4, boolean r5) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x0019
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Continuation "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " was cancelled normally"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            java.util.concurrent.CancellationException r3 = new java.util.concurrent.CancellationException
            r3.<init>(r0)
        L_0x0019:
            r2.<init>(r3, r5)
            r0 = 0
            r2._resumed = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15230mu.<init>(java.lang.Throwable, X.09x, boolean):void");
    }

    public final boolean A02() {
        return A00.compareAndSet(this, 0, 1);
    }
}
