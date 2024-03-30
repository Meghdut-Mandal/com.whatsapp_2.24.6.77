package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.036  reason: invalid class name */
public class AnonymousClass036 {
    public static final AtomicReferenceFieldUpdater A00 = AtomicReferenceFieldUpdater.newUpdater(AnonymousClass036.class, Object.class, "_cur");
    public volatile Object _cur = new AnonymousClass038(8, false);

    public final int A00() {
        long j = AnonymousClass038.A04.get(A00.get(this));
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j) >> 0)));
    }

    public final Object A01() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A00;
        while (true) {
            AnonymousClass038 r2 = (AnonymousClass038) atomicReferenceFieldUpdater.get(this);
            Object A03 = r2.A03();
            if (A03 != AnonymousClass038.A05) {
                return A03;
            }
            AnonymousClass0A8.A00(this, r2, AnonymousClass038.A01(r2, AnonymousClass038.A00(r2)), atomicReferenceFieldUpdater);
        }
    }

    public final boolean A02(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A00;
        while (true) {
            AnonymousClass038 r2 = (AnonymousClass038) atomicReferenceFieldUpdater.get(this);
            int A02 = r2.A02(obj);
            if (A02 == 0) {
                return true;
            }
            if (A02 != 1) {
                return false;
            }
            AnonymousClass0A8.A00(this, r2, AnonymousClass038.A01(r2, AnonymousClass038.A00(r2)), atomicReferenceFieldUpdater);
        }
    }
}
