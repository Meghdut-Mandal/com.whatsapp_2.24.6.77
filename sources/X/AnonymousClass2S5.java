package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2S5  reason: invalid class name */
public final class AnonymousClass2S5 extends C20890yK {
    public Long A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;

    public AnonymousClass2S5() {
        super(2300, C36441kJ.A0p(1, 20, 1000), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(11, this.A00);
        r3.Bpz(4, this.A01);
        r3.Bpz(12, this.A02);
        r3.Bpz(9, this.A03);
        r3.Bpz(1, this.A04);
        r3.Bpz(7, this.A05);
        r3.Bpz(8, this.A06);
        r3.Bpz(5, this.A07);
        r3.Bpz(10, this.A08);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0S(C36331k8.A0N(C36331k8.A0Q(C36331k8.A0P(C36331k8.A0J(C36331k8.A0R(C36331k8.A0U(C36331k8.A0M(C36421kH.A0U(), this.A00, A1G), this.A01, A1G), this.A02, A1G), this.A03, A1G), this.A04, A1G), this.A05, A1G), this.A06, A1G), this.A07, A1G), this.A08);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamMdAppStateSyncDaily {");
        C20910yM.A00(this.A00, "crossIndexConflictCount", A0u);
        C20910yM.A00(this.A01, "invalidActionCount", A0u);
        C20910yM.A00(this.A02, "keyRotationRemoveCount", A0u);
        C20910yM.A00(this.A03, "missingKeyCount", A0u);
        C20910yM.A00(this.A04, "mutationCount", A0u);
        C20910yM.A00(this.A05, "storedMutationCount", A0u);
        C20910yM.A00(this.A06, "unsetActionCount", A0u);
        C20910yM.A00(this.A07, "unsupportedActionCount", A0u);
        return C36321k7.A0C(this.A08, "uploadConflictCount", A0u);
    }
}
