package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.58t  reason: invalid class name and case insensitive filesystem */
public final class C1042258t extends C20890yK {
    public Double A00;
    public Double A01;
    public Double A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public Integer A08;
    public Integer A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;
    public Long A0D;
    public Long A0E;
    public Long A0F;
    public Long A0G;
    public Long A0H;
    public Long A0I;
    public Long A0J;
    public Long A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public String A0P;

    public C1042258t() {
        super(4290, C36431kI.A0q(), 1, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A0L);
        r3.Bpz(2, this.A03);
        r3.Bpz(3, this.A04);
        r3.Bpz(4, this.A05);
        r3.Bpz(5, this.A0M);
        r3.Bpz(6, this.A0N);
        r3.Bpz(7, this.A0O);
        r3.Bpz(8, this.A0A);
        r3.Bpz(9, this.A0B);
        r3.Bpz(31, this.A06);
        r3.Bpz(10, this.A07);
        r3.Bpz(11, this.A08);
        r3.Bpz(12, this.A09);
        r3.Bpz(13, (Object) null);
        r3.Bpz(14, this.A00);
        r3.Bpz(15, this.A0P);
        r3.Bpz(16, this.A0C);
        r3.Bpz(17, this.A0D);
        r3.Bpz(18, this.A0E);
        r3.Bpz(19, this.A0F);
        r3.Bpz(23, this.A0G);
        r3.Bpz(24, this.A0H);
        r3.Bpz(27, this.A0I);
        r3.Bpz(32, this.A0J);
        r3.Bpz(30, this.A01);
        r3.Bpz(28, this.A0K);
        r3.Bpz(29, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0U(C36331k8.A0T(C36331k8.A0S(C90504aG.A0f(C36331k8.A0R(C36331k8.A0Q(C36331k8.A0P(C36331k8.A0O(C36331k8.A0N(C36331k8.A0M(C36331k8.A0L(C36331k8.A0K(C36361kB.A0i(), this.A0L, A1G), this.A03, A1G), this.A04, A1G), this.A05, A1G), this.A0M, A1G), this.A0N, A1G), this.A0O, A1G), this.A0A, A1G), this.A0B, A1G), this.A06, A1G), this.A07, A1G), this.A08, A1G), this.A09);
        C36321k7.A1b(A1G, 13);
        A1G.put(C36381kD.A0o(C36371kC.A0q(C36351kA.A0t(C36351kA.A0s(C36341k9.A0b(C36401kF.A0k(), this.A00, A1G), this.A0P, A1G), this.A0C, A1G), this.A0D, A1G), this.A0E, A1G), this.A0F);
        Object A0c = C36341k9.A0c(A1G, 20);
        C36331k8.A1Q(A0c, A1G, 21);
        C36331k8.A1Q(A0c, A1G, 22);
        A1G.put(C90484aE.A0e(23, this.A0G, A1G), this.A0H);
        C36331k8.A1Q(C36341k9.A0c(A1G, 25), A1G, 26);
        A1G.put(C90504aG.A0d(C90504aG.A0e(C90504aG.A0g(C90514aH.A0k(), this.A0I, A1G), this.A0J, A1G), this.A01, A1G), this.A0K);
        A1G.put(29, this.A02);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamWaFsChatTransfer {");
        C20910yM.A00(this.A0L, "fpmAttemptId", A0u);
        C20910yM.A00(C36331k8.A0h(this.A03), "fpmCancellationReason", A0u);
        C20910yM.A00(C36331k8.A0h(this.A04), "fpmDeviceRole", A0u);
        C20910yM.A00(C36331k8.A0h(this.A05), "fpmDonorAppBuild", A0u);
        C20910yM.A00(this.A0M, "fpmDonorAppVersion", A0u);
        C20910yM.A00(this.A0N, "fpmDonorDeviceName", A0u);
        C20910yM.A00(this.A0O, "fpmDonorOsVersion", A0u);
        C20910yM.A00(this.A0A, "fpmDonorYearClass2016", A0u);
        C20910yM.A00(this.A0B, "fpmDuration", A0u);
        C20910yM.A00(C36331k8.A0h(this.A06), "fpmEntryPoint", A0u);
        C20910yM.A00(C36331k8.A0h(this.A07), "fpmErrorCode", A0u);
        C20910yM.A00(C36331k8.A0h(this.A08), "fpmErrorPhase", A0u);
        C20910yM.A00(C36331k8.A0h(this.A09), "fpmEvent", A0u);
        AnonymousClass00C.A0D("fpmEventContext", 1);
        C20910yM.A00(this.A00, "fpmExportedDbSize", A0u);
        C20910yM.A00(this.A0P, "fpmFunnelId", A0u);
        C20910yM.A00(this.A0C, "fpmImportCntMediaFailed", A0u);
        C20910yM.A00(this.A0D, "fpmImportCntMediaImported", A0u);
        C20910yM.A00(this.A0E, "fpmImportCntMessagesFailed", A0u);
        C20910yM.A00(this.A0F, "fpmImportCntMessagesImported", A0u);
        C20910yM.A00(this.A0G, "fpmNumMediaAttemptToTransferred", A0u);
        C20910yM.A00(this.A0H, "fpmNumMediaTransferred", A0u);
        C20910yM.A00(this.A0I, "fpmProgress", A0u);
        C20910yM.A00(this.A0J, "fpmProtocolVersion", A0u);
        C20910yM.A00(this.A01, "fpmTotalTransferSize", A0u);
        C20910yM.A00(this.A0K, "storageAvailSize", A0u);
        return C36321k7.A0C(this.A02, "waDbSize", A0u);
    }
}
