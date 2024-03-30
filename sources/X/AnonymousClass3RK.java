package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.3RK  reason: invalid class name */
public abstract class AnonymousClass3RK {
    public static boolean A01(C20810yC r3, AnonymousClass1E9 r4) {
        int A00 = r4.A06.A00("20210210");
        if (!r3.A0E(791) || A00 != 2) {
            return false;
        }
        return true;
    }

    public static boolean A00(AnonymousClass185 r3, C235618y r4, C20810yC r5, C20500xf r6, UserJid userJid, AnonymousClass1E9 r8) {
        if (!A01(r5, r8) || userJid == null || AnonymousClass3RB.A01(r6, userJid)) {
            return false;
        }
        AnonymousClass3U1 r1 = new AnonymousClass3U1(r3, r4, userJid);
        if (r1.A04() || r1.A05()) {
            return true;
        }
        return false;
    }
}
