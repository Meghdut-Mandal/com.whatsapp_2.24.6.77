package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2SZ  reason: invalid class name */
public final class AnonymousClass2SZ extends C20890yK {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public String A0B;

    public AnonymousClass2SZ() {
        super(4562, C36441kJ.A0p(1, 100, 1000), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A07);
        r3.Bpz(2, this.A08);
        r3.Bpz(3, this.A0B);
        r3.Bpz(4, this.A02);
        r3.Bpz(5, this.A03);
        r3.Bpz(6, this.A04);
        r3.Bpz(7, this.A05);
        r3.Bpz(8, this.A09);
        r3.Bpz(9, this.A06);
        r3.Bpz(10, this.A00);
        r3.Bpz(11, this.A0A);
        r3.Bpz(12, this.A01);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0U(C36331k8.A0T(C36331k8.A0S(C36331k8.A0R(C36331k8.A0Q(C36331k8.A0P(C36331k8.A0O(C36331k8.A0N(C36331k8.A0M(C36331k8.A0L(C36331k8.A0K(C36361kB.A0i(), this.A07, A1G), this.A08, A1G), this.A0B, A1G), this.A02, A1G), this.A03, A1G), this.A04, A1G), this.A05, A1G), this.A09, A1G), this.A06, A1G), this.A00, A1G), this.A0A, A1G), this.A01);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamLoginStageReliability {");
        C20910yM.A00(this.A07, "loginAbsT", A0u);
        C20910yM.A00(this.A08, "loginAppStageCounter", A0u);
        C20910yM.A00(this.A0B, "loginConnectionAttemptId", A0u);
        C20910yM.A00(C36331k8.A0h(this.A02), "loginDnsResolver", A0u);
        C20910yM.A00(C36331k8.A0h(this.A03), "loginIpSource", A0u);
        C20910yM.A00(C36331k8.A0h(this.A04), "loginPort", A0u);
        C20910yM.A00(C36331k8.A0h(this.A05), "loginStage", A0u);
        C20910yM.A00(this.A09, "loginStageCounter", A0u);
        C20910yM.A00(C36331k8.A0h(this.A06), "loginStageErrorReason", A0u);
        C20910yM.A00(this.A00, "loginStageSuccess", A0u);
        C20910yM.A00(this.A0A, "loginStageT", A0u);
        return C36321k7.A0C(this.A01, "passive", A0u);
    }
}
