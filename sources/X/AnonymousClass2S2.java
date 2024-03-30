package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2S2  reason: invalid class name */
public final class AnonymousClass2S2 extends C20890yK {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Long A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;

    public AnonymousClass2S2() {
        super(1616, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A00);
        r3.Bpz(6, this.A05);
        r3.Bpz(2, this.A01);
        r3.Bpz(11, (Object) null);
        r3.Bpz(7, this.A06);
        r3.Bpz(10, (Object) null);
        r3.Bpz(8, this.A07);
        r3.Bpz(9, this.A08);
        r3.Bpz(4, this.A02);
        r3.Bpz(3, this.A04);
        r3.Bpz(5, this.A03);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0K(C36331k8.A0O(C36361kB.A0i(), this.A00, A1G), this.A05, A1G), this.A01);
        C36321k7.A1b(A1G, 11);
        A1G.put(C36401kF.A0h(), this.A06);
        C36321k7.A1b(A1G, 10);
        A1G.put(C36331k8.A0N(C36331k8.A0L(C36331k8.A0M(C36331k8.A0R(C36391kE.A0r(), this.A07, A1G), this.A08, A1G), this.A02, A1G), this.A04, A1G), this.A03);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamChatFilterEvent {");
        C20910yM.A00(C36331k8.A0h(this.A00), "actionType", A0u);
        C20910yM.A00(this.A05, "activitySessionId", A0u);
        C20910yM.A00(C36331k8.A0h(this.A01), "filterType", A0u);
        AnonymousClass00C.A0D("labelName", 1);
        C20910yM.A00(this.A06, "metadata", A0u);
        AnonymousClass00C.A0D("predefinedId", 1);
        C20910yM.A00(this.A07, "searchQueryId", A0u);
        C20910yM.A00(this.A08, "searchRequestId", A0u);
        C20910yM.A00(C36331k8.A0h(this.A02), "searchResultType", A0u);
        C20910yM.A00(this.A04, "sessionId", A0u);
        return C36321k7.A0C(C36331k8.A0h(this.A03), "targetScreen", A0u);
    }
}
