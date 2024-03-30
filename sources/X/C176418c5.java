package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8c5  reason: invalid class name and case insensitive filesystem */
public final class C176418c5 extends C20890yK {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public String A04;
    public String A05;

    public C176418c5() {
        super(5236, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A00);
        r3.Bpz(6, this.A01);
        r3.Bpz(7, this.A04);
        r3.Bpz(2, this.A02);
        r3.Bpz(3, this.A05);
        r3.Bpz(5, this.A03);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0L(C36331k8.A0K(C36331k8.A0P(C36331k8.A0O(C36361kB.A0i(), this.A00, A1G), this.A01, A1G), this.A04, A1G), this.A02, A1G), this.A05);
        C36321k7.A1b(A1G, 4);
        A1G.put(C36371kC.A0p(), this.A03);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamEmailEvent {");
        C20910yM.A00(C36331k8.A0h(this.A00), "emailAction", A0u);
        C20910yM.A00(C36331k8.A0h(this.A01), "emailActionStatus", A0u);
        C20910yM.A00(this.A04, "emailActionStatusReason", A0u);
        C20910yM.A00(C36331k8.A0h(this.A02), "emailEntrypoint", A0u);
        C20910yM.A00(this.A05, "emailSessionId", A0u);
        return C36321k7.A0C(C36331k8.A0h(this.A03), "emailSurface", A0u);
    }
}
