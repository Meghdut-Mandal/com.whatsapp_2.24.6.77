package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.0kF  reason: invalid class name and case insensitive filesystem */
public final class C13670kF extends C06680Uq implements Iterator, AnonymousClass00W {
    public Object next() {
        A00();
        int i = this.A00;
        C12460i5 r1 = this.A03;
        C12460i5 r0 = C12460i5.A00;
        if (i < r1.length) {
            this.A00 = i + 1;
            this.A01 = i;
            Object[] objArr = r1.valuesArray;
            AnonymousClass00C.A0B(objArr);
            Object obj = objArr[this.A01];
            A01();
            return obj;
        }
        throw new NoSuchElementException();
    }

    public C13670kF(C12460i5 r1) {
        super(r1);
    }
}
