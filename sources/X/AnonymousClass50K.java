package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.50K  reason: invalid class name */
public final class AnonymousClass50K extends AnonymousClass5AG {
    public String A02(C122855vX r4, Map map) {
        int i;
        boolean A1a = C36331k8.A1a(map, r4);
        Iterator A0z = AnonymousClass000.A0z(map);
        if (A0z.hasNext()) {
            switch (((C132286Sy) A0z.next()).A01) {
                case 3489014:
                    i = 10;
                    break;
                case 3489016:
                    r4.A00 = A1a ? 1 : 0;
                    break;
                case 3489017:
                    i = 8;
                    break;
                case 3489018:
                    i = 9;
                    break;
            }
            r4.A00 = i;
        }
        return super.A02(r4, map);
    }
}
