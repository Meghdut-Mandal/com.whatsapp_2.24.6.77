package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Sn  reason: invalid class name and case insensitive filesystem */
public final class C45742Sn extends C20890yK {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public Integer A08;
    public Integer A09;
    public Integer A0A;
    public Integer A0B;
    public Long A0C;
    public Long A0D;
    public Long A0E;

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(21, this.A05);
        r3.Bpz(18, this.A0C);
        r3.Bpz(24, this.A06);
        r3.Bpz(25, this.A07);
        r3.Bpz(22, this.A00);
        r3.Bpz(14, this.A01);
        r3.Bpz(26, this.A08);
        r3.Bpz(9, this.A02);
        r3.Bpz(2, this.A09);
        r3.Bpz(1, this.A0A);
        r3.Bpz(20, this.A0D);
        r3.Bpz(19, this.A0E);
        r3.Bpz(23, this.A0B);
        r3.Bpz(16, this.A03);
        r3.Bpz(17, this.A04);
    }

    public C45742Sn() {
        super(1728, C20890yK.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36371kC.A0q(C36331k8.A0T(C36331k8.A0U(21, this.A05, A1G), (Object) null, A1G), (Object) null, A1G), this.A0C);
        A1G.put(24, this.A06);
        A1G.put(C36431kI.A14(), this.A07);
        C36321k7.A1b(A1G, 5);
        A1G.put(C36341k9.A0a(22, this.A00, A1G), this.A01);
        C36321k7.A1b(A1G, 10);
        A1G.put(C36331k8.A0K(C36331k8.A0R(C36331k8.A0L(C36331k8.A0O(C36331k8.A0M(26, this.A08, A1G), (Object) null, A1G), (Object) null, A1G), (Object) null, A1G), this.A02, A1G), this.A09);
        C36321k7.A1b(A1G, 13);
        A1G.put(C36381kD.A0o(C36331k8.A0P(C36331k8.A0Q(C36401kF.A0l(C36361kB.A0i(), this.A0A, A1G), this.A0D, A1G), (Object) null, A1G), (Object) null, A1G), this.A0E);
        A1G.put(C36351kA.A0t(C36351kA.A0s(23, this.A0B, A1G), this.A03, A1G), this.A04);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamForwardSend {");
        C20910yM.A00(C36331k8.A0h(this.A05), "disappearingChatInitiator", A0u);
        C20910yM.A00(this.A0C, "ephemeralityDuration", A0u);
        C20910yM.A00(C36331k8.A0h(this.A06), "ephemeralityInitiator", A0u);
        C20910yM.A00(C36331k8.A0h(this.A07), "ephemeralityTriggerAction", A0u);
        C20910yM.A00(this.A00, "isForwardedForward", A0u);
        C20910yM.A00(this.A01, "isFrequentlyForwarded", A0u);
        C20910yM.A00(C36331k8.A0h(this.A08), "messageBizType", A0u);
        C20910yM.A00(this.A02, "messageIsInternational", A0u);
        C20910yM.A00(C36331k8.A0h(this.A09), "messageMediaType", A0u);
        C20910yM.A00(C36331k8.A0h(this.A0A), "messageType", A0u);
        C20910yM.A00(this.A0D, "receiverDefaultDisappearingDuration", A0u);
        C20910yM.A00(this.A0E, "senderDefaultDisappearingDuration", A0u);
        C20910yM.A00(C36331k8.A0h(this.A0B), "typeOfGroup", A0u);
        C20910yM.A00(this.A03, "wouldBeFrequentlyForwardedAt3", A0u);
        return C36321k7.A0C(this.A04, "wouldBeFrequentlyForwardedAt4", A0u);
    }
}
