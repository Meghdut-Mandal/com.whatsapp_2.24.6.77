package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.58q  reason: invalid class name and case insensitive filesystem */
public final class C1041958q extends C20890yK {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
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

    public C1041958q() {
        super(4646, new C18950u5(1, 20, 1000, false), 2, 113760892);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A06);
        r3.Bpz(2, this.A07);
        r3.Bpz(3, this.A08);
        r3.Bpz(4, this.A00);
        r3.Bpz(5, this.A09);
        r3.Bpz(6, this.A01);
        r3.Bpz(8, this.A0A);
        r3.Bpz(9, this.A0B);
        r3.Bpz(10, this.A0C);
        r3.Bpz(11, this.A02);
        r3.Bpz(12, this.A03);
        r3.Bpz(13, this.A0D);
        r3.Bpz(14, this.A0E);
        r3.Bpz(15, this.A04);
        r3.Bpz(16, this.A0F);
        r3.Bpz(17, this.A0G);
        r3.Bpz(18, this.A0H);
        r3.Bpz(19, this.A0I);
        r3.Bpz(20, this.A0J);
        r3.Bpz(21, this.A0K);
        r3.Bpz(22, this.A0L);
        r3.Bpz(23, this.A05);
        r3.Bpz(24, this.A0M);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0O(C36331k8.A0N(C36331k8.A0M(C36331k8.A0L(C36331k8.A0K(C36361kB.A0i(), this.A06, A1G), this.A07, A1G), this.A08, A1G), this.A00, A1G), this.A09, A1G), this.A01);
        C36321k7.A1b(A1G, 7);
        A1G.put(C90484aE.A0e(C90484aE.A0d(C90474aD.A0X(C36411kG.A0s(C36401kF.A0l(C36381kD.A0o(C36371kC.A0q(C36351kA.A0t(C36351kA.A0s(C36341k9.A0b(C36341k9.A0a(C36331k8.A0V(C36331k8.A0U(C36331k8.A0T(C36331k8.A0S(C36331k8.A0R(C36391kE.A0r(), this.A0A, A1G), this.A0B, A1G), this.A0C, A1G), this.A02, A1G), this.A03, A1G), this.A0D, A1G), this.A0E, A1G), this.A04, A1G), this.A0F, A1G), this.A0G, A1G), this.A0H, A1G), this.A0I, A1G), this.A0J, A1G), this.A0K, A1G), this.A0L, A1G), this.A05, A1G), this.A0M);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamWamediaMp4opsEvent {");
        C20910yM.A00(this.A06, "wamediaMp4opsAudioStreamAverageBitrateKbps", A0u);
        C20910yM.A00(this.A07, "wamediaMp4opsAudioStreamNumChannels", A0u);
        C20910yM.A00(this.A08, "wamediaMp4opsAudioStreamSamplingRate", A0u);
        C20910yM.A00(C36331k8.A0h(this.A00), "wamediaMp4opsAudioStreamSubtype", A0u);
        C20910yM.A00(this.A09, "wamediaMp4opsAudioStreamTrackId", A0u);
        C20910yM.A00(C36331k8.A0h(this.A01), "wamediaMp4opsAudioStreamType", A0u);
        C20910yM.A00(this.A0A, "wamediaMp4opsErrorTolerance", A0u);
        C20910yM.A00(this.A0B, "wamediaMp4opsFileSize", A0u);
        C20910yM.A00(this.A0C, "wamediaMp4opsFileSizeOut", A0u);
        C20910yM.A00(C36331k8.A0h(this.A02), "wamediaMp4opsFileType", A0u);
        C20910yM.A00(C36331k8.A0h(this.A03), "wamediaMp4opsImpl", A0u);
        C20910yM.A00(this.A0D, "wamediaMp4opsReturnValue", A0u);
        C20910yM.A00(this.A0E, "wamediaMp4opsTimeElapsedNs", A0u);
        C20910yM.A00(C36331k8.A0h(this.A04), "wamediaMp4opsType", A0u);
        C20910yM.A00(this.A0F, "wamediaMp4opsVideoStreamAverageBitrateKpbs", A0u);
        C20910yM.A00(this.A0G, "wamediaMp4opsVideoStreamFramePerKseconds", A0u);
        C20910yM.A00(this.A0H, "wamediaMp4opsVideoStreamHeight", A0u);
        C20910yM.A00(this.A0I, "wamediaMp4opsVideoStreamLevelIdc", A0u);
        C20910yM.A00(this.A0J, "wamediaMp4opsVideoStreamProfileIdc", A0u);
        C20910yM.A00(this.A0K, "wamediaMp4opsVideoStreamRotation", A0u);
        C20910yM.A00(this.A0L, "wamediaMp4opsVideoStreamTrackId", A0u);
        C20910yM.A00(C36331k8.A0h(this.A05), "wamediaMp4opsVideoStreamType", A0u);
        return C36321k7.A0C(this.A0M, "wamediaMp4opsVideoStreamWidth", A0u);
    }
}
