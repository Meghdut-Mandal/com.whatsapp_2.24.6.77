package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Ou  reason: invalid class name and case insensitive filesystem */
public final class C44772Ou extends C20890yK {
    public Integer A00;
    public Integer A01;

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A00);
        r3.Bpz(2, this.A01);
    }

    public C44772Ou() {
        super(1936, C20890yK.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0K(C36361kB.A0i(), this.A00, A1G), this.A01);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamStarMessage {");
        C36441kJ.A1H(C36331k8.A0h(this.A00), A0u);
        return C36321k7.A0C(C36331k8.A0h(this.A01), "starMessageEntryPoint", A0u);
    }
}
