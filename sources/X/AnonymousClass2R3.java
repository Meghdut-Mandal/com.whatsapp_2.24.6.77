package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2R3  reason: invalid class name */
public final class AnonymousClass2R3 extends C20890yK {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Long A03;
    public Long A04;

    public AnonymousClass2R3() {
        super(3952, C36441kJ.A0p(1, 100, 5000), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(5, this.A00);
        r3.Bpz(3, this.A01);
        r3.Bpz(4, this.A03);
        r3.Bpz(1, this.A04);
        r3.Bpz(2, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0K(C36331k8.A0J(C36331k8.A0M(C36331k8.A0L(C36371kC.A0p(), this.A00, A1G), this.A01, A1G), this.A03, A1G), this.A04, A1G), this.A02);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamSearchLatency {");
        C20910yM.A00(this.A00, "isCached", A0u);
        C20910yM.A00(this.A01, "isStarred", A0u);
        C20910yM.A00(this.A03, "page", A0u);
        C20910yM.A00(this.A04, "searchDuration", A0u);
        return C36321k7.A0C(C36331k8.A0h(this.A02), "searchType", A0u);
    }
}
