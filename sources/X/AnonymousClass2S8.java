package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2S8  reason: invalid class name */
public final class AnonymousClass2S8 extends C20890yK {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Long A06;
    public String A07;
    public String A08;

    public AnonymousClass2S8() {
        super(5134, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A07);
        r3.Bpz(8, this.A00);
        r3.Bpz(9, this.A01);
        r3.Bpz(2, this.A02);
        r3.Bpz(3, this.A06);
        r3.Bpz(4, this.A03);
        r3.Bpz(5, this.A04);
        r3.Bpz(6, this.A08);
        r3.Bpz(7, this.A05);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0P(C36331k8.A0O(C36331k8.A0N(C36331k8.A0M(C36331k8.A0L(C36331k8.A0K(C36331k8.A0R(C36331k8.A0Q(C36361kB.A0i(), this.A07, A1G), this.A00, A1G), this.A01, A1G), this.A02, A1G), this.A06, A1G), this.A03, A1G), this.A04, A1G), this.A08, A1G), this.A05);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamMessagingUserJourney {");
        C20910yM.A00(this.A07, "appSessionId", A0u);
        C20910yM.A00(this.A00, "isSelfPin", A0u);
        C36441kJ.A1H(C36331k8.A0h(this.A01), A0u);
        C20910yM.A00(C36331k8.A0h(this.A02), "messagingActionType", A0u);
        C20910yM.A00(this.A06, "pinInChatExpirySecs", A0u);
        C20910yM.A00(C36331k8.A0h(this.A03), "threadType", A0u);
        C20910yM.A00(C36331k8.A0h(this.A04), "uiSurface", A0u);
        C20910yM.A00(this.A08, "userJourneyFunnelId", A0u);
        return C36321k7.A0C(C36331k8.A0h(this.A05), "userRole", A0u);
    }
}
