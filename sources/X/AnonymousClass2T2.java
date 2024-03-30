package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2T2  reason: invalid class name */
public final class AnonymousClass2T2 extends C20890yK {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
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
    public Long A0G;
    public Long A0H;
    public Long A0I;
    public Long A0J;
    public String A0K;

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(23, this.A00);
        r3.Bpz(25, this.A01);
        r3.Bpz(4, this.A05);
        r3.Bpz(17, this.A0K);
        r3.Bpz(18, this.A0A);
        r3.Bpz(19, this.A02);
        r3.Bpz(22, this.A03);
        r3.Bpz(14, this.A0B);
        r3.Bpz(16, this.A0C);
        r3.Bpz(7, this.A0D);
        r3.Bpz(5, this.A0E);
        r3.Bpz(8, this.A0F);
        r3.Bpz(9, this.A04);
        r3.Bpz(10, this.A0G);
        r3.Bpz(3, this.A06);
        r3.Bpz(6, this.A0H);
        r3.Bpz(2, this.A0I);
        r3.Bpz(11, this.A07);
        r3.Bpz(1, this.A0J);
        r3.Bpz(26, this.A08);
        r3.Bpz(27, this.A09);
    }

    public AnonymousClass2T2() {
        super(1658, C20890yK.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(23, this.A00);
        A1G.put(C36381kD.A0o(C36371kC.A0q(C36351kA.A0t(C36331k8.A0M(C36431kI.A14(), this.A01, A1G), this.A05, A1G), this.A0K, A1G), this.A0A, A1G), this.A02);
        A1G.put(22, this.A03);
        C36331k8.A1Q(C36341k9.A0c(A1G, 21), A1G, 20);
        A1G.put(C36331k8.A0J(C36331k8.A0T(C36331k8.A0K(C36331k8.A0O(C36331k8.A0L(C36331k8.A0S(C36331k8.A0R(C36331k8.A0Q(C36331k8.A0N(C36331k8.A0P(C36351kA.A0s(C36401kF.A0k(), this.A0B, A1G), this.A0C, A1G), this.A0D, A1G), this.A0E, A1G), this.A0F, A1G), this.A04, A1G), this.A0G, A1G), this.A06, A1G), this.A0H, A1G), this.A0I, A1G), this.A07, A1G), this.A0J);
        A1G.put(26, this.A08);
        A1G.put(27, this.A09);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamStatusItemView {");
        C20910yM.A00(this.A00, "isPosterBiz", A0u);
        C20910yM.A00(this.A01, "isPosterInAddressBook", A0u);
        C36441kJ.A1H(C36331k8.A0h(this.A05), A0u);
        C20910yM.A00(this.A0K, "psaCampaignId", A0u);
        C20910yM.A00(this.A0A, "psaCampaignItemIndex", A0u);
        C20910yM.A00(this.A02, "psaLinkAvailable", A0u);
        C20910yM.A00(this.A03, "psaLinkClick", A0u);
        C20910yM.A00(this.A0B, "statusItemImpressionCount", A0u);
        C20910yM.A00(this.A0C, "statusItemIndex", A0u);
        C20910yM.A00(this.A0D, "statusItemLength", A0u);
        C20910yM.A00(this.A0E, "statusItemLoadTime", A0u);
        C20910yM.A00(this.A0F, "statusItemReplied", A0u);
        C20910yM.A00(this.A04, "statusItemUnread", A0u);
        C20910yM.A00(this.A0G, "statusItemViewCount", A0u);
        C20910yM.A00(C36331k8.A0h(this.A06), "statusItemViewResult", A0u);
        C20910yM.A00(this.A0H, "statusItemViewTime", A0u);
        C20910yM.A00(this.A0I, "statusRowIndex", A0u);
        C20910yM.A00(C36331k8.A0h(this.A07), "statusRowSection", A0u);
        C20910yM.A00(this.A0J, "statusViewerSessionId", A0u);
        C20910yM.A00(C36331k8.A0h(this.A08), "urlStatusClicked", A0u);
        return C36321k7.A0C(C36331k8.A0h(this.A09), "urlStatusType", A0u);
    }
}
