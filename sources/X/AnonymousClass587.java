package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.587  reason: invalid class name */
public final class AnonymousClass587 extends C20890yK {
    public Long A00;
    public Long A01;
    public Long A02;
    public String A03;
    public String A04;
    public String A05;

    public AnonymousClass587() {
        super(3248, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(2, this.A03);
        r3.Bpz(3, this.A00);
        r3.Bpz(5, this.A01);
        r3.Bpz(7, this.A04);
        r3.Bpz(9, this.A05);
        r3.Bpz(8, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        C36321k7.A1b(A1G, 1);
        A1G.put(C36331k8.A0L(C36361kB.A0j(), this.A03, A1G), this.A00);
        C36321k7.A1b(A1G, 4);
        A1G.put(C36371kC.A0p(), this.A01);
        C36321k7.A1b(A1G, 6);
        A1G.put(C36331k8.A0Q(C36331k8.A0R(C36401kF.A0h(), this.A04, A1G), this.A05, A1G), this.A02);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamDirectoryServerRequests {");
        C20910yM.A00(this.A03, "directorySessionId", A0u);
        C20910yM.A00(this.A00, "endResponseTime", A0u);
        C20910yM.A00(this.A01, "httpResponseCode", A0u);
        C20910yM.A00(this.A04, "neworkLibraryType", A0u);
        C20910yM.A00(this.A05, "requestEndpoint", A0u);
        return C36321k7.A0C(this.A02, "startResponseTime", A0u);
    }
}
