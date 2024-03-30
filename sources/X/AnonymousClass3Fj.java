package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3Fj  reason: invalid class name */
public final class AnonymousClass3Fj {
    public final C196139Xw A00;

    public AnonymousClass3Fj(C196139Xw r1) {
        this.A00 = r1;
    }

    public final C186018vH A00(UserJid userJid, C185708uf r11, String str, String str2, List list, List list2) {
        ArrayList A0J = C36321k7.A0J(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass3T1 A0l = C36391kE.A0l(it);
            C64933Qa r2 = A0l.A1J;
            AnonymousClass11F r1 = r2.A00;
            AnonymousClass00C.A0E(r1, "null cannot be cast to non-null type com.whatsapp.jid.UserJid");
            A0J.add(new C50562l7(this.A00.A02(A0l, str2), (C16510pM) new C50642lF(r1, C36431kI.A1Q(r2.A02 ? 1 : 0) ? 1 : 0)));
        }
        C196139Xw r0 = this.A00;
        C185718ug A002 = r0.A00(userJid);
        List A03 = r0.A03(userJid);
        ArrayList arrayList = C50602lB.A00;
        return new C186018vH((Jid) userJid, A002, r11, new C50602lB(C55312uQ.A00(str2)), str, (List) A0J, list2, A03);
    }
}
