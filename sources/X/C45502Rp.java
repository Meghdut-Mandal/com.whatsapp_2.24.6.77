package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Rp  reason: invalid class name and case insensitive filesystem */
public final class C45502Rp extends C20890yK {
    public Long A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;

    public C45502Rp() {
        super(4332, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A00);
        r3.Bpz(2, this.A01);
        r3.Bpz(3, this.A02);
        r3.Bpz(4, this.A03);
        r3.Bpz(5, this.A04);
        r3.Bpz(6, this.A05);
        r3.Bpz(7, this.A06);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0P(C36331k8.A0O(C36331k8.A0N(C36331k8.A0M(C36331k8.A0L(C36331k8.A0K(C36361kB.A0i(), this.A00, A1G), this.A01, A1G), this.A02, A1G), this.A03, A1G), this.A04, A1G), this.A05, A1G), this.A06);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamTsBitArray {");
        C20910yM.A00(this.A00, "bitarrayHigh", A0u);
        C20910yM.A00(this.A01, "bitarrayLength", A0u);
        C20910yM.A00(this.A02, "bitarrayLow", A0u);
        C20910yM.A00(this.A03, "cumulativeBits", A0u);
        C20910yM.A00(this.A04, "relativeTimestampMs", A0u);
        C20910yM.A00(this.A05, "sessionSeq", A0u);
        return C36321k7.A0C(this.A06, "tsSessionId", A0u);
    }
}
