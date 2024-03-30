package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8cN  reason: invalid class name and case insensitive filesystem */
public final class C176598cN extends C20890yK {
    public Integer A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;

    public C176598cN() {
        super(4470, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A01);
        r3.Bpz(2, this.A02);
        r3.Bpz(3, this.A03);
        r3.Bpz(4, this.A04);
        r3.Bpz(5, this.A05);
        r3.Bpz(15, this.A06);
        r3.Bpz(6, this.A07);
        r3.Bpz(7, this.A08);
        r3.Bpz(8, this.A00);
        r3.Bpz(9, this.A09);
        r3.Bpz(10, this.A0A);
        r3.Bpz(11, this.A0B);
        r3.Bpz(12, this.A0C);
        r3.Bpz(13, this.A0D);
        r3.Bpz(14, this.A0E);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36341k9.A0a(C36331k8.A0V(C36331k8.A0U(C36331k8.A0T(C36331k8.A0S(C36331k8.A0R(C36331k8.A0Q(C36331k8.A0P(C36331k8.A0O(C36341k9.A0b(C36331k8.A0N(C36331k8.A0M(C36331k8.A0L(C36331k8.A0K(C36361kB.A0i(), this.A01, A1G), this.A02, A1G), this.A03, A1G), this.A04, A1G), this.A05, A1G), this.A06, A1G), this.A07, A1G), this.A08, A1G), this.A00, A1G), this.A09, A1G), this.A0A, A1G), this.A0B, A1G), this.A0C, A1G), this.A0D, A1G), this.A0E);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamWaBloksSupportVideo {");
        C20910yM.A00(this.A01, "appUniqueId", A0u);
        C20910yM.A00(this.A02, "approxWatchTime", A0u);
        C20910yM.A00(this.A03, "captionState", A0u);
        C20910yM.A00(this.A04, "deviceCategory", A0u);
        C20910yM.A00(this.A05, "deviceOs", A0u);
        C20910yM.A00(this.A06, "playbackSessionId", A0u);
        C20910yM.A00(this.A07, "supportVideoDuration", A0u);
        C20910yM.A00(this.A08, "timeMs", A0u);
        C20910yM.A00(C36331k8.A0h(this.A00), "videoEventType", A0u);
        C20910yM.A00(this.A09, "videoId", A0u);
        C20910yM.A00(this.A0A, "videoLocale", A0u);
        C20910yM.A00(this.A0B, "videoMediaGroupId", A0u);
        C20910yM.A00(this.A0C, "videoName", A0u);
        C20910yM.A00(this.A0D, "videoTimePosition", A0u);
        return C36321k7.A0C(this.A0E, "watchTimeInMs", A0u);
    }
}
