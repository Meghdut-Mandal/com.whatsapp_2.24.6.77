package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.586  reason: invalid class name */
public final class AnonymousClass586 extends C20890yK {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Long A04;
    public String A05;

    public AnonymousClass586() {
        super(2066, new C18950u5(1, 20, 20, false), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(8, this.A00);
        r3.Bpz(2, this.A01);
        r3.Bpz(1, this.A04);
        r3.Bpz(7, this.A02);
        r3.Bpz(3, this.A03);
        r3.Bpz(5, this.A05);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0L(C36331k8.A0P(C36331k8.A0J(C36331k8.A0K(C36391kE.A0r(), this.A00, A1G), this.A01, A1G), this.A04, A1G), this.A02, A1G), this.A03);
        C36321k7.A1b(A1G, 6);
        A1G.put(C36371kC.A0p(), this.A05);
        C36321k7.A1b(A1G, 4);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamCameraTtc {");
        C20910yM.A00(C36331k8.A0h(this.A00), "cameraApi", A0u);
        C20910yM.A00(C36331k8.A0h(this.A01), "cameraFacing", A0u);
        C20910yM.A00(this.A04, "cameraTtcDuration", A0u);
        C20910yM.A00(C36331k8.A0h(this.A02), "cameraType", A0u);
        C20910yM.A00(C36331k8.A0h(this.A03), "flashMode", A0u);
        return C36321k7.A0C(this.A05, "requestedPhotoResolution", A0u);
    }
}
