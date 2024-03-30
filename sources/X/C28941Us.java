package X;

import com.whatsapp.jid.UserJid;
import java.util.HashMap;

/* renamed from: X.1Us  reason: invalid class name and case insensitive filesystem */
public final class C28941Us {
    public final AnonymousClass005 A00;
    public final HashMap A01 = new HashMap();

    public C28941Us(AnonymousClass005 r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public final Integer A00(UserJid userJid) {
        if (userJid == null) {
            return null;
        }
        HashMap hashMap = this.A01;
        if (hashMap.get(userJid) == null) {
            C131316Oo r0 = (C131316Oo) hashMap.get(userJid);
            if (r0 == null) {
                r0 = new C131316Oo((Integer) null);
            }
            r0.A00 = null;
            hashMap.put(userJid, r0);
        }
        C131316Oo r3 = (C131316Oo) hashMap.get(userJid);
        if (r3 == null) {
            return null;
        }
        Integer num = r3.A00;
        if (num != null) {
            return num;
        }
        Integer A002 = C65213Re.A00((C65213Re) this.A00.get(), userJid, System.currentTimeMillis());
        r3.A00 = A002;
        return A002;
    }
}
