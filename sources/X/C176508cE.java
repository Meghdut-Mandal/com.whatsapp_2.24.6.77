package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8cE  reason: invalid class name and case insensitive filesystem */
public final class C176508cE extends C20890yK {
    public Boolean A00;
    public Boolean A01;
    public Double A02;
    public Integer A03;
    public Integer A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(7, this.A05);
        r3.Bpz(8, this.A06);
        r3.Bpz(5, this.A07);
        r3.Bpz(4, this.A00);
        r3.Bpz(9, this.A08);
        r3.Bpz(1, this.A03);
        r3.Bpz(3, this.A02);
        r3.Bpz(2, this.A04);
        r3.Bpz(6, this.A01);
    }

    public C176508cE() {
        super(458, C20890yK.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0O(C36331k8.A0K(C36331k8.A0L(C36331k8.A0J(C36331k8.A0R(C36331k8.A0M(C36331k8.A0N(C36331k8.A0Q(C36401kF.A0h(), this.A05, A1G), this.A06, A1G), this.A07, A1G), this.A00, A1G), this.A08, A1G), this.A03, A1G), this.A02, A1G), this.A04, A1G), this.A01);
        C36321k7.A1b(A1G, 10);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamPtt {");
        C20910yM.A00(this.A05, "pttDraftPlayCnt", A0u);
        C20910yM.A00(this.A06, "pttDraftSeekCnt", A0u);
        C20910yM.A00(this.A07, "pttDuration", A0u);
        C20910yM.A00(this.A00, "pttLock", A0u);
        C20910yM.A00(this.A08, "pttPauseCnt", A0u);
        C20910yM.A00(C36331k8.A0h(this.A03), "pttResult", A0u);
        C20910yM.A00(this.A02, "pttSize", A0u);
        C20910yM.A00(C36331k8.A0h(this.A04), "pttSource", A0u);
        return C36321k7.A0C(this.A01, "pttStop", A0u);
    }
}
