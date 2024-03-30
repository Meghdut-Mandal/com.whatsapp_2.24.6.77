package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.58p  reason: invalid class name and case insensitive filesystem */
public final class C1041858p extends C20890yK {
    public Long A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
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
    public Long A0H;
    public Long A0I;

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(34, this.A00);
        r3.Bpz(36, this.A01);
        r3.Bpz(37, this.A02);
        r3.Bpz(1, this.A03);
        r3.Bpz(2, this.A04);
        r3.Bpz(4, this.A05);
        r3.Bpz(5, this.A06);
        r3.Bpz(6, this.A07);
        r3.Bpz(7, this.A08);
        r3.Bpz(8, this.A09);
        r3.Bpz(9, this.A0A);
        r3.Bpz(10, this.A0B);
        r3.Bpz(13, this.A0C);
        r3.Bpz(14, this.A0D);
        r3.Bpz(15, this.A0E);
        r3.Bpz(16, this.A0F);
        r3.Bpz(17, this.A0G);
        r3.Bpz(20, this.A0H);
        r3.Bpz(21, this.A0I);
    }

    public C1041858p() {
        super(4224, C20890yK.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(34, this.A00);
        C36321k7.A1b(A1G, 35);
        A1G.put(36, this.A01);
        A1G.put(37, this.A02);
        C36321k7.A1b(A1G, 38);
        A1G.put(C36331k8.A0K(C36361kB.A0i(), this.A03, A1G), this.A04);
        C36321k7.A1b(A1G, 3);
        A1G.put(C36331k8.A0R(C36331k8.A0Q(C36331k8.A0P(C36331k8.A0O(C36331k8.A0N(C36371kC.A0o(), this.A05, A1G), this.A06, A1G), this.A07, A1G), this.A08, A1G), this.A09, A1G), this.A0A);
        C36321k7.A1b(A1G, 39);
        A1G.put(C36351kA.A0t(C36351kA.A0s(C36341k9.A0b(C36341k9.A0a(C36331k8.A0V(C36331k8.A0U(C36331k8.A0T(C36401kF.A0j(), this.A0B, A1G), (Object) null, A1G), (Object) null, A1G), this.A0C, A1G), this.A0D, A1G), this.A0E, A1G), this.A0F, A1G), this.A0G);
        C36331k8.A1Q(C36341k9.A0c(A1G, 18), A1G, 19);
        A1G.put(C36411kG.A0s(20, this.A0H, A1G), this.A0I);
        C36321k7.A1b(A1G, 22);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamScreenShareInfo {");
        C20910yM.A00(this.A00, "audShareDialogCount", A0u);
        C20910yM.A00(this.A01, "audShareIssue", A0u);
        C20910yM.A00(this.A02, "audShareLastIssue", A0u);
        C20910yM.A00(this.A03, "ssAvgCaptureFps", A0u);
        C20910yM.A00(this.A04, "ssFreezeCount", A0u);
        C20910yM.A00(this.A05, "ssIssue", A0u);
        C20910yM.A00(this.A06, "ssLastIssue", A0u);
        C20910yM.A00(this.A07, "ssPermission", A0u);
        C20910yM.A00(this.A08, "ssPinchToZoom", A0u);
        C20910yM.A00(this.A09, "ssReceiverLandscapeDuration", A0u);
        C20910yM.A00(this.A0A, "ssReceiverPipDuration", A0u);
        C20910yM.A00(this.A0B, "ssSharerPipDuration", A0u);
        C20910yM.A00(this.A0C, "ssSharerStopReason", A0u);
        C20910yM.A00(this.A0D, "ssStartDuration", A0u);
        C20910yM.A00(this.A0E, "ssStopDuration", A0u);
        C20910yM.A00(this.A0F, "ssTimeToFirstFrame", A0u);
        C20910yM.A00(this.A0G, "ssUserOpenedPickerCount", A0u);
        C20910yM.A00(this.A0H, "ssUserStartScreenShareCount", A0u);
        return C36321k7.A0C(this.A0I, "ssUserStopScreenShareCount", A0u);
    }
}
