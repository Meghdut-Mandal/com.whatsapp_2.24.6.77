package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.2rx  reason: invalid class name and case insensitive filesystem */
public abstract class C53832rx {
    public static final void A00(C20810yC r3, C65573Sp r4, AnonymousClass2aL r5, UserJid userJid, String str) {
        AnonymousClass00C.A0D(str, 0);
        C36321k7.A18(r4, r5, userJid, r3);
        if (r3.A0E(4725)) {
            ArrayList A04 = r5.A04();
            ArrayList A0I = AnonymousClass001.A0I();
            Iterator it = A04.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (AnonymousClass00C.A0J(((C63363Jt) next).A02, userJid)) {
                    A0I.add(next);
                }
            }
            if (C007103b.A0M(A0I) != null) {
                r4.A02(str);
            }
        }
    }
}
