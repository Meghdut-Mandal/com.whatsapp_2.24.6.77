package X;

import java.util.Objects;

/* renamed from: X.1Al  reason: invalid class name and case insensitive filesystem */
public class C23941Al<E> extends C23931Ak<E> {
    public static final C23931Ak EMPTY = new C23941Al(new Object[0], 0);
    public final transient Object[] array;
    public final transient int size;

    public int internalArrayStart() {
        return 0;
    }

    public boolean isPartialView() {
        return false;
    }

    public int copyIntoArray(Object[] objArr, int i) {
        System.arraycopy(this.array, 0, objArr, i, this.size);
        return i + this.size;
    }

    public Object get(int i) {
        C20740y5.A01(i, this.size);
        Object obj = this.array[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    public C23941Al(Object[] objArr, int i) {
        this.array = objArr;
        this.size = i;
    }

    public Object[] internalArray() {
        return this.array;
    }

    public int internalArrayEnd() {
        return this.size;
    }

    public int size() {
        return this.size;
    }
}
