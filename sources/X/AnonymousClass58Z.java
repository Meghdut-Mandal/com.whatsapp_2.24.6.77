package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.58Z  reason: invalid class name */
public final class AnonymousClass58Z extends C20890yK {
    public Double A00;
    public Integer A01;
    public Integer A02;
    public Long A03;
    public Long A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;

    public AnonymousClass58Z() {
        super(3634, C36431kI.A0q(), 2, 0);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A01);
        r3.Bpz(10, this.A03);
        r3.Bpz(2, this.A04);
        r3.Bpz(3, this.A00);
        r3.Bpz(8, this.A05);
        r3.Bpz(9, this.A06);
        r3.Bpz(11, this.A07);
        r3.Bpz(5, this.A08);
        r3.Bpz(6, this.A02);
        r3.Bpz(12, this.A09);
        r3.Bpz(7, this.A0A);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0R(C36331k8.A0Q(C36331k8.A0L(C36331k8.A0K(C36331k8.A0S(C36361kB.A0i(), this.A01, A1G), this.A03, A1G), this.A04, A1G), this.A00, A1G), this.A05, A1G), this.A06);
        C36321k7.A1b(A1G, 4);
        A1G.put(C36331k8.A0P(C36331k8.A0U(C36331k8.A0O(C36331k8.A0N(C36421kH.A0U(), this.A07, A1G), this.A08, A1G), this.A02, A1G), this.A09, A1G), this.A0A);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamDirectorySearchRanking {");
        C20910yM.A00(C36331k8.A0h(this.A01), "actionOnBusiness", A0u);
        C20910yM.A00(this.A03, "actionOrd", A0u);
        C20910yM.A00(this.A04, "businessRankingPosition", A0u);
        C20910yM.A00(this.A00, "finalRankingScore", A0u);
        C20910yM.A00(this.A05, "nextBizRankingResultId", A0u);
        C20910yM.A00(this.A06, "prevBizRankingResultId", A0u);
        C20910yM.A00(this.A07, "queryId", A0u);
        C20910yM.A00(this.A08, "rankingResultId", A0u);
        C20910yM.A00(C36331k8.A0h(this.A02), "searchEndpoint", A0u);
        C20910yM.A00(this.A09, "searchId", A0u);
        return C36321k7.A0C(this.A0A, "searchSessionId", A0u);
    }
}
