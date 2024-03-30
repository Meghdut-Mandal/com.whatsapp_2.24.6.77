package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2T0  reason: invalid class name */
public final class AnonymousClass2T0 extends C20890yK {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;

    public AnonymousClass2T0() {
        super(3876, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A02);
        r3.Bpz(2, this.A03);
        r3.Bpz(3, this.A06);
        r3.Bpz(12, this.A07);
        r3.Bpz(14, this.A0A);
        r3.Bpz(16, this.A00);
        r3.Bpz(17, this.A01);
        r3.Bpz(4, this.A0B);
        r3.Bpz(5, this.A04);
        r3.Bpz(10, this.A08);
        r3.Bpz(13, this.A09);
        r3.Bpz(15, this.A0C);
        r3.Bpz(8, this.A05);
        r3.Bpz(7, this.A0D);
        r3.Bpz(11, this.A0E);
        r3.Bpz(6, this.A0F);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36351kA.A0t(C36351kA.A0s(C36341k9.A0a(C36331k8.A0U(C36331k8.A0L(C36331k8.A0K(C36361kB.A0i(), this.A02, A1G), this.A03, A1G), this.A06, A1G), this.A07, A1G), this.A0A, A1G), this.A00, A1G), this.A01);
        Object A0c = C36341k9.A0c(A1G, 19);
        C36331k8.A1Q(A0c, A1G, 20);
        C36331k8.A1Q(A0c, A1G, 21);
        A1G.put(C36331k8.A0P(C36331k8.A0Q(C36341k9.A0b(C36331k8.A0V(C36331k8.A0S(C36331k8.A0N(C36331k8.A0M(18, A0c, A1G), this.A0B, A1G), this.A04, A1G), this.A08, A1G), this.A09, A1G), this.A0C, A1G), this.A05, A1G), this.A0D);
        C36321k7.A1b(A1G, 9);
        A1G.put(C36331k8.A0O(C36421kH.A0U(), this.A0E, A1G), this.A0F);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamQbmMessageReply {");
        C20910yM.A00(C36331k8.A0h(this.A02), "chatsFolderType", A0u);
        C20910yM.A00(C36331k8.A0h(this.A03), "contactType", A0u);
        C20910yM.A00(this.A06, "deltaTime", A0u);
        C20910yM.A00(this.A07, "deltaTimeReceived", A0u);
        C20910yM.A00(this.A0A, "hsmTagStr", A0u);
        C20910yM.A00(this.A00, "isFromAdsManagerMm", A0u);
        C20910yM.A00(this.A01, "isFromCapi", A0u);
        C20910yM.A00(this.A0B, "messageTypeStr", A0u);
        C20910yM.A00(C36331k8.A0h(this.A04), "qbmFlag", A0u);
        C20910yM.A00(this.A08, "quotedDeltaTime", A0u);
        C20910yM.A00(this.A09, "quotedDeltaTimeReceived", A0u);
        C20910yM.A00(this.A0C, "quotedMessageHsmTagStr", A0u);
        C20910yM.A00(C36331k8.A0h(this.A05), "quotedMessageQbmFlag", A0u);
        C20910yM.A00(this.A0D, "quotedMessageType", A0u);
        C20910yM.A00(this.A0E, "replyMessageType", A0u);
        return C36321k7.A0C(this.A0F, "threadIdHmac", A0u);
    }
}
