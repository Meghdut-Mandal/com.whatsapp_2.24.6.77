package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.0YX  reason: invalid class name */
public class AnonymousClass0YX {
    public static final AtomicIntegerFieldUpdater A01 = AtomicIntegerFieldUpdater.newUpdater(AnonymousClass0YX.class, "_size");
    public C16570pS[] A00;
    public volatile int _size;

    public static int A00(C16570pS[] r0, int i, int i2) {
        C16570pS r1 = r0[i];
        AnonymousClass00C.A0B(r1);
        C16570pS r02 = r0[i2];
        AnonymousClass00C.A0B(r02);
        return ((Comparable) r1).compareTo(r02);
    }

    public static final void A01(AnonymousClass0YX r2, int i, int i2) {
        C16570pS[] r22 = r2.A00;
        AnonymousClass00C.A0B(r22);
        C16570pS r1 = r22[i2];
        AnonymousClass00C.A0B(r1);
        C16570pS r0 = r22[i];
        AnonymousClass00C.A0B(r0);
        r22[i] = r1;
        r22[i2] = r0;
        ((C12090hU) r1).A00 = i;
        ((C12090hU) r0).A00 = i2;
    }

    public final C16570pS A02(int i) {
        C16570pS[] r4 = this.A00;
        AnonymousClass00C.A0B(r4);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A01;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i < atomicIntegerFieldUpdater.get(this)) {
            A01(this, i, atomicIntegerFieldUpdater.get(this));
            int i2 = (i - 1) / 2;
            if (i > 0 && A00(r4, i, i2) < 0) {
                A01(this, i, i2);
                while (i2 > 0) {
                    C16570pS[] r2 = this.A00;
                    AnonymousClass00C.A0B(r2);
                    int i3 = (i2 - 1) / 2;
                    if (A00(r2, i3, i2) <= 0) {
                        break;
                    }
                    A01(this, i2, i3);
                    i2 = i3;
                }
            } else {
                while (true) {
                    int i4 = (i * 2) + 1;
                    if (i4 >= atomicIntegerFieldUpdater.get(this)) {
                        break;
                    }
                    C16570pS[] r22 = this.A00;
                    AnonymousClass00C.A0B(r22);
                    int i5 = i4 + 1;
                    if (i5 < atomicIntegerFieldUpdater.get(this) && A00(r22, i5, i4) < 0) {
                        i4 = i5;
                    }
                    if (A00(r22, i, i4) <= 0) {
                        break;
                    }
                    A01(this, i, i4);
                    i = i4;
                }
            }
        }
        C16570pS r6 = r4[atomicIntegerFieldUpdater.get(this)];
        AnonymousClass00C.A0B(r6);
        C12090hU r23 = (C12090hU) r6;
        if (r23._heap != C05950Rs.A01) {
            r23._heap = null;
            r23.A00 = -1;
            r4[atomicIntegerFieldUpdater.get(this)] = null;
            return r6;
        }
        throw AnonymousClass001.A08("Failed requirement.");
    }
}
