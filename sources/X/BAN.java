package X;

import com.whatsapp.jid.UserJid;

public class BAN implements C31751cK {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public BAN(C79593ty r1, AnonymousClass9XI r2, UserJid userJid, int i) {
        this.A03 = i;
        this.A00 = r2;
        this.A01 = userJid;
        this.A02 = r1;
    }

    public void BYZ() {
        Object valueOf;
        int i = this.A03;
        C79593ty r2 = (C79593ty) this.A02;
        C63553Km r1 = ((AnonymousClass9XI) this.A00).A03;
        if (i != 0) {
            valueOf = r1.A00((C207109uZ) null);
        } else {
            valueOf = Boolean.valueOf(r1.A03((C207109uZ) null));
        }
        r2.accept(valueOf);
    }

    public void BYa() {
        int i;
        int i2 = this.A03;
        AnonymousClass1KK r4 = ((AnonymousClass9XI) this.A00).A04;
        UserJid userJid = (UserJid) this.A01;
        Object obj = this.A02;
        if (i2 != 0) {
            i = 1;
        } else {
            i = 0;
        }
        r4.A0C(new BAK(obj, this, i), userJid);
    }
}
