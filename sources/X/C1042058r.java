package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.58r  reason: invalid class name and case insensitive filesystem */
public final class C1042058r extends C20890yK {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;
    public Long A0D;
    public Long A0E;
    public Long A0F;
    public Long A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public String A0N;

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(21, this.A07);
        r3.Bpz(1, this.A0H);
        r3.Bpz(18, this.A00);
        r3.Bpz(22, this.A0I);
        r3.Bpz(2, this.A08);
        r3.Bpz(3, this.A09);
        r3.Bpz(4, this.A0A);
        r3.Bpz(5, this.A0B);
        r3.Bpz(6, this.A01);
        r3.Bpz(7, this.A0C);
        r3.Bpz(19, this.A0D);
        r3.Bpz(8, this.A0E);
        r3.Bpz(9, this.A0J);
        r3.Bpz(10, this.A0K);
        r3.Bpz(11, this.A02);
        r3.Bpz(12, this.A03);
        r3.Bpz(23, this.A0L);
        r3.Bpz(13, this.A04);
        r3.Bpz(14, this.A0F);
        r3.Bpz(15, this.A0M);
        r3.Bpz(20, this.A0G);
        r3.Bpz(16, this.A05);
        r3.Bpz(24, this.A06);
        r3.Bpz(17, this.A0N);
    }

    public C1042058r() {
        super(4032, C20890yK.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36351kA.A0t(C90484aE.A0e(C36351kA.A0s(C36401kF.A0l(C36341k9.A0b(C36341k9.A0a(C36331k8.A0V(C90484aE.A0d(C36331k8.A0U(C36331k8.A0T(C36331k8.A0S(C36331k8.A0R(C36331k8.A0Q(C36381kD.A0o(C36331k8.A0P(C36331k8.A0O(C36331k8.A0N(C36331k8.A0M(C36331k8.A0L(C36331k8.A0K(C90474aD.A0X(C36371kC.A0q(C36331k8.A0J(21, this.A07, A1G), this.A0H, A1G), this.A00, A1G), this.A0I, A1G), this.A08, A1G), this.A09, A1G), this.A0A, A1G), this.A0B, A1G), this.A01, A1G), this.A0C, A1G), this.A0D, A1G), this.A0E, A1G), this.A0J, A1G), this.A0K, A1G), this.A02, A1G), this.A03, A1G), this.A0L, A1G), this.A04, A1G), this.A0F, A1G), this.A0M, A1G), this.A0G, A1G), this.A05, A1G), this.A06, A1G), this.A0N);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamCallArEffectSession {");
        C20910yM.A00(this.A07, "arClassV2", A0u);
        C20910yM.A00(this.A0H, "callRandomId", A0u);
        C20910yM.A00(this.A00, "consentRequested", A0u);
        C20910yM.A00(this.A0I, "deliveryOperationId", A0u);
        C20910yM.A00(this.A08, "effectDurationT", A0u);
        C20910yM.A00(this.A09, "effectEftT", A0u);
        C20910yM.A00(this.A0A, "effectEitT", A0u);
        C20910yM.A00(this.A0B, "effectEmtT", A0u);
        C20910yM.A00(C36331k8.A0h(this.A01), "effectEndReason", A0u);
        C20910yM.A00(this.A0C, "effectEndT", A0u);
        C20910yM.A00(this.A0D, "effectEsdkT", A0u);
        C20910yM.A00(this.A0E, "effectEttiT", A0u);
        C20910yM.A00(this.A0J, "effectId", A0u);
        C20910yM.A00(this.A0K, "effectInstanceId", A0u);
        C20910yM.A00(C36331k8.A0h(this.A02), "effectLoadingFailedReason", A0u);
        C20910yM.A00(C36331k8.A0h(this.A03), "effectLoadingResultType", A0u);
        C20910yM.A00(this.A0L, "effectSessionId", A0u);
        C20910yM.A00(C36331k8.A0h(this.A04), "effectStartReason", A0u);
        C20910yM.A00(this.A0F, "effectStartT", A0u);
        C20910yM.A00(this.A0M, "effectTier", A0u);
        C20910yM.A00(this.A0G, "effectTotalLoadingT", A0u);
        C20910yM.A00(C36331k8.A0h(this.A05), "effectType", A0u);
        C20910yM.A00(C36331k8.A0h(this.A06), "flmConsentType", A0u);
        return C36321k7.A0C(this.A0N, "productSessionId", A0u);
    }
}
