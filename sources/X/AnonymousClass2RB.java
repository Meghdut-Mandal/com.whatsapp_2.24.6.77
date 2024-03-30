package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2RB  reason: invalid class name */
public final class AnonymousClass2RB extends C20890yK {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Long A03;
    public String A04;
    public String A05;

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(2, this.A04);
        r3.Bpz(8, this.A05);
        r3.Bpz(3, this.A00);
        r3.Bpz(5, this.A01);
        r3.Bpz(6, this.A02);
        r3.Bpz(7, this.A03);
    }

    public AnonymousClass2RB() {
        super(4294, C36331k8.A0H(), 2, 113760892);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        C36321k7.A1b(A1G, 1);
        A1G.put(C36331k8.A0L(C36331k8.A0Q(C36361kB.A0j(), this.A04, A1G), this.A05, A1G), this.A00);
        C36321k7.A1b(A1G, 4);
        A1G.put(C36331k8.A0P(C36331k8.A0O(C36371kC.A0p(), this.A01, A1G), this.A02, A1G), this.A03);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamAceSurveyUserResponse {");
        C20910yM.A00(this.A04, "aceSurveyBusinessSessionId", A0u);
        C20910yM.A00(this.A05, "aceSurveyDebugInfo", A0u);
        C20910yM.A00(C36331k8.A0h(this.A00), "aceSurveyEntryPoint", A0u);
        C20910yM.A00(C36331k8.A0h(this.A01), "aceSurveyTrigger", A0u);
        C20910yM.A00(C36331k8.A0h(this.A02), "aceSurveyUserEvent", A0u);
        return C36321k7.A0C(this.A03, "businessPhoneNumber", A0u);
    }
}
