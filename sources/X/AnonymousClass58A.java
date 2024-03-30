package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.58A  reason: invalid class name */
public final class AnonymousClass58A extends C20890yK {
    public Boolean A00;
    public Integer A01;
    public Long A02;
    public Long A03;
    public String A04;
    public String A05;

    public AnonymousClass58A() {
        super(2166, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(6, this.A01);
        r3.Bpz(7, this.A00);
        r3.Bpz(3, this.A04);
        r3.Bpz(1, this.A05);
        r3.Bpz(4, this.A02);
        r3.Bpz(5, this.A03);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0P(C36381kD.A0n(), this.A01, A1G), this.A00);
        C36321k7.A1b(A1G, 2);
        A1G.put(C36331k8.A0N(C36331k8.A0M(C36331k8.A0J(C36371kC.A0n(), this.A04, A1G), this.A05, A1G), this.A02, A1G), this.A03);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamPushNotificationReceived {");
        C20910yM.A00(C36331k8.A0h(this.A01), "deliveredPriority", A0u);
        C20910yM.A00(this.A00, "payloadDecryptSuccess", A0u);
        C20910yM.A00(this.A04, "pushNotificationEventId", A0u);
        C20910yM.A00(this.A05, "pushNotificationId", A0u);
        C20910yM.A00(this.A02, "pushReceivedT", A0u);
        return C36321k7.A0C(this.A03, "pushSentT", A0u);
    }
}
