package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8c4  reason: invalid class name and case insensitive filesystem */
public final class C176408c4 extends C20890yK {
    public Integer A00;
    public Integer A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;

    public C176408c4() {
        super(2582, new C18950u5(1, 1000, 2000, false), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A02);
        r3.Bpz(2, this.A03);
        r3.Bpz(4, this.A00);
        r3.Bpz(3, this.A01);
        r3.Bpz(5, this.A04);
        r3.Bpz(6, this.A05);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0O(C36331k8.A0N(C36331k8.A0L(C36331k8.A0M(C36331k8.A0K(C36361kB.A0i(), this.A02, A1G), this.A03, A1G), this.A00, A1G), this.A01, A1G), this.A04, A1G), this.A05);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamCallStanzaReceive {");
        C20910yM.A00(this.A02, "callStanzaDuration", A0u);
        C20910yM.A00(this.A03, "callStanzaOfflineCount", A0u);
        C20910yM.A00(C36331k8.A0h(this.A00), "callStanzaStage", A0u);
        C20910yM.A00(C36331k8.A0h(this.A01), "callStanzaType", A0u);
        C20910yM.A00(this.A04, "dbReadsCount", A0u);
        return C36321k7.A0C(this.A05, "dbWritesCount", A0u);
    }
}
