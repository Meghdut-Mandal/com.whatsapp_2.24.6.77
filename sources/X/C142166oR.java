package X;

import java.util.Map;

/* renamed from: X.6oR  reason: invalid class name and case insensitive filesystem */
public class C142166oR implements AnonymousClass7fH {
    public final AnonymousClass6MX A00;

    public C118845op Bsd(C1271967i r8, AnonymousClass6WZ r9, AnonymousClass6IK r10, AnonymousClass6KB r11, C124125xd r12) {
        C118845op r1;
        Map map = r11.A02;
        String A1A = C36431kI.A1A("key", map);
        if (A1A != null) {
            Object A002 = AnonymousClass5ZF.A00(r12, map);
            Object obj = map.get("mode");
            String str = r11.A00;
            boolean equals = "p".equals(obj);
            AnonymousClass6MX r2 = this.A00;
            synchronized (r2) {
                if (equals) {
                    r2.A01(A1A, A002);
                    r1 = AnonymousClass6MX.A00(r9, r2, A002, A1A, str);
                } else {
                    Map map2 = r2.A01;
                    Object obj2 = map2.get(A1A);
                    if (obj2 == null) {
                        map2.put(A1A, A002);
                    } else {
                        A002 = obj2;
                    }
                    r1 = AnonymousClass6MX.A00(r9, r2, A002, A1A, str);
                }
            }
            map.get("debug_metadata");
            return r1;
        }
        throw AnonymousClass001.A09("Key not defined in data manifest");
    }

    public C142166oR(AnonymousClass6MX r1) {
        this.A00 = r1;
    }
}
