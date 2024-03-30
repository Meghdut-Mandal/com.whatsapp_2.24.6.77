package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2SD  reason: invalid class name */
public final class AnonymousClass2SD extends C20890yK {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Long A07;
    public Long A08;

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(6, this.A02);
        r3.Bpz(2, this.A03);
        r3.Bpz(7, this.A04);
        r3.Bpz(5, this.A07);
        r3.Bpz(8, this.A00);
        r3.Bpz(9, this.A01);
        r3.Bpz(4, this.A05);
        r3.Bpz(3, this.A06);
        r3.Bpz(1, this.A08);
    }

    public AnonymousClass2SD() {
        super(1176, C20890yK.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0J(C36331k8.A0L(C36331k8.A0M(C36331k8.A0R(C36331k8.A0Q(C36331k8.A0N(C36331k8.A0P(C36331k8.A0K(C36381kD.A0n(), this.A02, A1G), this.A03, A1G), this.A04, A1G), this.A07, A1G), this.A00, A1G), this.A01, A1G), this.A05, A1G), this.A06, A1G), this.A08);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamStatusPost {");
        C20910yM.A00(C36331k8.A0h(this.A02), "defaultStatusPrivacySetting", A0u);
        C36441kJ.A1H(C36331k8.A0h(this.A03), A0u);
        C20910yM.A00(C36331k8.A0h(this.A04), "perPostStatusPrivacySetting", A0u);
        C20910yM.A00(this.A07, "retryCount", A0u);
        C20910yM.A00(this.A00, "statusAudienceSelectorClicked", A0u);
        C20910yM.A00(this.A01, "statusAudienceSelectorUpdated", A0u);
        C20910yM.A00(C36331k8.A0h(this.A05), "statusPostOrigin", A0u);
        C20910yM.A00(C36331k8.A0h(this.A06), "statusPostResult", A0u);
        return C36321k7.A0C(this.A08, "statusSessionId", A0u);
    }
}
