package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Qe  reason: invalid class name and case insensitive filesystem */
public final class C45132Qe extends C20890yK {
    public Integer A00;
    public Integer A01;
    public Long A02;
    public Long A03;
    public Long A04;

    public C45132Qe() {
        super(3050, C36441kJ.A0p(1, 10, 20), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(5, this.A02);
        r3.Bpz(4, this.A03);
        r3.Bpz(3, this.A00);
        r3.Bpz(2, this.A01);
        r3.Bpz(1, this.A04);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0J(C36331k8.A0K(C36331k8.A0O(C36331k8.A0P(C36331k8.A0L(C36331k8.A0M(C36371kC.A0p(), this.A02, A1G), this.A03, A1G), this.A00, A1G), (Object) null, A1G), (Object) null, A1G), this.A01, A1G), this.A04);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamAndroidNetworkUsageDetailed {");
        C20910yM.A00(this.A02, "kbytesReceived", A0u);
        C20910yM.A00(this.A03, "kbytesTransmitted", A0u);
        C20910yM.A00(C36331k8.A0h(this.A00), "networkCategory", A0u);
        C20910yM.A00(C36331k8.A0h(this.A01), "sessionCategory", A0u);
        return C36321k7.A0C(this.A04, "sessionDuration", A0u);
    }
}
