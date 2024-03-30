package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Sd  reason: invalid class name and case insensitive filesystem */
public final class C45642Sd extends C20890yK {
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
    public Long A0A;
    public Long A0B;
    public Long A0C;

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A06);
        r3.Bpz(2, this.A02);
        r3.Bpz(3, this.A03);
        r3.Bpz(4, this.A04);
        r3.Bpz(5, this.A00);
        r3.Bpz(6, this.A05);
        r3.Bpz(7, this.A07);
        r3.Bpz(8, this.A08);
        r3.Bpz(9, this.A09);
        r3.Bpz(10, this.A0A);
        r3.Bpz(11, this.A0B);
        r3.Bpz(12, this.A0C);
        r3.Bpz(13, this.A01);
    }

    public C45642Sd() {
        super(4592, C20890yK.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0V(C36331k8.A0U(C36331k8.A0T(C36331k8.A0S(C36331k8.A0R(C36331k8.A0Q(C36331k8.A0P(C36331k8.A0O(C36331k8.A0N(C36331k8.A0M(C36331k8.A0L(C36331k8.A0K(C36361kB.A0i(), this.A06, A1G), this.A02, A1G), this.A03, A1G), this.A04, A1G), this.A00, A1G), this.A05, A1G), this.A07, A1G), this.A08, A1G), this.A09, A1G), this.A0A, A1G), this.A0B, A1G), this.A0C, A1G), this.A01);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamLogout {");
        C20910yM.A00(this.A06, "appStandbyBucket", A0u);
        C20910yM.A00(C36331k8.A0h(this.A02), "loginDnsResolver", A0u);
        C20910yM.A00(C36331k8.A0h(this.A03), "loginIpSource", A0u);
        C20910yM.A00(C36331k8.A0h(this.A04), "loginPort", A0u);
        C20910yM.A00(this.A00, "logoutIsBatterySaver", A0u);
        C20910yM.A00(C36331k8.A0h(this.A05), "logoutReason", A0u);
        C20910yM.A00(this.A07, "logoutSessionBackgroundMs", A0u);
        C20910yM.A00(this.A08, "logoutSessionForegroundMs", A0u);
        C20910yM.A00(this.A09, "logoutSessionId", A0u);
        C20910yM.A00(this.A0A, "logoutSessionLengthMs", A0u);
        C20910yM.A00(this.A0B, "logoutSessionTotalBytesIn", A0u);
        C20910yM.A00(this.A0C, "logoutSessionTotalBytesOut", A0u);
        return C36321k7.A0C(this.A01, "passive", A0u);
    }
}
