package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.96I  reason: invalid class name */
public abstract class AnonymousClass96I {
    public static C199909gD A00(C80053ui r8, C203399nx r9) {
        Map map;
        UserJid userJid;
        String str;
        C186018vH r4 = (C186018vH) r8.A03.getValue();
        ArrayList A0I = AnonymousClass001.A0I();
        try {
            C186148vU r82 = new C186148vU(r9, r4);
            ArrayList A0I2 = AnonymousClass001.A0I();
            LinkedHashMap A1G = C36431kI.A1G();
            Iterator A14 = C90514aH.A14(r82.A01);
            while (A14.hasNext()) {
                C184268sA r0 = (C184268sA) A14.next();
                UserJid userJid2 = (UserJid) r0.A00;
                AnonymousClass00C.A08(userJid2);
                C184098rt r02 = (C184098rt) r0.A01;
                if (r02 != null) {
                    AnonymousClass9HY r1 = new AnonymousClass9HY(userJid2, A1G);
                    switch (r02.A00) {
                        case 0:
                            map = r1.A01;
                            userJid = r1.A00;
                            str = "406";
                            break;
                        case 1:
                            map = r1.A01;
                            userJid = r1.A00;
                            str = "405";
                            break;
                        case 2:
                            map = r1.A01;
                            userJid = r1.A00;
                            str = "404";
                            break;
                        default:
                            map = r1.A01;
                            userJid = r1.A00;
                            str = "500";
                            break;
                    }
                    map.put(userJid, str);
                } else {
                    A0I2.add(userJid2);
                }
            }
            AnonymousClass147 r5 = r82.A00;
            AnonymousClass00C.A08(r5);
            return new C199909gD(r5, C007103b.A0Y(A0I2), C000400e.A0B(A1G));
        } catch (C235919b e) {
            C165567td.A1R("RemoveParticipantsResponseSuccess: ", AnonymousClass000.A0u(), e, A0I);
            try {
                C23048B1t b1t = (C23048B1t) new C186278vh(r9, r4, 13).A00;
                AnonymousClass00C.A08(b1t);
                return new C199909gD(String.valueOf(b1t.B9o().longValue()), b1t.BIF());
            } catch (C235919b e2) {
                C165567td.A1R("RemoveParticipantsResponseClientError: ", AnonymousClass000.A0u(), e2, A0I);
                try {
                    C23047B1s b1s = (C23047B1s) ((C184818t3) new C186268vg(r9, r4, 4).A00).A00;
                    AnonymousClass00C.A08(b1s);
                    return new C199909gD(String.valueOf(b1s.B9o().longValue()), b1s.BIF());
                } catch (C235919b e3) {
                    throw C165567td.A0H("RemoveParticipantsResponseServerError: ", AnonymousClass000.A0u(), e3, A0I);
                }
            }
        }
    }
}
