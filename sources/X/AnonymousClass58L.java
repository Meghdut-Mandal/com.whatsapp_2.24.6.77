package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.58L  reason: invalid class name */
public final class AnonymousClass58L extends C20890yK {
    public Boolean A00;
    public Double A01;
    public Double A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public String A07;

    public AnonymousClass58L() {
        super(2444, new C18950u5(1, 20, 2000, false), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(9, this.A03);
        r3.Bpz(7, this.A00);
        r3.Bpz(3, this.A01);
        r3.Bpz(5, this.A04);
        r3.Bpz(2, this.A07);
        r3.Bpz(1, this.A05);
        r3.Bpz(4, this.A02);
        r3.Bpz(8, this.A06);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0Q(C36331k8.A0M(C36331k8.A0J(C36331k8.A0K(C36331k8.A0N(C36331k8.A0L(C36331k8.A0P(C36401kF.A0i(), this.A03, A1G), this.A00, A1G), this.A01, A1G), this.A04, A1G), this.A07, A1G), this.A05, A1G), this.A02, A1G), this.A06);
        C36321k7.A1b(A1G, 6);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamExitReasonEvent {");
        C20910yM.A00(this.A03, "exitImportance", A0u);
        C20910yM.A00(this.A00, "exitLowMemorySupported", A0u);
        C20910yM.A00(this.A01, "exitPss", A0u);
        C20910yM.A00(this.A04, "exitReason", A0u);
        C20910yM.A00(this.A07, "exitReasonDescription", A0u);
        C20910yM.A00(this.A05, "exitReasonTimestamp", A0u);
        C20910yM.A00(this.A02, "exitRss", A0u);
        return C36321k7.A0C(this.A06, "exitStatus", A0u);
    }
}
