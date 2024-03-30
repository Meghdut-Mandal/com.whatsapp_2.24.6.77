package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Se  reason: invalid class name and case insensitive filesystem */
public final class C45652Se extends C20890yK {
    public Integer A00;
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
    public String A0C;

    public C45652Se() {
        super(2292, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(14, this.A04);
        r3.Bpz(12, this.A05);
        r3.Bpz(6, this.A06);
        r3.Bpz(11, this.A00);
        r3.Bpz(13, this.A01);
        r3.Bpz(5, this.A07);
        r3.Bpz(4, this.A08);
        r3.Bpz(2, this.A02);
        r3.Bpz(8, this.A03);
        r3.Bpz(9, this.A09);
        r3.Bpz(10, this.A0B);
        r3.Bpz(1, this.A0C);
        r3.Bpz(3, this.A0A);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0L(C36331k8.A0J(C36331k8.A0S(C36331k8.A0R(C36331k8.A0Q(C36331k8.A0K(C36331k8.A0M(C36331k8.A0N(C36331k8.A0V(C36331k8.A0T(C36331k8.A0O(C36331k8.A0U(C36401kF.A0k(), this.A04, A1G), this.A05, A1G), this.A06, A1G), this.A00, A1G), this.A01, A1G), this.A07, A1G), this.A08, A1G), this.A02, A1G), this.A03, A1G), this.A09, A1G), this.A0B, A1G), this.A0C, A1G), this.A0A);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamMdBootstrapHistoryDataUploaded {");
        C20910yM.A00(this.A04, "historySyncChunkOrder", A0u);
        C20910yM.A00(this.A05, "historySyncStageProgress", A0u);
        C20910yM.A00(this.A06, "mdBootstrapChatsCount", A0u);
        C20910yM.A00(C36331k8.A0h(this.A00), "mdBootstrapHistoryPayloadType", A0u);
        C20910yM.A00(C36331k8.A0h(this.A01), "mdBootstrapHistoryUploadStepResult", A0u);
        C20910yM.A00(this.A07, "mdBootstrapMessagesCount", A0u);
        C20910yM.A00(this.A08, "mdBootstrapPayloadSize", A0u);
        C20910yM.A00(C36331k8.A0h(this.A02), "mdBootstrapPayloadType", A0u);
        C20910yM.A00(C36331k8.A0h(this.A03), "mdBootstrapStepResult", A0u);
        C20910yM.A00(this.A09, "mdHsOldestMessageTimestamp", A0u);
        C20910yM.A00(this.A0B, "mdRegAttemptId", A0u);
        C20910yM.A00(this.A0C, "mdSessionId", A0u);
        return C36321k7.A0C(this.A0A, "mdTimestamp", A0u);
    }
}
