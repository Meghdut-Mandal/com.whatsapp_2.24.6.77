package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2R0  reason: invalid class name */
public final class AnonymousClass2R0 extends C20890yK {
    public Double A00;
    public Integer A01;
    public Integer A02;
    public Long A03;
    public Long A04;

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(5, this.A03);
        r3.Bpz(1, this.A01);
        r3.Bpz(4, this.A00);
        r3.Bpz(3, this.A04);
        r3.Bpz(2, this.A02);
    }

    public AnonymousClass2R0() {
        super(848, C20890yK.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0K(C36331k8.A0L(C36331k8.A0M(C36331k8.A0J(C36371kC.A0p(), this.A03, A1G), this.A01, A1G), this.A00, A1G), this.A04, A1G), this.A02);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamProfilePicDownload {");
        C20910yM.A00(this.A03, "profilePicDownloadHttpCode", A0u);
        C20910yM.A00(C36331k8.A0h(this.A01), "profilePicDownloadResult", A0u);
        C20910yM.A00(this.A00, "profilePicDownloadSize", A0u);
        C20910yM.A00(this.A04, "profilePicDownloadT", A0u);
        return C36321k7.A0C(C36331k8.A0h(this.A02), "profilePicType", A0u);
    }
}
