package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2RQ  reason: invalid class name */
public final class AnonymousClass2RQ extends C20890yK {
    public Integer A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public String A05;

    public AnonymousClass2RQ() {
        super(3806, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A05);
        r3.Bpz(2, this.A01);
        r3.Bpz(3, this.A02);
        r3.Bpz(4, this.A03);
        r3.Bpz(5, this.A04);
        r3.Bpz(6, this.A00);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36361kB.A0i(), this.A05);
        C36321k7.A1b(A1G, 7);
        A1G.put(C36331k8.A0N(C36331k8.A0M(C36331k8.A0L(C36361kB.A0j(), this.A01, A1G), this.A02, A1G), this.A03, A1G), this.A04);
        C36321k7.A1b(A1G, 8);
        A1G.put(C36381kD.A0n(), this.A00);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamPnhDaily {");
        C20910yM.A00(this.A05, "communityId", A0u);
        C20910yM.A00(this.A01, "pnhIndicatorClicksChat", A0u);
        C20910yM.A00(this.A02, "pnhIndicatorClicksInfoScreen", A0u);
        C20910yM.A00(this.A03, "reactionDeleteCount", A0u);
        C20910yM.A00(this.A04, "reactionOpenTrayCount", A0u);
        return C36321k7.A0C(C36331k8.A0h(this.A00), "typeOfGroup", A0u);
    }
}
