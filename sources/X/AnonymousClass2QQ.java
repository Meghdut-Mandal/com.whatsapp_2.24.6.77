package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2QQ  reason: invalid class name */
public final class AnonymousClass2QQ extends C20890yK {
    public Integer A00;
    public Integer A01;
    public Long A02;
    public Long A03;

    public AnonymousClass2QQ() {
        super(3300, C36441kJ.A0p(1, 200, 1000), 2, 56300709);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A02);
        r3.Bpz(2, this.A00);
        r3.Bpz(5, this.A03);
        r3.Bpz(6, this.A01);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0O(C36331k8.A0N(C36331k8.A0M(C36331k8.A0L(C36331k8.A0K(C36361kB.A0i(), this.A02, A1G), this.A00, A1G), (Object) null, A1G), (Object) null, A1G), this.A03, A1G), this.A01);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamPsAppLaunch {");
        C20910yM.A00(this.A02, "psAppLaunchCpuT", A0u);
        C20910yM.A00(C36331k8.A0h(this.A00), "psAppLaunchDestination", A0u);
        C20910yM.A00(this.A03, "psAppLaunchT", A0u);
        return C36321k7.A0C(C36331k8.A0h(this.A01), "psAppLaunchTypeT", A0u);
    }
}
