package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2SI  reason: invalid class name */
public final class AnonymousClass2SI extends C20890yK {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public String A08;
    public String A09;

    public AnonymousClass2SI() {
        super(2288, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(10, this.A05);
        r3.Bpz(8, this.A06);
        r3.Bpz(7, this.A01);
        r3.Bpz(3, this.A02);
        r3.Bpz(2, this.A03);
        r3.Bpz(5, this.A04);
        r3.Bpz(6, this.A08);
        r3.Bpz(1, this.A09);
        r3.Bpz(4, this.A07);
        r3.Bpz(9, this.A00);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0R(C36331k8.A0M(C36331k8.A0J(C36331k8.A0O(C36331k8.A0N(C36331k8.A0K(C36331k8.A0L(C36331k8.A0P(C36331k8.A0Q(C36401kF.A0j(), this.A05, A1G), this.A06, A1G), this.A01, A1G), this.A02, A1G), this.A03, A1G), this.A04, A1G), this.A08, A1G), this.A09, A1G), this.A07, A1G), this.A00);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamMdBootstrapDataGenerated {");
        C20910yM.A00(this.A05, "historySyncChunkOrder", A0u);
        C20910yM.A00(this.A06, "historySyncStageProgress", A0u);
        C20910yM.A00(C36331k8.A0h(this.A01), "mdBootstrapHistoryPayloadType", A0u);
        C20910yM.A00(C36331k8.A0h(this.A02), "mdBootstrapPayloadType", A0u);
        C20910yM.A00(C36331k8.A0h(this.A03), "mdBootstrapSource", A0u);
        C20910yM.A00(C36331k8.A0h(this.A04), "mdBootstrapStepResult", A0u);
        C20910yM.A00(this.A08, "mdRegAttemptId", A0u);
        C20910yM.A00(this.A09, "mdSessionId", A0u);
        C20910yM.A00(this.A07, "mdTimestamp", A0u);
        return C36321k7.A0C(this.A00, "sentViaMms", A0u);
    }
}
