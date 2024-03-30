package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2SN  reason: invalid class name */
public final class AnonymousClass2SN extends C20890yK {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public String A08;
    public String A09;

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(9, this.A00);
        r3.Bpz(10, this.A01);
        r3.Bpz(8, this.A02);
        r3.Bpz(6, this.A03);
        r3.Bpz(7, this.A08);
        r3.Bpz(4, this.A09);
        r3.Bpz(5, this.A04);
        r3.Bpz(3, this.A05);
        r3.Bpz(1, this.A06);
        r3.Bpz(2, this.A07);
    }

    public AnonymousClass2SN() {
        super(2978, C20890yK.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0K(C36331k8.A0J(C36331k8.A0L(C36331k8.A0N(C36331k8.A0M(C36331k8.A0P(C36331k8.A0O(C36331k8.A0Q(C36331k8.A0S(C36401kF.A0i(), this.A00, A1G), this.A01, A1G), this.A02, A1G), this.A03, A1G), this.A08, A1G), this.A09, A1G), this.A04, A1G), this.A05, A1G), this.A06, A1G), this.A07);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamStatusMute {");
        C20910yM.A00(this.A00, "isPosterBiz", A0u);
        C20910yM.A00(this.A01, "isPosterInAddressBook", A0u);
        C20910yM.A00(C36331k8.A0h(this.A02), "muteAction", A0u);
        C20910yM.A00(C36331k8.A0h(this.A03), "muteOrigin", A0u);
        C20910yM.A00(this.A08, "psaCampaignId", A0u);
        C20910yM.A00(this.A09, "psaCampaignIds", A0u);
        C20910yM.A00(this.A04, "psaCampaignItemIndex", A0u);
        C20910yM.A00(this.A05, "statusItemIndex", A0u);
        C20910yM.A00(this.A06, "statusSessionId", A0u);
        return C36321k7.A0C(this.A07, "statusViewerSessionId", A0u);
    }
}
