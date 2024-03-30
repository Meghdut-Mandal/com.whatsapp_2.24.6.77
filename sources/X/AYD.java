package X;

import java.util.Iterator;

public abstract class AYD implements Iterator, AnonymousClass00W {
    public int A00;
    public int A01;
    public Object[] A02 = AnonymousClass6YE.A04.A02;

    public boolean hasNext() {
        return AnonymousClass000.A1T(this.A01, this.A00);
    }

    public void remove() {
        throw AnonymousClass001.A0E("Operation is not supported for read-only collection");
    }
}
