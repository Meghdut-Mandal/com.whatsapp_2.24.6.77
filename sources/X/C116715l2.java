package X;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.5l2  reason: invalid class name and case insensitive filesystem */
public class C116715l2 {
    public final Map A00 = new AnonymousClass008();

    public C116715l2(Map map) {
        Iterator A0y = AnonymousClass000.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            Object key = A11.getKey();
            Object value = A11.getValue();
            C18740tg.A06(key);
            for (Object put : (Set) key) {
                this.A00.put(put, value);
            }
        }
    }
}
