package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.58n  reason: invalid class name and case insensitive filesystem */
public final class C1041658n extends C20890yK {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public Boolean A05;
    public Double A06;
    public Integer A07;
    public Integer A08;
    public Integer A09;
    public Integer A0A;
    public Integer A0B;
    public Integer A0C;
    public Integer A0D;
    public Long A0E;
    public Long A0F;
    public Long A0G;
    public String A0H;

    public C1041658n() {
        super(3664, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A07);
        r3.Bpz(2, this.A00);
        r3.Bpz(3, this.A08);
        r3.Bpz(4, this.A0E);
        r3.Bpz(5, this.A0H);
        r3.Bpz(18, this.A09);
        r3.Bpz(6, this.A0A);
        r3.Bpz(7, this.A01);
        r3.Bpz(16, this.A0F);
        r3.Bpz(8, this.A02);
        r3.Bpz(17, this.A0B);
        r3.Bpz(9, this.A03);
        r3.Bpz(10, this.A04);
        r3.Bpz(11, this.A0C);
        r3.Bpz(12, this.A0D);
        r3.Bpz(13, this.A06);
        r3.Bpz(14, this.A05);
        r3.Bpz(15, this.A0G);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36341k9.A0b(C36341k9.A0a(C36331k8.A0V(C36331k8.A0U(C36331k8.A0T(C36331k8.A0S(C36331k8.A0R(C36351kA.A0t(C36331k8.A0Q(C36351kA.A0s(C36331k8.A0P(C36331k8.A0O(C36371kC.A0q(C36331k8.A0N(C36331k8.A0M(C36331k8.A0L(C36331k8.A0K(C36361kB.A0i(), this.A07, A1G), this.A00, A1G), this.A08, A1G), this.A0E, A1G), this.A0H, A1G), this.A09, A1G), this.A0A, A1G), this.A01, A1G), this.A0F, A1G), this.A02, A1G), this.A0B, A1G), this.A03, A1G), this.A04, A1G), this.A0C, A1G), this.A0D, A1G), this.A06, A1G), this.A05, A1G), this.A0G);
        Object A0c = C36341k9.A0c(A1G, 19);
        C36331k8.A1Q(A0c, A1G, 20);
        C36331k8.A1Q(A0c, A1G, 21);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamCameraCaptureFlow {");
        C20910yM.A00(C36331k8.A0h(this.A07), "cameraCaptureDirection", A0u);
        C20910yM.A00(this.A00, "cameraCaptureUserCancelled", A0u);
        C20910yM.A00(C36331k8.A0h(this.A08), "cameraEntryPoint", A0u);
        C20910yM.A00(this.A0E, "cameraErrorCode", A0u);
        C20910yM.A00(this.A0H, "cameraErrorDomain", A0u);
        C20910yM.A00(C36331k8.A0h(this.A09), "cameraEventName", A0u);
        C20910yM.A00(C36331k8.A0h(this.A0A), "cameraFlashMode", A0u);
        C20910yM.A00(this.A01, "cameraGalleryBrowserClosed", A0u);
        C20910yM.A00(this.A0F, "cameraGalleryBrowserMediaItemCount", A0u);
        C20910yM.A00(this.A02, "cameraGalleryBrowserMediaUsed", A0u);
        C20910yM.A00(C36331k8.A0h(this.A0B), "cameraGalleryBrowserSelectionType", A0u);
        C20910yM.A00(this.A03, "cameraGalleryStripMediaUsed", A0u);
        C20910yM.A00(this.A04, "cameraLowLight", A0u);
        C20910yM.A00(C36331k8.A0h(this.A0C), "cameraMediaType", A0u);
        C20910yM.A00(C36331k8.A0h(this.A0D), "cameraOrientation", A0u);
        C20910yM.A00(this.A06, "cameraVideoCaptureDuration", A0u);
        C20910yM.A00(this.A05, "cameraZoomUsed", A0u);
        return C36321k7.A0C(this.A0G, "mediaFlowSessionId", A0u);
    }
}
