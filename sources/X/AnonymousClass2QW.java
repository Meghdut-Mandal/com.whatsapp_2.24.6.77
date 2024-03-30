package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2QW  reason: invalid class name */
public final class AnonymousClass2QW extends C20890yK {
    public Integer A00;
    public Long A01;
    public Long A02;
    public Long A03;

    public AnonymousClass2QW() {
        super(4574, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A01);
        r3.Bpz(2, this.A02);
        r3.Bpz(3, this.A00);
        r3.Bpz(4, this.A03);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0M(C36331k8.A0L(C36331k8.A0K(C36361kB.A0i(), this.A01, A1G), this.A02, A1G), this.A00, A1G), this.A03);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamTsExternal {");
        C20910yM.A00(this.A01, "relativeTimestampMs", A0u);
        C20910yM.A00(this.A02, "tsDuration", A0u);
        C20910yM.A00(C36331k8.A0h(this.A00), "tsExternalEventSource", A0u);
        return C36321k7.A0C(this.A03, "tsSessionId", A0u);
    }
}
