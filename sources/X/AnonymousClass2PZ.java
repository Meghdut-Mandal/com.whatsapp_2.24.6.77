package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2PZ  reason: invalid class name */
public final class AnonymousClass2PZ extends C20890yK {
    public Boolean A00;
    public Integer A01;
    public Long A02;

    public AnonymousClass2PZ() {
        super(594, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(2, this.A02);
        r3.Bpz(1, this.A01);
        r3.Bpz(3, this.A00);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0L(C36331k8.A0J(C36361kB.A0j(), this.A02, A1G), this.A01, A1G), this.A00);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamGroupCreate {");
        C20910yM.A00(this.A02, "ephemeralityDuration", A0u);
        C20910yM.A00(C36331k8.A0h(this.A01), "groupCreateEntryPoint", A0u);
        return C36321k7.A0C(this.A00, "hasGroupName", A0u);
    }
}
