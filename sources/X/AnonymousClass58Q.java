package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.58Q  reason: invalid class name */
public final class AnonymousClass58Q extends C20890yK {
    public Boolean A00;
    public Integer A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public String A06;
    public String A07;
    public String A08;

    public AnonymousClass58Q() {
        super(5262, C36431kI.A0q(), 2, 0);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(11, this.A02);
        r3.Bpz(12, this.A03);
        r3.Bpz(1, this.A06);
        r3.Bpz(10, this.A07);
        r3.Bpz(3, this.A00);
        r3.Bpz(4, this.A04);
        r3.Bpz(5, this.A05);
        r3.Bpz(6, this.A08);
        r3.Bpz(7, this.A01);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0J(C36331k8.A0U(C36421kH.A0U(), this.A02, A1G), this.A03, A1G), this.A06);
        C36321k7.A1b(A1G, 2);
        A1G.put(C36331k8.A0R(C36331k8.A0Q(C36331k8.A0P(C36331k8.A0O(C36331k8.A0N(C36331k8.A0M(C36331k8.A0L(C36401kF.A0j(), this.A07, A1G), this.A00, A1G), this.A04, A1G), this.A05, A1G), this.A08, A1G), this.A01, A1G), (Object) null, A1G), (Object) null);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamFlowScreenProgress {");
        C20910yM.A00(this.A02, "analyticsIdSfmIndex", A0u);
        C20910yM.A00(this.A03, "analyticsIdSfmZeros", A0u);
        C20910yM.A00(this.A06, "destinationScreenName", A0u);
        C20910yM.A00(this.A07, "flowScreenProgressFlowId", A0u);
        C20910yM.A00(this.A00, "isSuccess", A0u);
        C20910yM.A00(this.A04, "sessionSfmIndex", A0u);
        C20910yM.A00(this.A05, "sessionSfmZeros", A0u);
        C20910yM.A00(this.A08, "sourceScreenName", A0u);
        return C36321k7.A0C(C36331k8.A0h(this.A01), "trafficSource", A0u);
    }
}
