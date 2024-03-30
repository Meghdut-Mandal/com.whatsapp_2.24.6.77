package X;

import com.whatsapp.jid.UserJid;

public final /* synthetic */ class AZC implements C006302t {
    public final /* synthetic */ AnonymousClass8WH A00;

    public /* synthetic */ AZC(AnonymousClass8WH r1) {
        this.A00 = r1;
    }

    public final Object invoke(Object obj) {
        AnonymousClass8WH r2 = this.A00;
        String str = (String) obj;
        r2.A0y = str;
        r2.A0U = r2.A0S.A06(r2.A0q, str);
        r2.A11 = false;
        AnonymousClass8WH.A0G(r2, str);
        r2.A3i();
        C167647yU r3 = r2.A0h;
        UserJid userJid = r2.A0q;
        if (r3.A0M.getAndSet(true)) {
            return null;
        }
        C64183Mz.A00(r3.A0F, userJid, 46);
        return null;
    }
}
