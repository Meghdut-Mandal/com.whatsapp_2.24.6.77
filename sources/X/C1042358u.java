package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.58u  reason: invalid class name and case insensitive filesystem */
public final class C1042358u extends C20890yK {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public Integer A08;
    public Integer A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;
    public Long A0D;
    public Long A0E;
    public Long A0F;
    public Long A0G;
    public Long A0H;
    public Long A0I;
    public Long A0J;
    public Long A0K;
    public Long A0L;
    public Long A0M;
    public Long A0N;
    public Long A0O;
    public Long A0P;
    public Long A0Q;

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(24, this.A00);
        r3.Bpz(25, this.A01);
        r3.Bpz(16, this.A0A);
        r3.Bpz(34, this.A0B);
        r3.Bpz(35, this.A02);
        r3.Bpz(36, this.A05);
        r3.Bpz(22, this.A03);
        r3.Bpz(4, this.A0C);
        r3.Bpz(10, this.A0D);
        r3.Bpz(3, this.A0E);
        r3.Bpz(11, this.A0F);
        r3.Bpz(18, this.A0G);
        r3.Bpz(26, this.A04);
        r3.Bpz(14, this.A06);
        r3.Bpz(2, this.A0H);
        r3.Bpz(5, this.A0I);
        r3.Bpz(12, this.A0J);
        r3.Bpz(15, this.A0K);
        r3.Bpz(13, this.A0L);
        r3.Bpz(1, this.A07);
        r3.Bpz(31, this.A0M);
        r3.Bpz(32, this.A0N);
        r3.Bpz(23, this.A0O);
        r3.Bpz(27, this.A08);
        r3.Bpz(30, this.A0P);
        r3.Bpz(17, this.A0Q);
        r3.Bpz(28, this.A09);
    }

    public C1042358u() {
        super(1038, C20890yK.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(24, this.A00);
        A1G.put(C36351kA.A0s(C36431kI.A14(), this.A01, A1G), this.A0A);
        A1G.put(34, this.A0B);
        A1G.put(35, this.A02);
        A1G.put(C90474aD.A0X(36, this.A05, A1G), this.A03);
        C36321k7.A1b(A1G, 33);
        A1G.put(C36371kC.A0q(C36331k8.A0T(C36331k8.A0L(C36331k8.A0S(C36371kC.A0o(), this.A0C, A1G), this.A0D, A1G), this.A0E, A1G), this.A0F, A1G), this.A0G);
        A1G.put(26, this.A04);
        A1G.put(C36341k9.A0a(20, C36341k9.A0c(A1G, 19), A1G), this.A06);
        C36321k7.A1b(A1G, 21);
        A1G.put(C36331k8.A0N(C36361kB.A0j(), this.A0H, A1G), this.A0I);
        C36321k7.A1b(A1G, 29);
        A1G.put(C90484aE.A0d(C90504aG.A0g(C90504aG.A0f(C36331k8.A0J(C36331k8.A0V(C36341k9.A0b(C36431kI.A12(), this.A0J, A1G), this.A0K, A1G), this.A0L, A1G), this.A07, A1G), this.A0M, A1G), this.A0N, A1G), this.A0O);
        A1G.put(C90504aG.A0d(C36351kA.A0t(C90504aG.A0e(C90514aH.A0k(), this.A08, A1G), this.A0P, A1G), this.A0Q, A1G), this.A09);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamMediaPicker {");
        C20910yM.A00(this.A00, "audienceSelectorClicked", A0u);
        C20910yM.A00(this.A01, "audienceSelectorUpdated", A0u);
        C20910yM.A00(this.A0A, "chatRecipients", A0u);
        C20910yM.A00(this.A0B, "hdToggleChange", A0u);
        C20910yM.A00(this.A02, "hdToggleEligible", A0u);
        C20910yM.A00(C36331k8.A0h(this.A05), "hdToggleState", A0u);
        C20910yM.A00(this.A03, "isViewOnce", A0u);
        C20910yM.A00(this.A0C, "mediaPickerChanged", A0u);
        C20910yM.A00(this.A0D, "mediaPickerCroppedRotated", A0u);
        C20910yM.A00(this.A0E, "mediaPickerDeleted", A0u);
        C20910yM.A00(this.A0F, "mediaPickerDrawing", A0u);
        C20910yM.A00(this.A0G, "mediaPickerFilter", A0u);
        C20910yM.A00(this.A04, "mediaPickerHasLocationSticker", A0u);
        C20910yM.A00(C36331k8.A0h(this.A06), "mediaPickerOrigin", A0u);
        C20910yM.A00(this.A0H, "mediaPickerSent", A0u);
        C20910yM.A00(this.A0I, "mediaPickerSentUnchanged", A0u);
        C20910yM.A00(this.A0J, "mediaPickerStickers", A0u);
        C20910yM.A00(this.A0K, "mediaPickerT", A0u);
        C20910yM.A00(this.A0L, "mediaPickerText", A0u);
        C20910yM.A00(C36331k8.A0h(this.A07), "mediaType", A0u);
        C20910yM.A00(this.A0M, "motionPhotoImpressionCount", A0u);
        C20910yM.A00(this.A0N, "motionPhotoSentCount", A0u);
        C20910yM.A00(this.A0O, "photoGalleryDurationT", A0u);
        C20910yM.A00(C36331k8.A0h(this.A08), "photoQualitySetting", A0u);
        C20910yM.A00(this.A0P, "pickerSessionId", A0u);
        C20910yM.A00(this.A0Q, "statusRecipients", A0u);
        return C36321k7.A0C(C36331k8.A0h(this.A09), "videoQualitySetting", A0u);
    }
}
