package X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* renamed from: X.76U  reason: invalid class name */
public final class AnonymousClass76U implements Iterator, AnonymousClass00W {
    public int A00;
    public final int A01;
    public final C1496372c A02;
    public final int A03;

    public boolean hasNext() {
        return AnonymousClass000.A1T(this.A00, this.A03);
    }

    public /* bridge */ /* synthetic */ Object next() {
        C1496372c r3 = this.A02;
        int i = r3.A03;
        int i2 = this.A01;
        if (i == i2) {
            int i3 = this.A00;
            this.A00 = C90524aI.A05(r3.A07, i3) + i3;
            return new C1496272b(r3, i3, i2);
        }
        throw new ConcurrentModificationException();
    }

    public AnonymousClass76U(C1496372c r2, int i, int i2) {
        this.A02 = r2;
        this.A03 = i2;
        this.A00 = i;
        this.A01 = r2.A03;
        if (r2.A06) {
            throw new ConcurrentModificationException();
        }
    }

    public void remove() {
        throw AnonymousClass000.A0x();
    }
}
