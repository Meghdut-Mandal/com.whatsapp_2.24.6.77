package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8cS  reason: invalid class name and case insensitive filesystem */
public final class C176648cS extends C20890yK {
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
    public Long A0J;
    public Long A0K;
    public Long A0L;
    public Long A0M;
    public Long A0N;
    public Long A0O;
    public Long A0P;
    public String A0Q;
    public String A0R;
    public String A0S;
    public String A0T;
    public String A0U;
    public String A0V;
    public String A0W;
    public String A0X;

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A00);
        r3.Bpz(2, this.A01);
        r3.Bpz(3, this.A0Q);
        r3.Bpz(4, this.A0R);
        r3.Bpz(5, this.A0S);
        r3.Bpz(6, this.A02);
        r3.Bpz(7, this.A0T);
        r3.Bpz(8, this.A03);
        r3.Bpz(9, this.A04);
        r3.Bpz(10, this.A05);
        r3.Bpz(11, this.A06);
        r3.Bpz(13, this.A07);
        r3.Bpz(14, this.A08);
        r3.Bpz(15, this.A09);
        r3.Bpz(16, this.A0A);
        r3.Bpz(17, this.A0B);
        r3.Bpz(18, this.A0C);
        r3.Bpz(19, this.A0D);
        r3.Bpz(20, this.A0E);
        r3.Bpz(21, this.A0F);
        r3.Bpz(22, this.A0G);
        r3.Bpz(23, this.A0H);
        r3.Bpz(24, this.A0I);
        r3.Bpz(25, this.A0J);
        r3.Bpz(26, this.A0K);
        r3.Bpz(27, this.A0U);
        r3.Bpz(28, this.A0L);
        r3.Bpz(29, this.A0V);
        r3.Bpz(30, this.A0W);
        r3.Bpz(31, this.A0M);
        r3.Bpz(32, this.A0N);
        r3.Bpz(33, this.A0O);
        r3.Bpz(34, this.A0P);
        r3.Bpz(35, this.A0X);
    }

    public C176648cS() {
        super(4028, C20890yK.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C90484aE.A0e(C90484aE.A0d(C90474aD.A0X(C36411kG.A0s(C36401kF.A0l(C36381kD.A0o(C36371kC.A0q(C36351kA.A0t(C36351kA.A0s(C36341k9.A0b(C36341k9.A0a(C36331k8.A0V(C36331k8.A0T(C36331k8.A0S(C36331k8.A0R(C36331k8.A0Q(C36331k8.A0P(C36331k8.A0O(C36331k8.A0N(C36331k8.A0M(C36331k8.A0L(C36331k8.A0K(C36361kB.A0i(), this.A00, A1G), this.A01, A1G), this.A0Q, A1G), this.A0R, A1G), this.A0S, A1G), this.A02, A1G), this.A0T, A1G), this.A03, A1G), this.A04, A1G), this.A05, A1G), this.A06, A1G), this.A07, A1G), this.A08, A1G), this.A09, A1G), this.A0A, A1G), this.A0B, A1G), this.A0C, A1G), this.A0D, A1G), this.A0E, A1G), this.A0F, A1G), this.A0G, A1G), this.A0H, A1G), this.A0I);
        A1G.put(25, this.A0J);
        A1G.put(C165597tg.A0d(), this.A0K);
        A1G.put(27, this.A0U);
        A1G.put(28, this.A0L);
        A1G.put(29, this.A0V);
        A1G.put(30, this.A0W);
        A1G.put(31, this.A0M);
        A1G.put(32, this.A0N);
        A1G.put(33, this.A0O);
        A1G.put(34, this.A0P);
        A1G.put(35, this.A0X);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamArfxRenderTime {");
        C20910yM.A00(this.A00, "averageFrameTimeMs", A0u);
        C20910yM.A00(this.A01, "averageRenderTimeMs", A0u);
        C20910yM.A00(this.A0Q, "cameraProductName", A0u);
        C20910yM.A00(this.A0R, "deliveryOperationId", A0u);
        C20910yM.A00(this.A0S, "effectInstanceId", A0u);
        C20910yM.A00(this.A02, "effectLoadTimeMs", A0u);
        C20910yM.A00(this.A0T, "effectSessionId", A0u);
        C20910yM.A00(this.A03, "firstFrameRenderTimeMs", A0u);
        C20910yM.A00(this.A04, "foregroundTimeDetailFrontAverageFrameTimeMs", A0u);
        C20910yM.A00(this.A05, "foregroundTimeDetailFrontAverageRenderTimeMs", A0u);
        C20910yM.A00(this.A06, "foregroundTimeDetailFrontFpsAverage", A0u);
        C20910yM.A00(this.A07, "foregroundTimeDetailFrontFpsFrameCount", A0u);
        C20910yM.A00(this.A08, "foregroundTimeDetailFrontFpsOutlierFps", A0u);
        C20910yM.A00(this.A09, "foregroundTimeDetailFrontFpsP0", A0u);
        C20910yM.A00(this.A0A, "foregroundTimeDetailFrontFpsP1", A0u);
        C20910yM.A00(this.A0B, "foregroundTimeDetailFrontFpsP10", A0u);
        C20910yM.A00(this.A0C, "foregroundTimeDetailFrontFpsP100", A0u);
        C20910yM.A00(this.A0D, "foregroundTimeDetailFrontFpsP50", A0u);
        C20910yM.A00(this.A0E, "foregroundTimeDetailFrontFrameCount", A0u);
        C20910yM.A00(this.A0F, "foregroundTimeDetailFrontFrameTimeVarianceMs", A0u);
        C20910yM.A00(this.A0G, "foregroundTimeDetailFrontVarianceMs", A0u);
        C20910yM.A00(this.A0H, "frameCount", A0u);
        C20910yM.A00(this.A0I, "frameTimeVarianceMs", A0u);
        C20910yM.A00(this.A0J, "initializationDurationMs", A0u);
        C20910yM.A00(this.A0K, "inputSizeFrames", A0u);
        C20910yM.A00(this.A0U, "inputSizeSize", A0u);
        C20910yM.A00(this.A0L, "outputSizeFrames", A0u);
        C20910yM.A00(this.A0V, "outputSizeSize", A0u);
        C20910yM.A00(this.A0W, "productSessionId", A0u);
        C20910yM.A00(this.A0M, "servicesLoadTimeMs", A0u);
        C20910yM.A00(this.A0N, "sessionDurationMs", A0u);
        C20910yM.A00(this.A0O, "varianceMs", A0u);
        C20910yM.A00(this.A0P, "virtualInputSizeFrames", A0u);
        return C36321k7.A0C(this.A0X, "virtualInputSizeSize", A0u);
    }
}
