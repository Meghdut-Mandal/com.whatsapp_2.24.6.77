package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8cJ  reason: invalid class name and case insensitive filesystem */
public final class C176558cJ extends C20890yK {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public String A0B;

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(12, this.A04);
        r3.Bpz(13, this.A05);
        r3.Bpz(10, this.A01);
        r3.Bpz(11, this.A02);
        r3.Bpz(1, this.A06);
        r3.Bpz(6, this.A00);
        r3.Bpz(3, this.A07);
        r3.Bpz(8, this.A08);
        r3.Bpz(5, this.A09);
        r3.Bpz(9, this.A03);
        r3.Bpz(7, this.A0A);
        r3.Bpz(4, this.A0B);
    }

    public C176558cJ() {
        super(2496, new C18950u5(1000, SearchActionVerificationClientService.NOTIFICATION_ID, 20000, false), 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0V(12, this.A04, A1G), this.A05);
        C36321k7.A1b(A1G, 2);
        A1G.put(C36331k8.A0M(C36331k8.A0P(C36331k8.A0R(C36331k8.A0N(C36331k8.A0Q(C36331k8.A0L(C36331k8.A0O(C36331k8.A0J(C36331k8.A0T(C36401kF.A0j(), this.A01, A1G), this.A02, A1G), this.A06, A1G), this.A00, A1G), this.A07, A1G), this.A08, A1G), this.A09, A1G), this.A03, A1G), this.A0A, A1G), this.A0B);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamReceiptStanzaReceive {");
        C20910yM.A00(this.A04, "dbReadsCount", A0u);
        C20910yM.A00(this.A05, "dbWritesCount", A0u);
        C20910yM.A00(C36331k8.A0h(this.A01), "messageType", A0u);
        C20910yM.A00(C36331k8.A0h(this.A02), "receiptAggregation", A0u);
        C20910yM.A00(this.A06, "receiptStanzaDuration", A0u);
        C20910yM.A00(this.A00, "receiptStanzaHasOrphaned", A0u);
        C20910yM.A00(this.A07, "receiptStanzaOfflineCount", A0u);
        C20910yM.A00(this.A08, "receiptStanzaProcessedCount", A0u);
        C20910yM.A00(this.A09, "receiptStanzaRetryVer", A0u);
        C20910yM.A00(C36331k8.A0h(this.A03), "receiptStanzaStage", A0u);
        C20910yM.A00(this.A0A, "receiptStanzaTotalCount", A0u);
        return C36321k7.A0C(this.A0B, "receiptStanzaType", A0u);
    }
}
