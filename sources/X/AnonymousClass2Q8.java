package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Q8  reason: invalid class name */
public final class AnonymousClass2Q8 extends C20890yK {
    public Double A00;
    public Double A01;
    public Double A02;
    public String A03;

    public AnonymousClass2Q8() {
        super(4602, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A03);
        r3.Bpz(2, this.A00);
        r3.Bpz(3, this.A01);
        r3.Bpz(4, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0M(C36331k8.A0L(C36331k8.A0K(C36361kB.A0i(), this.A03, A1G), this.A00, A1G), this.A01, A1G), this.A02);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamBlockConversationContext {");
        C20910yM.A00(this.A03, "blockedJid", A0u);
        C20910yM.A00(this.A00, "estimatedNumMessagesReceived", A0u);
        C20910yM.A00(this.A01, "estimatedNumMessagesSent", A0u);
        return C36321k7.A0C(this.A02, "estimatedTimeSinceFirstMessage", A0u);
    }
}
