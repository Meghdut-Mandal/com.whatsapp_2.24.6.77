package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Na  reason: invalid class name and case insensitive filesystem */
public final class C44312Na extends C20890yK {
    public Long A00;

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A00);
    }

    public C44312Na() {
        super(2508, C20890yK.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36361kB.A0i(), this.A00);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamMdAppStateCompanionsRemoval {");
        return C36321k7.A0C(this.A00, "syncdCompanionsRemovalRetryCount", A0u);
    }
}
