package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Q5  reason: invalid class name */
public final class AnonymousClass2Q5 extends C20890yK {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public String A03;

    public AnonymousClass2Q5() {
        super(4128, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A00);
        r3.Bpz(4, this.A03);
        r3.Bpz(3, this.A01);
        r3.Bpz(5, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0N(C36331k8.A0L(C36331k8.A0M(C36361kB.A0i(), this.A00, A1G), this.A03, A1G), this.A01, A1G), this.A02);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamAltPairingPrimaryStep {");
        C20910yM.A00(C36331k8.A0h(this.A00), "altPairingPrimaryStepType", A0u);
        C20910yM.A00(this.A03, "linkCodePairingRef", A0u);
        C20910yM.A00(C36331k8.A0h(this.A01), "mdCompanionPlatformType", A0u);
        return C36321k7.A0C(C36331k8.A0h(this.A02), "pairingEntryPoint", A0u);
    }
}