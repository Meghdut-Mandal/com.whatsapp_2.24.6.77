package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8cQ  reason: invalid class name and case insensitive filesystem */
public final class C176628cQ extends C20890yK {
    public Boolean A00;
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
    public Long A0Q;

    public C176628cQ() {
        super(4274, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(27, this.A00);
        r3.Bpz(1, this.A01);
        r3.Bpz(2, this.A02);
        r3.Bpz(3, this.A03);
        r3.Bpz(4, this.A04);
        r3.Bpz(5, this.A05);
        r3.Bpz(6, this.A06);
        r3.Bpz(7, this.A07);
        r3.Bpz(8, this.A08);
        r3.Bpz(9, this.A09);
        r3.Bpz(10, this.A0A);
        r3.Bpz(11, this.A0B);
        r3.Bpz(12, this.A0C);
        r3.Bpz(13, this.A0D);
        r3.Bpz(14, this.A0E);
        r3.Bpz(15, this.A0F);
        r3.Bpz(16, this.A0G);
        r3.Bpz(17, this.A0H);
        r3.Bpz(18, this.A0I);
        r3.Bpz(19, this.A0J);
        r3.Bpz(20, this.A0K);
        r3.Bpz(21, this.A0L);
        r3.Bpz(22, this.A0M);
        r3.Bpz(23, this.A0N);
        r3.Bpz(24, this.A0O);
        r3.Bpz(25, this.A0P);
        r3.Bpz(26, this.A0Q);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C90484aE.A0e(C90484aE.A0d(C90474aD.A0X(C36411kG.A0s(C36401kF.A0l(C36381kD.A0o(C36371kC.A0q(C36351kA.A0t(C36351kA.A0s(C36341k9.A0b(C36341k9.A0a(C36331k8.A0V(C36331k8.A0U(C36331k8.A0T(C36331k8.A0S(C36331k8.A0R(C36331k8.A0Q(C36331k8.A0P(C36331k8.A0O(C36331k8.A0N(C36331k8.A0M(C36331k8.A0L(C36331k8.A0K(C36331k8.A0J(27, this.A00, A1G), this.A01, A1G), this.A02, A1G), this.A03, A1G), this.A04, A1G), this.A05, A1G), this.A06, A1G), this.A07, A1G), this.A08, A1G), this.A09, A1G), this.A0A, A1G), this.A0B, A1G), this.A0C, A1G), this.A0D, A1G), this.A0E, A1G), this.A0F, A1G), this.A0G, A1G), this.A0H, A1G), this.A0I, A1G), this.A0J, A1G), this.A0K, A1G), this.A0L, A1G), this.A0M, A1G), this.A0N, A1G), this.A0O);
        A1G.put(25, this.A0P);
        A1G.put(C165597tg.A0d(), this.A0Q);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamMediaEngagementSentDaily {");
        C20910yM.A00(this.A00, "hdMediaTooltipSeen", A0u);
        C20910yM.A00(this.A01, "numAudioSent", A0u);
        C20910yM.A00(this.A02, "numDocsSent", A0u);
        C20910yM.A00(this.A03, "numDocsSentLte", A0u);
        C20910yM.A00(this.A04, "numDocsSentWifi", A0u);
        C20910yM.A00(this.A05, "numExternalShare", A0u);
        C20910yM.A00(this.A06, "numGifSent", A0u);
        C20910yM.A00(this.A07, "numLargeDocsNonWifi", A0u);
        C20910yM.A00(this.A08, "numLargeDocsSent", A0u);
        C20910yM.A00(this.A09, "numMediaSentAsDocs", A0u);
        C20910yM.A00(this.A0A, "numMediaSentChat", A0u);
        C20910yM.A00(this.A0B, "numMediaSentCommunity", A0u);
        C20910yM.A00(this.A0C, "numMediaSentGroup", A0u);
        C20910yM.A00(this.A0D, "numMediaSentStatus", A0u);
        C20910yM.A00(this.A0E, "numMediaUploadFailed", A0u);
        C20910yM.A00(this.A0F, "numPhotoHdSent", A0u);
        C20910yM.A00(this.A0G, "numPhotoSent", A0u);
        C20910yM.A00(this.A0H, "numPhotoSentLte", A0u);
        C20910yM.A00(this.A0I, "numPhotoSentWifi", A0u);
        C20910yM.A00(this.A0J, "numPhotoVoSent", A0u);
        C20910yM.A00(this.A0K, "numSticker", A0u);
        C20910yM.A00(this.A0L, "numUrl", A0u);
        C20910yM.A00(this.A0M, "numVideoHdSent", A0u);
        C20910yM.A00(this.A0N, "numVideoSent", A0u);
        C20910yM.A00(this.A0O, "numVideoSentLte", A0u);
        C20910yM.A00(this.A0P, "numVideoSentWifi", A0u);
        return C36321k7.A0C(this.A0Q, "numVideoVoSent", A0u);
    }
}
