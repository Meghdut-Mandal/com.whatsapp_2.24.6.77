package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2OU  reason: invalid class name */
public final class AnonymousClass2OU extends C20890yK {
    public Boolean A00;
    public Integer A01;

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A01);
        r3.Bpz(2, this.A00);
    }

    public AnonymousClass2OU() {
        super(3150, C20890yK.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0K(C36361kB.A0i(), this.A01, A1G), this.A00);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamGatedChatOpened {");
        C20910yM.A00(C36331k8.A0h(this.A01), "chatGatedReason", A0u);
        return C36321k7.A0C(this.A00, "selfInitiated", A0u);
    }
}
