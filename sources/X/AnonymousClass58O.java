package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.58O  reason: invalid class name */
public final class AnonymousClass58O extends C20890yK {
    public Long A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;

    public AnonymousClass58O() {
        super(4472, new C18950u5(1, 20, 1000, false), 2, 113760892);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A00);
        r3.Bpz(2, this.A04);
        r3.Bpz(3, this.A05);
        r3.Bpz(4, this.A01);
        r3.Bpz(5, this.A06);
        r3.Bpz(6, this.A07);
        r3.Bpz(7, this.A02);
        r3.Bpz(8, this.A03);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0Q(C36331k8.A0P(C36331k8.A0O(C36331k8.A0N(C36331k8.A0M(C36331k8.A0L(C36331k8.A0K(C36361kB.A0i(), this.A00, A1G), this.A04, A1G), this.A05, A1G), this.A01, A1G), this.A06, A1G), this.A07, A1G), this.A02, A1G), this.A03);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamXplatAttachmentFormatCheckEvent {");
        C20910yM.A00(this.A00, "formatCheckContentLength", A0u);
        C20910yM.A00(this.A04, "formatCheckExtensionDetected", A0u);
        C20910yM.A00(this.A05, "formatCheckExtensionHint", A0u);
        C20910yM.A00(this.A01, "formatCheckFileSize", A0u);
        C20910yM.A00(this.A06, "formatCheckMimetypeDetected", A0u);
        C20910yM.A00(this.A07, "formatCheckMimetypeHint", A0u);
        C20910yM.A00(this.A02, "formatCheckReturnCode", A0u);
        return C36321k7.A0C(this.A03, "formatCheckTimeElapsedNs", A0u);
    }
}
