package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.6Mv  reason: invalid class name and case insensitive filesystem */
public final class C130896Mv {
    public List A00;
    public Map A01;
    public final AnonymousClass00T A02;
    public final C1260762l A03;

    public static final Map A00(C123745x1 r4, C130896Mv r5, Collection collection, AnonymousClass040 r7) {
        Map map = r5.A01;
        LinkedHashMap linkedHashMap = map;
        if (map == null) {
            List list = r5.A00;
            if (list == null) {
                list = C110315aT.A00(r5.A01(r4, collection, r7));
                r5.A00 = list;
                if (list == null) {
                    throw C36381kD.A0k();
                }
            }
            C10980fX r1 = new C10980fX(new C14520ll(list));
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(C90484aE.A05(10));
            Iterator it = r1.iterator();
            while (it.hasNext()) {
                C06600Ug r0 = (C06600Ug) it.next();
                C36341k9.A1K(r0.A01, linkedHashMap2, r0.A00);
            }
            r5.A01 = linkedHashMap2;
            linkedHashMap = linkedHashMap2;
        }
        return linkedHashMap;
    }

    public final List A01(C123745x1 r5, Collection collection, AnonymousClass040 r7) {
        C122395um A002 = C1260762l.A00(r5, this.A03, r7);
        if (A002 == null) {
            return C023409w.A00;
        }
        ArrayList A0I = AnonymousClass001.A0I();
        for (C107265Nh r0 : A002.A03) {
            UserJid userJid = r0.A04.A01;
            if (!collection.contains(userJid)) {
                AnonymousClass00C.A08(userJid);
                A0I.add(userJid);
            }
        }
        return A0I;
    }

    public C130896Mv(C1260762l r2, AnonymousClass16D r3, C232317r r4) {
        C36321k7.A11(r3, r4, r2);
        this.A03 = r2;
        this.A02 = C36431kI.A1I(new C84864Ew(r3, r4));
    }
}
