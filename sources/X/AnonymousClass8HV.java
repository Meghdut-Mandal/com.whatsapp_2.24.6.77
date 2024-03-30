package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.8HV  reason: invalid class name */
public class AnonymousClass8HV extends AUu {
    public final /* synthetic */ Iterable val$iterable;
    public final /* synthetic */ int val$numberToSkip;

    public AnonymousClass8HV(Iterable iterable, int i) {
        this.val$iterable = iterable;
        this.val$numberToSkip = i;
    }

    public Iterator iterator() {
        Iterable iterable = this.val$iterable;
        if (iterable instanceof List) {
            List list = (List) iterable;
            return list.subList(Math.min(list.size(), this.val$numberToSkip), list.size()).iterator();
        }
        Iterator it = iterable.iterator();
        C225414v.advance(it, this.val$numberToSkip);
        return new C21721AXy(this, it);
    }
}
