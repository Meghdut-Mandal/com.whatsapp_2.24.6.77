package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2SJ  reason: invalid class name */
public final class AnonymousClass2SJ extends C20890yK {
    public Boolean A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public String A08;
    public String A09;

    public AnonymousClass2SJ() {
        super(3782, C36441kJ.A0p(1, 1000, 2000), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A00);
        r3.Bpz(2, this.A08);
        r3.Bpz(12, this.A01);
        r3.Bpz(3, this.A02);
        r3.Bpz(13, this.A03);
        r3.Bpz(7, this.A09);
        r3.Bpz(14, this.A04);
        r3.Bpz(8, this.A05);
        r3.Bpz(9, this.A06);
        r3.Bpz(11, this.A07);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0R(C36331k8.A0Q(C36341k9.A0a(C36331k8.A0P(C36331k8.A0V(C36331k8.A0L(C36331k8.A0U(C36331k8.A0K(C36361kB.A0i(), this.A00, A1G), this.A08, A1G), this.A01, A1G), this.A02, A1G), this.A03, A1G), this.A09, A1G), this.A04, A1G), this.A05, A1G), this.A06);
        C36321k7.A1b(A1G, 10);
        A1G.put(C36421kH.A0U(), this.A07);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamMexEvent {");
        C20910yM.A00(this.A00, "isMex", A0u);
        C20910yM.A00(this.A08, "mexEventData", A0u);
        C20910yM.A00(this.A01, "mexEventDurationT", A0u);
        C20910yM.A00(this.A02, "mexEventEndTime", A0u);
        C20910yM.A00(this.A03, "mexEventEnvelopeResponseStatus", A0u);
        C20910yM.A00(this.A09, "mexEventOperation", A0u);
        C20910yM.A00(this.A04, "mexEventPayloadResponseStatus", A0u);
        C20910yM.A00(this.A05, "mexEventRequestSize", A0u);
        C20910yM.A00(this.A06, "mexEventResponseSize", A0u);
        return C36321k7.A0C(this.A07, "mexEventStartTime", A0u);
    }
}
