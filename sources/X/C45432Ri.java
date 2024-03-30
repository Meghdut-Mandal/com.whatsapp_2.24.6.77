package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Ri  reason: invalid class name and case insensitive filesystem */
public final class C45432Ri extends C20890yK {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Long A04;
    public String A05;
    public String A06;

    public C45432Ri() {
        super(3748, new C18950u5(1, 20, 20, false), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(2, this.A00);
        r3.Bpz(3, this.A04);
        r3.Bpz(4, this.A01);
        r3.Bpz(5, this.A05);
        r3.Bpz(6, this.A02);
        r3.Bpz(7, this.A06);
        r3.Bpz(8, this.A03);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        C36321k7.A1b(A1G, 1);
        A1G.put(C36331k8.A0Q(C36331k8.A0P(C36331k8.A0O(C36331k8.A0N(C36331k8.A0M(C36331k8.A0L(C36361kB.A0j(), this.A00, A1G), this.A04, A1G), this.A01, A1G), this.A05, A1G), this.A02, A1G), this.A06, A1G), this.A03);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamNotificationDelivery {");
        C20910yM.A00(C36331k8.A0h(this.A00), "notificationAction", A0u);
        C20910yM.A00(this.A04, "notificationDeliveryT", A0u);
        C20910yM.A00(C36331k8.A0h(this.A01), "notificationDestination", A0u);
        C20910yM.A00(this.A05, "notificationId", A0u);
        C20910yM.A00(C36331k8.A0h(this.A02), "notificationSource", A0u);
        C20910yM.A00(this.A06, "threadId", A0u);
        return C36321k7.A0C(C36331k8.A0h(this.A03), "uiNotificationType", A0u);
    }
}
