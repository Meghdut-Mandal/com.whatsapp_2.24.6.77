package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Pc  reason: invalid class name and case insensitive filesystem */
public final class C44852Pc extends C20890yK {
    public Boolean A00;
    public Integer A01;
    public Integer A02;

    public C44852Pc() {
        super(2304, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(2, this.A01);
        r3.Bpz(16, this.A00);
        r3.Bpz(1, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0T(C36341k9.A0a(C36361kB.A0j(), this.A01, A1G), (Object) null, A1G), (Object) null);
        A1G.put(C36351kA.A0s(C36331k8.A0L(C36331k8.A0U(38, (Object) null, A1G), (Object) null, A1G), (Object) null, A1G), this.A00);
        Object A0c = C36341k9.A0c(A1G, 23);
        C36331k8.A1Q(A0c, A1G, 24);
        C36331k8.A1Q(A0c, A1G, 25);
        C36331k8.A1Q(A0c, A1G, 39);
        C36331k8.A1Q(A0c, A1G, 40);
        C36331k8.A1Q(A0c, A1G, 17);
        C36331k8.A1Q(A0c, A1G, 18);
        C36331k8.A1Q(A0c, A1G, 19);
        C36331k8.A1Q(A0c, A1G, 26);
        C36331k8.A1Q(A0c, A1G, 36);
        C36331k8.A1Q(A0c, A1G, 20);
        C36331k8.A1Q(A0c, A1G, 37);
        C36331k8.A1Q(A0c, A1G, 21);
        C36331k8.A1Q(A0c, A1G, 27);
        C36331k8.A1Q(A0c, A1G, 28);
        C36331k8.A1Q(A0c, A1G, 29);
        C36331k8.A1Q(A0c, A1G, 30);
        C36331k8.A1Q(A0c, A1G, 31);
        C36331k8.A1Q(A0c, A1G, 32);
        C36331k8.A1Q(A0c, A1G, 33);
        C36331k8.A1Q(A0c, A1G, 22);
        C36331k8.A1Q(A0c, A1G, 34);
        C36331k8.A1Q(A0c, A1G, 35);
        A1G.put(C36331k8.A0Q(C36331k8.A0P(C36331k8.A0O(C36331k8.A0S(C36341k9.A0b(C36331k8.A0N(C36331k8.A0R(C36331k8.A0J(C36421kH.A0V(), A0c, A1G), this.A02, A1G), (Object) null, A1G), (Object) null, A1G), (Object) null, A1G), (Object) null, A1G), (Object) null, A1G), (Object) null, A1G), (Object) null);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamMdFatalError {");
        C20910yM.A00(C36331k8.A0h(this.A01), "collection", A0u);
        C20910yM.A00(this.A00, "isFatal", A0u);
        return C36321k7.A0C(C36331k8.A0h(this.A02), "mdFatalErrorCode", A0u);
    }
}
