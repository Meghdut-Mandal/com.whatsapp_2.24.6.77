package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2P7  reason: invalid class name */
public final class AnonymousClass2P7 extends C20890yK {
    public Integer A00;
    public Integer A01;
    public String A02;

    public AnonymousClass2P7() {
        super(4130, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A00);
        r3.Bpz(4, this.A02);
        r3.Bpz(3, this.A01);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0L(C36331k8.A0M(C36361kB.A0i(), this.A00, A1G), this.A02, A1G), this.A01);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamAltLinkingFatalError {");
        C20910yM.A00(C36331k8.A0h(this.A00), "altLinkingFatalErrorType", A0u);
        C20910yM.A00(this.A02, "linkCodePairingRef", A0u);
        return C36321k7.A0C(C36331k8.A0h(this.A01), "mdCompanionPlatformType", A0u);
    }
}
