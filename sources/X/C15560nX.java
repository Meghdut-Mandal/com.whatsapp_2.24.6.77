package X;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: X.0nX  reason: invalid class name and case insensitive filesystem */
public final class C15560nX extends C15460nN {
    public final AtomicReferenceArray A00 = new AtomicReferenceArray(AnonymousClass0SC.A01 * 2);
    public final C12960iw A01;

    public void A06(Throwable th, C005102h r7, int i) {
        AnonymousClass035 r0;
        int i2 = AnonymousClass0SC.A01;
        boolean z = false;
        if (i >= i2) {
            z = true;
            i -= i2;
        }
        AtomicReferenceArray atomicReferenceArray = this.A00;
        int i3 = i * 2;
        atomicReferenceArray.get(i3);
        while (true) {
            Object obj = atomicReferenceArray.get(i3 + 1);
            if ((obj instanceof AnonymousClass0AQ) || (obj instanceof C06420Tn)) {
                if (z) {
                    r0 = AnonymousClass0SC.A0A;
                } else {
                    r0 = AnonymousClass0SC.A09;
                }
                if (A09(i, obj, r0)) {
                    atomicReferenceArray.lazySet(i3, (Object) null);
                    A08(i, !z);
                    break;
                }
            } else if (obj == AnonymousClass0SC.A0A || obj == AnonymousClass0SC.A09) {
                atomicReferenceArray.lazySet(i3, (Object) null);
            } else if (!(obj == AnonymousClass0SC.A0F || obj == AnonymousClass0SC.A0G)) {
                if (obj != AnonymousClass0SC.A07 && obj != AnonymousClass0SC.A03 && obj != AnonymousClass0SC.A04) {
                    throw AnonymousClass000.A0f(obj, "unexpected state: ", AnonymousClass000.A0u());
                }
                return;
            }
        }
        atomicReferenceArray.lazySet(i3, (Object) null);
        if (z) {
            AnonymousClass00C.A0B(this.A01);
        }
    }

    public final void A08(int i, boolean z) {
        if (z) {
            C12960iw r4 = this.A01;
            AnonymousClass00C.A0B(r4);
            r4.A0K((this.A00 * ((long) AnonymousClass0SC.A01)) + ((long) i));
        }
        A05();
    }

    public final boolean A09(int i, Object obj, Object obj2) {
        return this.A00.compareAndSet((i * 2) + 1, obj, obj2);
    }

    public C15560nX(C12960iw r3, C15560nX r4, int i, long j) {
        super(r4, i, j);
        this.A01 = r3;
    }

    public int A04() {
        return AnonymousClass0SC.A01;
    }
}
