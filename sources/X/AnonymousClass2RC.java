package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2RC  reason: invalid class name */
public final class AnonymousClass2RC extends C20890yK {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Long A05;

    public AnonymousClass2RC() {
        super(3980, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A05);
        r3.Bpz(2, this.A01);
        r3.Bpz(3, this.A02);
        r3.Bpz(4, this.A03);
        r3.Bpz(5, this.A00);
        r3.Bpz(7, this.A04);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0N(C36331k8.A0M(C36331k8.A0L(C36331k8.A0K(C36361kB.A0i(), this.A05, A1G), this.A01, A1G), this.A02, A1G), this.A03, A1G), this.A00);
        C36321k7.A1b(A1G, 6);
        A1G.put(C36401kF.A0h(), this.A04);
        C36321k7.A1b(A1G, 8);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamAttachmentTrayActions {");
        C20910yM.A00(this.A05, "actionDurationMs", A0u);
        C20910yM.A00(C36331k8.A0h(this.A01), "attachmentTrayAction", A0u);
        C20910yM.A00(C36331k8.A0h(this.A02), "attachmentTrayActionTarget", A0u);
        C20910yM.A00(C36331k8.A0h(this.A03), "groupSizeBucket", A0u);
        C36441kJ.A1G(this.A00, A0u);
        return C36321k7.A0C(C36331k8.A0h(this.A04), "sendMediaType", A0u);
    }
}
