package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Si  reason: invalid class name and case insensitive filesystem */
public final class C45692Si extends C20890yK {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;

    public C45692Si() {
        super(4644, C36441kJ.A0p(1, 1000, SearchActionVerificationClientService.NOTIFICATION_ID), 2, 113760892);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A03);
        r3.Bpz(2, this.A04);
        r3.Bpz(3, this.A05);
        r3.Bpz(4, this.A06);
        r3.Bpz(5, this.A00);
        r3.Bpz(12, this.A07);
        r3.Bpz(6, this.A08);
        r3.Bpz(7, this.A09);
        r3.Bpz(8, this.A01);
        r3.Bpz(13, this.A0A);
        r3.Bpz(9, this.A0B);
        r3.Bpz(10, this.A0C);
        r3.Bpz(11, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0T(C36331k8.A0S(C36331k8.A0R(C36331k8.A0V(C36331k8.A0Q(C36331k8.A0P(C36331k8.A0O(C36331k8.A0U(C36331k8.A0N(C36331k8.A0M(C36331k8.A0L(C36331k8.A0K(C36361kB.A0i(), this.A03, A1G), this.A04, A1G), this.A05, A1G), this.A06, A1G), this.A00, A1G), this.A07, A1G), this.A08, A1G), this.A09, A1G), this.A01, A1G), this.A0A, A1G), this.A0B, A1G), this.A0C, A1G), this.A02);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamWamediaImgopsEvent {");
        C20910yM.A00(this.A03, "wamediaImgopsContentLength", A0u);
        C20910yM.A00(this.A04, "wamediaImgopsErrorTolerance", A0u);
        C20910yM.A00(this.A05, "wamediaImgopsFileSize", A0u);
        C20910yM.A00(this.A06, "wamediaImgopsFileSizeOut", A0u);
        C20910yM.A00(C36331k8.A0h(this.A00), "wamediaImgopsFileType", A0u);
        C20910yM.A00(this.A07, "wamediaImgopsFrameDurationMs", A0u);
        C20910yM.A00(this.A08, "wamediaImgopsImageHeight", A0u);
        C20910yM.A00(this.A09, "wamediaImgopsImageWidth", A0u);
        C20910yM.A00(C36331k8.A0h(this.A01), "wamediaImgopsImpl", A0u);
        C20910yM.A00(this.A0A, "wamediaImgopsNumFrames", A0u);
        C20910yM.A00(this.A0B, "wamediaImgopsReturnValue", A0u);
        C20910yM.A00(this.A0C, "wamediaImgopsTimeElapsedNs", A0u);
        return C36321k7.A0C(C36331k8.A0h(this.A02), "wamediaImgopsType", A0u);
    }
}
