package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8c9  reason: invalid class name and case insensitive filesystem */
public final class C176458c9 extends C20890yK {
    public Integer A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public String A05;
    public String A06;

    public C176458c9() {
        super(2570, new C18950u5(1, 1000, 2000, false), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(6, this.A01);
        r3.Bpz(7, this.A02);
        r3.Bpz(1, this.A03);
        r3.Bpz(2, this.A04);
        r3.Bpz(4, this.A00);
        r3.Bpz(5, this.A05);
        r3.Bpz(3, this.A06);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0L(C36331k8.A0N(C36331k8.A0M(C36331k8.A0K(C36331k8.A0J(C36331k8.A0P(6, this.A01, A1G), this.A02, A1G), this.A03, A1G), this.A04, A1G), this.A00, A1G), this.A05, A1G), this.A06);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamNotificationStanzaReceive {");
        C20910yM.A00(this.A01, "dbReadsCount", A0u);
        C20910yM.A00(this.A02, "dbWritesCount", A0u);
        C20910yM.A00(this.A03, "notificationStanzaDuration", A0u);
        C20910yM.A00(this.A04, "notificationStanzaOfflineCount", A0u);
        C20910yM.A00(C36331k8.A0h(this.A00), "notificationStanzaStage", A0u);
        C20910yM.A00(this.A05, "notificationStanzaSubType", A0u);
        return C36321k7.A0C(this.A06, "notificationStanzaType", A0u);
    }
}
