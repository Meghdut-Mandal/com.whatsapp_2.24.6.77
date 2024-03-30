package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8cA  reason: invalid class name and case insensitive filesystem */
public final class C176468cA extends C20890yK {
    public Integer A00;
    public Integer A01;
    public Long A02;
    public Long A03;
    public String A04;
    public String A05;
    public String A06;

    public C176468cA() {
        super(3548, C36431kI.A0q(), 2, 0);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A04);
        r3.Bpz(2, this.A05);
        r3.Bpz(3, this.A06);
        r3.Bpz(4, this.A00);
        r3.Bpz(5, this.A02);
        r3.Bpz(6, this.A01);
        r3.Bpz(7, this.A03);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0P(C36331k8.A0O(C36331k8.A0N(C36331k8.A0M(C36331k8.A0L(C36331k8.A0K(C36361kB.A0i(), this.A04, A1G), this.A05, A1G), this.A06, A1G), this.A00, A1G), this.A02, A1G), this.A01, A1G), this.A03);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamProductSearch {");
        C20910yM.A00(this.A04, "catalogOwnerJid", A0u);
        C20910yM.A00(this.A05, "catalogSessionId", A0u);
        C20910yM.A00(this.A06, "productId", A0u);
        C20910yM.A00(C36331k8.A0h(this.A00), "searchEntryPoint", A0u);
        C20910yM.A00(this.A02, "searchResultIndex", A0u);
        C20910yM.A00(C36331k8.A0h(this.A01), "searchViewAction", A0u);
        return C36321k7.A0C(this.A03, "sequenceNumber", A0u);
    }
}
