package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.58v  reason: invalid class name and case insensitive filesystem */
public final class C1042458v extends C20890yK {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
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
    public Long A0J;
    public Long A0K;
    public Long A0L;
    public Long A0M;
    public Long A0N;
    public Long A0O;
    public Long A0P;
    public String A0Q;
    public String A0R;

    public C1042458v() {
        super(1138, new C18950u5(1, 5, 20, false), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(9, this.A05);
        r3.Bpz(10, this.A06);
        r3.Bpz(8, this.A07);
        r3.Bpz(11, this.A08);
        r3.Bpz(7, this.A09);
        r3.Bpz(17, this.A0A);
        r3.Bpz(14, this.A0Q);
        r3.Bpz(1, this.A00);
        r3.Bpz(20, this.A0B);
        r3.Bpz(26, this.A01);
        r3.Bpz(15, this.A02);
        r3.Bpz(24, this.A0C);
        r3.Bpz(23, this.A0D);
        r3.Bpz(27, this.A0E);
        r3.Bpz(25, this.A0F);
        r3.Bpz(13, this.A0R);
        r3.Bpz(22, this.A0G);
        r3.Bpz(19, this.A03);
        r3.Bpz(4, this.A0H);
        r3.Bpz(5, this.A0I);
        r3.Bpz(3, this.A0J);
        r3.Bpz(6, this.A0K);
        r3.Bpz(2, this.A0L);
        r3.Bpz(28, this.A0M);
        r3.Bpz(21, this.A0N);
        r3.Bpz(18, this.A0O);
        r3.Bpz(16, this.A0P);
        r3.Bpz(12, this.A04);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36401kF.A0l(C36331k8.A0J(C36341k9.A0a(C36351kA.A0t(C36331k8.A0P(C36331k8.A0T(C36331k8.A0Q(C36331k8.A0S(C36401kF.A0i(), this.A05, A1G), this.A06, A1G), this.A07, A1G), this.A08, A1G), this.A09, A1G), this.A0A, A1G), this.A0Q, A1G), this.A00, A1G), this.A0B);
        A1G.put(C90484aE.A0d(C90484aE.A0e(C36341k9.A0b(26, this.A01, A1G), this.A02, A1G), this.A0C, A1G), this.A0D);
        A1G.put(C90514aH.A0k(), this.A0E);
        A1G.put(C36331k8.A0U(C36351kA.A0s(C36371kC.A0q(C36411kG.A0s(C90504aG.A0d(C36331k8.A0K(C36331k8.A0O(C36331k8.A0L(C36331k8.A0N(C36331k8.A0M(C36381kD.A0o(C90474aD.A0X(C36331k8.A0V(C36431kI.A14(), this.A0F, A1G), this.A0R, A1G), this.A0G, A1G), this.A03, A1G), this.A0H, A1G), this.A0I, A1G), this.A0J, A1G), this.A0K, A1G), this.A0L, A1G), this.A0M, A1G), this.A0N, A1G), this.A0O, A1G), this.A0P, A1G), this.A04);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamAndroidMediaTranscodeEvent {");
        C20910yM.A00(this.A05, "dstBitrate", A0u);
        C20910yM.A00(this.A06, "dstDurationSec", A0u);
        C20910yM.A00(this.A07, "dstHeight", A0u);
        C20910yM.A00(this.A08, "dstSize", A0u);
        C20910yM.A00(this.A09, "dstWidth", A0u);
        C20910yM.A00(this.A0A, "durationMs", A0u);
        C20910yM.A00(this.A0Q, "errorType", A0u);
        C20910yM.A00(this.A00, "fileIsDoodle", A0u);
        C20910yM.A00(this.A0B, "firstScanSize", A0u);
        C20910yM.A00(this.A01, "hasStatusMessage", A0u);
        C20910yM.A00(this.A02, "isSuccess", A0u);
        C20910yM.A00(this.A0C, "lowQualitySize", A0u);
        C20910yM.A00(this.A0D, "maxEdge", A0u);
        C20910yM.A00(this.A0E, "mediaId", A0u);
        C20910yM.A00(this.A0F, "midQualitySize", A0u);
        C20910yM.A00(this.A0R, "operation", A0u);
        C20910yM.A00(this.A0G, "photoCompressionQuality", A0u);
        C20910yM.A00(this.A03, "progressiveJpeg", A0u);
        C20910yM.A00(this.A0H, "srcBitrate", A0u);
        C20910yM.A00(this.A0I, "srcDurationSec", A0u);
        C20910yM.A00(this.A0J, "srcHeight", A0u);
        C20910yM.A00(this.A0K, "srcSize", A0u);
        C20910yM.A00(this.A0L, "srcWidth", A0u);
        C20910yM.A00(this.A0M, "targetBitrate", A0u);
        C20910yM.A00(this.A0N, "thumbnailSize", A0u);
        C20910yM.A00(this.A0O, "totalQueueMs", A0u);
        C20910yM.A00(this.A0P, "transcodeMediaType", A0u);
        return C36321k7.A0C(this.A04, "transcoderSupported", A0u);
    }
}
