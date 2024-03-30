package X;

import java.util.Iterator;
import java.util.Set;

/* renamed from: X.0uL  reason: invalid class name and case insensitive filesystem */
public class C19080uL {
    public final C19250ud A00;
    public final String A01;

    public static String A00(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C19070uK r1 = (C19070uK) ((C19060uJ) it.next());
            sb.append(r1.A00);
            sb.append('/');
            sb.append(r1.A01);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public C19080uL(C19250ud r2, Set set) {
        this.A01 = A00(set);
        this.A00 = r2;
    }
}
