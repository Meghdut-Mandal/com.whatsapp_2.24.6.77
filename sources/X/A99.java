package X;

import com.whatsapp.jid.UserJid;

public final /* synthetic */ class A99 implements C22915AyR {
    public final /* synthetic */ C206759tv A00;
    public final /* synthetic */ C22915AyR A01;
    public final /* synthetic */ C196089Xp A02;
    public final /* synthetic */ UserJid A03;
    public final /* synthetic */ Integer A04;

    public /* synthetic */ A99(C206759tv r1, C22915AyR ayR, C196089Xp r3, UserJid userJid, Integer num) {
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = userJid;
        this.A04 = num;
        this.A01 = ayR;
    }

    public final void BZx(C21097A8i a8i) {
        C196089Xp r1 = this.A02;
        UserJid userJid = this.A03;
        Integer num = this.A04;
        C22915AyR ayR = this.A01;
        if (!(userJid == null || num == null)) {
            r1.A02.A00(userJid, num.intValue());
        }
        if (ayR != null) {
            ayR.BZx(a8i);
        }
    }
}
