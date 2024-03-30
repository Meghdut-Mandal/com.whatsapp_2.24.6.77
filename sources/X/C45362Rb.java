package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Rb  reason: invalid class name and case insensitive filesystem */
public final class C45362Rb extends C20890yK {
    public Integer A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public String A05;
    public String A06;

    public C45362Rb() {
        super(4752, C36431kI.A0q(), 2, 0);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A01);
        r3.Bpz(2, this.A02);
        r3.Bpz(3, this.A03);
        r3.Bpz(4, this.A05);
        r3.Bpz(5, this.A06);
        r3.Bpz(6, this.A04);
        r3.Bpz(9, this.A00);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0R(C36331k8.A0O(C36331k8.A0N(C36331k8.A0M(C36331k8.A0L(C36331k8.A0K(C36361kB.A0i(), this.A01, A1G), this.A02, A1G), this.A03, A1G), this.A05, A1G), this.A06, A1G), this.A04, A1G), this.A00);
        C36321k7.A1b(A1G, 8);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamDefaultSubGroupCommentsDailyStats {");
        C20910yM.A00(this.A01, "accumulatedComments", A0u);
        C20910yM.A00(this.A02, "cagMessageSentDs", A0u);
        C20910yM.A00(this.A03, "commentDeletes", A0u);
        C20910yM.A00(this.A05, "commentParentGroupId", A0u);
        C20910yM.A00(this.A06, "commentSpaceId", A0u);
        C20910yM.A00(this.A04, "comments", A0u);
        return C36321k7.A0C(C36331k8.A0h(this.A00), "groupSizeBucket", A0u);
    }
}
