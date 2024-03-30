package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.583  reason: invalid class name */
public final class AnonymousClass583 extends C20890yK {
    public Long A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public Long A04;

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A00);
        r3.Bpz(2, this.A01);
        r3.Bpz(3, this.A02);
        r3.Bpz(4, this.A03);
        r3.Bpz(5, this.A04);
    }

    public AnonymousClass583() {
        super(4810, C20890yK.DEFAULT_SAMPLING_RATE, 2, 113760892);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0N(C36331k8.A0M(C36331k8.A0L(C36331k8.A0K(C36361kB.A0i(), this.A00, A1G), this.A01, A1G), this.A02, A1G), this.A03, A1G), this.A04);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamPsAxolotlMissingLidsDaily {");
        C20910yM.A00(this.A00, "psFastRatchetSenderKeysMissingLidsCount", A0u);
        C20910yM.A00(this.A01, "psIdentitiesMissingLidsCount", A0u);
        C20910yM.A00(this.A02, "psMessageBaseKeyMissingLidsCount", A0u);
        C20910yM.A00(this.A03, "psSenderKeysMissingLidsCount", A0u);
        return C36321k7.A0C(this.A04, "psSessionsMissingLidsCount", A0u);
    }
}
