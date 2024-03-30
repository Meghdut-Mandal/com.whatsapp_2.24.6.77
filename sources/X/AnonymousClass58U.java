package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.58U  reason: invalid class name */
public final class AnonymousClass58U extends C20890yK {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;

    public AnonymousClass58U() {
        super(5166, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A00);
        r3.Bpz(2, this.A01);
        r3.Bpz(3, this.A02);
        r3.Bpz(4, this.A03);
        r3.Bpz(5, this.A04);
        r3.Bpz(6, this.A05);
        r3.Bpz(7, this.A06);
        r3.Bpz(8, this.A07);
        r3.Bpz(9, this.A08);
        r3.Bpz(10, this.A09);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0S(C36331k8.A0R(C36331k8.A0Q(C36331k8.A0P(C36331k8.A0O(C36331k8.A0N(C36331k8.A0M(C36331k8.A0L(C36331k8.A0K(C36361kB.A0i(), this.A00, A1G), this.A01, A1G), this.A02, A1G), this.A03, A1G), this.A04, A1G), this.A05, A1G), this.A06, A1G), this.A07, A1G), this.A08, A1G), this.A09);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamAiAgentEmbodimentTransition {");
        C20910yM.A00(this.A00, "threadSessionId", A0u);
        C20910yM.A00(this.A01, "transitionLlmActionName", A0u);
        C20910yM.A00(this.A02, "transitionLlmIntensityName", A0u);
        C20910yM.A00(this.A03, "transitionLlmSentimentName", A0u);
        C20910yM.A00(this.A04, "transitionPolicy", A0u);
        C20910yM.A00(this.A05, "transitionPreviousAction", A0u);
        C20910yM.A00(this.A06, "transitionPreviousIntensity", A0u);
        C20910yM.A00(this.A07, "transitionPreviousSentiment", A0u);
        C20910yM.A00(this.A08, "transitionPreviousState", A0u);
        return C36321k7.A0C(this.A09, "transitionTrigger", A0u);
    }
}
