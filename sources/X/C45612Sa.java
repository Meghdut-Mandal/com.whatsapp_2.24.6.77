package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Sa  reason: invalid class name and case insensitive filesystem */
public final class C45612Sa extends C20890yK {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Long A06;
    public Long A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;

    public C45612Sa() {
        super(3794, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(7, this.A08);
        r3.Bpz(1, this.A02);
        r3.Bpz(2, this.A06);
        r3.Bpz(9, this.A07);
        r3.Bpz(10, this.A09);
        r3.Bpz(12, this.A00);
        r3.Bpz(13, this.A01);
        r3.Bpz(8, this.A0A);
        r3.Bpz(3, this.A03);
        r3.Bpz(4, this.A04);
        r3.Bpz(6, this.A0B);
        r3.Bpz(5, this.A05);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        C36321k7.A1b(A1G, 11);
        A1G.put(C36401kF.A0h(), this.A08);
        C36321k7.A1b(A1G, 14);
        A1G.put(C36331k8.A0S(C36331k8.A0R(C36331k8.A0K(C36361kB.A0i(), this.A02, A1G), this.A06, A1G), this.A07, A1G), this.A09);
        C36321k7.A1b(A1G, 15);
        A1G.put(C36331k8.A0V(C36431kI.A12(), this.A00, A1G), this.A01);
        C36321k7.A1b(A1G, 16);
        A1G.put(C36331k8.A0N(C36331k8.A0O(C36331k8.A0M(C36331k8.A0L(C36391kE.A0r(), this.A0A, A1G), this.A03, A1G), this.A04, A1G), this.A0B, A1G), this.A05);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamQbmThreadLevelAction {");
        C20910yM.A00(this.A08, "blockReasonIdentifier", A0u);
        C20910yM.A00(C36331k8.A0h(this.A02), "contactType", A0u);
        C20910yM.A00(this.A06, "deltaTime", A0u);
        C20910yM.A00(this.A07, "deltaTimeReceived", A0u);
        C20910yM.A00(this.A09, "hsmTagStr", A0u);
        C20910yM.A00(this.A00, "isFromAdsManagerMm", A0u);
        C20910yM.A00(this.A01, "isFromCapi", A0u);
        C20910yM.A00(this.A0A, "messageTypeStr", A0u);
        C20910yM.A00(C36331k8.A0h(this.A03), "qbmFlag", A0u);
        C20910yM.A00(C36331k8.A0h(this.A04), "threadActionEntryPoint", A0u);
        C20910yM.A00(this.A0B, "threadIdHmac", A0u);
        return C36321k7.A0C(C36331k8.A0h(this.A05), "threadLevelAction", A0u);
    }
}
