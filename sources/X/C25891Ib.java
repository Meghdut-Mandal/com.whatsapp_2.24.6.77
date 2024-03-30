package X;

import java.util.Objects;

/* renamed from: X.1Ib  reason: invalid class name and case insensitive filesystem */
public final class C25891Ib<E> extends C20760y7<E> {
    public final transient Object element;

    public boolean isPartialView() {
        return false;
    }

    public int size() {
        return 1;
    }

    public C23931Ak asList() {
        return C23931Ak.of(this.element);
    }

    public boolean contains(Object obj) {
        return this.element.equals(obj);
    }

    public int copyIntoArray(Object[] objArr, int i) {
        objArr[i] = this.element;
        return i + 1;
    }

    public final int hashCode() {
        return this.element.hashCode();
    }

    public C225614x iterator() {
        return C225414v.singletonIterator(this.element);
    }

    public String toString() {
        String obj = this.element.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }

    public C25891Ib(Object obj) {
        Objects.requireNonNull(obj);
        this.element = obj;
    }
}
