package X;

import android.os.Looper;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.6MX  reason: invalid class name */
public class AnonymousClass6MX {
    public final List A00 = AnonymousClass001.A0I();
    public final Map A01 = AnonymousClass001.A0J();

    public synchronized void A01(String str, Object obj) {
        Map map;
        if (obj == null) {
            map = this.A01;
            if (!map.containsKey(str)) {
            }
        } else {
            map = this.A01;
            if (obj.equals(map.get(str))) {
            }
        }
        map.put(str, obj);
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            C121125sd r1 = (C121125sd) it.next();
            AnonymousClass6WZ r4 = (AnonymousClass6WZ) r1.A01.get();
            if (r1.A00.A00 || r4 == null) {
                it.remove();
            } else {
                Set A0r = C90524aI.A0r(str, r1.A02);
                if (A0r != null) {
                    Iterator it2 = A0r.iterator();
                    while (it2.hasNext()) {
                        C1502274l r2 = new C1502274l(r4, obj, AnonymousClass001.A0C(it2), 8);
                        if (Looper.getMainLooper() == Looper.myLooper()) {
                            r2.run();
                        } else {
                            AnonymousClass6WZ.A0M.post(r2);
                        }
                    }
                }
            }
        }
    }

    public static C118845op A00(AnonymousClass6WZ r5, AnonymousClass6MX r6, Object obj, String str, String str2) {
        C121125sd r3;
        List list = r6.A00;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                r3 = new C121125sd(r5);
                list.add(r3);
                break;
            }
            r3 = (C121125sd) it.next();
            Object obj2 = r3.A01.get();
            if (r3.A00.A00 || obj2 == null) {
                it.remove();
            } else if (obj2 == r5) {
                break;
            }
        }
        Map map = r3.A02;
        Set A0r = C90524aI.A0r(str, map);
        HashSet hashSet = A0r;
        if (A0r == null) {
            HashSet hashSet2 = new HashSet(1);
            hashSet2.add(str2);
            map.put(str, hashSet2);
            hashSet = hashSet2;
        }
        hashSet.add(str2);
        return new C118845op(r3.A00, obj);
    }
}
