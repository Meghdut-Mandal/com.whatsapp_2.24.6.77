package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Ry  reason: invalid class name and case insensitive filesystem */
public final class C45592Ry extends C20890yK {
    public Integer A00;
    public Integer A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public String A07;

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(8, this.A07);
        r3.Bpz(5, this.A00);
        r3.Bpz(4, this.A02);
        r3.Bpz(3, this.A01);
        r3.Bpz(7, this.A03);
        r3.Bpz(6, this.A04);
        r3.Bpz(1, this.A05);
        r3.Bpz(2, this.A06);
    }

    public C45592Ry() {
        super(1656, C20890yK.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0K(C36331k8.A0J(C36331k8.A0O(C36331k8.A0P(C36331k8.A0L(C36331k8.A0M(C36331k8.A0N(C36391kE.A0r(), this.A07, A1G), this.A00, A1G), this.A02, A1G), this.A01, A1G), this.A03, A1G), this.A04, A1G), this.A05, A1G), this.A06);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamStatusRowView {");
        C20910yM.A00(this.A07, "psaCampaigns", A0u);
        C20910yM.A00(C36331k8.A0h(this.A00), "statusRowEntryMethod", A0u);
        C20910yM.A00(this.A02, "statusRowIndex", A0u);
        C20910yM.A00(C36331k8.A0h(this.A01), "statusRowSection", A0u);
        C20910yM.A00(this.A03, "statusRowUnreadItemCount", A0u);
        C20910yM.A00(this.A04, "statusRowViewCount", A0u);
        C20910yM.A00(this.A05, "statusSessionId", A0u);
        return C36321k7.A0C(this.A06, "statusViewerSessionId", A0u);
    }
}
