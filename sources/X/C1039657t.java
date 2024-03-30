package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.57t  reason: invalid class name and case insensitive filesystem */
public final class C1039657t extends C20890yK {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Long A03;

    public C1039657t() {
        super(2064, new C18950u5(1, 20, 20, false), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(4, this.A00);
        r3.Bpz(1, this.A03);
        r3.Bpz(3, this.A01);
        r3.Bpz(2, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0K(C36331k8.A0L(C36331k8.A0J(C36371kC.A0o(), this.A00, A1G), this.A03, A1G), this.A01, A1G), this.A02);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamCameraTti {");
        C20910yM.A00(C36331k8.A0h(this.A00), "cameraApi", A0u);
        C20910yM.A00(this.A03, "cameraTtiDuration", A0u);
        C20910yM.A00(C36331k8.A0h(this.A01), "cameraType", A0u);
        return C36321k7.A0C(C36331k8.A0h(this.A02), "launchType", A0u);
    }
}
