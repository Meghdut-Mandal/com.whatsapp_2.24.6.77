package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.3N8  reason: invalid class name */
public final class AnonymousClass3N8 {
    public final C005502l A00;

    public AnonymousClass3N8(C005502l r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public static final C135066c4 A00(Integer num, String str, List list) {
        Object obj;
        AnonymousClass00C.A0D(list, 0);
        if (AnonymousClass000.A1V(str)) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (AnonymousClass00C.A0J(str, ((C135066c4) obj).A06)) {
                    break;
                }
            }
            C135066c4 r2 = (C135066c4) obj;
            if (r2 != null) {
                return r2;
            }
        }
        int size = list.size();
        int intValue = num.intValue();
        if (size > intValue) {
            return (C135066c4) list.get(intValue);
        }
        return null;
    }
}
