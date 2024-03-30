package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.ASf  reason: case insensitive filesystem */
public class C21613ASf implements C23068B2x {
    public final C23068B2x A00;
    public final /* synthetic */ AnonymousClass1WR A01;

    public C21613ASf(AnonymousClass1WR r1, C23068B2x b2x) {
        this.A01 = r1;
        this.A00 = b2x;
    }

    public void BVG(UserJid userJid) {
        C23068B2x b2x = this.A00;
        if (b2x != null) {
            b2x.BVG(userJid);
        }
    }

    public void BWd(UserJid userJid, int i) {
        C23068B2x b2x = this.A00;
        if (b2x != null) {
            b2x.BWd(userJid, i);
        }
        this.A01.A02.postDelayed(new C1497572q(this, 45), 25);
    }

    public void Bbh(UserJid userJid) {
        C23068B2x b2x = this.A00;
        if (b2x != null) {
            b2x.Bbh(userJid);
        }
    }

    public void BhP(UserJid userJid, String str, long j) {
        C23068B2x b2x = this.A00;
        if (b2x != null) {
            b2x.BhP(userJid, str, j);
        }
        this.A01.A02.post(new AnonymousClass751(8, str, this));
    }
}
