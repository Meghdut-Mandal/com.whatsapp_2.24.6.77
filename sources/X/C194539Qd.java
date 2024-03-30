package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.9Qd  reason: invalid class name and case insensitive filesystem */
public final class C194539Qd {
    public final C21010yW A00;
    public final AnonymousClass1KU A01;

    public C194539Qd(C21010yW r2, AnonymousClass1KU r3) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
        this.A01 = r3;
    }

    public final void A00(C195809Wc r4, UserJid userJid, int i) {
        C176348by r2 = new C176348by();
        r2.A03 = Integer.valueOf(i);
        Boolean A0m = C36371kC.A0m();
        if (r4 != null) {
            if (r4.A01 != null) {
                r2.A00 = A0m;
            }
            if (r4.A02 != null) {
                r2.A01 = A0m;
            }
            if (r4.A00 != null) {
                r2.A02 = A0m;
            }
        }
        if (userJid != null) {
            try {
                String A002 = this.A01.A00(userJid);
                AnonymousClass00C.A08(A002);
                r2.A04 = C36431kI.A15(A002);
            } catch (NumberFormatException e) {
                Log.e((Throwable) e);
            }
        }
        this.A00.Bly(r2);
    }
}
