package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2P3  reason: invalid class name */
public final class AnonymousClass2P3 extends C20890yK {
    public Integer A00;
    public Long A01;
    public String A02;

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A02);
        r3.Bpz(2, this.A01);
        r3.Bpz(5, this.A00);
    }

    public AnonymousClass2P3() {
        super(2692, C36441kJ.A0p(10, 1000, 1000000), 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        C36321k7.A1b(A1G, 4);
        C36321k7.A1I(C36331k8.A0N(C36331k8.A0K(C36361kB.A0i(), this.A02, A1G), this.A01, A1G), this.A00, A1G);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamActivityStats {");
        C20910yM.A00(this.A02, "featureName", A0u);
        C20910yM.A00(this.A01, "memoryKbsConsumed", A0u);
        return C36321k7.A0C(C36331k8.A0h(this.A00), "memoryStatStage", A0u);
    }
}
