package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.58h  reason: invalid class name and case insensitive filesystem */
public final class C1041058h extends C20890yK {
    public Boolean A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;

    public C1041058h() {
        super(4714, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(8, this.A07);
        r3.Bpz(9, this.A08);
        r3.Bpz(10, this.A09);
        r3.Bpz(11, this.A00);
        r3.Bpz(1, this.A01);
        r3.Bpz(2, this.A02);
        r3.Bpz(3, this.A03);
        r3.Bpz(4, this.A04);
        r3.Bpz(5, this.A05);
        r3.Bpz(12, this.A0A);
        r3.Bpz(13, this.A0B);
        r3.Bpz(14, this.A0C);
        r3.Bpz(6, this.A06);
        r3.Bpz(7, this.A0D);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0P(C36331k8.A0O(C36341k9.A0a(C36331k8.A0V(C36331k8.A0U(C36331k8.A0N(C36331k8.A0M(C36331k8.A0L(C36331k8.A0K(C36331k8.A0J(C36331k8.A0T(C36331k8.A0S(C36331k8.A0R(C36391kE.A0r(), this.A07, A1G), this.A08, A1G), this.A09, A1G), this.A00, A1G), this.A01, A1G), this.A02, A1G), this.A03, A1G), this.A04, A1G), this.A05, A1G), this.A0A, A1G), this.A0B, A1G), this.A0C, A1G), this.A06, A1G), this.A0D);
        C36321k7.A1b(A1G, 15);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamBotVideoPlayback {");
        C20910yM.A00(this.A07, "actionName", A0u);
        C20910yM.A00(this.A08, "fallbackReason", A0u);
        C20910yM.A00(this.A09, "intensityName", A0u);
        C20910yM.A00(this.A00, "isVideoNotReady", A0u);
        C20910yM.A00(this.A01, "playbackErrorCode", A0u);
        C20910yM.A00(this.A02, "playbackStallCount", A0u);
        C20910yM.A00(this.A03, "playbackStallTime", A0u);
        C20910yM.A00(this.A04, "playbackStartLatency", A0u);
        C20910yM.A00(this.A05, "playbackTime", A0u);
        C20910yM.A00(this.A0A, "sentimentName", A0u);
        C20910yM.A00(this.A0B, "stateName", A0u);
        C20910yM.A00(this.A0C, "threadSessionId", A0u);
        C20910yM.A00(this.A06, "videoDuration", A0u);
        return C36321k7.A0C(this.A0D, "videoId", A0u);
    }
}