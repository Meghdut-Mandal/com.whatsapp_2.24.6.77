package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2SQ  reason: invalid class name */
public final class AnonymousClass2SQ extends C20890yK {
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
    public String A0A;

    public AnonymousClass2SQ() {
        super(2298, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(5, this.A02);
        r3.Bpz(14, this.A06);
        r3.Bpz(11, this.A07);
        r3.Bpz(10, this.A03);
        r3.Bpz(3, this.A04);
        r3.Bpz(2, this.A05);
        r3.Bpz(6, this.A08);
        r3.Bpz(1, this.A0A);
        r3.Bpz(4, this.A09);
        r3.Bpz(13, this.A00);
        r3.Bpz(7, this.A01);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0T(C36341k9.A0a(C36371kC.A0p(), this.A02, A1G), this.A06, A1G), this.A07);
        C36321k7.A1b(A1G, 8);
        A1G.put(C36331k8.A0P(C36331k8.A0V(C36331k8.A0M(C36331k8.A0J(C36331k8.A0R(C36331k8.A0U(C36331k8.A0O(C36331k8.A0K(C36331k8.A0L(C36401kF.A0j(), this.A03, A1G), this.A04, A1G), this.A05, A1G), this.A08, A1G), (Object) null, A1G), (Object) null, A1G), this.A0A, A1G), this.A09, A1G), this.A00, A1G), this.A01);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamMdBootstrapDataApplied {");
        C20910yM.A00(C36331k8.A0h(this.A02), "collection", A0u);
        C20910yM.A00(this.A06, "historySyncChunkOrder", A0u);
        C20910yM.A00(this.A07, "historySyncStageProgress", A0u);
        C20910yM.A00(C36331k8.A0h(this.A03), "mdBootstrapHistoryPayloadType", A0u);
        C20910yM.A00(C36331k8.A0h(this.A04), "mdBootstrapPayloadType", A0u);
        C20910yM.A00(C36331k8.A0h(this.A05), "mdBootstrapSource", A0u);
        C20910yM.A00(this.A08, "mdBootstrapStepDuration", A0u);
        C20910yM.A00(this.A0A, "mdSessionId", A0u);
        C20910yM.A00(this.A09, "mdTimestamp", A0u);
        C20910yM.A00(this.A00, "sentViaMms", A0u);
        return C36321k7.A0C(this.A01, "usedSnapshot", A0u);
    }
}