package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.6R2  reason: invalid class name */
public abstract class AnonymousClass6R2 {
    public static AnonymousClass6EZ A00(C128046Aq r4) {
        int i;
        UserJid A0l = C36431kI.A0l(r4.A01);
        C18740tg.A06(A0l);
        String str = A0l.user;
        if (A0l instanceof C223313w) {
            i = 1;
        } else {
            i = 0;
            if (A0l instanceof AnonymousClass148) {
                i = 2;
            }
        }
        return new AnonymousClass6EZ(str, i, r4.A00);
    }

    public static String A01(AnonymousClass6EZ r3) {
        String str;
        int i = r3.A01;
        if (i == 1) {
            str = "lid";
        } else if (i != 2) {
            str = "s.whatsapp.net";
        } else {
            str = "interop";
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(r3.A02);
        return C90464aC.A0f(str, A0u, '@');
    }

    public static C1268866a A02(AnonymousClass6EU r3) {
        AnonymousClass6EZ r0 = r3.A00;
        return new C1268866a(r3.A01, new C128046Aq(A01(r0), r0.A00));
    }
}
