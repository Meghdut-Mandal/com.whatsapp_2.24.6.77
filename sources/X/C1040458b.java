package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.58b  reason: invalid class name and case insensitive filesystem */
public final class C1040458b extends C20890yK {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public String A0A;

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(7, this.A04);
        r3.Bpz(8, this.A00);
        r3.Bpz(9, this.A05);
        r3.Bpz(10, this.A02);
        r3.Bpz(2, this.A06);
        r3.Bpz(11, this.A0A);
        r3.Bpz(6, this.A07);
        r3.Bpz(3, this.A01);
        r3.Bpz(4, this.A08);
        r3.Bpz(1, this.A03);
        r3.Bpz(5, this.A09);
    }

    public C1040458b() {
        super(2032, C20890yK.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0N(C36331k8.A0J(C36331k8.A0M(C36331k8.A0L(C36331k8.A0O(C36331k8.A0T(C36331k8.A0K(C36331k8.A0S(C36331k8.A0R(C36331k8.A0Q(C36401kF.A0h(), this.A04, A1G), this.A00, A1G), this.A05, A1G), this.A02, A1G), this.A06, A1G), this.A0A, A1G), this.A07, A1G), this.A01, A1G), this.A08, A1G), this.A03, A1G), this.A09);
        C36321k7.A1b(A1G, 12);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamInlineVideoPlaybackClosed {");
        C20910yM.A00(this.A04, "inlineVideoCancelBeforePlayStateT", A0u);
        C20910yM.A00(this.A00, "inlineVideoComplete", A0u);
        C20910yM.A00(this.A05, "inlineVideoCompletionRate", A0u);
        C20910yM.A00(C36331k8.A0h(this.A02), "inlineVideoCtaClick", A0u);
        C20910yM.A00(this.A06, "inlineVideoDurationT", A0u);
        C20910yM.A00(this.A0A, "inlineVideoError", A0u);
        C20910yM.A00(this.A07, "inlineVideoPlayStartT", A0u);
        C20910yM.A00(this.A01, "inlineVideoPlayed", A0u);
        C20910yM.A00(this.A08, "inlineVideoStallT", A0u);
        C20910yM.A00(C36331k8.A0h(this.A03), "inlineVideoType", A0u);
        return C36321k7.A0C(this.A09, "inlineVideoWatchT", A0u);
    }
}
