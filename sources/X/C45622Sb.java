package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Sb  reason: invalid class name and case insensitive filesystem */
public final class C45622Sb extends C20890yK {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public String A0B;
    public String A0C;

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(7, this.A05);
        r3.Bpz(1, this.A06);
        r3.Bpz(10, this.A02);
        r3.Bpz(2, this.A07);
        r3.Bpz(6, this.A08);
        r3.Bpz(11, this.A0B);
        r3.Bpz(12, this.A00);
        r3.Bpz(13, this.A01);
        r3.Bpz(14, this.A09);
        r3.Bpz(8, this.A0A);
        r3.Bpz(3, this.A03);
        r3.Bpz(5, this.A04);
        r3.Bpz(4, this.A0C);
    }

    public C45622Sb() {
        super(3772, C36331k8.A0H(), 2, 113760892);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0J(C36401kF.A0h(), this.A05, A1G), this.A06);
        C36321k7.A1b(A1G, 16);
        A1G.put(C36331k8.A0V(C36331k8.A0U(C36331k8.A0T(C36331k8.A0O(C36331k8.A0K(C36401kF.A0j(), this.A02, A1G), this.A07, A1G), this.A08, A1G), this.A0B, A1G), this.A00, A1G), this.A01);
        C36321k7.A1b(A1G, 17);
        A1G.put(C36341k9.A0b(C36331k8.A0Q(C36401kF.A0k(), this.A09, A1G), this.A0A, A1G), (Object) null);
        C36331k8.A1Q((Object) null, A1G, 18);
        A1G.put(C36331k8.A0L(19, (Object) null, A1G), this.A03);
        C36321k7.A1b(A1G, 9);
        A1G.put(C36331k8.A0M(C36371kC.A0p(), this.A04, A1G), this.A0C);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamBusinessTemplateMessageUserAction {");
        C20910yM.A00(this.A05, "businessMessageSentTs", A0u);
        C20910yM.A00(this.A06, "businessPhoneNumber", A0u);
        C20910yM.A00(C36331k8.A0h(this.A02), "contactType", A0u);
        C20910yM.A00(this.A07, "deltaTime", A0u);
        C20910yM.A00(this.A08, "deltaTimeReceived", A0u);
        C20910yM.A00(this.A0B, "hsmTagStr", A0u);
        C20910yM.A00(this.A00, "isFromAdsManagerMm", A0u);
        C20910yM.A00(this.A01, "isFromCapi", A0u);
        C20910yM.A00(this.A09, "lastOutgoingTs", A0u);
        C20910yM.A00(this.A0A, "messageDeliveredTs", A0u);
        C20910yM.A00(C36331k8.A0h(this.A03), "messageLevelAction", A0u);
        C20910yM.A00(C36331k8.A0h(this.A04), "qbmFlag", A0u);
        return C36321k7.A0C(this.A0C, "templateId", A0u);
    }
}
