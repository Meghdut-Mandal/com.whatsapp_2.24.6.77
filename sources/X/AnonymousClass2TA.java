package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2TA  reason: invalid class name */
public final class AnonymousClass2TA extends C20890yK {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public String A03;

    public AnonymousClass2TA() {
        super(3180, new C18950u5(1, 1, 100, false), 2, 0);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A00);
        r3.Bpz(4, this.A01);
        r3.Bpz(5, this.A03);
        r3.Bpz(6, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0O(C36331k8.A0N(C36331k8.A0M(C36331k8.A0L(C36331k8.A0K(C36361kB.A0i(), this.A00, A1G), (Object) null, A1G), (Object) null, A1G), this.A01, A1G), this.A03, A1G), this.A02);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamMdAppStateSyncMutationStats {");
        C20910yM.A00(C36331k8.A0h(this.A00), "applied", A0u);
        C20910yM.A00(C36331k8.A0h(this.A01), "orphan", A0u);
        C20910yM.A00(this.A03, "syncdAction", A0u);
        return C36321k7.A0C(C36331k8.A0h(this.A02), "unsupported", A0u);
    }
}
