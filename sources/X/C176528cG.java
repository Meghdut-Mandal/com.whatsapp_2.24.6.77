package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8cG  reason: invalid class name and case insensitive filesystem */
public final class C176528cG extends C20890yK {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public String A0A;
    public String A0B;

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(10, this.A00);
        r3.Bpz(6, this.A01);
        r3.Bpz(7, this.A02);
        r3.Bpz(9, this.A0A);
        r3.Bpz(2, this.A04);
        r3.Bpz(1, this.A05);
        r3.Bpz(5, this.A06);
        r3.Bpz(4, this.A07);
        r3.Bpz(8, this.A0B);
        r3.Bpz(12, this.A08);
        r3.Bpz(3, this.A03);
        r3.Bpz(11, this.A09);
    }

    public C176528cG() {
        super(2636, C20890yK.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0T(C36331k8.A0L(C36331k8.A0U(C36331k8.A0Q(C36331k8.A0M(C36331k8.A0N(C36331k8.A0J(C36331k8.A0K(C36331k8.A0R(C36331k8.A0P(C36331k8.A0O(C36401kF.A0j(), this.A00, A1G), this.A01, A1G), this.A02, A1G), this.A0A, A1G), this.A04, A1G), this.A05, A1G), this.A06, A1G), this.A07, A1G), this.A0B, A1G), this.A08, A1G), this.A03, A1G), this.A09);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamAckKickReceived {");
        C20910yM.A00(C36331k8.A0h(this.A00), "callStanzaType", A0u);
        C20910yM.A00(C36331k8.A0h(this.A01), "mediaType", A0u);
        C20910yM.A00(C36331k8.A0h(this.A02), "messageType", A0u);
        C20910yM.A00(this.A0A, "notificationStanzaType", A0u);
        C20910yM.A00(this.A04, "numOfflineStanzasProcessing", A0u);
        C20910yM.A00(this.A05, "numStanzasProcessing", A0u);
        C20910yM.A00(this.A06, "numStanzasProcessingForType", A0u);
        C20910yM.A00(this.A07, "numStanzasWithSameId", A0u);
        C20910yM.A00(this.A0B, "receiptStanzaType", A0u);
        C20910yM.A00(this.A08, "stanzaOfflineCount", A0u);
        C20910yM.A00(C36331k8.A0h(this.A03), "stanzaType", A0u);
        return C36321k7.A0C(this.A09, "timeToAckKickInMs", A0u);
    }
}
