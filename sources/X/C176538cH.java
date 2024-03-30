package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8cH  reason: invalid class name and case insensitive filesystem */
public final class C176538cH extends C20890yK {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Long A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;

    public C176538cH() {
        super(1722, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(13, this.A00);
        r3.Bpz(1, this.A02);
        r3.Bpz(7, this.A03);
        r3.Bpz(3, this.A06);
        r3.Bpz(14, this.A07);
        r3.Bpz(15, this.A08);
        r3.Bpz(8, this.A04);
        r3.Bpz(10, this.A01);
        r3.Bpz(9, this.A09);
        r3.Bpz(2, this.A0A);
        r3.Bpz(16, this.A0B);
        r3.Bpz(11, this.A05);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(13, this.A00);
        C36321k7.A1b(A1G, 4);
        A1G.put(C36331k8.A0L(C36331k8.A0P(C36361kB.A0i(), this.A02, A1G), this.A03, A1G), this.A06);
        C36321k7.A1b(A1G, 18);
        A1G.put(C36331k8.A0Q(C36341k9.A0b(14, this.A07, A1G), this.A08, A1G), this.A04);
        C36321k7.A1b(A1G, 5);
        A1G.put(C36331k8.A0R(C36401kF.A0j(), this.A01, A1G), this.A09);
        C36321k7.A1b(A1G, 6);
        A1G.put(C36361kB.A0j(), this.A0A);
        C36321k7.A1b(A1G, 12);
        A1G.put(C36331k8.A0T(16, this.A0B, A1G), this.A05);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamCatalogBiz {");
        C20910yM.A00(this.A00, "cartToggle", A0u);
        C20910yM.A00(C36331k8.A0h(this.A02), "catalogBizAction", A0u);
        C20910yM.A00(C36331k8.A0h(this.A03), "catalogEntryPoint", A0u);
        C20910yM.A00(this.A06, "catalogSessionId", A0u);
        C20910yM.A00(this.A07, "collectionId", A0u);
        C20910yM.A00(this.A08, "collectionIndex", A0u);
        C20910yM.A00(C36331k8.A0h(this.A04), "deepLinkOpenFrom", A0u);
        C20910yM.A00(this.A01, "isOrderMsgAttached", A0u);
        C20910yM.A00(this.A09, "orderId", A0u);
        C20910yM.A00(this.A0A, "productId", A0u);
        C20910yM.A00(this.A0B, "productIndex", A0u);
        return C36321k7.A0C(this.A05, "quantity", A0u);
    }
}
