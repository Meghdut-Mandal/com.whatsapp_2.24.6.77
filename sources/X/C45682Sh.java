package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Sh  reason: invalid class name and case insensitive filesystem */
public final class C45682Sh extends C20890yK {
    public Boolean A00;
    public Integer A01;
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
    public String A0C;

    public C45682Sh() {
        super(472, C36441kJ.A0p(1, 100, 5000), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(9, this.A01);
        r3.Bpz(11, this.A02);
        r3.Bpz(13, this.A06);
        r3.Bpz(14, this.A07);
        r3.Bpz(15, this.A08);
        r3.Bpz(5, this.A09);
        r3.Bpz(8, this.A00);
        r3.Bpz(10, (Object) null);
        r3.Bpz(6, this.A0A);
        r3.Bpz(4, this.A03);
        r3.Bpz(7, this.A04);
        r3.Bpz(3, this.A0B);
        r3.Bpz(12, this.A0C);
        r3.Bpz(1, this.A05);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0Q(C36331k8.A0N(C36341k9.A0b(C36341k9.A0a(C36331k8.A0V(C36331k8.A0T(C36401kF.A0i(), this.A01, A1G), this.A02, A1G), this.A06, A1G), this.A07, A1G), this.A08, A1G), this.A09, A1G), this.A00);
        C36321k7.A1b(A1G, 10);
        A1G.put(C36331k8.A0P(C36331k8.A0M(C36381kD.A0n(), this.A0A, A1G), this.A03, A1G), this.A04);
        C36321k7.A1b(A1G, 2);
        A1G.put(C36331k8.A0J(C36331k8.A0U(C36371kC.A0n(), this.A0B, A1G), this.A0C, A1G), this.A05);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamUiAction {");
        C20910yM.A00(C36331k8.A0h(this.A01), "agentEngagementType", A0u);
        C20910yM.A00(C36331k8.A0h(this.A02), "botType", A0u);
        C20910yM.A00(this.A06, "dbMainThreadCount", A0u);
        C20910yM.A00(this.A07, "dbReadsCount", A0u);
        C20910yM.A00(this.A08, "dbWritesCount", A0u);
        C20910yM.A00(this.A09, "deviceCount", A0u);
        C20910yM.A00(this.A00, "isLid", A0u);
        AnonymousClass00C.A0D("localAddressingMode", 1);
        C20910yM.A00(this.A0A, "participantCount", A0u);
        C20910yM.A00(C36331k8.A0h(this.A03), "sizeBucket", A0u);
        C20910yM.A00(C36331k8.A0h(this.A04), "uiActionChatType", A0u);
        C20910yM.A00(this.A0B, "uiActionT", A0u);
        C20910yM.A00(this.A0C, "uiActionTtrcSurfaceName", A0u);
        return C36321k7.A0C(C36331k8.A0h(this.A05), "uiActionType", A0u);
    }
}
