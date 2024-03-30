package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.581  reason: invalid class name */
public final class AnonymousClass581 extends C20890yK {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public String A04;

    public AnonymousClass581() {
        super(5186, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A04);
        r3.Bpz(2, this.A00);
        r3.Bpz(3, this.A01);
        r3.Bpz(4, this.A02);
        r3.Bpz(5, this.A03);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0N(C36331k8.A0M(C36331k8.A0L(C36331k8.A0K(C36361kB.A0i(), this.A04, A1G), this.A00, A1G), this.A01, A1G), this.A02, A1G), this.A03);
        C36321k7.A1b(A1G, 6);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamMediaSharingUserJourney {");
        C20910yM.A00(this.A04, "mediaSessionId", A0u);
        C20910yM.A00(C36331k8.A0h(this.A00), "mediaUserJourneyOrigin", A0u);
        C20910yM.A00(C36331k8.A0h(this.A01), "mediaUserJourneyScreen", A0u);
        C20910yM.A00(C36331k8.A0h(this.A02), "mediaUserJourneyTarget", A0u);
        return C36321k7.A0C(C36331k8.A0h(this.A03), "userJourneyAction", A0u);
    }
}
