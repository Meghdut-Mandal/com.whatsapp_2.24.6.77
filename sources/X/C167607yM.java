package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.7yM  reason: invalid class name and case insensitive filesystem */
public final class C167607yM extends AnonymousClass04R {
    public final C001600r A00;
    public final C001600r A01;
    public final C195419Uf A02;
    public final C28201Rs A03;
    public final C178358fo A04;
    public final B76 A05;
    public final UserJid A06;

    public C167607yM(C195419Uf r3, C178358fo r4, UserJid userJid) {
        AnonymousClass00C.A0D(r3, 2);
        this.A06 = userJid;
        this.A02 = r3;
        this.A04 = r4;
        this.A00 = r3.A03;
        C28201Rs A0t = C36441kJ.A0t();
        this.A03 = A0t;
        this.A01 = A0t;
        B76 b76 = new B76(this, 6);
        this.A05 = b76;
        r4.registerObserver(b76);
    }

    public void A0R() {
        this.A04.unregisterObserver(this.A05);
    }
}
