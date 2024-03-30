package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0yP  reason: invalid class name and case insensitive filesystem */
public final class C20940yP {
    public static final C20950yQ A01 = new C20950yQ((Object) null);
    public final Map A00 = new HashMap();

    public final void A00(int i, Object obj) {
        if (obj == null) {
            this.A00.remove(Integer.valueOf(i));
            return;
        }
        C20950yQ r3 = new C20950yQ(obj);
        Map map = this.A00;
        Integer valueOf = Integer.valueOf(i);
        if (!map.containsKey(valueOf) || !map.get(valueOf).equals(r3)) {
            map.put(valueOf, r3);
        }
    }
}
