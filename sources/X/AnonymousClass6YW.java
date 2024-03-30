package X;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.6YW  reason: invalid class name */
public class AnonymousClass6YW implements AnonymousClass7fV {
    public Object A00;
    public final int A01;

    public AnonymousClass6YW(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BVA(long j) {
        if (this.A01 != 0) {
            ((AnonymousClass65Q) this.A00).A0R.addAndGet(j);
            return;
        }
        AnonymousClass6VL r5 = (AnonymousClass6VL) this.A00;
        AtomicLong atomicLong = r5.A0f;
        atomicLong.addAndGet(j);
        if (j >= 10240) {
            r5.A0G.A04(atomicLong.get(), r5.A0d.get());
        }
    }
}
