package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2SK  reason: invalid class name */
public final class AnonymousClass2SK extends C20890yK {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Long A07;
    public Long A08;
    public Long A09;

    public AnonymousClass2SK() {
        super(2244, new C18950u5(1, 1, 100, false), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(6, this.A03);
        r3.Bpz(14, this.A00);
        r3.Bpz(3, this.A07);
        r3.Bpz(1, this.A04);
        r3.Bpz(2, this.A08);
        r3.Bpz(11, this.A09);
        r3.Bpz(10, this.A01);
        r3.Bpz(4, this.A05);
        r3.Bpz(9, this.A06);
        r3.Bpz(5, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36381kD.A0n(), this.A03);
        C36321k7.A1b(A1G, 12);
        A1G.put(C36401kF.A0k(), this.A00);
        C36321k7.A1b(A1G, 13);
        A1G.put(C36331k8.A0N(C36331k8.A0R(C36331k8.A0M(C36331k8.A0S(C36331k8.A0T(C36331k8.A0K(C36331k8.A0J(C36371kC.A0n(), this.A07, A1G), this.A04, A1G), this.A08, A1G), this.A09, A1G), this.A01, A1G), this.A05, A1G), this.A06, A1G), this.A02);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamPsBufferUpload {");
        C20910yM.A00(C36331k8.A0h(this.A03), "applicationState", A0u);
        C20910yM.A00(this.A00, "isUserSampled", A0u);
        C20910yM.A00(this.A07, "psBufferUploadHttpResponseCode", A0u);
        C20910yM.A00(C36331k8.A0h(this.A04), "psBufferUploadResult", A0u);
        C20910yM.A00(this.A08, "psBufferUploadT", A0u);
        C20910yM.A00(this.A09, "psDitheredT", A0u);
        C20910yM.A00(this.A01, "psForceUpload", A0u);
        C20910yM.A00(C36331k8.A0h(this.A05), "psTokenNotReadyReason", A0u);
        C20910yM.A00(C36331k8.A0h(this.A06), "psUploadReason", A0u);
        return C36321k7.A0C(this.A02, "waConnectedToChatd", A0u);
    }
}
