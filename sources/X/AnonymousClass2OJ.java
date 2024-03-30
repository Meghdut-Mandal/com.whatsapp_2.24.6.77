package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2OJ  reason: invalid class name */
public final class AnonymousClass2OJ extends C20890yK {
    public Integer A00;
    public String A01;

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(2, this.A01);
        r3.Bpz(3, this.A00);
    }

    public AnonymousClass2OJ() {
        super(3720, C36331k8.A0H(), 2, 113760892);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0L(C36361kB.A0j(), this.A01, A1G), this.A00);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamCtwaJwtVerificationState {");
        C20910yM.A00(this.A01, "failReason", A0u);
        return C36321k7.A0C(C36331k8.A0h(this.A00), "verificationState", A0u);
    }
}
