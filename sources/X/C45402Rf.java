package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Rf  reason: invalid class name and case insensitive filesystem */
public final class C45402Rf extends C20890yK {
    public Integer A00;
    public Integer A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public String A05;
    public String A06;

    public C45402Rf() {
        super(2290, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(5, this.A02);
        r3.Bpz(4, this.A03);
        r3.Bpz(2, this.A00);
        r3.Bpz(7, this.A01);
        r3.Bpz(8, this.A05);
        r3.Bpz(1, this.A06);
        r3.Bpz(3, this.A04);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0L(C36331k8.A0J(C36331k8.A0Q(C36331k8.A0P(C36331k8.A0K(C36331k8.A0M(C36371kC.A0p(), this.A02, A1G), this.A03, A1G), this.A00, A1G), this.A01, A1G), this.A05, A1G), this.A06, A1G), this.A04);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamMdBootstrapAppStateDataUploaded {");
        C20910yM.A00(this.A02, "mdBootstrapContactsCount", A0u);
        C20910yM.A00(this.A03, "mdBootstrapPayloadSize", A0u);
        C20910yM.A00(C36331k8.A0h(this.A00), "mdBootstrapPayloadType", A0u);
        C20910yM.A00(C36331k8.A0h(this.A01), "mdBootstrapStepResult", A0u);
        C20910yM.A00(this.A05, "mdRegAttemptId", A0u);
        C20910yM.A00(this.A06, "mdSessionId", A0u);
        return C36321k7.A0C(this.A04, "mdTimestamp", A0u);
    }
}
