package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2PF  reason: invalid class name */
public final class AnonymousClass2PF extends C20890yK {
    public Integer A00;
    public Integer A01;
    public Integer A02;

    public AnonymousClass2PF() {
        super(4868, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(5, this.A00);
        r3.Bpz(6, this.A01);
        r3.Bpz(7, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        C36321k7.A1b(A1G, 1);
        A1G.put(C36331k8.A0P(C36331k8.A0O(C36371kC.A0p(), this.A00, A1G), this.A01, A1G), this.A02);
        C36321k7.A1b(A1G, 4);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamBotBizJourney {");
        C20910yM.A00(C36331k8.A0h(this.A00), "botBizActionType", A0u);
        C20910yM.A00(C36331k8.A0h(this.A01), "botBizEntryPoint", A0u);
        return C36321k7.A0C(C36331k8.A0h(this.A02), "botBizType", A0u);
    }
}
