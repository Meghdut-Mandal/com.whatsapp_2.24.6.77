package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8cU  reason: invalid class name and case insensitive filesystem */
public final class C176668cU extends C20890yK {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public Long A08;
    public Long A09;
    public String A0A;
    public String A0B;

    public C176668cU() {
        super(3008, C36431kI.A0q(), 2, 0);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(8, this.A02);
        r3.Bpz(9, this.A03);
        r3.Bpz(2, this.A0A);
        r3.Bpz(6, this.A0B);
        r3.Bpz(13, this.A00);
        r3.Bpz(10, this.A01);
        r3.Bpz(5, this.A04);
        r3.Bpz(12, this.A05);
        r3.Bpz(4, this.A08);
        r3.Bpz(7, this.A09);
        r3.Bpz(1, this.A06);
        r3.Bpz(3, this.A07);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0S(C36331k8.A0V(C36331k8.A0O(C36331k8.A0K(C36331k8.A0R(8, this.A02, A1G), this.A03, A1G), this.A0A, A1G), this.A0B, A1G), this.A00, A1G), this.A01);
        C36321k7.A1b(A1G, 11);
        A1G.put(C36331k8.A0L(C36331k8.A0J(C36331k8.A0P(C36331k8.A0M(C36331k8.A0U(C36371kC.A0p(), this.A04, A1G), this.A05, A1G), this.A08, A1G), this.A09, A1G), this.A06, A1G), this.A07);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamBizProfileView {");
        C20910yM.A00(C36331k8.A0h(this.A02), "bizFbSize", A0u);
        C20910yM.A00(C36331k8.A0h(this.A03), "bizIgSize", A0u);
        C20910yM.A00(this.A0A, "businessProfileJid", A0u);
        C20910yM.A00(this.A0B, "catalogSessionId", A0u);
        C20910yM.A00(this.A00, "hasCoverPhoto", A0u);
        C20910yM.A00(this.A01, "isProfileLinked", A0u);
        C20910yM.A00(C36331k8.A0h(this.A04), "linkedAccount", A0u);
        C20910yM.A00(C36331k8.A0h(this.A05), "profileEntryPoint", A0u);
        C20910yM.A00(this.A08, "scrollDepth", A0u);
        C20910yM.A00(this.A09, "sequenceNumber", A0u);
        C20910yM.A00(C36331k8.A0h(this.A06), "viewBusinessProfileAction", A0u);
        return C36321k7.A0C(C36331k8.A0h(this.A07), "websiteSource", A0u);
    }
}
