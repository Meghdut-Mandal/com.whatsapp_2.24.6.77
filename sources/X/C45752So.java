package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2So  reason: invalid class name and case insensitive filesystem */
public final class C45752So extends C20890yK {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;
    public Long A0D;
    public Long A0E;

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(10, this.A02);
        r3.Bpz(6, this.A03);
        r3.Bpz(5, this.A08);
        r3.Bpz(13, this.A04);
        r3.Bpz(14, this.A05);
        r3.Bpz(15, this.A06);
        r3.Bpz(1, this.A07);
        r3.Bpz(3, this.A09);
        r3.Bpz(4, this.A00);
        r3.Bpz(16, this.A0A);
        r3.Bpz(8, this.A01);
        r3.Bpz(17, this.A0B);
        r3.Bpz(2, this.A0C);
        r3.Bpz(7, this.A0D);
        r3.Bpz(9, this.A0E);
    }

    public C45752So() {
        super(460, C20890yK.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0O(C36401kF.A0j(), this.A02, A1G), this.A03);
        C36321k7.A1b(A1G, 11);
        A1G.put(C36371kC.A0p(), this.A08);
        C36321k7.A1b(A1G, 12);
        A1G.put(C36331k8.A0R(C36331k8.A0P(C36331k8.A0K(C36351kA.A0t(C36331k8.A0Q(C36351kA.A0s(C36331k8.A0M(C36331k8.A0L(C36331k8.A0J(C36341k9.A0b(C36341k9.A0a(C36421kH.A0V(), this.A04, A1G), this.A05, A1G), this.A06, A1G), this.A07, A1G), this.A09, A1G), this.A00, A1G), this.A0A, A1G), this.A01, A1G), this.A0B, A1G), this.A0C, A1G), this.A0D, A1G), this.A0E);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamLogin {");
        C20910yM.A00(C36331k8.A0h(this.A02), "androidKeystoreState", A0u);
        C20910yM.A00(C36331k8.A0h(this.A03), "connectionOrigin", A0u);
        C20910yM.A00(this.A08, "connectionT", A0u);
        C20910yM.A00(C36331k8.A0h(this.A04), "loginDnsResolver", A0u);
        C20910yM.A00(C36331k8.A0h(this.A05), "loginIpSource", A0u);
        C20910yM.A00(C36331k8.A0h(this.A06), "loginPort", A0u);
        C20910yM.A00(C36331k8.A0h(this.A07), "loginResult", A0u);
        C20910yM.A00(this.A09, "loginT", A0u);
        C20910yM.A00(this.A00, "longConnect", A0u);
        C20910yM.A00(this.A0A, "noiseProtocolVersion", A0u);
        C20910yM.A00(this.A01, "passive", A0u);
        C20910yM.A00(this.A0B, "pendingAcksCount", A0u);
        C20910yM.A00(this.A0C, "retryCount", A0u);
        C20910yM.A00(this.A0D, "sequenceStep", A0u);
        return C36321k7.A0C(this.A0E, "serverErrorCode", A0u);
    }
}
