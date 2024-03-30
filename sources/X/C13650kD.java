package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.0kD  reason: invalid class name and case insensitive filesystem */
public final class C13650kD extends C06680Uq implements Iterator, AnonymousClass00W {
    public /* bridge */ /* synthetic */ Object next() {
        A00();
        int i = this.A00;
        C12460i5 r1 = this.A03;
        C12460i5 r0 = C12460i5.A00;
        if (i < r1.length) {
            this.A00 = i + 1;
            this.A01 = i;
            C12440i3 r02 = new C12440i3(r1, i);
            A01();
            return r02;
        }
        throw new NoSuchElementException();
    }

    public C13650kD(C12460i5 r1) {
        super(r1);
    }
}
