package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.58D  reason: invalid class name */
public final class AnonymousClass58D extends C20890yK {
    public Long A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;

    public AnonymousClass58D() {
        super(4434, C36431kI.A0q(), 2, 0);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(7, this.A01);
        r3.Bpz(1, this.A02);
        r3.Bpz(2, this.A03);
        r3.Bpz(3, this.A00);
        r3.Bpz(4, this.A04);
        r3.Bpz(5, this.A05);
        r3.Bpz(6, this.A06);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0O(C36331k8.A0N(C36331k8.A0M(C36331k8.A0L(C36331k8.A0K(C36331k8.A0J(C36401kF.A0h(), this.A01, A1G), this.A02, A1G), this.A03, A1G), this.A00, A1G), this.A04, A1G), this.A05, A1G), this.A06);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamBloksScriptCrashes {");
        C20910yM.A00(this.A01, "bloksErrorAppId", A0u);
        C20910yM.A00(this.A02, "bloksErrorFeature", A0u);
        C20910yM.A00(this.A03, "bloksErrorFileName", A0u);
        C20910yM.A00(this.A00, "bloksErrorLineNumber", A0u);
        C20910yM.A00(this.A04, "bloksErrorMessage", A0u);
        C20910yM.A00(this.A05, "bloksErrorOncall", A0u);
        return C36321k7.A0C(this.A06, "bloksErrorProduct", A0u);
    }
}
