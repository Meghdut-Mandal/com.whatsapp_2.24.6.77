package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2S7  reason: invalid class name */
public final class AnonymousClass2S7 extends C20890yK {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public String A07;
    public String A08;

    public AnonymousClass2S7() {
        super(2574, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(9, this.A00);
        r3.Bpz(7, this.A04);
        r3.Bpz(5, this.A05);
        r3.Bpz(4, this.A01);
        r3.Bpz(12, this.A02);
        r3.Bpz(10, this.A03);
        r3.Bpz(8, this.A07);
        r3.Bpz(1, this.A08);
        r3.Bpz(6, this.A06);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        C36321k7.A1b(A1G, 11);
        A1G.put(C36331k8.A0O(C36331k8.A0J(C36331k8.A0Q(C36331k8.A0S(C36331k8.A0U(C36331k8.A0M(C36331k8.A0N(C36331k8.A0P(C36401kF.A0i(), this.A00, A1G), this.A04, A1G), this.A05, A1G), this.A01, A1G), this.A02, A1G), this.A03, A1G), this.A07, A1G), this.A08, A1G), this.A06);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamMdLinkDevicePrimary {");
        C20910yM.A00(C36331k8.A0h(this.A00), "mdCompanionPlatformType", A0u);
        C20910yM.A00(this.A04, "mdDurationS", A0u);
        C20910yM.A00(this.A05, "mdLinkDevicePrimaryErrorCode", A0u);
        C20910yM.A00(C36331k8.A0h(this.A01), "mdLinkDevicePrimaryStage", A0u);
        C20910yM.A00(C36331k8.A0h(this.A02), "mdLinkPrimaryAccountType", A0u);
        C20910yM.A00(C36331k8.A0h(this.A03), "mdPairingMethod", A0u);
        C20910yM.A00(this.A07, "mdRegAttemptId", A0u);
        C20910yM.A00(this.A08, "mdSessionId", A0u);
        return C36321k7.A0C(this.A06, "mdTimestampS", A0u);
    }
}
