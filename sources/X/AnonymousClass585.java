package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.585  reason: invalid class name */
public final class AnonymousClass585 extends C20890yK {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Long A03;
    public Long A04;
    public String A05;

    public AnonymousClass585() {
        super(2070, new C18950u5(1, 20, 20, false), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(9, this.A00);
        r3.Bpz(4, this.A01);
        r3.Bpz(1, this.A03);
        r3.Bpz(2, this.A04);
        r3.Bpz(8, this.A02);
        r3.Bpz(3, this.A05);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        C36321k7.A1b(A1G, 7);
        A1G.put(C36331k8.A0N(C36331k8.A0O(C36331k8.A0L(C36331k8.A0Q(C36331k8.A0K(C36331k8.A0J(C36331k8.A0M(C36401kF.A0i(), this.A00, A1G), this.A01, A1G), this.A03, A1G), this.A04, A1G), this.A02, A1G), this.A05, A1G), (Object) null, A1G), (Object) null);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamCameraTtRecordVideo {");
        C20910yM.A00(C36331k8.A0h(this.A00), "cameraApi", A0u);
        C20910yM.A00(C36331k8.A0h(this.A01), "cameraFacing", A0u);
        C20910yM.A00(this.A03, "cameraTtStartVideo", A0u);
        C20910yM.A00(this.A04, "cameraTtStopVideo", A0u);
        C20910yM.A00(C36331k8.A0h(this.A02), "cameraType", A0u);
        return C36321k7.A0C(this.A05, "requestedVideoResolution", A0u);
    }
}
