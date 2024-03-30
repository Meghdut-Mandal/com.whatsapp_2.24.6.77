package X;

import android.net.TrafficStats;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.58R  reason: invalid class name */
public final class AnonymousClass58R extends C20890yK {
    public Integer A00;
    public Integer A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public String A07;
    public String A08;

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(4, this.A02);
        r3.Bpz(3, this.A03);
        r3.Bpz(9, this.A07);
        r3.Bpz(2, this.A00);
        r3.Bpz(7, this.A04);
        r3.Bpz(6, this.A05);
        r3.Bpz(5, this.A06);
        r3.Bpz(8, this.A01);
        r3.Bpz(1, this.A08);
    }

    public AnonymousClass58R() {
        super(1650, C20890yK.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public static void A00(C19970wo r1, AnonymousClass58R r2, AnonymousClass3L7 r3, long j) {
        C19970wo.A00(r1);
        r2.A05 = Long.valueOf(C19970wo.A00(r1) - j);
        r3.A05.Bly(r2);
        TrafficStats.clearThreadStatsTag();
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0J(C36331k8.A0Q(C36331k8.A0N(C36331k8.A0O(C36331k8.A0P(C36331k8.A0K(C36331k8.A0R(C36331k8.A0L(C36371kC.A0o(), this.A02, A1G), this.A03, A1G), this.A07, A1G), this.A00, A1G), this.A04, A1G), this.A05, A1G), this.A06, A1G), this.A01, A1G), this.A08);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamGifBatchLoad {");
        C20910yM.A00(this.A02, "gifBatchConnectionDownloadT", A0u);
        C20910yM.A00(this.A03, "gifBatchConnectionSetupT", A0u);
        C20910yM.A00(this.A07, "gifBatchErrorMessage", A0u);
        C20910yM.A00(C36331k8.A0h(this.A00), "gifBatchEventType", A0u);
        C20910yM.A00(this.A04, "gifBatchHttpCode", A0u);
        C20910yM.A00(this.A05, "gifBatchOverallT", A0u);
        C20910yM.A00(this.A06, "gifBatchParseResponseT", A0u);
        C20910yM.A00(C36331k8.A0h(this.A01), "gifBatchResult", A0u);
        return C36321k7.A0C(this.A08, "gifProvider", A0u);
    }
}
