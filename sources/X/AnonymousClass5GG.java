package X;

import java.util.Map;

/* renamed from: X.5GG  reason: invalid class name */
public final class AnonymousClass5GG extends AnonymousClass6F2 implements C162097o1, C162107o2 {
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
        Object obj2 = null;
        if (map == null || (obj = map.get("action")) == null || !"on_back_pressed".equals(obj)) {
            if (map != null) {
                obj2 = map.get("kyc_status");
            }
            C159627jf r1 = this.A01;
            if (r1 != null) {
                r1.BiH(C36391kE.A11("kyc_status", obj2));
                return;
            }
            return;
        }
        C131376Ou r12 = this.A05;
        String str = this.A02;
        if (str == null) {
            throw C36331k8.A0d("observerId");
        }
        r12.A02(str).A02(new AnonymousClass707("br_p2m_checkout_add_card:AddCardUserInfoCollectionScreen", (String) null, false));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5GG(AnonymousClass60Z r1, C19630wG r2, C105705Fs r3, C131376Ou r4) {
        super(r3);
        C36321k7.A18(r2, r4, r3, r1);
        this.A03 = r2;
        this.A05 = r4;
        this.A04 = r1;
    }
}
