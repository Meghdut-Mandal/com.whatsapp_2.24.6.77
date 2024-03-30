package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2QK  reason: invalid class name */
public final class AnonymousClass2QK extends C20890yK {
    public Integer A00;
    public Long A01;
    public String A02;
    public String A03;

    public AnonymousClass2QK() {
        super(2286, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(2, this.A00);
        r3.Bpz(4, this.A02);
        r3.Bpz(1, this.A03);
        r3.Bpz(3, this.A01);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0L(C36331k8.A0J(C36331k8.A0M(C36361kB.A0j(), this.A00, A1G), this.A02, A1G), this.A03, A1G), this.A01);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamMdBootstrapStarted {");
        C20910yM.A00(C36331k8.A0h(this.A00), "mdBootstrapSource", A0u);
        C20910yM.A00(this.A02, "mdRegAttemptId", A0u);
        C20910yM.A00(this.A03, "mdSessionId", A0u);
        return C36321k7.A0C(this.A01, "mdTimestamp", A0u);
    }
}
