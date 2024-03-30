package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2P0  reason: invalid class name */
public final class AnonymousClass2P0 extends C20890yK {
    public Boolean A00;
    public Boolean A01;

    public AnonymousClass2P0() {
        super(4104, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A00);
        r3.Bpz(2, this.A01);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        C36321k7.A1I(C36331k8.A0K(C36361kB.A0i(), this.A00, A1G), this.A01, A1G);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamWaffleDaily {");
        C20910yM.A00(this.A00, "isAccountConnected", A0u);
        return C36321k7.A0C(this.A01, "isAutoStatusCrossPostOn", A0u);
    }
}
