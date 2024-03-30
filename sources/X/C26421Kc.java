package X;

import com.whatsapp.jid.UserJid;
import java.util.HashMap;

/* renamed from: X.1Kc  reason: invalid class name and case insensitive filesystem */
public final class C26421Kc extends C19590wC {
    public final HashMap A00 = new HashMap();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26421Kc(AnonymousClass005 r2) {
        super(r2);
        AnonymousClass00C.A0D(r2, 1);
    }

    public final void A01(UserJid userJid) {
        AnonymousClass00C.A0D(userJid, 0);
        for (AnonymousClass16A r0 : getObservers()) {
            r0.BSP(userJid);
            r0.BSM(userJid);
        }
    }

    public final void A00(C207109uZ r4) {
        UserJid userJid;
        if (r4 != null && (userJid = r4.A08) != null) {
            HashMap hashMap = this.A00;
            Object obj = hashMap.get(userJid);
            hashMap.put(userJid, r4);
            if (obj == null || !obj.equals(r4)) {
                for (AnonymousClass16A BSP : getObservers()) {
                    BSP.BSP(userJid);
                }
            }
        }
    }
}
