package X;

import java.util.ConcurrentModificationException;

/* renamed from: X.0Uq  reason: invalid class name and case insensitive filesystem */
public abstract class C06680Uq {
    public int A00;
    public int A01 = -1;
    public int A02;
    public final C12460i5 A03;

    public final void A00() {
        C12460i5 r1 = this.A03;
        C12460i5 r0 = C12460i5.A00;
        if (r1.modCount != this.A02) {
            throw new ConcurrentModificationException();
        }
    }

    public final void A01() {
        while (true) {
            int i = this.A00;
            C12460i5 r1 = this.A03;
            C12460i5 r0 = C12460i5.A00;
            if (i < r1.length && r1.presenceArray[i] < 0) {
                this.A00 = i + 1;
            } else {
                return;
            }
        }
    }

    public final boolean hasNext() {
        int i = this.A00;
        C12460i5 r1 = this.A03;
        C12460i5 r0 = C12460i5.A00;
        return AnonymousClass000.A1T(i, r1.length);
    }

    public C06680Uq(C12460i5 r2) {
        this.A03 = r2;
        C12460i5 r0 = C12460i5.A00;
        this.A02 = r2.modCount;
        A01();
    }

    public final void remove() {
        A00();
        if (this.A01 != -1) {
            C12460i5 r1 = this.A03;
            r1.A05();
            C12460i5.A03(r1, this.A01);
            this.A01 = -1;
            this.A02 = r1.modCount;
            return;
        }
        throw AnonymousClass001.A09("Call next() before removing element from the iterator.");
    }
}
