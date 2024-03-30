package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Rk  reason: invalid class name and case insensitive filesystem */
public final class C45452Rk extends C20890yK {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Long A06;

    public C45452Rk() {
        super(4438, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A02);
        r3.Bpz(2, this.A03);
        r3.Bpz(3, this.A00);
        r3.Bpz(7, this.A01);
        r3.Bpz(4, this.A04);
        r3.Bpz(5, this.A06);
        r3.Bpz(6, this.A05);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0P(C36331k8.A0L(C36331k8.A0K(C36361kB.A0i(), this.A02, A1G), this.A03, A1G), this.A00, A1G), this.A01);
        C36321k7.A1b(A1G, 8);
        A1G.put(C36331k8.A0O(C36331k8.A0N(C36371kC.A0o(), this.A04, A1G), this.A06, A1G), this.A05);
        C36321k7.A1b(A1G, 9);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamPinInChatMessageSend {");
        C20910yM.A00(C36331k8.A0h(this.A02), "groupRole", A0u);
        C20910yM.A00(C36331k8.A0h(this.A03), "groupTypeClient", A0u);
        C36441kJ.A1G(this.A00, A0u);
        C20910yM.A00(this.A01, "isSelfParentMessage", A0u);
        C36441kJ.A1H(C36331k8.A0h(this.A04), A0u);
        C20910yM.A00(this.A06, "pinInChatExpirySecs", A0u);
        return C36321k7.A0C(C36331k8.A0h(this.A05), "pinInChatType", A0u);
    }
}
