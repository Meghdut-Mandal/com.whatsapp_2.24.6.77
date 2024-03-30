package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2T7  reason: invalid class name */
public final class AnonymousClass2T7 extends C20890yK {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public Boolean A05;
    public Boolean A06;
    public Boolean A07;
    public Boolean A08;
    public Boolean A09;
    public Boolean A0A;
    public Boolean A0B;
    public Boolean A0C;
    public Boolean A0D;
    public Integer A0E;
    public Integer A0F;
    public Integer A0G;
    public Integer A0H;
    public Integer A0I;
    public Integer A0J;
    public Integer A0K;
    public Long A0L;
    public Long A0M;
    public Long A0N;
    public Long A0O;
    public Long A0P;
    public Long A0Q;
    public Long A0R;
    public Long A0S;
    public Long A0T;
    public Long A0U;
    public Long A0V;
    public Long A0W;
    public Long A0X;
    public Long A0Y;

    public AnonymousClass2T7() {
        super(1994, C36441kJ.A0p(1, 1000, 2000), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(16, this.A00);
        r3.Bpz(36, this.A0L);
        r3.Bpz(26, this.A0E);
        r3.Bpz(11, this.A0M);
        r3.Bpz(12, this.A0N);
        r3.Bpz(1, this.A0O);
        r3.Bpz(42, this.A0F);
        r3.Bpz(15, this.A01);
        r3.Bpz(21, this.A0P);
        r3.Bpz(17, this.A0G);
        r3.Bpz(33, this.A02);
        r3.Bpz(27, this.A03);
        r3.Bpz(41, this.A04);
        r3.Bpz(9, this.A05);
        r3.Bpz(8, this.A06);
        r3.Bpz(24, this.A07);
        r3.Bpz(29, this.A08);
        r3.Bpz(18, this.A0Q);
        r3.Bpz(3, this.A0H);
        r3.Bpz(30, this.A09);
        r3.Bpz(31, this.A0A);
        r3.Bpz(4, this.A0I);
        r3.Bpz(14, this.A0B);
        r3.Bpz(37, this.A0R);
        r3.Bpz(34, this.A0S);
        r3.Bpz(28, this.A0C);
        r3.Bpz(39, this.A0T);
        r3.Bpz(13, this.A0U);
        r3.Bpz(10, this.A0V);
        r3.Bpz(2, this.A0J);
        r3.Bpz(40, this.A0W);
        r3.Bpz(23, this.A0X);
        r3.Bpz(25, this.A0D);
        r3.Bpz(19, this.A0Y);
        r3.Bpz(38, this.A0K);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(16, this.A00);
        C36331k8.A1Q(C36341k9.A0c(A1G, 32), A1G, 35);
        A1G.put(36, this.A0L);
        A1G.put(C36331k8.A0J(C36331k8.A0U(C36331k8.A0T(26, this.A0E, A1G), this.A0M, A1G), this.A0N, A1G), this.A0O);
        A1G.put(C36351kA.A0t(C36411kG.A0s(C36341k9.A0b(42, this.A0F, A1G), this.A01, A1G), this.A0P, A1G), this.A0G);
        A1G.put(33, this.A02);
        A1G.put(27, this.A03);
        A1G.put(C36331k8.A0Q(C36331k8.A0R(41, this.A04, A1G), this.A05, A1G), this.A06);
        A1G.put(24, this.A07);
        A1G.put(C36331k8.A0L(C36371kC.A0q(29, this.A08, A1G), this.A0Q, A1G), this.A0H);
        A1G.put(30, this.A09);
        A1G.put(C36341k9.A0a(C36331k8.A0M(31, this.A0A, A1G), this.A0I, A1G), this.A0B);
        A1G.put(37, this.A0R);
        A1G.put(34, this.A0S);
        A1G.put(28, this.A0C);
        A1G.put(C36331k8.A0K(C36331k8.A0S(C36331k8.A0V(39, this.A0T, A1G), this.A0U, A1G), this.A0V, A1G), this.A0J);
        A1G.put(40, this.A0W);
        A1G.put(23, this.A0X);
        A1G.put(C36431kI.A14(), this.A0D);
        C36321k7.A1b(A1G, 20);
        A1G.put(19, this.A0Y);
        A1G.put(38, this.A0K);
        C36321k7.A1b(A1G, 43);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamAndroidMessageSendPerf {");
        C20910yM.A00(this.A00, "appRestart", A0u);
        C20910yM.A00(this.A0L, "deviceCount", A0u);
        C20910yM.A00(C36331k8.A0h(this.A0E), "deviceSizeBucket", A0u);
        C20910yM.A00(this.A0M, "durationAbs", A0u);
        C20910yM.A00(this.A0N, "durationRelative", A0u);
        C20910yM.A00(this.A0O, "durationT", A0u);
        C20910yM.A00(C36331k8.A0h(this.A0F), "editType", A0u);
        C20910yM.A00(this.A01, "fetchPrekeys", A0u);
        C20910yM.A00(this.A0P, "fetchPrekeysPercentage", A0u);
        C20910yM.A00(C36331k8.A0h(this.A0G), "groupSizeBucket", A0u);
        C20910yM.A00(this.A02, "isDirectedMessage", A0u);
        C20910yM.A00(this.A03, "isE2eBackfill", A0u);
        C20910yM.A00(this.A04, "isLid", A0u);
        C20910yM.A00(this.A05, "isMessageFanout", A0u);
        C20910yM.A00(this.A06, "isMessageForward", A0u);
        C20910yM.A00(this.A07, "isRevokeMessage", A0u);
        C20910yM.A00(this.A08, "isViewOnce", A0u);
        C20910yM.A00(this.A0Q, "jobsInQueue", A0u);
        C36441kJ.A1H(C36331k8.A0h(this.A0H), A0u);
        C20910yM.A00(this.A09, "messageIsFirstUserMessage", A0u);
        C20910yM.A00(this.A0A, "messageIsInvisible", A0u);
        C20910yM.A00(C36331k8.A0h(this.A0I), "messageType", A0u);
        C20910yM.A00(this.A0B, "networkWasDisconnected", A0u);
        C20910yM.A00(this.A0R, "participantCount", A0u);
        C20910yM.A00(this.A0S, "phoneCores", A0u);
        C20910yM.A00(this.A0C, "prekeysEligibleForPrallelProcessing", A0u);
        C20910yM.A00(this.A0T, "receiverDeviceCount", A0u);
        C20910yM.A00(this.A0U, "sendCount", A0u);
        C20910yM.A00(this.A0V, "sendRetryCount", A0u);
        C20910yM.A00(C36331k8.A0h(this.A0J), "sendStage", A0u);
        C20910yM.A00(this.A0W, "senderDeviceCount", A0u);
        C20910yM.A00(this.A0X, "senderKeyDistributionCountPercentage", A0u);
        C20910yM.A00(this.A0D, "sessionsMissingWhenComposing", A0u);
        C20910yM.A00(this.A0Y, "threadsInExecution", A0u);
        return C36321k7.A0C(C36331k8.A0h(this.A0K), "typeOfGroup", A0u);
    }
}
