package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Rm  reason: invalid class name and case insensitive filesystem */
public final class C45472Rm extends C20890yK {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(5, this.A00);
        r3.Bpz(6, this.A02);
        r3.Bpz(4, this.A03);
        r3.Bpz(3, this.A04);
        r3.Bpz(2, this.A05);
        r3.Bpz(1, this.A01);
        r3.Bpz(7, this.A06);
    }

    public C45472Rm() {
        super(2034, C20890yK.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0P(C36331k8.A0J(C36331k8.A0K(C36331k8.A0L(C36331k8.A0M(C36331k8.A0O(C36371kC.A0p(), this.A00, A1G), this.A02, A1G), this.A03, A1G), this.A04, A1G), this.A05, A1G), this.A01, A1G), this.A06);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamQrCodeScan {");
        C20910yM.A00(this.A00, "isContact", A0u);
        C20910yM.A00(C36331k8.A0h(this.A02), "linkOwnerType", A0u);
        C20910yM.A00(C36331k8.A0h(this.A03), "qrCodeCameraSource", A0u);
        C20910yM.A00(C36331k8.A0h(this.A04), "qrCodeErrorReason", A0u);
        C20910yM.A00(C36331k8.A0h(this.A05), "qrCodeType", A0u);
        C20910yM.A00(this.A01, "scannedCodeSuccessfully", A0u);
        return C36321k7.A0C(C36331k8.A0h(this.A06), "srcLinkParam", A0u);
    }
}
