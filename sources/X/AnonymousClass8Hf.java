package X;

import java.util.Iterator;
import java.util.ListIterator;

/* renamed from: X.8Hf  reason: invalid class name */
public class AnonymousClass8Hf<E> extends C23931Ak<E> {
    public final transient C23931Ak forwardList;

    public boolean contains(Object obj) {
        return this.forwardList.contains(obj);
    }

    public int indexOf(Object obj) {
        int lastIndexOf = this.forwardList.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return reverseIndex(lastIndexOf);
        }
        return -1;
    }

    public boolean isPartialView() {
        return this.forwardList.isPartialView();
    }

    public int lastIndexOf(Object obj) {
        int indexOf = this.forwardList.indexOf(obj);
        if (indexOf >= 0) {
            return reverseIndex(indexOf);
        }
        return -1;
    }

    public int size() {
        return this.forwardList.size();
    }

    public AnonymousClass8Hf(C23931Ak r1) {
        this.forwardList = r1;
    }

    private int reverseIndex(int i) {
        return (size() - 1) - i;
    }

    private int reversePosition(int i) {
        return size() - i;
    }

    public Object get(int i) {
        C20740y5.A01(i, size());
        return this.forwardList.get(reverseIndex(i));
    }

    public /* bridge */ /* synthetic */ Iterator iterator() {
        return super.iterator();
    }

    public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return super.listIterator(i);
    }

    public C23931Ak reverse() {
        return this.forwardList;
    }

    public C23931Ak subList(int i, int i2) {
        C20740y5.A03(i, i2, size());
        return this.forwardList.subList(reversePosition(i2), reversePosition(i)).reverse();
    }

    public /* bridge */ /* synthetic */ ListIterator listIterator() {
        return super.listIterator();
    }
}
