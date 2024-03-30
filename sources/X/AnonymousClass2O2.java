package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2O2  reason: invalid class name */
public final class AnonymousClass2O2 extends C20890yK {
    public Long A00;

    public AnonymousClass2O2() {
        super(5164, C36431kI.A0q(), 3, 0);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(2, this.A00);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        C36321k7.A1b(A1G, 1);
        C36321k7.A1I(C36361kB.A0j(), this.A00, A1G);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamWamTestAnonymousRealtime {");
        return C36321k7.A0C(this.A00, "psRealtimeTestIntField", A0u);
    }
}
