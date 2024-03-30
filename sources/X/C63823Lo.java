package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.3Lo  reason: invalid class name and case insensitive filesystem */
public abstract class C63823Lo {
    public static boolean A00(AnonymousClass16D r4, AnonymousClass185 r5, C20810yC r6, C20500xf r7, AnonymousClass3T1 r8) {
        AnonymousClass141 A07;
        if (!r6.A0E(1105) || (A07 = r4.A07(C64933Qa.A01(r8))) == null) {
            return false;
        }
        UserJid A0l = C36351kA.A0l(A07);
        if (AnonymousClass3RB.A01(r7, A0l) || !new AnonymousClass3U1(r5, (C235618y) null, A0l).A04()) {
            return false;
        }
        return true;
    }

    public static boolean A01(AnonymousClass185 r3, C20810yC r4, C20500xf r5, UserJid userJid) {
        if (!r4.A0E(1105) || userJid == null || AnonymousClass3RB.A01(r5, userJid) || !new AnonymousClass3U1(r3, (C235618y) null, userJid).A04()) {
            return false;
        }
        return true;
    }
}
