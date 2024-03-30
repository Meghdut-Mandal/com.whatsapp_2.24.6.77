package X;

import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.12l  reason: invalid class name and case insensitive filesystem */
public final class C219912l extends C19580wB {
    public final void A00(long j, long j2) {
        for (AnonymousClass9E9 r0 : getObservers()) {
            A8Z a8z = r0.A00;
            C219712j r1 = a8z.A02;
            UserJid userJid = (UserJid) r1.A0C(C223313w.class, j);
            UserJid userJid2 = (UserJid) r1.A0C(PhoneUserJid.class, j2);
            String A0a = a8z.A01.A0a();
            AnonymousClass1NG r2 = a8z.A00;
            boolean A0O = r2.A0O(userJid);
            boolean A0O2 = r2.A0O(userJid2);
            if (userJid2 != null && A0O && !A0O2) {
                r2.A0I(userJid2, A0a);
            } else if (userJid != null && A0O2 && !A0O) {
                r2.A0I(userJid, A0a);
            }
        }
    }
}
