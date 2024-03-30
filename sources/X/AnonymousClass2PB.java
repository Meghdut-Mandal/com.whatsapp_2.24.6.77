package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2PB  reason: invalid class name */
public final class AnonymousClass2PB extends C20890yK {
    public Integer A00;
    public String A01;
    public String A02;

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A01);
        r3.Bpz(2, this.A02);
        r3.Bpz(3, this.A00);
    }

    public AnonymousClass2PB() {
        super(3916, C20890yK.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0L(C36331k8.A0K(C36361kB.A0i(), this.A01, A1G), this.A02, A1G), this.A00);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamAvatarHealth {");
        C20910yM.A00(this.A01, "avatarHealthEventData", A0u);
        C20910yM.A00(this.A02, "avatarHealthEventReason", A0u);
        return C36321k7.A0C(C36331k8.A0h(this.A00), "avatarHealthEventType", A0u);
    }
}
