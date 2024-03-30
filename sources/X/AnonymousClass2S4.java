package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2S4  reason: invalid class name */
public final class AnonymousClass2S4 extends C20890yK {
    public Boolean A00;
    public Double A01;
    public Integer A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;

    public AnonymousClass2S4() {
        super(2200, C36441kJ.A0p(1, 20, 200), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A00);
        r3.Bpz(9, this.A01);
        r3.Bpz(3, this.A02);
        r3.Bpz(5, this.A03);
        r3.Bpz(6, this.A04);
        r3.Bpz(7, this.A05);
        r3.Bpz(8, this.A06);
        r3.Bpz(2, this.A07);
        r3.Bpz(4, this.A08);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0M(C36331k8.A0K(C36331k8.A0Q(C36331k8.A0P(C36331k8.A0O(C36331k8.A0N(C36331k8.A0L(C36331k8.A0R(C36361kB.A0i(), this.A00, A1G), this.A01, A1G), this.A02, A1G), this.A03, A1G), this.A04, A1G), this.A05, A1G), this.A06, A1G), this.A07, A1G), this.A08);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamImageDownloadHashMismatch {");
        C20910yM.A00(this.A00, "isStreaming", A0u);
        C20910yM.A00(this.A01, "mediaSize", A0u);
        C36441kJ.A1H(C36331k8.A0h(this.A02), A0u);
        C20910yM.A00(this.A03, "scan1Length", A0u);
        C20910yM.A00(this.A04, "scan2Length", A0u);
        C20910yM.A00(this.A05, "scan3Length", A0u);
        C20910yM.A00(this.A06, "scan4Length", A0u);
        C20910yM.A00(this.A07, "scanForHashMismatch", A0u);
        return C36321k7.A0C(this.A08, "scansAvailable", A0u);
    }
}
