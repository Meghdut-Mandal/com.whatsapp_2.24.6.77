package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2S1  reason: invalid class name */
public final class AnonymousClass2S1 extends C20890yK {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public String A07;
    public String A08;

    public AnonymousClass2S1() {
        super(5202, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A00);
        r3.Bpz(2, this.A01);
        r3.Bpz(3, this.A07);
        r3.Bpz(4, this.A04);
        r3.Bpz(5, this.A02);
        r3.Bpz(6, this.A08);
        r3.Bpz(7, this.A05);
        r3.Bpz(9, this.A03);
        r3.Bpz(10, this.A06);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0S(C36331k8.A0R(C36331k8.A0P(C36331k8.A0O(C36331k8.A0N(C36331k8.A0M(C36331k8.A0L(C36331k8.A0K(C36361kB.A0i(), this.A00, A1G), this.A01, A1G), this.A07, A1G), this.A04, A1G), this.A02, A1G), this.A08, A1G), this.A05, A1G), this.A03, A1G), this.A06);
        C36321k7.A1b(A1G, 8);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamChannelSimilarChannels {");
        C20910yM.A00(C36331k8.A0h(this.A00), "bannerStatus", A0u);
        C20910yM.A00(C36331k8.A0h(this.A01), "bannerStatusReason", A0u);
        C20910yM.A00(this.A07, "cid", A0u);
        C20910yM.A00(this.A04, "similarChannelDisplayRank", A0u);
        C20910yM.A00(C36331k8.A0h(this.A02), "similarChannelEventSurface", A0u);
        C20910yM.A00(this.A08, "similarChannelId", A0u);
        C20910yM.A00(this.A05, "similarChannelRank", A0u);
        C20910yM.A00(C36331k8.A0h(this.A03), "similarChannelUserType", A0u);
        return C36321k7.A0C(this.A06, "similarChannelsSessionId", A0u);
    }
}
