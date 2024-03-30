package X;

import android.util.Base64;
import com.whatsapp.jid.UserJid;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.1Ka  reason: invalid class name and case insensitive filesystem */
public final class C26401Ka {
    public final C26411Kb A00;
    public final AnonymousClass189 A01;

    public C26401Ka(AnonymousClass189 r2, C26411Kb r3) {
        AnonymousClass00C.A0D(r2, 1);
        this.A01 = r2;
        this.A00 = r3;
    }

    public static final boolean A00(C26401Ka r2, UserJid userJid, String str, String str2) {
        AnonymousClass6EZ A02 = C133256Xm.A02(userJid.getPrimaryDevice());
        AnonymousClass189 r1 = r2.A01;
        Set singleton = Collections.singleton(A02);
        AnonymousClass00C.A08(singleton);
        Iterator it = r1.A0J(singleton).values().iterator();
        if (!it.hasNext()) {
            return false;
        }
        return C133256Xm.A06(((AnonymousClass3FZ) it.next()).A00, Base64.decode(str, 2), Base64.decode(str2, 2));
    }
}
