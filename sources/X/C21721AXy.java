package X;

import java.util.Iterator;

/* renamed from: X.AXy  reason: case insensitive filesystem */
public class C21721AXy implements Iterator {
    public boolean atStart = true;
    public final /* synthetic */ Iterator val$iterator;

    public C21721AXy(AnonymousClass8HV r2, Iterator it) {
        this.val$iterator = it;
    }

    public boolean hasNext() {
        return this.val$iterator.hasNext();
    }

    public Object next() {
        Object next = this.val$iterator.next();
        this.atStart = false;
        return next;
    }

    public void remove() {
        C20080wz.checkRemove(!this.atStart);
        this.val$iterator.remove();
    }
}
