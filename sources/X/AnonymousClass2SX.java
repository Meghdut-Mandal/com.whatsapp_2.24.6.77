package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2SX  reason: invalid class name */
public final class AnonymousClass2SX extends C20890yK {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public String A0A;
    public String A0B;

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(6, this.A04);
        r3.Bpz(1, this.A05);
        r3.Bpz(9, this.A02);
        r3.Bpz(2, this.A06);
        r3.Bpz(5, this.A07);
        r3.Bpz(10, this.A0A);
        r3.Bpz(11, this.A00);
        r3.Bpz(12, this.A01);
        r3.Bpz(13, this.A08);
        r3.Bpz(7, this.A09);
        r3.Bpz(4, this.A03);
        r3.Bpz(3, this.A0B);
    }

    public AnonymousClass2SX() {
        super(3768, C36331k8.A0H(), 2, 113760892);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0J(C36381kD.A0n(), this.A04, A1G), this.A05);
        C36321k7.A1b(A1G, 14);
        A1G.put(C36331k8.A0U(C36331k8.A0T(C36331k8.A0S(C36331k8.A0N(C36331k8.A0K(C36401kF.A0i(), this.A02, A1G), this.A06, A1G), this.A07, A1G), this.A0A, A1G), this.A00, A1G), this.A01);
        C36321k7.A1b(A1G, 15);
        A1G.put(C36331k8.A0P(C36421kH.A0V(), this.A08, A1G), this.A09);
        Object A0c = C36341k9.A0c(A1G, 16);
        A1G.put(C36331k8.A0L(C36331k8.A0M(C36331k8.A0Q(C36431kI.A13(), A0c, A1G), A0c, A1G), this.A03, A1G), this.A0B);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamBusinessTemplateMessageReplyStats {");
        C20910yM.A00(this.A04, "businessMessageSentTs", A0u);
        C20910yM.A00(this.A05, "businessPhoneNumber", A0u);
        C20910yM.A00(C36331k8.A0h(this.A02), "contactType", A0u);
        C20910yM.A00(this.A06, "deltaTime", A0u);
        C20910yM.A00(this.A07, "deltaTimeReceived", A0u);
        C20910yM.A00(this.A0A, "hsmTagStr", A0u);
        C20910yM.A00(this.A00, "isFromAdsManagerMm", A0u);
        C20910yM.A00(this.A01, "isFromCapi", A0u);
        C20910yM.A00(this.A08, "lastOutgoingTs", A0u);
        C20910yM.A00(this.A09, "messageDeliveredTs", A0u);
        C20910yM.A00(C36331k8.A0h(this.A03), "qbmFlag", A0u);
        return C36321k7.A0C(this.A0B, "templateId", A0u);
    }
}
