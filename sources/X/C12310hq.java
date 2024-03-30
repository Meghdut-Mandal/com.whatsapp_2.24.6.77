package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.0hq  reason: invalid class name and case insensitive filesystem */
public final class C12310hq implements Iterator, AnonymousClass00W {
    public int A00;
    public final Object[] A01;

    public boolean hasNext() {
        return AnonymousClass000.A1T(this.A00, this.A01.length);
    }

    public Object next() {
        try {
            Object[] objArr = this.A01;
            int i = this.A00;
            this.A00 = i + 1;
            return objArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.A00--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public C12310hq(Object[] objArr) {
        this.A01 = objArr;
    }

    public void remove() {
        throw AnonymousClass000.A0x();
    }
}
