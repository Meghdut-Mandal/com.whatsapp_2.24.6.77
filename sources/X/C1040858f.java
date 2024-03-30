package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.58f  reason: invalid class name and case insensitive filesystem */
public final class C1040858f extends C20890yK {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Double A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(12, this.A08);
        r3.Bpz(15, this.A09);
        r3.Bpz(16, this.A00);
        r3.Bpz(17, this.A0A);
        r3.Bpz(8, this.A01);
        r3.Bpz(10, this.A04);
        r3.Bpz(11, this.A0B);
        r3.Bpz(18, this.A02);
        r3.Bpz(14, this.A03);
        r3.Bpz(9, this.A05);
        r3.Bpz(13, this.A0C);
        r3.Bpz(5, this.A06);
        r3.Bpz(6, this.A07);
    }

    public C1040858f() {
        super(2044, C20890yK.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36431kI.A12(), this.A08);
        C36321k7.A1b(A1G, 7);
        A1G.put(C36351kA.A0t(C36351kA.A0s(15, this.A09, A1G), this.A00, A1G), this.A0A);
        C36321k7.A1b(A1G, 1);
        A1G.put(C36391kE.A0r(), this.A01);
        C36321k7.A1b(A1G, 4);
        A1G.put(C36331k8.A0O(C36331k8.A0N(C36331k8.A0V(C36331k8.A0L(C36331k8.A0K(C36331k8.A0R(C36341k9.A0a(C36371kC.A0q(C36331k8.A0T(C36401kF.A0j(), this.A04, A1G), this.A0B, A1G), this.A02, A1G), this.A03, A1G), this.A05, A1G), (Object) null, A1G), (Object) null, A1G), this.A0C, A1G), this.A06, A1G), this.A07);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamPttPlayback {");
        C20910yM.A00(this.A08, "pttDuration", A0u);
        C20910yM.A00(this.A09, "pttMiniPlayerClick", A0u);
        C20910yM.A00(this.A00, "pttMiniPlayerClose", A0u);
        C20910yM.A00(this.A0A, "pttMiniPlayerPauseCnt", A0u);
        C20910yM.A00(this.A01, "pttPlaybackFailed", A0u);
        C20910yM.A00(C36331k8.A0h(this.A04), "pttPlaybackSpeed", A0u);
        C20910yM.A00(this.A0B, "pttPlaybackSpeedCnt", A0u);
        C20910yM.A00(this.A02, "pttPlayedOutOfChat", A0u);
        C20910yM.A00(this.A03, "pttPlayedPct", A0u);
        C20910yM.A00(C36331k8.A0h(this.A05), "pttPlayer", A0u);
        C20910yM.A00(this.A0C, "pttSeekCnt", A0u);
        C20910yM.A00(C36331k8.A0h(this.A06), "pttTrigger", A0u);
        return C36321k7.A0C(C36331k8.A0h(this.A07), "pttType", A0u);
    }
}
