package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Rg  reason: invalid class name and case insensitive filesystem */
public final class C45412Rg extends C20890yK {
    public Double A00;
    public Double A01;
    public Double A02;
    public Double A03;
    public Double A04;
    public Double A05;
    public Long A06;

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(13, this.A00);
        r3.Bpz(12, this.A01);
        r3.Bpz(11, this.A06);
        r3.Bpz(3, this.A02);
        r3.Bpz(4, this.A03);
        r3.Bpz(6, this.A04);
        r3.Bpz(1, this.A05);
    }

    public C45412Rg() {
        super(1336, C20890yK.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0L(C36331k8.A0Q(C36331k8.A0P(C36331k8.A0T(C36331k8.A0U(C36421kH.A0V(), this.A00, A1G), this.A01, A1G), this.A06, A1G), (Object) null, A1G), (Object) null, A1G), this.A02);
        C36321k7.A1b(A1G, 5);
        A1G.put(C36331k8.A0O(C36371kC.A0o(), this.A03, A1G), this.A04);
        C36321k7.A1b(A1G, 2);
        A1G.put(C36361kB.A0i(), this.A05);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamMemoryStat {");
        C20910yM.A00(this.A00, "androidDalvikPrivateDirty", A0u);
        C20910yM.A00(this.A01, "androidNativePrivateDirty", A0u);
        C20910yM.A00(this.A06, "androidThreadCount", A0u);
        C20910yM.A00(this.A02, "privateBytes", A0u);
        C20910yM.A00(this.A03, "sharedBytes", A0u);
        C20910yM.A00(this.A04, "uptime", A0u);
        return C36321k7.A0C(this.A05, "workingSetSize", A0u);
    }
}
