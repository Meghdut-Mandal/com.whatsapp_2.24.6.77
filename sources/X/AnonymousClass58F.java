package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.58F  reason: invalid class name */
public final class AnonymousClass58F extends C20890yK {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public Long A04;
    public String A05;
    public String A06;

    public AnonymousClass58F() {
        super(2952, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A05);
        r3.Bpz(5, this.A02);
        r3.Bpz(6, this.A03);
        r3.Bpz(10, this.A04);
        r3.Bpz(9, this.A00);
        r3.Bpz(8, this.A01);
        r3.Bpz(3, this.A06);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0L(C36331k8.A0Q(C36331k8.A0R(C36331k8.A0S(C36331k8.A0P(C36331k8.A0M(C36331k8.A0O(C36331k8.A0N(C36361kB.A0i(), this.A05, A1G), this.A02, A1G), this.A03, A1G), (Object) null, A1G), (Object) null, A1G), this.A04, A1G), this.A00, A1G), this.A01, A1G), this.A06);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamBusinessMessageLevelCsat {");
        C20910yM.A00(this.A05, "businessJid", A0u);
        C20910yM.A00(C36331k8.A0h(this.A02), "csatActionType", A0u);
        C20910yM.A00(C36331k8.A0h(this.A03), "csatEntryPoint", A0u);
        C20910yM.A00(this.A04, "csatUserRating", A0u);
        C20910yM.A00(this.A00, "hasCsatRating", A0u);
        C20910yM.A00(this.A01, "isCsatRatingChanged", A0u);
        return C36321k7.A0C(this.A06, "messageTemplateId", A0u);
    }
}
