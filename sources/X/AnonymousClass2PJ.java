package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2PJ  reason: invalid class name */
public final class AnonymousClass2PJ extends C20890yK {
    public Integer A00;
    public Long A01;
    public String A02;

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(5, this.A00);
        r3.Bpz(1, this.A01);
        r3.Bpz(7, this.A02);
    }

    public AnonymousClass2PJ() {
        super(1536, C20890yK.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0P(C36331k8.A0J(C36331k8.A0N(C36331k8.A0O(C36331k8.A0L(C36331k8.A0M(C36361kB.A0j(), (Object) null, A1G), (Object) null, A1G), (Object) null, A1G), (Object) null, A1G), this.A00, A1G), this.A01, A1G), this.A02);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamCamera {");
        C20910yM.A00(C36331k8.A0h(this.A00), "cameraOrigin", A0u);
        C20910yM.A00(this.A01, "cameraPresentationT", A0u);
        return C36321k7.A0C(this.A02, "cameraViewType", A0u);
    }
}
