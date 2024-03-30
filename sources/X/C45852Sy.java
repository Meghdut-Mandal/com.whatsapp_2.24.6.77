package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Sy  reason: invalid class name and case insensitive filesystem */
public final class C45852Sy extends C20890yK {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public Integer A08;
    public Integer A09;
    public Integer A0A;
    public Integer A0B;
    public Long A0C;
    public Long A0D;
    public Long A0E;
    public String A0F;

    public C45852Sy() {
        super(1980, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(9, this.A0C);
        r3.Bpz(8, this.A03);
        r3.Bpz(16, this.A04);
        r3.Bpz(19, this.A00);
        r3.Bpz(12, this.A01);
        r3.Bpz(15, this.A02);
        r3.Bpz(14, this.A0F);
        r3.Bpz(6, this.A05);
        r3.Bpz(5, this.A06);
        r3.Bpz(10, this.A0D);
        r3.Bpz(2, this.A07);
        r3.Bpz(11, this.A08);
        r3.Bpz(3, this.A09);
        r3.Bpz(4, this.A0E);
        r3.Bpz(1, this.A0A);
        r3.Bpz(13, this.A0B);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36341k9.A0b(C36331k8.A0U(C36381kD.A0o(C36351kA.A0s(C36331k8.A0Q(C36401kF.A0i(), this.A0C, A1G), this.A03, A1G), this.A04, A1G), this.A00, A1G), this.A01, A1G), this.A02);
        C36321k7.A1b(A1G, 7);
        A1G.put(C36331k8.A0L(C36331k8.A0T(C36331k8.A0K(C36331k8.A0S(C36331k8.A0N(C36331k8.A0O(C36401kF.A0k(), this.A0F, A1G), this.A05, A1G), this.A06, A1G), this.A0D, A1G), this.A07, A1G), this.A08, A1G), this.A09);
        C36321k7.A1b(A1G, 17);
        A1G.put(C36331k8.A0V(C36331k8.A0J(C36371kC.A0o(), this.A0E, A1G), this.A0A, A1G), this.A0B);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamPlaceholderActivity {");
        C20910yM.A00(this.A0C, "deviceCount", A0u);
        C20910yM.A00(C36331k8.A0h(this.A03), "deviceSizeBucket", A0u);
        C20910yM.A00(C36331k8.A0h(this.A04), "e2eSenderType", A0u);
        C20910yM.A00(this.A00, "isHostedChat", A0u);
        C20910yM.A00(this.A01, "isLid", A0u);
        C20910yM.A00(this.A02, "messageBeforeReg", A0u);
        C20910yM.A00(this.A0F, "messageKeyHash", A0u);
        C20910yM.A00(C36331k8.A0h(this.A05), "messageMediaType", A0u);
        C20910yM.A00(C36331k8.A0h(this.A06), "messageType", A0u);
        C20910yM.A00(this.A0D, "participantCount", A0u);
        C20910yM.A00(C36331k8.A0h(this.A07), "placeholderActionInd", A0u);
        C20910yM.A00(C36331k8.A0h(this.A08), "placeholderAddReason", A0u);
        C20910yM.A00(C36331k8.A0h(this.A09), "placeholderChatTypeInd", A0u);
        C20910yM.A00(this.A0E, "placeholderTimePeriod", A0u);
        C20910yM.A00(C36331k8.A0h(this.A0A), "placeholderTypeInd", A0u);
        return C36321k7.A0C(C36331k8.A0h(this.A0B), "typeOfGroup", A0u);
    }
}
