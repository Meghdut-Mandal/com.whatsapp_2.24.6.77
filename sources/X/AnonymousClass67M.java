package X;

import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* renamed from: X.67M  reason: invalid class name */
public final class AnonymousClass67M {
    public final AnonymousClass9Y1 A00;
    public final C202279lS A01;
    public final C116615ks A02;
    public final C131496Pg A03;

    public void A00(UserJid userJid, Set set, C006302t r13) {
        UserJid userJid2;
        AnonymousClass00C.A0D(set, 0);
        Iterator it = set.iterator();
        do {
            userJid2 = userJid;
            if (it.hasNext()) {
            } else {
                LinkedHashMap A1G = C36431kI.A1G();
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    String A0C = AnonymousClass001.A0C(it2);
                    A1G.put(A0C, this.A03.A01(userJid, A0C));
                }
                r13.invoke(new C1030753o(A1G, true));
                return;
            }
        } while (this.A03.A04(userJid, AnonymousClass001.A0C(it)));
        Set set2 = set;
        if (set.contains("catalog_category_dummy_root_id")) {
            set2 = C004702c.A00;
        }
        C142956pk r1 = new C142956pk(this, userJid, set, r13);
        int i = this.A02.A00;
        String str = this.A00.A02;
        AnonymousClass00C.A0B(str);
        C128516Co r4 = new C128516Co(userJid2, str, set2, i, i);
        C163237ps r2 = new C163237ps(r1, this, 1);
        C202279lS r0 = this.A01;
        r0.A0D.A01(r4, new C164837sS(r2, r0, 1));
    }

    public AnonymousClass67M(AnonymousClass9Y1 r2, C202279lS r3, C116615ks r4, C131496Pg r5) {
        C36321k7.A0x(r3, r5);
        AnonymousClass00C.A0D(r2, 4);
        this.A01 = r3;
        this.A03 = r5;
        this.A02 = r4;
        this.A00 = r2;
    }
}
