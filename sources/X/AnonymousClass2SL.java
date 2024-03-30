package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2SL  reason: invalid class name */
public final class AnonymousClass2SL extends C20890yK {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A02);
        r3.Bpz(2, this.A03);
        r3.Bpz(3, this.A06);
        r3.Bpz(11, this.A04);
        r3.Bpz(5, this.A05);
        r3.Bpz(6, this.A07);
        r3.Bpz(7, this.A00);
        r3.Bpz(8, this.A01);
        r3.Bpz(9, this.A08);
        r3.Bpz(10, this.A09);
    }

    public AnonymousClass2SL() {
        super(4356, C36331k8.A0H(), 2, 248614979);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0L(C36331k8.A0K(C36361kB.A0i(), this.A02, A1G), this.A03, A1G), this.A06);
        C36321k7.A1b(A1G, 4);
        A1G.put(C36331k8.A0S(C36331k8.A0R(C36331k8.A0Q(C36331k8.A0P(C36331k8.A0O(C36331k8.A0N(C36421kH.A0U(), this.A04, A1G), this.A05, A1G), this.A07, A1G), this.A00, A1G), this.A01, A1G), this.A08, A1G), this.A09);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamPsProxyLogin {");
        C20910yM.A00(C36331k8.A0h(this.A02), "androidKeystoreState", A0u);
        C20910yM.A00(C36331k8.A0h(this.A03), "connectionOrigin", A0u);
        C20910yM.A00(this.A06, "connectionT", A0u);
        C20910yM.A00(C36331k8.A0h(this.A04), "loginDnsResolver", A0u);
        C20910yM.A00(C36331k8.A0h(this.A05), "loginResult", A0u);
        C20910yM.A00(this.A07, "loginT", A0u);
        C20910yM.A00(this.A00, "longConnect", A0u);
        C20910yM.A00(this.A01, "psPassive", A0u);
        C20910yM.A00(this.A08, "retryCount", A0u);
        return C36321k7.A0C(this.A09, "serverErrorCode", A0u);
    }
}
