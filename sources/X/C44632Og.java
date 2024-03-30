package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Og  reason: invalid class name and case insensitive filesystem */
public final class C44632Og extends C20890yK {
    public Long A00;
    public Long A01;

    public C44632Og() {
        super(5144, new C18950u5(1, 20, 20, false), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A00);
        r3.Bpz(3, this.A01);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36361kB.A0i(), this.A00);
        C36321k7.A1b(A1G, 2);
        A1G.put(C36331k8.A0O(C36331k8.A0N(C36331k8.A0M(C36371kC.A0n(), this.A01, A1G), (Object) null, A1G), (Object) null, A1G), (Object) null);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamOutOfOrderMessage {");
        C20910yM.A00(this.A00, "numCallMsg", A0u);
        return C36321k7.A0C(this.A01, "numOutOfOrderCallMsg", A0u);
    }
}
