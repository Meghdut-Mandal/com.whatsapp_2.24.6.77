package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.58S  reason: invalid class name */
public final class AnonymousClass58S extends C20890yK {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Long A07;
    public Long A08;

    public AnonymousClass58S() {
        super(2110, new C18950u5(1, 1000, 2000, false), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(7, this.A04);
        r3.Bpz(4, this.A00);
        r3.Bpz(3, this.A01);
        r3.Bpz(8, this.A02);
        r3.Bpz(6, this.A05);
        r3.Bpz(1, this.A07);
        r3.Bpz(5, this.A06);
        r3.Bpz(2, this.A08);
        r3.Bpz(9, this.A03);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0R(C36331k8.A0K(C36331k8.A0N(C36331k8.A0J(C36331k8.A0O(C36331k8.A0Q(C36331k8.A0L(C36331k8.A0M(C36401kF.A0h(), this.A04, A1G), this.A00, A1G), this.A01, A1G), this.A02, A1G), this.A05, A1G), this.A07, A1G), this.A06, A1G), this.A08, A1G), this.A03);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamPushLatency {");
        C20910yM.A00(C36331k8.A0h(this.A04), "deliveredPriority", A0u);
        C20910yM.A00(this.A00, "fbnsAvailable", A0u);
        C20910yM.A00(this.A01, "gcmAvailable", A0u);
        C20910yM.A00(this.A02, "hasSessionId", A0u);
        C20910yM.A00(C36331k8.A0h(this.A05), "originalPriority", A0u);
        C20910yM.A00(this.A07, "pushDelayT", A0u);
        C20910yM.A00(C36331k8.A0h(this.A06), "pushTransport", A0u);
        C20910yM.A00(this.A08, "serverTimestampT", A0u);
        return C36321k7.A0C(this.A03, "wasSessionDozed", A0u);
    }
}
