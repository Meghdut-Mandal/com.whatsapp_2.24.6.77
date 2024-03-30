package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.58C  reason: invalid class name */
public final class AnonymousClass58C extends C20890yK {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A00);
        r3.Bpz(2, this.A01);
        r3.Bpz(3, this.A02);
        r3.Bpz(4, this.A03);
        r3.Bpz(5, this.A04);
        r3.Bpz(6, this.A05);
        r3.Bpz(7, this.A06);
    }

    public AnonymousClass58C() {
        super(4030, C20890yK.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0P(C36331k8.A0O(C36331k8.A0N(C36331k8.A0M(C36331k8.A0L(C36331k8.A0K(C36361kB.A0i(), this.A00, A1G), this.A01, A1G), this.A02, A1G), this.A03, A1G), this.A04, A1G), this.A05, A1G), this.A06);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamArfxWaterfallEvent {");
        C20910yM.A00(this.A00, "cameraProductName", A0u);
        C20910yM.A00(this.A01, "deliveryOperationId", A0u);
        C20910yM.A00(this.A02, "effectInstanceId", A0u);
        C20910yM.A00(this.A03, "effectSessionId", A0u);
        C20910yM.A00(this.A04, "productSessionId", A0u);
        C20910yM.A00(this.A05, "sessionStartIntent", A0u);
        return C36321k7.A0C(this.A06, "waterfallEvent", A0u);
    }
}
