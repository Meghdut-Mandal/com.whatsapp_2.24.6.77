package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8c3  reason: invalid class name and case insensitive filesystem */
public final class C176398c3 extends C20890yK {
    public Boolean A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;

    public C176398c3() {
        super(4360, new C18950u5(1, 20, 200, false), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A00);
        r3.Bpz(5, this.A01);
        r3.Bpz(2, this.A02);
        r3.Bpz(3, this.A03);
        r3.Bpz(4, this.A04);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0M(C36331k8.A0L(C36331k8.A0K(C36331k8.A0N(C36361kB.A0i(), this.A00, A1G), this.A01, A1G), this.A02, A1G), this.A03, A1G), this.A04);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamWhatsappQuickPromotionClientEligibilityWaterfall {");
        C20910yM.A00(this.A00, "eligibilityStatus", A0u);
        C20910yM.A00(this.A01, "instanceLogData", A0u);
        C20910yM.A00(this.A02, "promotionId", A0u);
        C20910yM.A00(this.A03, "qpFailureReason", A0u);
        return C36321k7.A0C(this.A04, "step", A0u);
    }
}
