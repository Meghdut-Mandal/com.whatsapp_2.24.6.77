package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Sw  reason: invalid class name and case insensitive filesystem */
public final class C45832Sw extends C20890yK {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public Integer A08;
    public Integer A09;
    public Integer A0A;
    public Integer A0B;
    public Integer A0C;
    public Integer A0D;
    public Long A0E;
    public Long A0F;

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(15, this.A04);
        r3.Bpz(19, this.A05);
        r3.Bpz(5, this.A06);
        r3.Bpz(6, this.A0E);
        r3.Bpz(4, this.A07);
        r3.Bpz(2, this.A08);
        r3.Bpz(8, this.A09);
        r3.Bpz(1, this.A00);
        r3.Bpz(13, this.A0A);
        r3.Bpz(20, this.A01);
        r3.Bpz(11, this.A02);
        r3.Bpz(16, (Object) null);
        r3.Bpz(17, (Object) null);
        r3.Bpz(7, this.A0B);
        r3.Bpz(9, this.A03);
        r3.Bpz(3, this.A0F);
        r3.Bpz(10, this.A0C);
        r3.Bpz(18, (Object) null);
        r3.Bpz(12, this.A0D);
    }

    public C45832Sw() {
        super(478, C20890yK.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0T(C36401kF.A0l(C36331k8.A0V(C36331k8.A0J(C36331k8.A0Q(C36331k8.A0K(C36331k8.A0M(C36331k8.A0O(C36331k8.A0N(C36381kD.A0o(C36421kH.A0W(), this.A04, A1G), this.A05, A1G), this.A06, A1G), this.A0E, A1G), this.A07, A1G), this.A08, A1G), this.A09, A1G), this.A00, A1G), this.A0A, A1G), this.A01, A1G), this.A02);
        A1G.put(C36331k8.A0U(C36341k9.A0a(C36371kC.A0q(C36331k8.A0S(C36331k8.A0L(C36331k8.A0R(C36331k8.A0P(C36431kI.A13(), C36341k9.A0c(A1G, 16), A1G), this.A0B, A1G), this.A03, A1G), this.A0F, A1G), this.A0C, A1G), (Object) null, A1G), (Object) null, A1G), this.A0D);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamE2eMessageRecv {");
        C20910yM.A00(C36331k8.A0h(this.A04), "agentEngagementType", A0u);
        C20910yM.A00(C36331k8.A0h(this.A05), "botType", A0u);
        C20910yM.A00(C36331k8.A0h(this.A06), "e2eCiphertextType", A0u);
        C20910yM.A00(this.A0E, "e2eCiphertextVersion", A0u);
        C20910yM.A00(C36331k8.A0h(this.A07), "e2eDestination", A0u);
        C20910yM.A00(C36331k8.A0h(this.A08), "e2eFailureReason", A0u);
        C20910yM.A00(C36331k8.A0h(this.A09), "e2eSenderType", A0u);
        C20910yM.A00(this.A00, "e2eSuccessful", A0u);
        C20910yM.A00(C36331k8.A0h(this.A0A), "editType", A0u);
        C20910yM.A00(this.A01, "isHostedChat", A0u);
        C20910yM.A00(this.A02, "isLid", A0u);
        String str = null;
        AnonymousClass00C.A0D("localAddressingMode", 1);
        AnonymousClass00C.A0D("messageAddressingMode", 1);
        Integer num = this.A0B;
        if (num != null) {
            str = num.toString();
        }
        C20910yM.A00(str, "messageMediaType", A0u);
        C20910yM.A00(this.A03, "offline", A0u);
        C20910yM.A00(this.A0F, "retryCount", A0u);
        C20910yM.A00(C36331k8.A0h(this.A0C), "revokeType", A0u);
        String str2 = null;
        AnonymousClass00C.A0D("serverAddressingMode", 1);
        Integer num2 = this.A0D;
        if (num2 != null) {
            str2 = num2.toString();
        }
        return C36321k7.A0C(str2, "typeOfGroup", A0u);
    }
}
