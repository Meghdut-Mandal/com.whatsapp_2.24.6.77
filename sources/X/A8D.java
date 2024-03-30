package X;

import java.util.Iterator;
import java.util.List;

public class A8D implements C22905AyH {
    public Object BKy(C21670AUn aUn, C199959gK r6, Object obj, String str, List list) {
        StringBuilder A0u = AnonymousClass000.A0u();
        C23091B4b b4b = r6.A01.A00;
        if (obj instanceof List) {
            for (Object next : b4b.Bvj(obj)) {
                if (next instanceof String) {
                    C36351kA.A1K(next, A0u);
                }
            }
        }
        if (list != null) {
            Iterator it = C201989kp.A00(r6, String.class, list).iterator();
            while (it.hasNext()) {
                A0u.append(AnonymousClass001.A0C(it));
            }
        }
        return A0u.toString();
    }
}
