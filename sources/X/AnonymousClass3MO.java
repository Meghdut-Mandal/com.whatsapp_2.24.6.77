package X;

import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.3MO  reason: invalid class name */
public abstract class AnonymousClass3MO {
    public static final String A01(Map map) {
        String str;
        boolean z = true;
        if (map == null || map.isEmpty()) {
            return null;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        Iterator A0y = AnonymousClass000.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            String str2 = (String) A11.getKey();
            int A0I = AnonymousClass000.A0I(A11.getValue());
            StringBuilder A0u2 = AnonymousClass000.A0u();
            if (z) {
                str = "";
            } else {
                str = ",";
            }
            A0u2.append(str);
            A0u2.append(str2);
            A0u2.append(':');
            A0u2.append(A0I);
            C36351kA.A1K(A0u2, A0u);
            z = false;
        }
        return A0u.toString();
    }

    public static final UserJid A00(AnonymousClass3T1 r1) {
        if (r1.A1J.A02) {
            return C223613z.A00;
        }
        C222813r r0 = UserJid.Companion;
        return C222813r.A00(r1.A0J());
    }
}
