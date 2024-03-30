package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.592  reason: invalid class name */
public final class AnonymousClass592 extends C20890yK {
    public Boolean A00;
    public Double A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Long A05;
    public Long A06;
    public String A07;

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(6, this.A00);
        r3.Bpz(4, this.A07);
        r3.Bpz(8, this.A01);
        r3.Bpz(5, this.A05);
        r3.Bpz(3, this.A02);
        r3.Bpz(9, this.A06);
        r3.Bpz(1, this.A03);
        r3.Bpz(2, this.A04);
    }

    public AnonymousClass592() {
        super(834, C20890yK.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0K(C36331k8.A0J(C36331k8.A0R(C36331k8.A0L(C36331k8.A0N(C36331k8.A0Q(C36331k8.A0M(C36381kD.A0n(), this.A00, A1G), this.A07, A1G), this.A01, A1G), this.A05, A1G), this.A02, A1G), this.A06, A1G), this.A03, A1G), this.A04);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamPlacesApiQuery {");
        C20910yM.A00(this.A00, "placesApiCached", A0u);
        C20910yM.A00(this.A07, "placesApiFailureDescription", A0u);
        C20910yM.A00(this.A01, "placesApiPlacesCount", A0u);
        C20910yM.A00(this.A05, "placesApiRequestIndex", A0u);
        C20910yM.A00(C36331k8.A0h(this.A02), "placesApiResponse", A0u);
        C20910yM.A00(this.A06, "placesApiResponseT", A0u);
        C20910yM.A00(C36331k8.A0h(this.A03), "placesApiSource", A0u);
        return C36321k7.A0C(C36331k8.A0h(this.A04), "placesApiSourceDefault", A0u);
    }
}
