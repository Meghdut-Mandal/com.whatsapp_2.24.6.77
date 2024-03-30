package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Q7  reason: invalid class name */
public final class AnonymousClass2Q7 extends C20890yK {
    public Long A00;
    public String A01;
    public String A02;
    public String A03;

    public AnonymousClass2Q7() {
        super(4744, C36431kI.A0q(), 2, 0);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A01);
        r3.Bpz(2, this.A02);
        r3.Bpz(3, this.A03);
        r3.Bpz(4, this.A00);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0M(C36331k8.A0L(C36331k8.A0K(C36361kB.A0i(), this.A01, A1G), this.A02, A1G), this.A03, A1G), this.A00);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamBizConversationSketchAnonymousDaily {");
        C20910yM.A00(this.A01, "businessJid", A0u);
        C20910yM.A00(this.A02, "conversationEvents", A0u);
        C20910yM.A00(this.A03, "conversationId", A0u);
        return C36321k7.A0C(this.A00, "numConversationEventsSkipped", A0u);
    }
}
