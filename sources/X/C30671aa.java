package X;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.1aa  reason: invalid class name and case insensitive filesystem */
public final class C30671aa {
    public final C19700wN A00;
    public final C19650wI A01;
    public final Map A02 = new LinkedHashMap();

    public C30671aa(C19700wN r2, C19650wI r3) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r3, 2);
        this.A00 = r2;
        this.A01 = r3;
    }

    public static final void A00(C30671aa r6, String str, String str2, String str3, AnonymousClass00S r10) {
        boolean z;
        synchronized (r6) {
            Map map = r6.A02;
            C61803Dm r3 = (C61803Dm) map.get(str);
            if (r3 == null) {
                z = true;
                map.put(str, new C61803Dm(str2));
                r6.A01.A00.postDelayed(new C35481il(10, str, r6), AnonymousClass6X5.A0L);
            } else {
                List list = r3.A02;
                if (list.size() < 10 && str3 != null) {
                    list.add(str3);
                }
                r3.A00++;
                z = false;
            }
        }
        if (z) {
            r10.invoke();
        }
    }
}
