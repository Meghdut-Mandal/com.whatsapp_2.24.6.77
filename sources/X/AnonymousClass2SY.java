package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2SY  reason: invalid class name */
public final class AnonymousClass2SY extends C20890yK {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public Integer A08;
    public Integer A09;
    public Long A0A;
    public Long A0B;

    public AnonymousClass2SY() {
        super(3724, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(12, this.A01);
        r3.Bpz(14, this.A02);
        r3.Bpz(2, this.A03);
        r3.Bpz(9, this.A04);
        r3.Bpz(3, this.A05);
        r3.Bpz(4, this.A06);
        r3.Bpz(5, this.A07);
        r3.Bpz(6, this.A00);
        r3.Bpz(11, this.A0A);
        r3.Bpz(7, this.A0B);
        r3.Bpz(8, this.A08);
        r3.Bpz(10, this.A09);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36341k9.A0a(C36431kI.A12(), this.A01, A1G), this.A02);
        C36321k7.A1b(A1G, 1);
        A1G.put(C36331k8.A0L(C36331k8.A0R(C36361kB.A0j(), this.A03, A1G), this.A04, A1G), this.A05);
        C36321k7.A1b(A1G, 13);
        A1G.put(C36331k8.A0S(C36331k8.A0Q(C36331k8.A0P(C36331k8.A0T(C36331k8.A0O(C36331k8.A0N(C36371kC.A0o(), this.A06, A1G), this.A07, A1G), this.A00, A1G), this.A0A, A1G), this.A0B, A1G), this.A08, A1G), this.A09);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamIncomingMessageDrop {");
        C20910yM.A00(C36331k8.A0h(this.A01), "agentEngagementType", A0u);
        C20910yM.A00(C36331k8.A0h(this.A02), "botType", A0u);
        C20910yM.A00(C36331k8.A0h(this.A03), "e2eDestination", A0u);
        C20910yM.A00(C36331k8.A0h(this.A04), "e2eFailureReason", A0u);
        C20910yM.A00(C36331k8.A0h(this.A05), "e2eSenderType", A0u);
        C20910yM.A00(C36331k8.A0h(this.A06), "messageDropReason", A0u);
        C20910yM.A00(C36331k8.A0h(this.A07), "messageMediaType", A0u);
        C20910yM.A00(this.A00, "offline", A0u);
        C20910yM.A00(this.A0A, "offlineCount", A0u);
        C20910yM.A00(this.A0B, "retryCount", A0u);
        C20910yM.A00(C36331k8.A0h(this.A08), "revokeType", A0u);
        return C36321k7.A0C(C36331k8.A0h(this.A09), "typeOfGroup", A0u);
    }
}
