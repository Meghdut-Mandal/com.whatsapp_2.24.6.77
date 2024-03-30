package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2RJ  reason: invalid class name */
public final class AnonymousClass2RJ extends C20890yK {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Long A04;
    public String A05;

    public AnonymousClass2RJ() {
        super(2136, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(2, this.A01);
        r3.Bpz(6, this.A05);
        r3.Bpz(3, this.A02);
        r3.Bpz(4, this.A00);
        r3.Bpz(5, this.A03);
        r3.Bpz(7, this.A04);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0P(C36331k8.A0N(C36331k8.A0M(C36331k8.A0L(C36331k8.A0O(C36361kB.A0j(), this.A01, A1G), this.A05, A1G), this.A02, A1G), this.A00, A1G), this.A03, A1G), this.A04);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamDeepLinkOpen {");
        C20910yM.A00(C36331k8.A0h(this.A01), "deepLinkOpenFrom", A0u);
        C20910yM.A00(this.A05, "deepLinkSessionId", A0u);
        C20910yM.A00(C36331k8.A0h(this.A02), "deepLinkType", A0u);
        C20910yM.A00(this.A00, "isContact", A0u);
        C20910yM.A00(C36331k8.A0h(this.A03), "linkOwnerType", A0u);
        return C36321k7.A0C(this.A04, "sourceSurface", A0u);
    }
}
