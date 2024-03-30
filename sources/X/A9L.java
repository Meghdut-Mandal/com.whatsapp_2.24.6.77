package X;

import com.whatsapp.jid.UserJid;
import java.util.List;
import java.util.Map;

public final class A9L implements C23027B0x {
    public final /* synthetic */ C193339Lb A00;

    public A9L(C193339Lb r1) {
        this.A00 = r1;
    }

    public void BXK(AnonymousClass9XP r6, int i) {
        C193339Lb r4 = this.A00;
        C36321k7.A1S("onFetchCollectionProductListFailure errorCode =", AnonymousClass000.A0u(), i);
        C202279lS r3 = r4.A00;
        C36341k9.A19(r3.A05, false);
        if (i == 404) {
            r3.A0B.A0F(r4.A01, true);
        }
        r3.A03.A0C(new AnonymousClass8WA(r4.A01, i, r4.A02));
    }

    public void BiN(C21113A8y a8y, AnonymousClass9XP r16) {
        String str;
        C193339Lb r8 = this.A00;
        C202279lS r9 = r8.A00;
        C36341k9.A19(r9.A05, false);
        String str2 = r16.A05;
        if (str2 == null || str2.equals(r8.A03)) {
            boolean z = true;
            boolean A1V = AnonymousClass000.A1V(str2);
            C29461Ws r7 = r9.A0B;
            UserJid userJid = r8.A01;
            AnonymousClass00C.A0D(userJid, 0);
            synchronized (r7) {
                C195929Wv r11 = a8y.A02;
                List<C207269up> list = r11.A04;
                for (C207269up r3 : list) {
                    Map map = r7.A02;
                    String str3 = r3.A0F;
                    map.put(new C1276369b(userJid, str3), r3);
                    r7.A03.put(str3, userJid);
                }
                str = r11.A03;
                AnonymousClass9VT r2 = (AnonymousClass9VT) C29461Ws.A00(r7, userJid).A05.get(str);
                if (r2 != null) {
                    if (!A1V) {
                        r2.A01.A04.clear();
                    }
                    C195929Wv r1 = r2.A01;
                    r1.A02 = r11.A02;
                    r1.A01 = r11.A01;
                    r1.A00 = r11.A00;
                    r1.A04.addAll(list);
                } else {
                    C198089ct A002 = C29461Ws.A00(r7, userJid);
                    r2 = new AnonymousClass9VT(r11);
                    A002.A05.put(str, r2);
                }
                r2.A00 = a8y.A01;
            }
            C001700s r12 = r9.A03;
            if (r8.A03 != null) {
                z = false;
            }
            r12.A0C(new AnonymousClass8WB(userJid, str, false, z));
        }
    }
}
