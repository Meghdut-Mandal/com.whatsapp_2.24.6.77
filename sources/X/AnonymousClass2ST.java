package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2ST  reason: invalid class name */
public final class AnonymousClass2ST extends C20890yK {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Long A06;
    public Long A07;
    public String A08;
    public String A09;
    public String A0A;

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A00);
        r3.Bpz(2, this.A01);
        r3.Bpz(3, this.A02);
        r3.Bpz(11, this.A06);
        r3.Bpz(4, this.A03);
        r3.Bpz(8, this.A04);
        r3.Bpz(5, this.A05);
        r3.Bpz(10, this.A07);
        r3.Bpz(6, this.A08);
        r3.Bpz(9, this.A09);
        r3.Bpz(7, this.A0A);
    }

    public AnonymousClass2ST() {
        super(4740, C36331k8.A0H(), 2, 113760892);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0P(C36331k8.A0R(C36331k8.A0O(C36331k8.A0S(C36331k8.A0N(C36331k8.A0Q(C36331k8.A0M(C36331k8.A0T(C36331k8.A0L(C36331k8.A0K(C36361kB.A0i(), this.A00, A1G), this.A01, A1G), this.A02, A1G), this.A06, A1G), this.A03, A1G), this.A04, A1G), this.A05, A1G), this.A07, A1G), this.A08, A1G), this.A09, A1G), this.A0A);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamPaidMessagingUserInteractionsLogger {");
        C20910yM.A00(C36331k8.A0h(this.A00), "pmxActionTarget", A0u);
        C20910yM.A00(C36331k8.A0h(this.A01), "pmxActionType", A0u);
        C20910yM.A00(C36331k8.A0h(this.A02), "pmxComponentType", A0u);
        C20910yM.A00(this.A06, "pmxHashedMessageKey", A0u);
        C20910yM.A00(C36331k8.A0h(this.A03), "pmxHeaderMediaType", A0u);
        C20910yM.A00(C36331k8.A0h(this.A04), "pmxHostStorage", A0u);
        C20910yM.A00(C36331k8.A0h(this.A05), "pmxMarketingFormat", A0u);
        C20910yM.A00(this.A07, "pmxMessageDeliveredTs", A0u);
        C20910yM.A00(this.A08, "pmxQueryParams", A0u);
        C20910yM.A00(this.A09, "pmxSenderCountryCode", A0u);
        return C36321k7.A0C(this.A0A, "templateId", A0u);
    }
}
