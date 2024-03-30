package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Qq  reason: invalid class name and case insensitive filesystem */
public final class C45252Qq extends C20890yK {
    public Boolean A00;
    public Integer A01;
    public Long A02;
    public String A03;
    public String A04;

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A03);
        r3.Bpz(2, this.A04);
        r3.Bpz(3, this.A01);
        r3.Bpz(4, this.A00);
        r3.Bpz(5, this.A02);
    }

    public C45252Qq() {
        super(3466, C36331k8.A0H(), 2, 113760892);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0K(C36361kB.A0i(), this.A03, A1G), this.A04);
        C36321k7.A1b(A1G, 6);
        A1G.put(C36331k8.A0Q(C36331k8.A0P(C36331k8.A0N(C36331k8.A0M(C36371kC.A0n(), this.A01, A1G), this.A00, A1G), this.A02, A1G), (Object) null, A1G), (Object) null);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamCtwaUserJourney {");
        C20910yM.A00(this.A03, "adId", A0u);
        C20910yM.A00(this.A04, "businessJid", A0u);
        C20910yM.A00(C36331k8.A0h(this.A01), "ctwaUserJourneyOperation", A0u);
        C20910yM.A00(this.A00, "icebreakersShown", A0u);
        return C36321k7.A0C(this.A02, "sequenceNumber", A0u);
    }
}
