package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.58s  reason: invalid class name and case insensitive filesystem */
public final class C1042158s extends C20890yK {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public String A0N;

    public C1042158s() {
        super(4112, C36431kI.A0q(), 2, 0);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(22, this.A09);
        r3.Bpz(1, this.A03);
        r3.Bpz(2, this.A0A);
        r3.Bpz(24, this.A06);
        r3.Bpz(3, this.A0B);
        r3.Bpz(4, this.A0C);
        r3.Bpz(5, this.A0D);
        r3.Bpz(19, this.A04);
        r3.Bpz(20, this.A0E);
        r3.Bpz(21, this.A0F);
        r3.Bpz(6, this.A0G);
        r3.Bpz(17, this.A00);
        r3.Bpz(7, this.A07);
        r3.Bpz(18, this.A0H);
        r3.Bpz(8, this.A0I);
        r3.Bpz(9, this.A0J);
        r3.Bpz(10, this.A0K);
        r3.Bpz(23, this.A05);
        r3.Bpz(11, this.A0L);
        r3.Bpz(16, this.A0M);
        r3.Bpz(25, this.A01);
        r3.Bpz(13, this.A02);
        r3.Bpz(14, this.A0N);
        r3.Bpz(15, this.A08);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0T(C90484aE.A0d(C36331k8.A0S(C36331k8.A0R(C36331k8.A0Q(C36371kC.A0q(C36331k8.A0P(C36351kA.A0t(C36331k8.A0O(C36411kG.A0s(C36401kF.A0l(C36381kD.A0o(C36331k8.A0N(C36331k8.A0M(C36331k8.A0L(C90484aE.A0e(C36331k8.A0K(C36331k8.A0J(22, this.A09, A1G), this.A03, A1G), this.A0A, A1G), this.A06, A1G), this.A0B, A1G), this.A0C, A1G), this.A0D, A1G), this.A04, A1G), this.A0E, A1G), this.A0F, A1G), this.A0G, A1G), this.A00, A1G), this.A07, A1G), this.A0H, A1G), this.A0I, A1G), this.A0J, A1G), this.A0K, A1G), this.A05, A1G), this.A0L);
        C36321k7.A1b(A1G, 12);
        A1G.put(16, this.A0M);
        A1G.put(C36341k9.A0b(C36341k9.A0a(C36331k8.A0V(C36431kI.A14(), this.A01, A1G), this.A02, A1G), this.A0N, A1G), this.A08);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamExtensionScreenProgress {");
        C20910yM.A00(this.A09, "adContext", A0u);
        C20910yM.A00(C36331k8.A0h(this.A03), "bizPlatform", A0u);
        C20910yM.A00(this.A0A, "businessOwnerJid", A0u);
        C20910yM.A00(this.A06, "clickSequenceNumber", A0u);
        C20910yM.A00(this.A0B, "embeddedError", A0u);
        C20910yM.A00(this.A0C, "embeddedFlow", A0u);
        C20910yM.A00(this.A0D, "embeddedFlowType", A0u);
        C20910yM.A00(C36331k8.A0h(this.A04), "entryPointConversationInitiated", A0u);
        C20910yM.A00(this.A0E, "entryPointConversionApp", A0u);
        C20910yM.A00(this.A0F, "entryPointConversionSource", A0u);
        C20910yM.A00(this.A0G, "extensionCategory", A0u);
        C20910yM.A00(this.A00, "extensionRestoredFromCache", A0u);
        C20910yM.A00(this.A07, "extensionScreenLength", A0u);
        C20910yM.A00(this.A0H, "extensionStatus", A0u);
        C20910yM.A00(this.A0I, "extensionsFlowId", A0u);
        C20910yM.A00(this.A0J, "extensionsMessageId", A0u);
        C20910yM.A00(this.A0K, "extensionsSessionId", A0u);
        C20910yM.A00(C36331k8.A0h(this.A05), "flowEntryPoint", A0u);
        C20910yM.A00(this.A0L, "flowStatusExit", A0u);
        C20910yM.A00(this.A0M, "hsmTag", A0u);
        C20910yM.A00(this.A01, "isSuccessScreen", A0u);
        C20910yM.A00(this.A02, "isTemplate", A0u);
        C20910yM.A00(this.A0N, "screenProgress", A0u);
        return C36321k7.A0C(this.A08, "sequenceNumber", A0u);
    }
}
