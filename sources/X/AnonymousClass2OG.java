package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2OG  reason: invalid class name */
public final class AnonymousClass2OG extends C20890yK {
    public Integer A00;
    public Integer A01;

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A00);
        r3.Bpz(2, this.A01);
    }

    public AnonymousClass2OG() {
        super(4432, C36331k8.A0H(), 2, 113760892);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        C36321k7.A1I(C36331k8.A0K(C36361kB.A0i(), this.A00, A1G), this.A01, A1G);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamClickToWhatsappCallingPrivate {");
        C20910yM.A00(C36331k8.A0h(this.A00), "clickToWhatsappCallingActionPrivate", A0u);
        return C36321k7.A0C(C36331k8.A0h(this.A01), "clickToWhatsappCallingButtonPrivate", A0u);
    }
}
