package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Pf  reason: invalid class name and case insensitive filesystem */
public final class C44882Pf extends C20890yK {
    public Integer A00;
    public String A01;
    public String A02;

    public C44882Pf() {
        super(3456, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, (Object) null);
        r3.Bpz(2, this.A01);
        r3.Bpz(7, this.A02);
        r3.Bpz(8, this.A00);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        C36321k7.A1b(A1G, 1);
        A1G.put(C36331k8.A0O(C36331k8.A0N(C36331k8.A0M(C36331k8.A0L(C36331k8.A0V(C36361kB.A0j(), this.A01, A1G), (Object) null, A1G), (Object) null, A1G), (Object) null, A1G), (Object) null, A1G), (Object) null);
        C36331k8.A1Q((Object) null, A1G, 14);
        A1G.put(C36331k8.A0U(C36331k8.A0S(C36331k8.A0R(C36331k8.A0T(C36331k8.A0Q(C36331k8.A0P(C36421kH.A0W(), (Object) null, A1G), this.A02, A1G), this.A00, A1G), (Object) null, A1G), (Object) null, A1G), (Object) null, A1G), (Object) null);
        C36331k8.A1Q((Object) null, A1G, 16);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamOrderDetailsActionsSmb {");
        AnonymousClass00C.A0D("acceptedPayMethods", 1);
        C20910yM.A00(this.A01, "actionCategory", A0u);
        C20910yM.A00(this.A02, "orderDetailEntryPoint", A0u);
        return C36321k7.A0C(C36331k8.A0h(this.A00), "orderDetailsCreationAction", A0u);
    }
}
