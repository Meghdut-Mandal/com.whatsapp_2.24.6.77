package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Sl  reason: invalid class name and case insensitive filesystem */
public final class C45722Sl extends C20890yK {
    public Boolean A00;
    public Boolean A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;
    public Long A0D;

    public C45722Sl() {
        super(4476, new C18950u5(1, 10, 10, false), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(9, this.A02);
        r3.Bpz(10, this.A03);
        r3.Bpz(11, this.A04);
        r3.Bpz(12, this.A05);
        r3.Bpz(1, this.A00);
        r3.Bpz(13, this.A01);
        r3.Bpz(14, this.A06);
        r3.Bpz(2, this.A07);
        r3.Bpz(3, this.A08);
        r3.Bpz(15, this.A09);
        r3.Bpz(4, this.A0A);
        r3.Bpz(5, this.A0B);
        r3.Bpz(7, this.A0C);
        r3.Bpz(8, this.A0D);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0N(C36331k8.A0M(C36341k9.A0b(C36331k8.A0L(C36331k8.A0K(C36341k9.A0a(C36331k8.A0V(C36331k8.A0J(C36331k8.A0U(C36331k8.A0T(C36331k8.A0S(C36401kF.A0i(), this.A02, A1G), this.A03, A1G), this.A04, A1G), this.A05, A1G), this.A00, A1G), this.A01, A1G), this.A06, A1G), this.A07, A1G), this.A08, A1G), this.A09, A1G), this.A0A, A1G), this.A0B);
        C36321k7.A1b(A1G, 6);
        A1G.put(C36331k8.A0Q(C36401kF.A0h(), this.A0C, A1G), this.A0D);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamUpdatesTabOpen {");
        C20910yM.A00(this.A02, "channelFollowedCount", A0u);
        C20910yM.A00(this.A03, "channelMutedCount", A0u);
        C20910yM.A00(this.A04, "channelUnreadCount", A0u);
        C20910yM.A00(this.A05, "channelUnreadPostsCount", A0u);
        C20910yM.A00(this.A00, "horizontalView", A0u);
        C20910yM.A00(this.A01, "isUpdatesTab", A0u);
        C20910yM.A00(this.A06, "mutedRecentStatusItems", A0u);
        C20910yM.A00(this.A07, "mutedStatusItems", A0u);
        C20910yM.A00(this.A08, "mutedStatusRows", A0u);
        C20910yM.A00(this.A09, "mutedViewedStatusItems", A0u);
        C20910yM.A00(this.A0A, "recentStatusItems", A0u);
        C20910yM.A00(this.A0B, "recentStatusRows", A0u);
        C20910yM.A00(this.A0C, "viewedStatusItems", A0u);
        return C36321k7.A0C(this.A0D, "viewedStatusRows", A0u);
    }
}
