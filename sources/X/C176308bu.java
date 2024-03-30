package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8bu  reason: invalid class name and case insensitive filesystem */
public final class C176308bu extends C20890yK {
    public Double A00;
    public Double A01;
    public Integer A02;
    public Long A03;

    public C176308bu() {
        super(1638, new C18950u5(1, 50, 1000, false), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A00);
        r3.Bpz(2, this.A01);
        r3.Bpz(3, this.A03);
        r3.Bpz(12, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0U(C36331k8.A0L(C36331k8.A0M(C36331k8.A0O(C36331k8.A0K(C36331k8.A0N(C36331k8.A0P(C36331k8.A0Q(C36331k8.A0J(C36331k8.A0S(C36421kH.A0U(), (Object) null, A1G), (Object) null, A1G), this.A00, A1G), (Object) null, A1G), (Object) null, A1G), (Object) null, A1G), this.A01, A1G), (Object) null, A1G), (Object) null, A1G), this.A03, A1G), this.A02);
        C36321k7.A1b(A1G, 9);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamAndroidScrollPerfEvent {");
        C20910yM.A00(this.A00, "frameDropsPerMin", A0u);
        C20910yM.A00(this.A01, "largeFrameDropsPerMin", A0u);
        C20910yM.A00(this.A03, "scrollDurationT", A0u);
        return C36321k7.A0C(C36331k8.A0h(this.A02), "surface", A0u);
    }
}
