package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Sf  reason: invalid class name and case insensitive filesystem */
public final class C45662Sf extends C20890yK {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Long A07;
    public Long A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;

    public C45662Sf() {
        super(3792, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A03);
        r3.Bpz(2, this.A04);
        r3.Bpz(3, this.A07);
        r3.Bpz(8, this.A08);
        r3.Bpz(9, this.A09);
        r3.Bpz(10, this.A00);
        r3.Bpz(11, this.A01);
        r3.Bpz(13, this.A0A);
        r3.Bpz(6, this.A0B);
        r3.Bpz(4, this.A05);
        r3.Bpz(12, this.A02);
        r3.Bpz(5, this.A06);
        r3.Bpz(7, this.A0C);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0R(C36331k8.A0Q(C36331k8.A0L(C36331k8.A0K(C36361kB.A0i(), this.A03, A1G), this.A04, A1G), this.A07, A1G), this.A08, A1G), this.A09);
        C36321k7.A1b(A1G, 14);
        A1G.put(C36341k9.A0b(C36331k8.A0T(C36401kF.A0j(), this.A00, A1G), this.A01, A1G), (Object) null);
        C36331k8.A1Q((Object) null, A1G, 16);
        C36331k8.A1Q((Object) null, A1G, 17);
        A1G.put(C36331k8.A0P(C36331k8.A0N(C36331k8.A0U(C36331k8.A0M(C36331k8.A0O(C36421kH.A0V(), this.A0A, A1G), this.A0B, A1G), this.A05, A1G), this.A02, A1G), this.A06, A1G), this.A0C);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamQbmMessageRead {");
        C20910yM.A00(C36331k8.A0h(this.A03), "chatsFolderType", A0u);
        C20910yM.A00(C36331k8.A0h(this.A04), "contactType", A0u);
        C20910yM.A00(this.A07, "deltaTime", A0u);
        C20910yM.A00(this.A08, "deltaTimeReceived", A0u);
        C20910yM.A00(this.A09, "hsmTagStr", A0u);
        C20910yM.A00(this.A00, "isFromAdsManagerMm", A0u);
        C20910yM.A00(this.A01, "isFromCapi", A0u);
        C20910yM.A00(this.A0A, "messageIdHmac", A0u);
        C20910yM.A00(this.A0B, "messageTypeStr", A0u);
        C20910yM.A00(C36331k8.A0h(this.A05), "qbmFlag", A0u);
        C20910yM.A00(this.A02, "readReceiptsEnabled", A0u);
        C20910yM.A00(C36331k8.A0h(this.A06), "readSource", A0u);
        return C36321k7.A0C(this.A0C, "threadIdHmac", A0u);
    }
}
