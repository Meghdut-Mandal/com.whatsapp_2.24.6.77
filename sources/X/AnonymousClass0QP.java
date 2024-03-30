package X;

import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.0QP  reason: invalid class name */
public abstract class AnonymousClass0QP {
    public static void A00(StringBuilder sb, HashMap hashMap) {
        sb.append("{");
        Iterator it = hashMap.keySet().iterator();
        boolean z = true;
        while (it.hasNext()) {
            String A0C = AnonymousClass001.A0C(it);
            if (!z) {
                sb.append(",");
            }
            String str = (String) hashMap.get(A0C);
            sb.append("\"");
            sb.append(A0C);
            sb.append("\":");
            if (str == null) {
                sb.append("null");
            } else {
                sb.append("\"");
                sb.append(str);
                sb.append("\"");
            }
            z = false;
        }
        sb.append("}");
    }
}
