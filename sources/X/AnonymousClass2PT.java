package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2PT  reason: invalid class name */
public final class AnonymousClass2PT extends C20890yK {
    public Integer A00;
    public Integer A01;
    public Long A02;

    public AnonymousClass2PT() {
        super(4406, C36431kI.A0q(), 2, 0);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(3, this.A02);
        r3.Bpz(1, this.A00);
        r3.Bpz(2, this.A01);
    }

    public static void A00(C21010yW r2, AnonymousClass2PT r3, int i) {
        r3.A00 = Integer.valueOf(i);
        r3.A02 = 1L;
        r2.Bly(r3);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0K(C36331k8.A0J(C36371kC.A0n(), this.A02, A1G), this.A00, A1G), this.A01);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamCtwaConsumerDisclosure {");
        C20910yM.A00(this.A02, "ctwaConsumerDisclosureVersion", A0u);
        C20910yM.A00(C36331k8.A0h(this.A00), "disclosureAction", A0u);
        return C36321k7.A0C(C36331k8.A0h(this.A01), "disclosureType", A0u);
    }
}
