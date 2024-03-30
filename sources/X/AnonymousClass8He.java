package X;

import java.util.Iterator;
import java.util.ListIterator;

/* renamed from: X.8He  reason: invalid class name */
public class AnonymousClass8He extends C23931Ak<E> {
    public final transient int length;
    public final transient int offset;
    public final /* synthetic */ C23931Ak this$0;

    public boolean isPartialView() {
        return true;
    }

    public AnonymousClass8He(C23931Ak r1, int i, int i2) {
        this.this$0 = r1;
        this.offset = i;
        this.length = i2;
    }

    public Object get(int i) {
        C20740y5.A01(i, this.length);
        return this.this$0.get(i + this.offset);
    }

    public Object[] internalArray() {
        return this.this$0.internalArray();
    }

    public int internalArrayEnd() {
        return this.this$0.internalArrayStart() + this.offset + this.length;
    }

    public int internalArrayStart() {
        return this.this$0.internalArrayStart() + this.offset;
    }

    public C23931Ak subList(int i, int i2) {
        C20740y5.A03(i, i2, this.length);
        C23931Ak r1 = this.this$0;
        int i3 = this.offset;
        return r1.subList(i + i3, i2 + i3);
    }

    public /* bridge */ /* synthetic */ Iterator iterator() {
        return super.iterator();
    }

    public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return super.listIterator(i);
    }

    public int size() {
        return this.length;
    }

    public /* bridge */ /* synthetic */ ListIterator listIterator() {
        return super.listIterator();
    }
}
