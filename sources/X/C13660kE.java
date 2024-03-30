package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.0kE  reason: invalid class name and case insensitive filesystem */
public final class C13660kE extends C06680Uq implements Iterator, AnonymousClass00W {
    public Object next() {
        A00();
        int i = this.A00;
        C12460i5 r1 = this.A03;
        C12460i5 r0 = C12460i5.A00;
        if (i < r1.length) {
            this.A00 = i + 1;
            this.A01 = i;
            Object obj = r1.keysArray[i];
            A01();
            return obj;
        }
        throw new NoSuchElementException();
    }

    public C13660kE(C12460i5 r1) {
        super(r1);
    }
}
