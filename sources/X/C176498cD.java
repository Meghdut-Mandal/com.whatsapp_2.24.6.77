package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8cD  reason: invalid class name and case insensitive filesystem */
public final class C176498cD extends C20890yK {
    public Boolean A00;
    public Boolean A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;

    public C176498cD() {
        super(4336, new C18950u5(1, 1000, 2000, false), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A02);
        r3.Bpz(2, this.A03);
        r3.Bpz(3, this.A05);
        r3.Bpz(4, this.A06);
        r3.Bpz(5, this.A00);
        r3.Bpz(6, this.A01);
        r3.Bpz(7, this.A07);
        r3.Bpz(8, this.A08);
        r3.Bpz(9, this.A04);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0R(C36331k8.A0Q(C36331k8.A0P(C36331k8.A0O(C36331k8.A0N(C36331k8.A0M(C36331k8.A0L(C36331k8.A0K(C36361kB.A0i(), this.A02, A1G), this.A03, A1G), this.A05, A1G), this.A06, A1G), this.A00, A1G), this.A01, A1G), this.A07, A1G), this.A08, A1G), this.A04);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamMexEventV2 {");
        C20910yM.A00(this.A02, "mexEventV2DurationMs", A0u);
        C20910yM.A00(this.A03, "mexEventV2EndTime", A0u);
        C20910yM.A00(this.A05, "mexEventV2ErrorCodes", A0u);
        C20910yM.A00(this.A06, "mexEventV2Errors", A0u);
        C20910yM.A00(this.A00, "mexEventV2HasData", A0u);
        C20910yM.A00(this.A01, "mexEventV2IsMex", A0u);
        C20910yM.A00(this.A07, "mexEventV2OperationName", A0u);
        C20910yM.A00(this.A08, "mexEventV2QueryId", A0u);
        return C36321k7.A0C(this.A04, "mexEventV2StartTime", A0u);
    }
}
