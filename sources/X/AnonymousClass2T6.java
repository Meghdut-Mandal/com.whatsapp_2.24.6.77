package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2T6  reason: invalid class name */
public final class AnonymousClass2T6 extends C20890yK {
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
    public Integer A0A;
    public Integer A0B;
    public Integer A0C;
    public Integer A0D;
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

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(28, this.A0A);
        r3.Bpz(37, this.A0B);
        r3.Bpz(16, this.A0L);
        r3.Bpz(10, this.A0C);
        r3.Bpz(14, this.A0D);
        r3.Bpz(25, this.A0E);
        r3.Bpz(13, this.A0M);
        r3.Bpz(26, this.A0F);
        r3.Bpz(27, this.A0G);
        r3.Bpz(36, this.A00);
        r3.Bpz(19, this.A01);
        r3.Bpz(18, this.A02);
        r3.Bpz(24, this.A03);
        r3.Bpz(9, this.A04);
        r3.Bpz(33, (Object) null);
        r3.Bpz(34, (Object) null);
        r3.Bpz(4, this.A05);
        r3.Bpz(23, this.A06);
        r3.Bpz(5, this.A07);
        r3.Bpz(2, this.A0H);
        r3.Bpz(6, this.A0N);
        r3.Bpz(7, this.A0O);
        r3.Bpz(1, this.A0I);
        r3.Bpz(8, this.A08);
        r3.Bpz(30, this.A0P);
        r3.Bpz(22, this.A0Q);
        r3.Bpz(17, this.A0R);
        r3.Bpz(12, this.A0S);
        r3.Bpz(20, this.A0J);
        r3.Bpz(11, this.A0T);
        r3.Bpz(35, (Object) null);
        r3.Bpz(29, this.A09);
        r3.Bpz(21, this.A0K);
    }

    public AnonymousClass2T6() {
        super(450, C20890yK.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(28, this.A0A);
        A1G.put(37, this.A0B);
        C36321k7.A1b(A1G, 38);
        A1G.put(C36341k9.A0a(C36331k8.A0S(16, this.A0L, A1G), this.A0C, A1G), this.A0D);
        A1G.put(C36331k8.A0V(C36431kI.A14(), this.A0E, A1G), this.A0M);
        A1G.put(26, this.A0F);
        A1G.put(27, this.A0G);
        C36321k7.A1b(A1G, 39);
        A1G.put(C36371kC.A0q(C36381kD.A0o(36, this.A00, A1G), this.A01, A1G), this.A02);
        A1G.put(C36331k8.A0R(24, this.A03, A1G), this.A04);
        A1G.put(C36331k8.A0M(34, C36341k9.A0c(A1G, 33), A1G), this.A05);
        A1G.put(C36331k8.A0K(C36331k8.A0N(23, this.A06, A1G), this.A07, A1G), this.A0H);
        C36321k7.A1b(A1G, 15);
        C36321k7.A1I(C36331k8.A0Q(C36331k8.A0J(C36331k8.A0P(C36381kD.A0n(), this.A0N, A1G), this.A0O, A1G), this.A0I, A1G), this.A08, A1G);
        A1G.put(30, this.A0P);
        C36321k7.A1b(A1G, 40);
        A1G.put(C36331k8.A0T(C36401kF.A0l(C36331k8.A0U(C36351kA.A0t(22, this.A0Q, A1G), this.A0R, A1G), this.A0S, A1G), this.A0J, A1G), this.A0T);
        C36321k7.A1b(A1G, 35);
        A1G.put(29, this.A09);
        C36331k8.A1Q(C36341k9.A0c(A1G, 31), A1G, 32);
        A1G.put(21, this.A0K);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamMessageReceive {");
        C20910yM.A00(C36331k8.A0h(this.A0A), "agentEngagementType", A0u);
        C20910yM.A00(C36331k8.A0h(this.A0B), "botType", A0u);
        C20910yM.A00(this.A0L, "deviceCount", A0u);
        C20910yM.A00(C36331k8.A0h(this.A0C), "deviceSizeBucket", A0u);
        C20910yM.A00(C36331k8.A0h(this.A0D), "disappearingChatInitiator", A0u);
        C20910yM.A00(C36331k8.A0h(this.A0E), "editType", A0u);
        C20910yM.A00(this.A0M, "ephemeralityDuration", A0u);
        C20910yM.A00(C36331k8.A0h(this.A0F), "ephemeralityInitiator", A0u);
        C20910yM.A00(C36331k8.A0h(this.A0G), "ephemeralityTriggerAction", A0u);
        C20910yM.A00(this.A00, "isAComment", A0u);
        C20910yM.A00(this.A01, "isAReply", A0u);
        C20910yM.A00(this.A02, "isForwardedForward", A0u);
        C20910yM.A00(this.A03, "isLid", A0u);
        C20910yM.A00(this.A04, "isViewOnce", A0u);
        String str = null;
        AnonymousClass00C.A0D("localAddressingMode", 1);
        AnonymousClass00C.A0D("messageAddressingMode", 1);
        C20910yM.A00(this.A05, "messageIsInternational", A0u);
        C20910yM.A00(this.A06, "messageIsInvisible", A0u);
        C20910yM.A00(this.A07, "messageIsOffline", A0u);
        Integer num = this.A0H;
        if (num != null) {
            str = num.toString();
        }
        C20910yM.A00(str, "messageMediaType", A0u);
        C20910yM.A00(this.A0N, "messageReceiveT0", A0u);
        C20910yM.A00(this.A0O, "messageReceiveT1", A0u);
        C20910yM.A00(C36331k8.A0h(this.A0I), "messageType", A0u);
        C20910yM.A00(this.A08, "mutedGroupMessage", A0u);
        C20910yM.A00(this.A0P, "offlineCount", A0u);
        C20910yM.A00(this.A0Q, "paddingBytesSize", A0u);
        C20910yM.A00(this.A0R, "participantCount", A0u);
        C20910yM.A00(this.A0S, "receiverDefaultDisappearingDuration", A0u);
        C20910yM.A00(C36331k8.A0h(this.A0J), "revokeType", A0u);
        C20910yM.A00(this.A0T, "senderDefaultDisappearingDuration", A0u);
        String str2 = null;
        AnonymousClass00C.A0D("serverAddressingMode", 1);
        C20910yM.A00(this.A09, "stickerIsAi", A0u);
        Integer num2 = this.A0K;
        if (num2 != null) {
            str2 = num2.toString();
        }
        return C36321k7.A0C(str2, "typeOfGroup", A0u);
    }
}
