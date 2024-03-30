package X;

import java.util.NoSuchElementException;

/* renamed from: X.153  reason: invalid class name */
public abstract class AnonymousClass153 extends AnonymousClass152 {
    public int position;
    public final int size;

    public abstract Object get(int i);

    public final boolean hasNext() {
        if (this.position < this.size) {
            return true;
        }
        return false;
    }

    public final boolean hasPrevious() {
        if (this.position > 0) {
            return true;
        }
        return false;
    }

    public final int previousIndex() {
        return this.position - 1;
    }

    public AnonymousClass153(int i, int i2) {
        C20740y5.A02(i2, i);
        this.size = i;
        this.position = i2;
    }

    public final Object next() {
        if (hasNext()) {
            int i = this.position;
            this.position = i + 1;
            return get(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.position;
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i = this.position - 1;
            this.position = i;
            return get(i);
        }
        throw new NoSuchElementException();
    }
}
