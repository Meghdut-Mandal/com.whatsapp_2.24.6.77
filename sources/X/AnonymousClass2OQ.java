package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2OQ  reason: invalid class name */
public final class AnonymousClass2OQ extends C20890yK {
    public Long A00;
    public String A01;

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(2, this.A01);
        r3.Bpz(1, this.A00);
    }

    public AnonymousClass2OQ() {
        super(2442, C20890yK.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0J(C36361kB.A0j(), this.A01, A1G), this.A00);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamExitReasonsSummary {");
        C20910yM.A00(this.A01, "exitReasonsCensus", A0u);
        return C36321k7.A0C(this.A00, "lastReportedExitTime", A0u);
    }
}
