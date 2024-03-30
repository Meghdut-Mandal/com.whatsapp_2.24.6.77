package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Qa  reason: invalid class name and case insensitive filesystem */
public final class C45092Qa extends C20890yK {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public String A03;
    public String A04;

    public C45092Qa() {
        super(4292, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(6, this.A03);
        r3.Bpz(1, this.A00);
        r3.Bpz(3, this.A01);
        r3.Bpz(4, this.A02);
        r3.Bpz(5, this.A04);
    }

    public static void A00(C45092Qa r4, C65573Sp r5, C63363Jt r6, int i, int i2) {
        Integer valueOf = Integer.valueOf(i);
        r4.A02 = valueOf;
        Integer valueOf2 = Integer.valueOf(i2);
        r4.A00 = valueOf2;
        r4.A01 = Integer.valueOf(C65573Sp.A00(r6.A01));
        r4.A04 = r6.A04;
        C21010yW r1 = r5.A01;
        r1.Bly(r4);
        AnonymousClass2RB r0 = new AnonymousClass2RB();
        r0.A02 = valueOf;
        r0.A00 = valueOf2;
        C65573Sp.A01(r0, r6);
        r1.Bly(r0);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0J(C36381kD.A0n(), this.A03, A1G), this.A00);
        C36321k7.A1b(A1G, 2);
        A1G.put(C36331k8.A0N(C36331k8.A0M(C36371kC.A0n(), this.A01, A1G), this.A02, A1G), this.A04);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamAceSurveyUserEngagement {");
        C20910yM.A00(this.A03, "aceSurveyDebugInfo", A0u);
        C20910yM.A00(C36331k8.A0h(this.A00), "aceSurveyEntryPoint", A0u);
        C20910yM.A00(C36331k8.A0h(this.A01), "aceSurveyTrigger", A0u);
        C20910yM.A00(C36331k8.A0h(this.A02), "aceSurveyUserEvent", A0u);
        return C36321k7.A0C(this.A04, "aceSurveyUserSessionId", A0u);
    }
}
