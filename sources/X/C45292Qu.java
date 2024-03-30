package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Qu  reason: invalid class name and case insensitive filesystem */
public final class C45292Qu extends C20890yK {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Long A03;
    public String A04;

    public C45292Qu() {
        super(3206, C36431kI.A0q(), 2, 0);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(4, this.A04);
        r3.Bpz(5, this.A00);
        r3.Bpz(1, this.A01);
        r3.Bpz(3, this.A03);
        r3.Bpz(2, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0K(C36331k8.A0L(C36331k8.A0J(C36331k8.A0N(C36371kC.A0o(), this.A04, A1G), this.A00, A1G), this.A01, A1G), this.A03, A1G), this.A02);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamGraphqlCatalogRequest {");
        C20910yM.A00(this.A04, "businessJid", A0u);
        C20910yM.A00(C36331k8.A0h(this.A00), "businessType", A0u);
        C20910yM.A00(C36331k8.A0h(this.A01), "graphqlCatalogEndpoint", A0u);
        C20910yM.A00(this.A03, "graphqlErrorCode", A0u);
        return C36321k7.A0C(C36331k8.A0h(this.A02), "graphqlRequestResult", A0u);
    }
}
