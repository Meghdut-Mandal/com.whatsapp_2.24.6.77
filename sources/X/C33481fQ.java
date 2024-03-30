package X;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/* renamed from: X.1fQ  reason: invalid class name and case insensitive filesystem */
public class C33481fQ {
    public final Set A00 = new HashSet();

    public void A00() {
        Set<C226715i> set = this.A00;
        synchronized (set) {
            if (!set.isEmpty()) {
                for (C226715i BS8 : set) {
                    BS8.BS8();
                }
            }
        }
    }

    public void A01() {
        Set<C226715i> set = this.A00;
        synchronized (set) {
            if (!set.isEmpty()) {
                LinkedList linkedList = null;
                for (C226715i r1 : set) {
                    if (r1.BQx()) {
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                        }
                        linkedList.add(r1);
                    }
                }
                if (linkedList != null) {
                    Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        set.remove((C226715i) it.next());
                    }
                }
            }
        }
    }

    public void A02(C226715i r3) {
        Set set = this.A00;
        synchronized (set) {
            set.add(r3);
        }
    }
}
