package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.0hi  reason: invalid class name and case insensitive filesystem */
public final class C12230hi implements Iterator {
    public int A00;
    public final int A01;
    public final /* synthetic */ C10970fW A02;

    public C12230hi() {
    }

    public C12230hi(C10970fW r2) {
        this.A02 = r2;
        this.A00 = 0;
        this.A01 = r2.A04();
    }

    public final boolean hasNext() {
        return AnonymousClass000.A1T(this.A00, this.A01);
    }

    public final /* synthetic */ Object next() {
        int i = this.A00;
        if (i < this.A01) {
            this.A00 = i + 1;
            return Byte.valueOf(this.A02.A03(i));
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw AnonymousClass001.A0D();
    }
}
