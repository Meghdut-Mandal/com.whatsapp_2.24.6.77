package X;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.AcP  reason: case insensitive filesystem */
public class C21896AcP extends AbstractSet<K> {
    public final /* synthetic */ C21892AcL this$0;

    public C21896AcP(C21892AcL acL) {
        this.this$0 = acL;
    }

    public void clear() {
        this.this$0.clear();
    }

    public boolean contains(Object obj) {
        return this.this$0.containsKey(obj);
    }

    public Iterator iterator() {
        return this.this$0.keySetIterator();
    }

    public boolean remove(Object obj) {
        C21892AcL acL = this.this$0;
        Map delegateOrNull = acL.delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.keySet().remove(obj);
        }
        return C36371kC.A1W(acL.removeHelper(obj), C21892AcL.NOT_FOUND);
    }

    public int size() {
        return this.this$0.size();
    }
}
