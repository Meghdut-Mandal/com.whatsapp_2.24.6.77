package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Q9  reason: invalid class name */
public final class AnonymousClass2Q9 extends C20890yK {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public String A03;

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A00);
        r3.Bpz(2, this.A01);
        r3.Bpz(3, this.A02);
        r3.Bpz(4, this.A03);
    }

    public AnonymousClass2Q9() {
        super(3852, C20890yK.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0M(C36331k8.A0L(C36331k8.A0K(C36361kB.A0i(), this.A00, A1G), this.A01, A1G), this.A02, A1G), this.A03);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamCallLinkActionEvent {");
        C20910yM.A00(C36331k8.A0h(this.A00), "callLinkAction", A0u);
        C20910yM.A00(C36331k8.A0h(this.A01), "callLinkActionEntryPoint", A0u);
        C20910yM.A00(C36331k8.A0h(this.A02), "callLinkMedia", A0u);
        return C36321k7.A0C(this.A03, "callLinkSharedApp", A0u);
    }
}
