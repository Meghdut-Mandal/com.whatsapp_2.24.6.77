package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2SR  reason: invalid class name */
public final class AnonymousClass2SR extends C20890yK {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public String A0A;

    public AnonymousClass2SR() {
        super(2296, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(15, this.A03);
        r3.Bpz(14, this.A04);
        r3.Bpz(13, this.A00);
        r3.Bpz(4, this.A05);
        r3.Bpz(2, this.A01);
        r3.Bpz(7, this.A06);
        r3.Bpz(8, this.A02);
        r3.Bpz(1, this.A0A);
        r3.Bpz(9, this.A07);
        r3.Bpz(10, this.A08);
        r3.Bpz(3, this.A09);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36341k9.A0a(C36421kH.A0W(), this.A03, A1G), this.A04);
        C36321k7.A1b(A1G, 6);
        A1G.put(C36421kH.A0V(), this.A00);
        C36321k7.A1b(A1G, 5);
        A1G.put(C36331k8.A0L(C36331k8.A0S(C36331k8.A0R(C36331k8.A0J(C36331k8.A0U(C36331k8.A0T(C36331k8.A0Q(C36331k8.A0P(C36331k8.A0K(C36371kC.A0o(), this.A05, A1G), this.A01, A1G), this.A06, A1G), this.A02, A1G), (Object) null, A1G), (Object) null, A1G), this.A0A, A1G), this.A07, A1G), this.A08, A1G), this.A09);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamMdBootstrapHistoryDataDownloaded {");
        C20910yM.A00(this.A03, "historySyncChunkOrder", A0u);
        C20910yM.A00(this.A04, "historySyncStageProgress", A0u);
        C20910yM.A00(C36331k8.A0h(this.A00), "mdBootstrapHistoryPayloadType", A0u);
        C20910yM.A00(this.A05, "mdBootstrapPayloadSize", A0u);
        C20910yM.A00(C36331k8.A0h(this.A01), "mdBootstrapPayloadType", A0u);
        C20910yM.A00(this.A06, "mdBootstrapStepDuration", A0u);
        C20910yM.A00(C36331k8.A0h(this.A02), "mdBootstrapStepResult", A0u);
        C20910yM.A00(this.A0A, "mdSessionId", A0u);
        C20910yM.A00(this.A07, "mdStorageQuotaBytes", A0u);
        C20910yM.A00(this.A08, "mdStorageQuotaUsedBytes", A0u);
        return C36321k7.A0C(this.A09, "mdTimestamp", A0u);
    }
}
