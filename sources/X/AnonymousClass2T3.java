package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2T3  reason: invalid class name */
public final class AnonymousClass2T3 extends C20890yK {
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
    public Long A0A;
    public Long A0B;
    public Long A0C;
    public Long A0D;
    public Long A0E;
    public Long A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(8, this.A04);
        r3.Bpz(9, this.A05);
        r3.Bpz(10, this.A0G);
        r3.Bpz(12, this.A0A);
        r3.Bpz(13, this.A0H);
        r3.Bpz(1, this.A0B);
        r3.Bpz(20, this.A06);
        r3.Bpz(14, this.A0I);
        r3.Bpz(2, this.A0C);
        r3.Bpz(7, this.A0D);
        r3.Bpz(15, this.A00);
        r3.Bpz(21, this.A0J);
        r3.Bpz(25, this.A01);
        r3.Bpz(26, this.A02);
        r3.Bpz(16, this.A03);
        r3.Bpz(23, this.A0E);
        r3.Bpz(17, this.A0F);
        r3.Bpz(6, this.A07);
        r3.Bpz(3, this.A0K);
        r3.Bpz(19, this.A0L);
        r3.Bpz(4, this.A08);
        r3.Bpz(5, this.A09);
    }

    public AnonymousClass2T3() {
        super(3770, C36331k8.A0H(), 2, 113760892);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        C36321k7.A1b(A1G, 22);
        A1G.put(C36331k8.A0S(C36331k8.A0R(C36391kE.A0r(), this.A04, A1G), this.A05, A1G), this.A0G);
        C36321k7.A1b(A1G, 11);
        A1G.put(C36331k8.A0J(C36331k8.A0V(C36431kI.A12(), this.A0A, A1G), this.A0H, A1G), this.A0B);
        C36321k7.A1b(A1G, 27);
        A1G.put(C36411kG.A0s(C36341k9.A0b(C36331k8.A0P(C36331k8.A0K(C36341k9.A0a(20, this.A06, A1G), this.A0I, A1G), this.A0C, A1G), this.A0D, A1G), this.A00, A1G), this.A0J);
        C36321k7.A1b(A1G, 28);
        A1G.put(C36431kI.A14(), this.A01);
        A1G.put(26, this.A02);
        C36321k7.A1b(A1G, 29);
        A1G.put(16, this.A03);
        A1G.put(C36351kA.A0t(23, this.A0E, A1G), this.A0F);
        C36321k7.A1b(A1G, 18);
        A1G.put(C36331k8.A0M(C36381kD.A0o(C36331k8.A0L(C36381kD.A0n(), this.A07, A1G), this.A0K, A1G), this.A0L, A1G), this.A08);
        C36321k7.A1b(A1G, 24);
        A1G.put(C36371kC.A0p(), this.A09);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamBusinessTemplateMessageThreadLevelUserAction {");
        C20910yM.A00(C36331k8.A0h(this.A04), "blockEntryPoint", A0u);
        C20910yM.A00(C36331k8.A0h(this.A05), "blockReason", A0u);
        C20910yM.A00(this.A0G, "businessMessageDeliveredTsList", A0u);
        C20910yM.A00(this.A0A, "businessMessageSentTs", A0u);
        C20910yM.A00(this.A0H, "businessMessageSentTsList", A0u);
        C20910yM.A00(this.A0B, "businessPhoneNumber", A0u);
        C20910yM.A00(C36331k8.A0h(this.A06), "contactType", A0u);
        C20910yM.A00(this.A0I, "customBlockReasonStr", A0u);
        C20910yM.A00(this.A0C, "deltaTime", A0u);
        C20910yM.A00(this.A0D, "deltaTimeReceived", A0u);
        C20910yM.A00(this.A00, "didUserReply", A0u);
        C20910yM.A00(this.A0J, "hsmTagStr", A0u);
        C20910yM.A00(this.A01, "isFromAdsManagerMm", A0u);
        C20910yM.A00(this.A02, "isFromCapi", A0u);
        C20910yM.A00(this.A03, "isUnsubBlock", A0u);
        C20910yM.A00(this.A0E, "lastOutgoingTs", A0u);
        C20910yM.A00(this.A0F, "messageDeliveredTs", A0u);
        C20910yM.A00(C36331k8.A0h(this.A07), "qbmFlag", A0u);
        C20910yM.A00(this.A0K, "templateId", A0u);
        C20910yM.A00(this.A0L, "templateIdsList", A0u);
        C20910yM.A00(C36331k8.A0h(this.A08), "threadActionEntryPoint", A0u);
        return C36321k7.A0C(C36331k8.A0h(this.A09), "threadLevelAction", A0u);
    }
}
