package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.58i  reason: invalid class name and case insensitive filesystem */
public final class C1041158i extends C20890yK {
    public Long A00;
    public Long A01;
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
    public Long A0C;
    public Long A0D;
    public Long A0E;

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A00);
        r3.Bpz(2, this.A01);
        r3.Bpz(3, this.A02);
        r3.Bpz(4, this.A03);
        r3.Bpz(5, this.A04);
        r3.Bpz(6, this.A05);
        r3.Bpz(7, this.A06);
        r3.Bpz(8, this.A07);
        r3.Bpz(9, this.A08);
        r3.Bpz(10, this.A09);
        r3.Bpz(11, this.A0A);
        r3.Bpz(12, this.A0B);
        r3.Bpz(13, this.A0C);
        r3.Bpz(14, this.A0D);
        r3.Bpz(15, this.A0E);
    }

    public C1041158i() {
        super(4504, C36431kI.A0q(), 2, 113760892);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36341k9.A0b(C36341k9.A0a(C36331k8.A0V(C36331k8.A0U(C36331k8.A0T(C36331k8.A0S(C36331k8.A0R(C36331k8.A0Q(C36331k8.A0P(C36331k8.A0O(C36331k8.A0N(C36331k8.A0M(C36331k8.A0L(C36331k8.A0K(C36361kB.A0i(), this.A00, A1G), this.A01, A1G), this.A02, A1G), this.A03, A1G), this.A04, A1G), this.A05, A1G), this.A06, A1G), this.A07, A1G), this.A08, A1G), this.A09, A1G), this.A0A, A1G), this.A0B, A1G), this.A0C, A1G), this.A0D, A1G), this.A0E);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamIncomingCallPrivacyImpact {");
        C20910yM.A00(this.A00, "acceptedWouldSilence180d", A0u);
        C20910yM.A00(this.A01, "acceptedWouldSilence30d", A0u);
        C20910yM.A00(this.A02, "acceptedWouldSilence360d", A0u);
        C20910yM.A00(this.A03, "acceptedWouldSilence60d", A0u);
        C20910yM.A00(this.A04, "acceptedWouldSilence90d", A0u);
        C20910yM.A00(this.A05, "allWouldSilence180d", A0u);
        C20910yM.A00(this.A06, "allWouldSilence30d", A0u);
        C20910yM.A00(this.A07, "allWouldSilence360d", A0u);
        C20910yM.A00(this.A08, "allWouldSilence60d", A0u);
        C20910yM.A00(this.A09, "allWouldSilence90d", A0u);
        C20910yM.A00(this.A0A, "total180d", A0u);
        C20910yM.A00(this.A0B, "total30d", A0u);
        C20910yM.A00(this.A0C, "total360d", A0u);
        C20910yM.A00(this.A0D, "total60d", A0u);
        return C36321k7.A0C(this.A0E, "total90d", A0u);
    }
}
