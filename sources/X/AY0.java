package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class AY0 implements Iterator {
    public int A00 = 0;
    public final Object[] A01;

    public AY0(Object[] objArr) {
        this.A01 = objArr;
    }

    public boolean hasNext() {
        return AnonymousClass000.A1T(this.A00, this.A01.length);
    }

    public Object next() {
        int i = this.A00;
        Object[] objArr = this.A01;
        if (i != objArr.length) {
            this.A00 = i + 1;
            return objArr[i];
        }
        throw new NoSuchElementException(AnonymousClass000.A0r("Out of elements: ", AnonymousClass000.A0u(), i));
    }

    public void remove() {
        throw AnonymousClass001.A0E("Cannot remove element from an Array.");
    }
}
