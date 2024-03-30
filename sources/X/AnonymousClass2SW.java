package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2SW  reason: invalid class name */
public final class AnonymousClass2SW extends C20890yK {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public Boolean A05;
    public Boolean A06;
    public Boolean A07;
    public Integer A08;
    public Integer A09;
    public Integer A0A;

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(7, this.A00);
        r3.Bpz(3, this.A01);
        r3.Bpz(6, this.A02);
        r3.Bpz(2, this.A03);
        r3.Bpz(5, this.A04);
        r3.Bpz(10, this.A05);
        r3.Bpz(9, this.A06);
        r3.Bpz(11, this.A07);
        r3.Bpz(8, this.A08);
        r3.Bpz(4, this.A09);
        r3.Bpz(1, this.A0A);
    }

    public AnonymousClass2SW() {
        super(1840, C20890yK.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0J(C36331k8.A0M(C36331k8.A0Q(C36331k8.A0T(C36331k8.A0R(C36331k8.A0S(C36331k8.A0N(C36331k8.A0K(C36331k8.A0O(C36331k8.A0L(C36401kF.A0h(), this.A00, A1G), this.A01, A1G), this.A02, A1G), this.A03, A1G), this.A04, A1G), this.A05, A1G), this.A06, A1G), this.A07, A1G), this.A08, A1G), this.A09, A1G), this.A0A);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamStickerSend {");
        C20910yM.A00(this.A00, "stickerIsAi", A0u);
        C20910yM.A00(this.A01, "stickerIsAnimated", A0u);
        C20910yM.A00(this.A02, "stickerIsAvatar", A0u);
        C20910yM.A00(this.A03, "stickerIsFirstParty", A0u);
        C20910yM.A00(this.A04, "stickerIsFromStickerMaker", A0u);
        C20910yM.A00(this.A05, "stickerIsGiphy", A0u);
        C20910yM.A00(this.A06, "stickerIsLottie", A0u);
        C20910yM.A00(this.A07, "stickerIsTenor", A0u);
        C20910yM.A00(C36331k8.A0h(this.A08), "stickerMakerSourceType", A0u);
        C20910yM.A00(C36331k8.A0h(this.A09), "stickerSendMessageType", A0u);
        return C36321k7.A0C(C36331k8.A0h(this.A0A), "stickerSendOrigin", A0u);
    }
}
