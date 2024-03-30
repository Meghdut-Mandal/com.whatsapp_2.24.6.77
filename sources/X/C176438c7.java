package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8c7  reason: invalid class name and case insensitive filesystem */
public final class C176438c7 extends C20890yK {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Long A03;
    public String A04;
    public String A05;

    public C176438c7() {
        super(2638, new C18950u5(1, 20, 20, false), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(7, this.A00);
        r3.Bpz(4, this.A01);
        r3.Bpz(6, this.A04);
        r3.Bpz(2, this.A03);
        r3.Bpz(5, this.A05);
        r3.Bpz(1, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36401kF.A0h(), this.A00);
        C36321k7.A1b(A1G, 3);
        A1G.put(C36331k8.A0J(C36331k8.A0N(C36331k8.A0K(C36331k8.A0O(C36371kC.A0o(), this.A01, A1G), this.A04, A1G), this.A03, A1G), this.A05, A1G), this.A02);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamOfflineCountTooHigh {");
        C20910yM.A00(C36331k8.A0h(this.A00), "callStanzaType", A0u);
        C20910yM.A00(C36331k8.A0h(this.A01), "messageType", A0u);
        C20910yM.A00(this.A04, "notificationStanzaType", A0u);
        C20910yM.A00(this.A03, "offlineCount", A0u);
        C20910yM.A00(this.A05, "receiptStanzaType", A0u);
        return C36321k7.A0C(C36331k8.A0h(this.A02), "stanzaType", A0u);
    }
}
