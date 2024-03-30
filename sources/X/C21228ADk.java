package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.ADk  reason: case insensitive filesystem */
public final class C21228ADk implements C159607jd {
    public final C197999cj A00;
    public final C159607jd A01;
    public final AnonymousClass2bS A02;
    public final String A03;

    public void BiH(Map map) {
        Map map2;
        String str = this.A02.A1J.A01;
        AnonymousClass00C.A07(str);
        String str2 = this.A03;
        if (str2 == null) {
            C197999cj r7 = this.A00;
            LinkedHashMap A06 = C000400e.A06(map);
            C197999cj.A00(r7);
            map2 = r7.A02;
            synchronized (map2) {
                if (!map2.containsKey(str)) {
                    map2.put(str, new C199839g6(C36431kI.A1G(), C36431kI.A1G()));
                }
                C199839g6 r4 = (C199839g6) map2.get(str);
                if (r4 != null) {
                    r4.A01 = C19970wo.A00(r7.A00) + C36431kI.A09(r7.A04.getValue());
                    r4.A03 = A06;
                }
            }
        } else {
            C197999cj r8 = this.A00;
            Object obj = map.get(str2);
            if (obj == null) {
                obj = C023409w.A00;
            }
            C197999cj.A00(r8);
            map2 = r8.A02;
            synchronized (map2) {
                if (!map2.containsKey(str)) {
                    map2.put(str, new C199839g6(C36431kI.A1G(), C36431kI.A1G()));
                }
                C199839g6 r42 = (C199839g6) map2.get(str);
                if (r42 != null) {
                    r42.A00 = C19970wo.A00(r8.A00) + C36431kI.A09(r8.A03.getValue());
                    r42.A02.put(str2, obj);
                }
            }
        }
        this.A01.BiH(map);
    }

    public void onError(Throwable th) {
        this.A01.onError(th);
    }

    public C21228ADk(C197999cj r1, C159607jd r2, AnonymousClass2bS r3, String str) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = str;
    }
}
