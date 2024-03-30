package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2T1  reason: invalid class name */
public final class AnonymousClass2T1 extends C20890yK {
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
    public Integer A0A;
    public Integer A0B;
    public Long A0C;
    public Long A0D;
    public Long A0E;
    public Long A0F;
    public Long A0G;
    public Long A0H;
    public Long A0I;
    public String A0J;

    public AnonymousClass2T1() {
        super(4778, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A01);
        r3.Bpz(2, this.A0C);
        r3.Bpz(3, this.A02);
        r3.Bpz(4, this.A0D);
        r3.Bpz(5, this.A03);
        r3.Bpz(6, this.A04);
        r3.Bpz(7, this.A0E);
        r3.Bpz(8, this.A05);
        r3.Bpz(9, this.A0F);
        r3.Bpz(10, this.A06);
        r3.Bpz(11, this.A07);
        r3.Bpz(12, this.A0G);
        r3.Bpz(13, this.A08);
        r3.Bpz(14, this.A00);
        r3.Bpz(15, this.A09);
        r3.Bpz(16, this.A0H);
        r3.Bpz(17, this.A0A);
        r3.Bpz(18, this.A0I);
        r3.Bpz(19, this.A0B);
        r3.Bpz(20, this.A0J);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36401kF.A0l(C36381kD.A0o(C36371kC.A0q(C36351kA.A0t(C36351kA.A0s(C36341k9.A0b(C36341k9.A0a(C36331k8.A0V(C36331k8.A0U(C36331k8.A0T(C36331k8.A0S(C36331k8.A0R(C36331k8.A0Q(C36331k8.A0P(C36331k8.A0O(C36331k8.A0N(C36331k8.A0M(C36331k8.A0L(C36331k8.A0K(C36361kB.A0i(), this.A01, A1G), this.A0C, A1G), this.A02, A1G), this.A0D, A1G), this.A03, A1G), this.A04, A1G), this.A0E, A1G), this.A05, A1G), this.A0F, A1G), this.A06, A1G), this.A07, A1G), this.A0G, A1G), this.A08, A1G), this.A00, A1G), this.A09, A1G), this.A0H, A1G), this.A0A, A1G), this.A0I, A1G), this.A0B, A1G), this.A0J);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamEphemeralSyncResponseSend {");
        C20910yM.A00(C36331k8.A0h(this.A01), "clientDisappearingModeInitiator", A0u);
        C20910yM.A00(this.A0C, "clientEphemeralityDuration", A0u);
        C20910yM.A00(C36331k8.A0h(this.A02), "clientEphemeralityInitiator", A0u);
        C20910yM.A00(this.A0D, "clientEphemeralitySettingTimestamp", A0u);
        C20910yM.A00(C36331k8.A0h(this.A03), "clientEphemeralityTriggerAction", A0u);
        C20910yM.A00(C36331k8.A0h(this.A04), "esrDisappearingModeInitiator", A0u);
        C20910yM.A00(this.A0E, "esrEphemeralityDuration", A0u);
        C20910yM.A00(C36331k8.A0h(this.A05), "esrEphemeralityInitiator", A0u);
        C20910yM.A00(this.A0F, "esrEphemeralitySettingTimestamp", A0u);
        C20910yM.A00(C36331k8.A0h(this.A06), "esrEphemeralityTriggerAction", A0u);
        C20910yM.A00(C36331k8.A0h(this.A07), "esrFailureReason", A0u);
        C20910yM.A00(this.A0G, "esrSendAttempt", A0u);
        C20910yM.A00(C36331k8.A0h(this.A08), "esrSendResult", A0u);
        C36441kJ.A1G(this.A00, A0u);
        C20910yM.A00(C36331k8.A0h(this.A09), "messageDisappearingModeInitiator", A0u);
        C20910yM.A00(this.A0H, "messageEphemeralityDuration", A0u);
        C20910yM.A00(C36331k8.A0h(this.A0A), "messageEphemeralityInitiator", A0u);
        C20910yM.A00(this.A0I, "messageEphemeralitySettingTimestamp", A0u);
        C20910yM.A00(C36331k8.A0h(this.A0B), "messageEphemeralityTriggerAction", A0u);
        return C36321k7.A0C(this.A0J, "threadId", A0u);
    }
}
