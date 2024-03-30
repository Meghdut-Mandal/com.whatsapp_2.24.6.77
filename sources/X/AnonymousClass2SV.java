package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2SV  reason: invalid class name */
public final class AnonymousClass2SV extends C20890yK {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public String A09;
    public String A0A;

    public AnonymousClass2SV() {
        super(3546, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A05);
        r3.Bpz(2, this.A06);
        r3.Bpz(3, this.A00);
        r3.Bpz(4, this.A01);
        r3.Bpz(5, this.A02);
        r3.Bpz(13, this.A07);
        r3.Bpz(7, this.A03);
        r3.Bpz(12, this.A09);
        r3.Bpz(8, this.A0A);
        r3.Bpz(10, this.A04);
        r3.Bpz(11, this.A08);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0T(C36331k8.A0S(C36331k8.A0Q(C36331k8.A0U(C36331k8.A0P(C36331k8.A0V(C36331k8.A0N(C36331k8.A0M(C36331k8.A0L(C36331k8.A0K(C36361kB.A0i(), this.A05, A1G), this.A06, A1G), this.A00, A1G), this.A01, A1G), this.A02, A1G), this.A07, A1G), this.A03, A1G), this.A09, A1G), this.A0A, A1G), this.A04, A1G), this.A08);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamStatusPosterActions {");
        C20910yM.A00(this.A05, "retryCount", A0u);
        C20910yM.A00(this.A06, "statusAudienceSize", A0u);
        C20910yM.A00(C36331k8.A0h(this.A00), "statusContentSource", A0u);
        C20910yM.A00(C36331k8.A0h(this.A01), "statusContentType", A0u);
        C20910yM.A00(C36331k8.A0h(this.A02), "statusCreationEntryPoint", A0u);
        C20910yM.A00(this.A07, "statusDuration", A0u);
        C20910yM.A00(C36331k8.A0h(this.A03), "statusEventType", A0u);
        C20910yM.A00(this.A09, "statusId", A0u);
        C20910yM.A00(this.A0A, "statusPostFailureReason", A0u);
        C20910yM.A00(C36331k8.A0h(this.A04), "statusPrivacyType", A0u);
        return C36321k7.A0C(this.A08, "statusSessionId", A0u);
    }
}
