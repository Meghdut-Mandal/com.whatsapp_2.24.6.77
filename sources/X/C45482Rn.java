package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Rn  reason: invalid class name and case insensitive filesystem */
public final class C45482Rn extends C20890yK {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Integer A04;
    public String A05;
    public String A06;

    public C45482Rn() {
        super(1844, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(6, this.A05);
        r3.Bpz(5, this.A00);
        r3.Bpz(1, this.A04);
        r3.Bpz(3, this.A01);
        r3.Bpz(2, this.A02);
        r3.Bpz(7, this.A03);
        r3.Bpz(4, this.A06);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0M(C36331k8.A0P(C36331k8.A0K(C36331k8.A0L(C36331k8.A0J(C36331k8.A0N(C36381kD.A0n(), this.A05, A1G), this.A00, A1G), this.A04, A1G), this.A01, A1G), this.A02, A1G), this.A03, A1G), this.A06);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamStickerPackDownload {");
        C20910yM.A00(this.A05, "stickerPackDownloadErrorReason", A0u);
        C20910yM.A00(this.A00, "stickerPackDownloadFailed", A0u);
        C20910yM.A00(C36331k8.A0h(this.A04), "stickerPackDownloadOrigin", A0u);
        C20910yM.A00(this.A01, "stickerPackIsAvatar", A0u);
        C20910yM.A00(this.A02, "stickerPackIsFirstParty", A0u);
        C20910yM.A00(this.A03, "stickerPackIsLottie", A0u);
        return C36321k7.A0C(this.A06, "waAvatarSessionId", A0u);
    }
}
