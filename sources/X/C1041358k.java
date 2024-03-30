package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.58k  reason: invalid class name and case insensitive filesystem */
public final class C1041358k extends C20890yK {
    public Boolean A00;
    public Double A01;
    public Double A02;
    public Double A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;
    public Long A0D;
    public Long A0E;

    public C1041358k() {
        super(1584, new C18950u5(1, 1, 100, false), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(4, this.A01);
        r3.Bpz(5, this.A02);
        r3.Bpz(15, this.A00);
        r3.Bpz(7, this.A07);
        r3.Bpz(2, this.A03);
        r3.Bpz(3, this.A04);
        r3.Bpz(10, this.A08);
        r3.Bpz(1, this.A09);
        r3.Bpz(14, this.A0A);
        r3.Bpz(16, this.A05);
        r3.Bpz(11, this.A06);
        r3.Bpz(13, this.A0B);
        r3.Bpz(9, this.A0C);
        r3.Bpz(8, this.A0D);
        r3.Bpz(6, this.A0E);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36341k9.A0b(C36331k8.A0N(C36371kC.A0o(), this.A01, A1G), this.A02, A1G), this.A00);
        C36321k7.A1b(A1G, 12);
        A1G.put(C36341k9.A0a(C36331k8.A0J(C36331k8.A0S(C36331k8.A0L(C36331k8.A0K(C36401kF.A0h(), this.A07, A1G), this.A03, A1G), this.A04, A1G), this.A08, A1G), this.A09, A1G), this.A0A);
        C36321k7.A1b(A1G, 17);
        A1G.put(C36331k8.A0O(C36331k8.A0Q(C36331k8.A0R(C36331k8.A0V(C36331k8.A0T(16, this.A05, A1G), this.A06, A1G), this.A0B, A1G), this.A0C, A1G), this.A0D, A1G), this.A0E);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamMediaStreamPlayback {");
        C20910yM.A00(this.A01, "bytesDownloadedStart", A0u);
        C20910yM.A00(this.A02, "bytesTransferred", A0u);
        C20910yM.A00(this.A00, "didPlay", A0u);
        C20910yM.A00(this.A07, "initialBufferingT", A0u);
        C20910yM.A00(this.A03, "mediaSize", A0u);
        C20910yM.A00(C36331k8.A0h(this.A04), "mediaType", A0u);
        C20910yM.A00(this.A08, "overallPlayT", A0u);
        C20910yM.A00(this.A09, "overallT", A0u);
        C20910yM.A00(this.A0A, "playbackCount", A0u);
        C20910yM.A00(C36331k8.A0h(this.A05), "playbackOrigin", A0u);
        C20910yM.A00(C36331k8.A0h(this.A06), "playbackState", A0u);
        C20910yM.A00(this.A0B, "seekCount", A0u);
        C20910yM.A00(this.A0C, "totalRebufferingCount", A0u);
        C20910yM.A00(this.A0D, "totalRebufferingT", A0u);
        return C36321k7.A0C(this.A0E, "videoDuration", A0u);
    }
}
