package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Rw  reason: invalid class name and case insensitive filesystem */
public final class C45572Rw extends C20890yK {
    public Integer A00;
    public Integer A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public String A07;

    public C45572Rw() {
        super(2294, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(4, this.A02);
        r3.Bpz(2, this.A00);
        r3.Bpz(6, this.A03);
        r3.Bpz(7, this.A01);
        r3.Bpz(1, this.A07);
        r3.Bpz(8, this.A04);
        r3.Bpz(9, this.A05);
        r3.Bpz(3, this.A06);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0P(C36331k8.A0O(C36331k8.A0K(C36331k8.A0M(C36331k8.A0T(C36371kC.A0p(), (Object) null, A1G), (Object) null, A1G), this.A02, A1G), this.A00, A1G), this.A03, A1G), this.A01);
        C36321k7.A1b(A1G, 10);
        A1G.put(C36331k8.A0L(C36331k8.A0R(C36331k8.A0Q(C36361kB.A0i(), this.A07, A1G), this.A04, A1G), this.A05, A1G), this.A06);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamMdBootstrapAppStateDataDownloaded {");
        C20910yM.A00(this.A02, "mdBootstrapPayloadSize", A0u);
        C20910yM.A00(C36331k8.A0h(this.A00), "mdBootstrapPayloadType", A0u);
        C20910yM.A00(this.A03, "mdBootstrapStepDuration", A0u);
        C20910yM.A00(C36331k8.A0h(this.A01), "mdBootstrapStepResult", A0u);
        C20910yM.A00(this.A07, "mdSessionId", A0u);
        C20910yM.A00(this.A04, "mdStorageQuotaBytes", A0u);
        C20910yM.A00(this.A05, "mdStorageQuotaUsedBytes", A0u);
        return C36321k7.A0C(this.A06, "mdTimestamp", A0u);
    }
}
