package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Sk  reason: invalid class name and case insensitive filesystem */
public final class C45712Sk extends C20890yK {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public Integer A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;
    public String A0D;

    public C45712Sk() {
        super(4780, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A01);
        r3.Bpz(2, this.A09);
        r3.Bpz(3, this.A02);
        r3.Bpz(4, this.A0A);
        r3.Bpz(5, this.A03);
        r3.Bpz(6, this.A04);
        r3.Bpz(7, this.A0B);
        r3.Bpz(8, this.A05);
        r3.Bpz(9, this.A0C);
        r3.Bpz(10, this.A06);
        r3.Bpz(11, this.A07);
        r3.Bpz(12, this.A08);
        r3.Bpz(13, this.A00);
        r3.Bpz(14, this.A0D);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36341k9.A0a(C36331k8.A0V(C36331k8.A0U(C36331k8.A0T(C36331k8.A0S(C36331k8.A0R(C36331k8.A0Q(C36331k8.A0P(C36331k8.A0O(C36331k8.A0N(C36331k8.A0M(C36331k8.A0L(C36331k8.A0K(C36361kB.A0i(), this.A01, A1G), this.A09, A1G), this.A02, A1G), this.A0A, A1G), this.A03, A1G), this.A04, A1G), this.A0B, A1G), this.A05, A1G), this.A0C, A1G), this.A06, A1G), this.A07, A1G), this.A08, A1G), this.A00, A1G), this.A0D);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamEphemeralSyncResponseReceive {");
        C20910yM.A00(C36331k8.A0h(this.A01), "clientDisappearingModeInitiator", A0u);
        C20910yM.A00(this.A09, "clientEphemeralityDuration", A0u);
        C20910yM.A00(C36331k8.A0h(this.A02), "clientEphemeralityInitiator", A0u);
        C20910yM.A00(this.A0A, "clientEphemeralitySettingTimestamp", A0u);
        C20910yM.A00(C36331k8.A0h(this.A03), "clientEphemeralityTriggerAction", A0u);
        C20910yM.A00(C36331k8.A0h(this.A04), "esrDisappearingModeInitiator", A0u);
        C20910yM.A00(this.A0B, "esrEphemeralityDuration", A0u);
        C20910yM.A00(C36331k8.A0h(this.A05), "esrEphemeralityInitiator", A0u);
        C20910yM.A00(this.A0C, "esrEphemeralitySettingTimestamp", A0u);
        C20910yM.A00(C36331k8.A0h(this.A06), "esrEphemeralityTriggerAction", A0u);
        C20910yM.A00(C36331k8.A0h(this.A07), "esrFailureReason", A0u);
        C20910yM.A00(C36331k8.A0h(this.A08), "esrResolveResult", A0u);
        C36441kJ.A1G(this.A00, A0u);
        return C36321k7.A0C(this.A0D, "threadId", A0u);
    }
}