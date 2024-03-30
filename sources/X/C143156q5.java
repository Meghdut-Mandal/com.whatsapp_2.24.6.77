package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.6q5  reason: invalid class name and case insensitive filesystem */
public final class C143156q5 implements C23028B0y {
    public final C29461Ws A00;
    public final C159197iy A01;
    public final C1276769f A02;

    public C143156q5(C29461Ws r2, C159197iy r3, C1276769f r4) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
        this.A02 = r4;
        this.A01 = r3;
    }

    public void BXa(AnonymousClass9NZ r4, String str) {
        AnonymousClass00C.A0D(str, 1);
        UserJid userJid = r4.A01;
        AnonymousClass00C.A07(userJid);
        C207269up A06 = this.A00.A06(userJid, str);
        if (A06 != null) {
            this.A01.BiC(this.A02, A06);
        } else {
            BXY(r4, 404);
        }
    }

    public void BXY(AnonymousClass9NZ r3, int i) {
        this.A01.BXP(this.A02, i);
    }
}
