package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Rx  reason: invalid class name and case insensitive filesystem */
public final class C45582Rx extends C20890yK {
    public Integer A00;
    public Integer A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;

    public C45582Rx() {
        super(4026, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(3, this.A02);
        r3.Bpz(1, this.A03);
        r3.Bpz(2, this.A00);
        r3.Bpz(9, this.A04);
        r3.Bpz(5, this.A05);
        r3.Bpz(6, this.A01);
        r3.Bpz(10, this.A06);
        r3.Bpz(8, this.A07);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0Q(C36331k8.A0S(C36331k8.A0O(C36331k8.A0N(C36331k8.A0R(C36331k8.A0K(C36331k8.A0M(C36331k8.A0P(C36331k8.A0J(C36371kC.A0n(), this.A02, A1G), this.A03, A1G), (Object) null, A1G), (Object) null, A1G), this.A00, A1G), this.A04, A1G), this.A05, A1G), this.A01, A1G), this.A06, A1G), this.A07);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamSelfServeHelp {");
        C20910yM.A00(this.A02, "bloksScreenName", A0u);
        C20910yM.A00(this.A03, "contentId", A0u);
        C20910yM.A00(C36331k8.A0h(this.A00), "helpEventType", A0u);
        C20910yM.A00(this.A04, "mediaGroupId", A0u);
        C20910yM.A00(this.A05, "supportBloksLaunchErrorMessage", A0u);
        C20910yM.A00(C36331k8.A0h(this.A01), "supportBloksLaunchErrorType", A0u);
        C20910yM.A00(this.A06, "supportVideoLocale", A0u);
        return C36321k7.A0C(this.A07, "videoUrl", A0u);
    }
}
