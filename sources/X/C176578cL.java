package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8cL  reason: invalid class name and case insensitive filesystem */
public final class C176578cL extends C20890yK {
    public Boolean A00;
    public Double A01;
    public Double A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;
    public Long A0D;

    public C176578cL() {
        super(1766, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(2, this.A01);
        r3.Bpz(1, this.A02);
        r3.Bpz(13, this.A06);
        r3.Bpz(14, this.A07);
        r3.Bpz(11, this.A08);
        r3.Bpz(10, this.A09);
        r3.Bpz(15, this.A0A);
        r3.Bpz(12, this.A0B);
        r3.Bpz(16, this.A0C);
        r3.Bpz(7, this.A00);
        r3.Bpz(6, this.A03);
        r3.Bpz(4, this.A04);
        r3.Bpz(3, this.A0D);
        r3.Bpz(5, this.A05);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0S(C36331k8.A0T(C36341k9.A0a(C36331k8.A0V(C36331k8.A0J(C36361kB.A0j(), this.A01, A1G), this.A02, A1G), this.A06, A1G), this.A07, A1G), this.A08, A1G), this.A09);
        C36321k7.A1b(A1G, 18);
        A1G.put(C36331k8.A0N(C36331k8.A0L(C36331k8.A0M(C36331k8.A0O(C36331k8.A0P(C36351kA.A0s(C36331k8.A0U(15, this.A0A, A1G), this.A0B, A1G), this.A0C, A1G), this.A00, A1G), this.A03, A1G), this.A04, A1G), this.A0D, A1G), this.A05);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamMediaDailyDataUsage {");
        C20910yM.A00(this.A01, "bytesReceived", A0u);
        C20910yM.A00(this.A02, "bytesSent", A0u);
        C20910yM.A00(this.A06, "countDownloaded", A0u);
        C20910yM.A00(this.A07, "countForward", A0u);
        C20910yM.A00(this.A08, "countMessageReceived", A0u);
        C20910yM.A00(this.A09, "countMessageSent", A0u);
        C20910yM.A00(this.A0A, "countShared", A0u);
        C20910yM.A00(this.A0B, "countUploaded", A0u);
        C20910yM.A00(this.A0C, "countViewed", A0u);
        C20910yM.A00(this.A00, "isAutoDownload", A0u);
        C20910yM.A00(C36331k8.A0h(this.A03), "mediaTransferOrigin", A0u);
        C20910yM.A00(C36331k8.A0h(this.A04), "mediaType", A0u);
        C20910yM.A00(this.A0D, "transferDate", A0u);
        return C36321k7.A0C(C36331k8.A0h(this.A05), "transferRadio", A0u);
    }
}
