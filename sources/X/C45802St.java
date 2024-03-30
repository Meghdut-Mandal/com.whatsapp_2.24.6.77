package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2St  reason: invalid class name and case insensitive filesystem */
public final class C45802St extends C20890yK {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public Boolean A05;
    public Integer A06;
    public Integer A07;
    public Integer A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;
    public String A0D;
    public String A0E;
    public String A0F;

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(9, this.A09);
        r3.Bpz(1, this.A0A);
        r3.Bpz(2, this.A06);
        r3.Bpz(11, this.A07);
        r3.Bpz(12, this.A0D);
        r3.Bpz(13, this.A00);
        r3.Bpz(14, this.A01);
        r3.Bpz(3, this.A02);
        r3.Bpz(4, this.A03);
        r3.Bpz(5, this.A04);
        r3.Bpz(15, this.A0B);
        r3.Bpz(10, this.A0C);
        r3.Bpz(7, this.A08);
        r3.Bpz(8, this.A0E);
        r3.Bpz(16, this.A05);
        r3.Bpz(6, this.A0F);
    }

    public C45802St() {
        super(3762, C36331k8.A0H(), 2, 113760892);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0S(C36341k9.A0b(C36331k8.A0N(C36331k8.A0M(C36331k8.A0L(C36341k9.A0a(C36331k8.A0V(C36331k8.A0U(C36331k8.A0T(C36331k8.A0K(C36331k8.A0J(C36401kF.A0i(), this.A09, A1G), this.A0A, A1G), this.A06, A1G), this.A07, A1G), this.A0D, A1G), this.A00, A1G), this.A01, A1G), this.A02, A1G), this.A03, A1G), this.A04, A1G), this.A0B, A1G), this.A0C);
        A1G.put(C36331k8.A0O(C36351kA.A0s(C36331k8.A0Q(C36331k8.A0P(18, C36341k9.A0c(A1G, 17), A1G), this.A08, A1G), this.A0E, A1G), this.A05, A1G), this.A0F);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamBusinessTemplateMessageIncomingStats {");
        C20910yM.A00(this.A09, "businessMessageSentTs", A0u);
        C20910yM.A00(this.A0A, "businessPhoneNumber", A0u);
        C20910yM.A00(C36331k8.A0h(this.A06), "chatsFolderType", A0u);
        C20910yM.A00(C36331k8.A0h(this.A07), "contactType", A0u);
        C20910yM.A00(this.A0D, "hsmTagStr", A0u);
        C20910yM.A00(this.A00, "isFromAdsManagerMm", A0u);
        C20910yM.A00(this.A01, "isFromCapi", A0u);
        C20910yM.A00(this.A02, "isKeepChatsArchivedEnabled", A0u);
        C20910yM.A00(this.A03, "isMuted", A0u);
        C20910yM.A00(this.A04, "isNotificationEnabled", A0u);
        C20910yM.A00(this.A0B, "lastOutgoingTs", A0u);
        C20910yM.A00(this.A0C, "messageDeliveredTs", A0u);
        C20910yM.A00(C36331k8.A0h(this.A08), "qbmFlag", A0u);
        C20910yM.A00(this.A0E, "qbmFlagStr", A0u);
        C20910yM.A00(this.A05, "readReceiptsEnabled", A0u);
        return C36321k7.A0C(this.A0F, "templateId", A0u);
    }
}
