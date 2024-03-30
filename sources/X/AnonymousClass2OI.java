package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2OI  reason: invalid class name */
public final class AnonymousClass2OI extends C20890yK {
    public Integer A00;
    public String A01;

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A00);
        r3.Bpz(21, this.A01);
    }

    public AnonymousClass2OI() {
        super(470, C20890yK.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        C36321k7.A1b(A1G, 3);
        A1G.put(C36411kG.A0s(C36331k8.A0T(C36381kD.A0o(C36331k8.A0O(C36331k8.A0N(C36331k8.A0U(C36331k8.A0M(C36331k8.A0K(C36361kB.A0i(), this.A00, A1G), (Object) null, A1G), (Object) null, A1G), (Object) null, A1G), (Object) null, A1G), (Object) null, A1G), (Object) null, A1G), (Object) null, A1G), this.A01);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamContactUsSession {");
        C20910yM.A00(C36331k8.A0h(this.A00), "contactUsExitState", A0u);
        return C36321k7.A0C(this.A01, "languageCode", A0u);
    }
}
