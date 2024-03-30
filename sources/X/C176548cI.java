package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8cI  reason: invalid class name and case insensitive filesystem */
public final class C176548cI extends C20890yK {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public Long A0B;

    public C176548cI() {
        super(2494, new C18950u5(1, 1000, 2000, false), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(11, this.A07);
        r3.Bpz(12, this.A08);
        r3.Bpz(5, this.A00);
        r3.Bpz(3, this.A04);
        r3.Bpz(10, this.A09);
        r3.Bpz(1, this.A0A);
        r3.Bpz(6, this.A01);
        r3.Bpz(7, this.A02);
        r3.Bpz(2, this.A0B);
        r3.Bpz(8, this.A03);
        r3.Bpz(9, this.A05);
        r3.Bpz(4, this.A06);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0U(C36421kH.A0U(), this.A07, A1G), this.A08);
        C36321k7.A1b(A1G, 13);
        A1G.put(C36331k8.A0M(C36331k8.A0R(C36331k8.A0Q(C36331k8.A0K(C36331k8.A0P(C36331k8.A0O(C36331k8.A0J(C36331k8.A0S(C36331k8.A0L(C36351kA.A0s(C36341k9.A0b(C36341k9.A0a(C36371kC.A0p(), this.A00, A1G), (Object) null, A1G), (Object) null, A1G), (Object) null, A1G), this.A04, A1G), this.A09, A1G), this.A0A, A1G), this.A01, A1G), this.A02, A1G), this.A0B, A1G), this.A03, A1G), this.A05, A1G), this.A06);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamMessageStanzaReceive {");
        C20910yM.A00(this.A07, "dbReadsCount", A0u);
        C20910yM.A00(this.A08, "dbWritesCount", A0u);
        C20910yM.A00(this.A00, "hasSenderKeyDistributionMessage", A0u);
        C20910yM.A00(C36331k8.A0h(this.A04), "mediaType", A0u);
        C20910yM.A00(this.A09, "messageStanzaDecryptQueueSize", A0u);
        C20910yM.A00(this.A0A, "messageStanzaDuration", A0u);
        C20910yM.A00(this.A01, "messageStanzaE2eSuccess", A0u);
        C20910yM.A00(this.A02, "messageStanzaIsEphemeral", A0u);
        C20910yM.A00(this.A0B, "messageStanzaOfflineCount", A0u);
        C20910yM.A00(this.A03, "messageStanzaRevoke", A0u);
        C20910yM.A00(C36331k8.A0h(this.A05), "messageStanzaStage", A0u);
        return C36321k7.A0C(C36331k8.A0h(this.A06), "messageType", A0u);
    }
}
