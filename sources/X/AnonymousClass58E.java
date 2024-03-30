package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.58E  reason: invalid class name */
public final class AnonymousClass58E extends C20890yK {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Long A05;
    public String A06;

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A00);
        r3.Bpz(2, this.A01);
        r3.Bpz(3, this.A06);
        r3.Bpz(4, this.A02);
        r3.Bpz(5, this.A03);
        r3.Bpz(6, this.A04);
        r3.Bpz(7, this.A05);
    }

    public AnonymousClass58E() {
        super(3450, C36431kI.A0q(), 2, 113760892);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0P(C36331k8.A0O(C36331k8.A0N(C36331k8.A0M(C36331k8.A0L(C36331k8.A0K(C36361kB.A0i(), this.A00, A1G), this.A01, A1G), this.A06, A1G), this.A02, A1G), this.A03, A1G), this.A04, A1G), this.A05);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamBusinessInteraction {");
        C20910yM.A00(C36331k8.A0h(this.A00), "businessInteractionAction", A0u);
        C20910yM.A00(C36331k8.A0h(this.A01), "businessInteractionTargetScreen", A0u);
        C20910yM.A00(this.A06, "businessJid", A0u);
        C20910yM.A00(C36331k8.A0h(this.A02), "entryPointApp", A0u);
        C20910yM.A00(C36331k8.A0h(this.A03), "entryPointSource", A0u);
        C20910yM.A00(C36331k8.A0h(this.A04), "internalEntryPoint", A0u);
        return C36321k7.A0C(this.A05, "sequenceNumber", A0u);
    }
}
