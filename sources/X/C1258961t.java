package X;

import java.util.Map;

/* renamed from: X.61t  reason: invalid class name and case insensitive filesystem */
public class C1258961t {
    public final Map A00 = AnonymousClass001.A0J();
    public final Map A01 = AnonymousClass001.A0J();

    public void A00(Object obj, Object obj2) {
        Map map = this.A01;
        if (map.containsKey(obj2) && !C1901797e.A00(map.get(obj2), obj)) {
            map.put(obj2, obj);
            ((AnonymousClass04S) C90514aH.A0p(obj2, this.A00)).BTH(obj);
        }
    }
}
