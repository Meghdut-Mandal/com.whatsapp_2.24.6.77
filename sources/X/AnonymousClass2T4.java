package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2T4  reason: invalid class name */
public final class AnonymousClass2T4 extends C20890yK {
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
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A0A);
        r3.Bpz(12, this.A04);
        r3.Bpz(2, this.A05);
        r3.Bpz(3, this.A06);
        r3.Bpz(13, this.A00);
        r3.Bpz(14, this.A01);
        r3.Bpz(15, this.A02);
        r3.Bpz(11, this.A0B);
        r3.Bpz(20, this.A0E);
        r3.Bpz(5, this.A07);
        r3.Bpz(6, this.A08);
        r3.Bpz(16, this.A0F);
        r3.Bpz(21, this.A0C);
        r3.Bpz(23, this.A0G);
        r3.Bpz(24, this.A03);
        r3.Bpz(7, this.A09);
        r3.Bpz(22, this.A0H);
        r3.Bpz(8, this.A0I);
        r3.Bpz(18, this.A0J);
        r3.Bpz(17, this.A0K);
        r3.Bpz(9, this.A0L);
        r3.Bpz(25, this.A0D);
    }

    public AnonymousClass2T4() {
        super(3468, C36331k8.A0H(), 2, 113760892);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36361kB.A0i(), this.A0A);
        C36321k7.A1b(A1G, 19);
        A1G.put(C36411kG.A0s(C36351kA.A0s(C36331k8.A0O(C36331k8.A0N(C36401kF.A0l(C36331k8.A0T(C36341k9.A0b(C36341k9.A0a(C36331k8.A0V(C36331k8.A0L(C36331k8.A0K(C36431kI.A12(), this.A04, A1G), this.A05, A1G), this.A06, A1G), this.A00, A1G), this.A01, A1G), this.A02, A1G), this.A0B, A1G), this.A0E, A1G), this.A07, A1G), this.A08, A1G), this.A0F, A1G), this.A0C);
        A1G.put(23, this.A0G);
        A1G.put(C36331k8.A0P(24, this.A03, A1G), this.A09);
        A1G.put(C36331k8.A0R(C36351kA.A0t(C36371kC.A0q(C36331k8.A0Q(22, this.A0H, A1G), this.A0I, A1G), this.A0J, A1G), this.A0K, A1G), this.A0L);
        C36321k7.A1b(A1G, 10);
        A1G.put(C36431kI.A14(), this.A0D);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamOtpRetriever {");
        C20910yM.A00(this.A0A, "businessPhoneNumber", A0u);
        C20910yM.A00(C36331k8.A0h(this.A04), "chatsFolderType", A0u);
        C20910yM.A00(C36331k8.A0h(this.A05), "ctaFallbackReason", A0u);
        C20910yM.A00(C36331k8.A0h(this.A06), "ctaType", A0u);
        C20910yM.A00(this.A00, "isKeepChatsArchivedEnabled", A0u);
        C20910yM.A00(this.A01, "isMessageNotificationEnabled", A0u);
        C20910yM.A00(this.A02, "isNotificationEnabled", A0u);
        C20910yM.A00(this.A0B, "messageReceivedElapsedTimeSeconds", A0u);
        C20910yM.A00(this.A0E, "otpCorrelationId", A0u);
        C20910yM.A00(C36331k8.A0h(this.A07), "otpEventSource", A0u);
        C20910yM.A00(C36331k8.A0h(this.A08), "otpEventType", A0u);
        C20910yM.A00(this.A0F, "otpFailureReason", A0u);
        C20910yM.A00(this.A0C, "otpHandshakeElapsedTimeMs", A0u);
        C20910yM.A00(this.A0G, "otpHandshakeId", A0u);
        C20910yM.A00(this.A03, "otpMaskLinkedDevices", A0u);
        C20910yM.A00(C36331k8.A0h(this.A09), "otpProductType", A0u);
        C20910yM.A00(this.A0H, "otpSdkVersion", A0u);
        C20910yM.A00(this.A0I, "otpSessionId", A0u);
        C20910yM.A00(this.A0J, "receiverCountryCode", A0u);
        C20910yM.A00(this.A0K, "templateId", A0u);
        C20910yM.A00(this.A0L, "thirdPartyPackageNameFromIntent", A0u);
        return C36321k7.A0C(this.A0D, "waDeviceId", A0u);
    }
}
