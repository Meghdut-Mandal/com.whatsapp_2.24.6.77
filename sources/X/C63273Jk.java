package X;

import com.whatsapp.jid.UserJid;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.3Jk  reason: invalid class name and case insensitive filesystem */
public final class C63273Jk {
    public final AnonymousClass6TX A00;
    public final C19770wU A01;
    public final Map A02 = new ConcurrentHashMap();
    public final C200469hS A03;

    public C63273Jk(C200469hS r2, AnonymousClass6TX r3, C19770wU r4) {
        AnonymousClass00C.A0D(r4, 3);
        this.A00 = r3;
        this.A03 = r2;
        this.A01 = r4;
    }

    public final void A01(String str) {
        AnonymousClass00C.A0D(str, 0);
        this.A01.Boy(new C80373vI(this, str, 1, 6));
    }

    public final void A02(String str) {
        AnonymousClass00C.A0D(str, 0);
        this.A01.Boy(new C80373vI(this, str, 0, 6));
    }

    public final void A00(UserJid userJid, String str, int i) {
        Integer A002 = C200469hS.A00(i);
        if (A002 != null) {
            this.A02.put(str, new AnonymousClass37C(userJid, this.A00.A02(A002.intValue()), i));
        }
    }
}
