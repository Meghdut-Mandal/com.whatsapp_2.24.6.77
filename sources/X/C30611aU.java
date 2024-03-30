package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1aU  reason: invalid class name and case insensitive filesystem */
public class C30611aU {
    public int A00;
    public final Map A01 = new HashMap();
    public final AnonymousClass004 A02;

    public AnonymousClass6QI A00(String str, String str2, int i) {
        if (i != this.A00) {
            A01();
            this.A00 = i;
        }
        Map map = this.A01;
        if (!map.containsKey(str)) {
            C26901Ly r2 = (C26901Ly) this.A02.get();
            try {
                map.put(str, ((AnonymousClass1M0) r2).A02.A0C(str, str2));
                r2.close();
            } catch (Throwable th) {
                th.addSuppressed(th);
                throw th;
            }
        }
        return (AnonymousClass6QI) map.get(str);
    }

    public void A01() {
        Map map = this.A01;
        for (AnonymousClass6QI r0 : map.values()) {
            if (r0 != null) {
                r0.A00.close();
            }
        }
        map.clear();
    }

    public C30611aU(AnonymousClass004 r2, int i) {
        this.A00 = i;
        this.A02 = r2;
    }
}
