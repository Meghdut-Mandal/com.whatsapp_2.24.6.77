package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.5YH  reason: invalid class name */
public abstract class AnonymousClass5YH {
    public static String A00(List list) {
        StringBuilder A0u = AnonymousClass000.A0u();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0u.append(AnonymousClass001.A0C(it));
            A0u.append(";");
        }
        return A0u.toString();
    }
}
