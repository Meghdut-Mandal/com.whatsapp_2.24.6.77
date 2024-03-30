package X;

import java.util.AbstractMap;
import java.util.Map;

/* renamed from: X.5GF  reason: invalid class name */
public final class AnonymousClass5GF extends AnonymousClass6F2 implements C162097o1, C162107o2 {
    public AnonymousClass66U A00;
    public C159627jf A01;
    public String A02;
    public final C19630wG A03;
    public final AnonymousClass60Z A04;
    public final C131376Ou A05;

    public void B1S(String str) {
        AnonymousClass00C.A0D(str, 0);
        this.A02 = str;
        this.A00 = this.A04.A00(str);
    }

    public void B7N(Map map) {
        Object obj;
        Object obj2;
        if (map == null || (obj2 = map.get("action")) == null || !"on_back_pressed".equals(obj2)) {
            if (map != null) {
                obj = map.get("account_compliance_status");
                C108355Te r1 = C108355Te.ERROR;
                if (map.containsKey(r1.key)) {
                    Object obj3 = map.get(r1.key);
                    AnonymousClass00C.A0E(obj3, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.Any>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, kotlin.Any> }");
                    AbstractMap abstractMap = (AbstractMap) obj3;
                    Object obj4 = abstractMap.get(C108355Te.ERROR_NAME.key);
                    C90494aF.A10(obj4);
                    String str = (String) obj4;
                    Object obj5 = abstractMap.get(C108355Te.ERROR_CODE.key);
                    AnonymousClass00C.A0E(obj5, "null cannot be cast to non-null type kotlin.Int");
                    Integer num = (Integer) obj5;
                    C159627jf r12 = this.A01;
                    if (r12 != null) {
                        r12.BXS(new AnonymousClass6PH(num, str, (String) null), (Map) null);
                    }
                    C159627jf r13 = this.A01;
                    if (r13 != null) {
                        r13.BXS(AnonymousClass6PH.A03, map);
                        return;
                    }
                    return;
                }
            } else {
                obj = null;
            }
            C159627jf r14 = this.A01;
            if (r14 != null) {
                r14.BiH(C36391kE.A11("account_compliance_status", obj));
                return;
            }
            return;
        }
        C131376Ou r15 = this.A05;
        String str2 = this.A02;
        if (str2 == null) {
            throw C36331k8.A0d("observerId");
        }
        r15.A02(str2).A02(new AnonymousClass707("br_p2m_checkout_add_card:AddCardUserInfoCollectionScreen", (String) null, false));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5GF(AnonymousClass60Z r1, C19630wG r2, C105705Fs r3, C131376Ou r4) {
        super(r3);
        C36321k7.A18(r2, r4, r3, r1);
        this.A03 = r2;
        this.A05 = r4;
        this.A04 = r1;
    }
}
