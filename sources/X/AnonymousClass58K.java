package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.58K  reason: invalid class name */
public final class AnonymousClass58K extends C20890yK {
    public Boolean A00;
    public Double A01;
    public Double A02;
    public Integer A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public String A07;

    public AnonymousClass58K() {
        super(4712, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A01);
        r3.Bpz(2, this.A04);
        r3.Bpz(3, this.A00);
        r3.Bpz(4, this.A03);
        r3.Bpz(5, this.A02);
        r3.Bpz(6, this.A05);
        r3.Bpz(7, this.A06);
        r3.Bpz(8, this.A07);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0Q(C36331k8.A0P(C36331k8.A0O(C36331k8.A0N(C36331k8.A0M(C36331k8.A0L(C36331k8.A0K(C36361kB.A0i(), this.A01, A1G), this.A04, A1G), this.A00, A1G), this.A03, A1G), this.A02, A1G), this.A05, A1G), this.A06, A1G), this.A07);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamBotVideoDownload {");
        C20910yM.A00(this.A01, "bytesTransferred", A0u);
        C20910yM.A00(this.A04, "httpResponseCode", A0u);
        C20910yM.A00(this.A00, "isPrefetch", A0u);
        C20910yM.A00(C36331k8.A0h(this.A03), "mediaDownloadResult", A0u);
        C20910yM.A00(this.A02, "mediaSize", A0u);
        C20910yM.A00(this.A05, "overallT", A0u);
        C20910yM.A00(this.A06, "retryCount", A0u);
        return C36321k7.A0C(this.A07, "videoId", A0u);
    }
}
