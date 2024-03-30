package X;

import java.util.Iterator;

public final class AYE implements Iterator, AnonymousClass00W {
    public final C166627wY A00;

    public boolean hasNext() {
        return this.A00.hasNext();
    }

    public /* bridge */ /* synthetic */ Object next() {
        return this.A00.next();
    }

    public void remove() {
        this.A00.remove();
    }

    public AYE(C1513479e r5) {
        AYD[] aydArr = new AYD[8];
        int i = 0;
        do {
            aydArr[i] = new C166667wc(this);
            i++;
        } while (i < 8);
        this.A00 = new C166627wY(r5, aydArr);
    }
}
