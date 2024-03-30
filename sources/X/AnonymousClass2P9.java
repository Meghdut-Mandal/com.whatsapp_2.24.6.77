package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2P9  reason: invalid class name */
public final class AnonymousClass2P9 extends C20890yK {
    public Integer A00;
    public Long A01;
    public Long A02;

    public AnonymousClass2P9() {
        super(2598, new C18950u5(1, 20, 20, false), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(3, this.A00);
        r3.Bpz(2, this.A01);
        r3.Bpz(1, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0J(C36331k8.A0K(C36371kC.A0n(), this.A00, A1G), this.A01, A1G), this.A02);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamAndroidKeystoreAuthkeySuccess {");
        C20910yM.A00(C36331k8.A0h(this.A00), "androidKeystoreState", A0u);
        C20910yM.A00(this.A01, "numFailures", A0u);
        return C36321k7.A0C(this.A02, "numSuccessfulReads", A0u);
    }
}
