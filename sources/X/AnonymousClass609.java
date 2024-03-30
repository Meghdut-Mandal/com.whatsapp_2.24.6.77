package X;

import android.util.Log;
import java.util.AbstractMap;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: X.609  reason: invalid class name */
public class AnonymousClass609 {
    public final Map A00 = C36431kI.A1G();

    public void A00(AnonymousClass61V... r8) {
        AnonymousClass00C.A0D(r8, 0);
        for (AnonymousClass61V r4 : r8) {
            int i = r4.A01;
            int i2 = r4.A00;
            Map map = this.A00;
            Integer valueOf = Integer.valueOf(i);
            Object obj = map.get(valueOf);
            if (obj == null) {
                obj = new TreeMap();
                map.put(valueOf, obj);
            }
            AbstractMap abstractMap = (AbstractMap) obj;
            Integer valueOf2 = Integer.valueOf(i2);
            if (abstractMap.containsKey(valueOf2)) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("Overriding migration ");
                A0u.append(abstractMap.get(valueOf2));
                Log.w("ROOM", AnonymousClass000.A0l(r4, " with ", A0u));
            }
            abstractMap.put(valueOf2, r4);
        }
    }
}
