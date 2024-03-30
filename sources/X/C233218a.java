package X;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.18a  reason: invalid class name and case insensitive filesystem */
public class C233218a {
    public final Map A00 = new HashMap();
    public final Set A01 = new LinkedHashSet();

    public synchronized C198789eC A00(AnonymousClass6EZ r2) {
        this.A01.remove(r2);
        return (C198789eC) this.A00.get(r2);
    }

    public synchronized void A03(C198789eC r6, AnonymousClass6EZ r7) {
        synchronized (this) {
            Map map = this.A00;
            if (map.size() > 1000) {
                Iterator it = this.A01.iterator();
                while (it.hasNext() && map.size() > 1000) {
                    map.remove((AnonymousClass6EZ) it.next());
                    it.remove();
                }
            }
            if (map.containsKey(r7)) {
                this.A01.add(r7);
            }
            map.put(r7, r6);
        }
    }

    public synchronized void A04(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass6EZ r2 = (AnonymousClass6EZ) it.next();
            Map map = this.A00;
            if (!map.containsKey(r2)) {
                map.put(r2, new C198789eC());
            }
        }
    }

    public HashSet A01(List list) {
        HashSet hashSet = new HashSet(list.size());
        synchronized (this) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass6EZ r1 = (AnonymousClass6EZ) it.next();
                C198789eC r0 = (C198789eC) this.A00.get(r1);
                if (r0 != null && r0.A00) {
                    hashSet.add(r1);
                }
            }
        }
        return hashSet;
    }

    public HashSet A02(List list) {
        HashSet hashSet = new HashSet(list.size());
        synchronized (this) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass6EZ r1 = (AnonymousClass6EZ) it.next();
                if (!this.A00.containsKey(r1)) {
                    hashSet.add(r1);
                }
            }
        }
        return hashSet;
    }
}
