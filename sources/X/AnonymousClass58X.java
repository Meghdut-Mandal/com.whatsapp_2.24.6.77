package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.58X  reason: invalid class name */
public final class AnonymousClass58X extends C20890yK {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Long A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;

    public AnonymousClass58X() {
        super(4928, C36431kI.A0q(), 2, 0);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A00);
        r3.Bpz(2, this.A03);
        r3.Bpz(11, this.A04);
        r3.Bpz(3, this.A01);
        r3.Bpz(4, this.A05);
        r3.Bpz(5, this.A06);
        r3.Bpz(6, this.A07);
        r3.Bpz(7, this.A02);
        r3.Bpz(8, this.A08);
        r3.Bpz(10, this.A09);
        r3.Bpz(9, this.A0A);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0R(C36331k8.A0S(C36331k8.A0Q(C36331k8.A0P(C36331k8.A0O(C36331k8.A0N(C36331k8.A0M(C36331k8.A0L(C36331k8.A0T(C36331k8.A0K(C36361kB.A0i(), this.A00, A1G), this.A03, A1G), this.A04, A1G), this.A01, A1G), this.A05, A1G), this.A06, A1G), this.A07, A1G), this.A02, A1G), this.A08, A1G), this.A09, A1G), this.A0A);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamBusinessSearchRanking {");
        C20910yM.A00(C36331k8.A0h(this.A00), "actionOnSerp", A0u);
        C20910yM.A00(this.A03, "actionOrder", A0u);
        C20910yM.A00(this.A04, "businessRankingId", A0u);
        C20910yM.A00(C36331k8.A0h(this.A01), "businessSearchFilterType", A0u);
        C20910yM.A00(this.A05, "businessSearchId", A0u);
        C20910yM.A00(this.A06, "businessSearchMetadata", A0u);
        C20910yM.A00(this.A07, "businessSearchQueryId", A0u);
        C20910yM.A00(C36331k8.A0h(this.A02), "businessSearchResultType", A0u);
        C20910yM.A00(this.A08, "businessSearchSessionId", A0u);
        C20910yM.A00(this.A09, "searchQuery", A0u);
        return C36321k7.A0C(this.A0A, "wabpId", A0u);
    }
}
