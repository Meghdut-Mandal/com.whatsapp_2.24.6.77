package X;

import java.util.Map;

/* renamed from: X.0z1  reason: invalid class name and case insensitive filesystem */
public class C21320z1 {
    public final ThreadLocal A00 = new C21330z2(this);

    public synchronized String A00(String str) {
        Map map;
        map = (Map) this.A00.get();
        C18740tg.A06(map);
        return (String) map.get(str);
    }

    public synchronized void A01(String str, String str2) {
        Map map = (Map) this.A00.get();
        C18740tg.A06(map);
        map.put(str, str2);
    }
}
