package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.3NM  reason: invalid class name */
public final class AnonymousClass3NM {
    public final C21010yW A00;
    public final AnonymousClass1KU A01;

    public AnonymousClass3NM(C21010yW r2, AnonymousClass1KU r3) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
        this.A01 = r3;
    }

    public static final void A00(AnonymousClass3NM r2, UserJid userJid, int i) {
        AnonymousClass2O9 r1 = new AnonymousClass2O9();
        r1.A00 = Integer.valueOf(i);
        if (userJid != null) {
            try {
                String A002 = r2.A01.A00(userJid);
                AnonymousClass00C.A08(A002);
                r1.A01 = C36431kI.A15(A002);
            } catch (NumberFormatException e) {
                Log.e((Throwable) e);
            }
        }
        r2.A00.Bly(r1);
    }
}
