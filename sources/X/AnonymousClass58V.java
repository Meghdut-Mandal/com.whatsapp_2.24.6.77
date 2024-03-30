package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.58V  reason: invalid class name */
public final class AnonymousClass58V extends C20890yK {
    public Integer A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;

    public AnonymousClass58V() {
        super(3062, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(9, this.A01);
        r3.Bpz(10, this.A02);
        r3.Bpz(3, this.A00);
        r3.Bpz(5, this.A03);
        r3.Bpz(6, this.A04);
        r3.Bpz(2, this.A06);
        r3.Bpz(8, this.A07);
        r3.Bpz(4, this.A05);
        r3.Bpz(7, this.A08);
        r3.Bpz(1, this.A09);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0J(C36331k8.A0P(C36331k8.A0M(C36331k8.A0Q(C36331k8.A0K(C36331k8.A0O(C36331k8.A0N(C36331k8.A0L(C36331k8.A0S(C36401kF.A0i(), this.A01, A1G), this.A02, A1G), this.A00, A1G), this.A03, A1G), this.A04, A1G), this.A06, A1G), this.A07, A1G), this.A05, A1G), this.A08, A1G), this.A09);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamDirectorySearchConsumerServerErrors {");
        C20910yM.A00(this.A01, "directorySearchAcsErrorCode", A0u);
        C20910yM.A00(this.A02, "directorySearchAcsTokenNotReadyReason", A0u);
        C20910yM.A00(C36331k8.A0h(this.A00), "directorySearchCallType", A0u);
        C20910yM.A00(this.A03, "directorySearchErrorApiErrorCode", A0u);
        C20910yM.A00(this.A04, "directorySearchErrorApiErrorSubCode", A0u);
        C20910yM.A00(this.A06, "directorySearchErrorEntrypoint", A0u);
        C20910yM.A00(this.A07, "directorySearchErrorFbtraceId", A0u);
        C20910yM.A00(this.A05, "directorySearchErrorHttpResponseCode", A0u);
        C20910yM.A00(this.A08, "directorySearchErrorMessage", A0u);
        return C36321k7.A0C(this.A09, "directorySessionId", A0u);
    }
}
