package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;

/* renamed from: X.3BZ  reason: invalid class name */
public final class AnonymousClass3BZ {
    public final AnonymousClass146 A00(C19730wQ r4, String str) {
        AnonymousClass146 r1;
        AnonymousClass00C.A0D(str, 1);
        PhoneUserJid A0e = C36371kC.A0e(r4);
        AnonymousClass00C.A08(A0e);
        StringBuilder A0u = AnonymousClass000.A0u();
        String str2 = A0e.user;
        C18740tg.A06(str2);
        A0u.append(str2);
        A0u.append('-');
        A0u.append(str);
        String A0q = AnonymousClass000.A0q("@temp", A0u);
        Jid A00 = C222513o.A00(A0q);
        if ((A00 instanceof AnonymousClass146) && (r1 = (AnonymousClass146) A00) != null) {
            return r1;
        }
        throw new C19740wR(A0q);
    }
}
