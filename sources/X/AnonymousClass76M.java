package X;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.76M  reason: invalid class name */
public final class AnonymousClass76M implements Iterator {
    public int A00 = 0;
    public final int A01;
    public final Object[] A02;

    public boolean hasNext() {
        return AnonymousClass000.A1T(this.A00, this.A02.length);
    }

    public AnonymousClass76M(Object[] objArr, int i) {
        this.A02 = objArr;
        this.A01 = i;
    }

    public /* bridge */ /* synthetic */ Object next() {
        if (hasNext()) {
            int i = this.A00;
            int i2 = this.A01;
            Object[] objArr = this.A02;
            int length = objArr.length;
            int min = Math.min(i + i2, length);
            if (length > i2 || i != 0) {
                objArr = Arrays.copyOfRange(objArr, i, min);
            }
            this.A00 += i2;
            return objArr;
        }
        throw new NoSuchElementException("There are no more chunks to provide.");
    }
}
