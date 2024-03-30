package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2S3  reason: invalid class name */
public final class AnonymousClass2S3 extends C20890yK {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Long A07;
    public String A08;

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A00);
        r3.Bpz(2, this.A01);
        r3.Bpz(9, this.A02);
        r3.Bpz(10, this.A03);
        r3.Bpz(3, this.A04);
        r3.Bpz(4, this.A05);
        r3.Bpz(5, this.A06);
        r3.Bpz(6, this.A07);
        r3.Bpz(7, this.A08);
    }

    public AnonymousClass2S3() {
        super(4884, C36331k8.A0H(), 2, 113760892);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36361kB.A0i(), this.A00);
        C36321k7.A1b(A1G, 8);
        A1G.put(C36331k8.A0P(C36331k8.A0O(C36331k8.A0N(C36331k8.A0M(C36331k8.A0L(C36331k8.A0S(C36331k8.A0R(C36361kB.A0j(), this.A01, A1G), this.A02, A1G), this.A03, A1G), this.A04, A1G), this.A05, A1G), this.A06, A1G), this.A07, A1G), this.A08);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamConsumerDisclosureEvents {");
        C20910yM.A00(C36331k8.A0h(this.A00), "consumerDisclosureAction", A0u);
        C20910yM.A00(C36331k8.A0h(this.A01), "consumerDisclosureEventType", A0u);
        C20910yM.A00(C36331k8.A0h(this.A02), "consumerDisclosureResultType", A0u);
        C20910yM.A00(C36331k8.A0h(this.A03), "consumerDisclosureServiceAccessType", A0u);
        C20910yM.A00(C36331k8.A0h(this.A04), "consumerDisclosureSource", A0u);
        C20910yM.A00(C36331k8.A0h(this.A05), "consumerDisclosureSuppressionReason", A0u);
        C20910yM.A00(C36331k8.A0h(this.A06), "consumerDisclosureType", A0u);
        C20910yM.A00(this.A07, "consumerDisclosureVersion", A0u);
        return C36321k7.A0C(this.A08, "threadIdHmac", A0u);
    }
}
