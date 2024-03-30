package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class AY1 implements Iterator {
    public int A00 = 0;
    public final int A01;
    public final /* synthetic */ AUv A02;

    public AY1(AUv aUv) {
        this.A02 = aUv;
        this.A01 = aUv.A02();
    }

    public final boolean hasNext() {
        return AnonymousClass000.A1T(this.A00, this.A01);
    }

    public final /* synthetic */ Object next() {
        try {
            AUv aUv = this.A02;
            int i = this.A00;
            this.A00 = i + 1;
            return Byte.valueOf(aUv.A01(i));
        } catch (IndexOutOfBoundsException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public final void remove() {
        throw AnonymousClass001.A0D();
    }
}
