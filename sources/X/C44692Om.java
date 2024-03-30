package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Om  reason: invalid class name and case insensitive filesystem */
public final class C44692Om extends C20890yK {
    public Integer A00;
    public String A01;

    public C44692Om() {
        super(2490, new C18950u5(1, 1, 5, false), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(2, this.A01);
        r3.Bpz(1, this.A00);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0J(C36361kB.A0j(), this.A01, A1G), this.A00);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamQplHealth {");
        C20910yM.A00(this.A01, "qplHealthEventData", A0u);
        return C36321k7.A0C(C36331k8.A0h(this.A00), "qplHealthEventType", A0u);
    }
}
