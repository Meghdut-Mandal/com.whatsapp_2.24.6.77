package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2NB  reason: invalid class name */
public final class AnonymousClass2NB extends C20890yK {
    public String A00;

    public AnonymousClass2NB() {
        super(1942, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A00);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36361kB.A0i(), this.A00);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamAdvertisingId {");
        return C36321k7.A0C(this.A00, "androidAdvertisingId", A0u);
    }
}
