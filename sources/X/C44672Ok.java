package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Ok  reason: invalid class name and case insensitive filesystem */
public final class C44672Ok extends C20890yK {
    public Integer A00;
    public String A01;

    public C44672Ok() {
        super(4552, C36441kJ.A0p(1, 20, 200), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A01);
        r3.Bpz(2, this.A00);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0K(C36361kB.A0i(), this.A01, A1G), this.A00);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamPushExpire {");
        C20910yM.A00(this.A01, "psaCampaignId", A0u);
        return C36321k7.A0C(C36331k8.A0h(this.A00), "pushSurfaceId", A0u);
    }
}
