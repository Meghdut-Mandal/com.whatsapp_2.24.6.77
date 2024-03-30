package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Pu  reason: invalid class name and case insensitive filesystem */
public final class C45032Pu extends C20890yK {
    public Integer A00;
    public Long A01;
    public Long A02;

    public C45032Pu() {
        super(5026, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A01);
        r3.Bpz(2, this.A00);
        r3.Bpz(3, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0L(C36331k8.A0K(C36361kB.A0i(), Integer.valueOf(A1G.size()), A1G), this.A00, A1G), this.A02);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamStickerLatency {");
        C20910yM.A00(this.A01, "size", A0u);
        C20910yM.A00(C36331k8.A0h(this.A00), "stickerLatencyAction", A0u);
        return C36321k7.A0C(this.A02, "stickerLatencyTtAction", A0u);
    }
}
