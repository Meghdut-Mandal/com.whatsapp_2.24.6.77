package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Nb  reason: invalid class name and case insensitive filesystem */
public final class C44322Nb extends C20890yK {
    public Boolean A00;

    public C44322Nb() {
        super(2520, C36441kJ.A0p(1, 20, 1000), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(2, this.A00);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36361kB.A0j(), this.A00);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamMdAppStateDirtyBits {");
        return C36321k7.A0C(this.A00, "dirtyBitsFalsePositive", A0u);
    }
}
