package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Su  reason: invalid class name and case insensitive filesystem */
public final class C45812Su extends C20890yK {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;
    public Long A0D;
    public String A0E;
    public String A0F;

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(8, this.A07);
        r3.Bpz(1, this.A08);
        r3.Bpz(2, this.A03);
        r3.Bpz(11, this.A04);
        r3.Bpz(3, this.A09);
        r3.Bpz(7, this.A0A);
        r3.Bpz(12, this.A0E);
        r3.Bpz(13, this.A00);
        r3.Bpz(14, this.A01);
        r3.Bpz(15, this.A0B);
        r3.Bpz(9, this.A0C);
        r3.Bpz(10, this.A0D);
        r3.Bpz(6, this.A05);
        r3.Bpz(16, this.A02);
        r3.Bpz(4, this.A06);
        r3.Bpz(5, this.A0F);
    }

    public C45812Su() {
        super(3766, C36331k8.A0H(), 2, 113760892);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36341k9.A0a(C36331k8.A0V(C36331k8.A0U(C36331k8.A0P(C36331k8.A0L(C36331k8.A0T(C36331k8.A0K(C36331k8.A0J(C36391kE.A0r(), this.A07, A1G), this.A08, A1G), this.A03, A1G), this.A04, A1G), this.A09, A1G), this.A0A, A1G), this.A0E, A1G), this.A00, A1G), this.A01);
        C36321k7.A1b(A1G, 17);
        A1G.put(C36331k8.A0R(C36421kH.A0W(), this.A0B, A1G), this.A0C);
        A1G.put(C36331k8.A0N(C36331k8.A0M(C36351kA.A0s(C36331k8.A0O(C36331k8.A0S(19, C36341k9.A0c(A1G, 18), A1G), this.A0D, A1G), this.A05, A1G), this.A02, A1G), this.A06, A1G), this.A0F);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamBusinessTemplateMessageReadStats {");
        C20910yM.A00(this.A07, "businessMessageSentTs", A0u);
        C20910yM.A00(this.A08, "businessPhoneNumber", A0u);
        C20910yM.A00(C36331k8.A0h(this.A03), "chatsFolderType", A0u);
        C20910yM.A00(C36331k8.A0h(this.A04), "contactType", A0u);
        C20910yM.A00(this.A09, "deltaTime", A0u);
        C20910yM.A00(this.A0A, "deltaTimeReceived", A0u);
        C20910yM.A00(this.A0E, "hsmTagStr", A0u);
        C20910yM.A00(this.A00, "isFromAdsManagerMm", A0u);
        C20910yM.A00(this.A01, "isFromCapi", A0u);
        C20910yM.A00(this.A0B, "lastOutgoingTs", A0u);
        C20910yM.A00(this.A0C, "messageDeliveredTs", A0u);
        C20910yM.A00(this.A0D, "messageReadTs", A0u);
        C20910yM.A00(C36331k8.A0h(this.A05), "qbmFlag", A0u);
        C20910yM.A00(this.A02, "readReceiptsEnabled", A0u);
        C20910yM.A00(C36331k8.A0h(this.A06), "readSource", A0u);
        return C36321k7.A0C(this.A0F, "templateId", A0u);
    }
}
