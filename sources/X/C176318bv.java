package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8bv  reason: invalid class name and case insensitive filesystem */
public final class C176318bv extends C20890yK {
    public Long A00;
    public Long A01;
    public Long A02;
    public Long A03;

    public C176318bv() {
        super(3484, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(3, this.A00);
        r3.Bpz(4, this.A01);
        r3.Bpz(5, this.A02);
        r3.Bpz(6, this.A03);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0O(C36331k8.A0N(C36331k8.A0M(C36371kC.A0n(), this.A00, A1G), this.A01, A1G), this.A02, A1G), this.A03);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamKeepInChatNotif {");
        C20910yM.A00(this.A00, "kicGroupNotificationTaps", A0u);
        C20910yM.A00(this.A01, "kicGroupNotifications", A0u);
        C20910yM.A00(this.A02, "kicNotificationTaps", A0u);
        return C36321k7.A0C(this.A03, "kicNotifications", A0u);
    }
}
