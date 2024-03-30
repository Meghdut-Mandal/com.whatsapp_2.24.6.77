package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.58c  reason: invalid class name and case insensitive filesystem */
public final class C1040558c extends C20890yK {
    public Integer A00;
    public Integer A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public Long A0B;

    public C1040558c() {
        super(1914, new C18950u5(1, 1000, 2000, false), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(3, this.A02);
        r3.Bpz(6, this.A03);
        r3.Bpz(10, this.A04);
        r3.Bpz(12, this.A05);
        r3.Bpz(5, this.A06);
        r3.Bpz(9, this.A07);
        r3.Bpz(11, this.A08);
        r3.Bpz(4, this.A09);
        r3.Bpz(8, this.A0A);
        r3.Bpz(7, this.A00);
        r3.Bpz(1, this.A01);
        r3.Bpz(2, this.A0B);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0K(C36331k8.A0J(C36331k8.A0P(C36331k8.A0Q(C36331k8.A0M(C36331k8.A0T(C36331k8.A0R(C36331k8.A0N(C36331k8.A0U(C36331k8.A0S(C36331k8.A0O(C36371kC.A0n(), this.A02, A1G), this.A03, A1G), this.A04, A1G), this.A05, A1G), this.A06, A1G), this.A07, A1G), this.A08, A1G), this.A09, A1G), this.A0A, A1G), this.A00, A1G), this.A01, A1G), this.A0B);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamAndroidMediaFileScanEvent {");
        C20910yM.A00(this.A02, "analyzeT", A0u);
        C20910yM.A00(this.A03, "bytesAnalyzed", A0u);
        C20910yM.A00(this.A04, "bytesMerged", A0u);
        C20910yM.A00(this.A05, "bytesRelinked", A0u);
        C20910yM.A00(this.A06, "filesAnalyzed", A0u);
        C20910yM.A00(this.A07, "filesMerged", A0u);
        C20910yM.A00(this.A08, "filesRelinked", A0u);
        C20910yM.A00(this.A09, "filesScanned", A0u);
        C20910yM.A00(this.A0A, "filesToAnalyze", A0u);
        C20910yM.A00(C36331k8.A0h(this.A00), "mediaType", A0u);
        C20910yM.A00(C36331k8.A0h(this.A01), "origin", A0u);
        return C36321k7.A0C(this.A0B, "scanT", A0u);
    }
}
