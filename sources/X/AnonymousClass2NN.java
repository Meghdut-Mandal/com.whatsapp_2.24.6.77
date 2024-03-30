package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2NN  reason: invalid class name */
public final class AnonymousClass2NN extends C20890yK {
    public Integer A00;

    public AnonymousClass2NN() {
        super(3678, C36431kI.A0q(), 2, 0);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(3, this.A00);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        C36321k7.A1b(A1G, 2);
        A1G.put(C36371kC.A0n(), this.A00);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamCtwaReliabilityUnderstand {");
        return C36321k7.A0C(C36331k8.A0h(this.A00), "reliabilityActionEnum", A0u);
    }
}
