package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.58W  reason: invalid class name */
public final class AnonymousClass58W extends C20890yK {
    public Double A00;
    public Double A01;
    public Double A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public String A09;

    public AnonymousClass58W() {
        super(2872, C36431kI.A0q(), 1, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(9, this.A06);
        r3.Bpz(7, this.A00);
        r3.Bpz(8, this.A01);
        r3.Bpz(10, this.A03);
        r3.Bpz(5, this.A04);
        r3.Bpz(1, this.A05);
        r3.Bpz(11, this.A07);
        r3.Bpz(12, this.A08);
        r3.Bpz(6, this.A02);
        r3.Bpz(2, this.A09);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36341k9.A0a(C36331k8.A0V(C36331k8.A0Q(C36331k8.A0P(C36401kF.A0i(), this.A06, A1G), this.A00, A1G), this.A01, A1G), (Object) null, A1G), (Object) null);
        C36331k8.A1Q((Object) null, A1G, 15);
        A1G.put(C36331k8.A0K(C36331k8.A0O(C36331k8.A0U(C36331k8.A0T(C36331k8.A0J(C36331k8.A0N(C36331k8.A0L(C36351kA.A0t(C36331k8.A0S(16, (Object) null, A1G), this.A03, A1G), (Object) null, A1G), (Object) null, A1G), this.A04, A1G), this.A05, A1G), this.A07, A1G), this.A08, A1G), this.A02, A1G), this.A09);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamXplatformMigrationExport {");
        C20910yM.A00(this.A06, "storageAvailSize", A0u);
        C20910yM.A00(this.A00, "waDbSize", A0u);
        C20910yM.A00(this.A01, "waMediaSize", A0u);
        C20910yM.A00(C36331k8.A0h(this.A03), "xpmDonorPlatform", A0u);
        C20910yM.A00(C36331k8.A0h(this.A04), "xpmError", A0u);
        C20910yM.A00(C36331k8.A0h(this.A05), "xpmEvent", A0u);
        C20910yM.A00(this.A07, "xpmExportDuration", A0u);
        C20910yM.A00(this.A08, "xpmExportProgress", A0u);
        C20910yM.A00(this.A02, "xpmExportedDbSize", A0u);
        return C36321k7.A0C(this.A09, "xpmFunnelId", A0u);
    }
}
