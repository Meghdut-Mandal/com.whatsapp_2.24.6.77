package X;

import java.util.NoSuchElementException;

/* renamed from: X.0Mn  reason: invalid class name and case insensitive filesystem */
public final class C04920Mn extends C04930Mo {
    public int A00;
    public final int A01;
    public final AnonymousClass0MZ A02;

    public final int nextIndex() {
        return this.A00;
    }

    public final int previousIndex() {
        return this.A00 - 1;
    }

    public final boolean hasNext() {
        return AnonymousClass000.A1T(this.A00, this.A01);
    }

    public final boolean hasPrevious() {
        return AnonymousClass000.A1R(this.A00);
    }

    public C04920Mn(AnonymousClass0MZ r3, int i) {
        int size = r3.size();
        if (i <= size) {
            this.A01 = size;
            this.A00 = i;
            this.A02 = r3;
            return;
        }
        throw new IndexOutOfBoundsException(C07320Xe.A00(i, size, "index"));
    }

    public final Object next() {
        if (hasNext()) {
            int i = this.A00;
            this.A00 = i + 1;
            return this.A02.get(i);
        }
        throw new NoSuchElementException();
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i = this.A00 - 1;
            this.A00 = i;
            return this.A02.get(i);
        }
        throw new NoSuchElementException();
    }
}
