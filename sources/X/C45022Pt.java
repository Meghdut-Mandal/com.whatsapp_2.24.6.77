package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Pt  reason: invalid class name and case insensitive filesystem */
public final class C45022Pt extends C20890yK {
    public Long A00;
    public Long A01;
    public String A02;

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(5, this.A02);
        r3.Bpz(2, this.A00);
        r3.Bpz(1, this.A01);
    }

    public C45022Pt() {
        super(1172, C20890yK.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        C36321k7.A1I(C36331k8.A0K(C36371kC.A0p(), this.A02, A1G), this.A00, A1G);
        A1G.put(C36361kB.A0i(), this.A01);
        C36321k7.A1b(A1G, 4);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamStatusTabOpen {");
        C20910yM.A00(this.A02, "psaCampaigns", A0u);
        C20910yM.A00(this.A00, "statusAvailableUpdatesCount", A0u);
        return C36321k7.A0C(this.A01, "statusSessionId", A0u);
    }
}
