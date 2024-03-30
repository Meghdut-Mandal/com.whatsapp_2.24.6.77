package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Sg  reason: invalid class name and case insensitive filesystem */
public final class C45672Sg extends C20890yK {
    public Long A00;
    public Long A01;
    public Long A02;
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

    public C45672Sg() {
        super(2884, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(11, this.A00);
        r3.Bpz(12, this.A01);
        r3.Bpz(13, this.A02);
        r3.Bpz(14, this.A03);
        r3.Bpz(1, this.A04);
        r3.Bpz(6, this.A05);
        r3.Bpz(9, this.A06);
        r3.Bpz(8, this.A07);
        r3.Bpz(5, this.A08);
        r3.Bpz(3, this.A09);
        r3.Bpz(15, this.A0A);
        r3.Bpz(2, this.A0B);
        r3.Bpz(7, this.A0C);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36421kH.A0U(), this.A00);
        A1G.put(C36331k8.A0Q(C36331k8.A0R(C36331k8.A0O(C36331k8.A0J(C36341k9.A0a(C36331k8.A0V(C36331k8.A0U(C36431kI.A13(), C36341k9.A0c(A1G, 16), A1G), this.A01, A1G), this.A02, A1G), this.A03, A1G), this.A04, A1G), this.A05, A1G), this.A06, A1G), this.A07);
        C36321k7.A1b(A1G, 10);
        A1G.put(C36331k8.A0P(C36331k8.A0K(C36341k9.A0b(C36331k8.A0L(C36371kC.A0p(), this.A08, A1G), this.A09, A1G), this.A0A, A1G), this.A0B, A1G), this.A0C);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamStickerDailyAggregatedEvent {");
        C20910yM.A00(this.A00, "stickerAddToFavoriteCount", A0u);
        C20910yM.A00(this.A01, "stickerPackDeleteCount", A0u);
        C20910yM.A00(this.A02, "stickerPickerOpenedCount", A0u);
        C20910yM.A00(this.A03, "stickerSearchOpenedCount", A0u);
        C20910yM.A00(this.A04, "stickerSendCount", A0u);
        C20910yM.A00(this.A05, "stickerSendCountForward", A0u);
        C20910yM.A00(this.A06, "stickerSendCountIsAnimated", A0u);
        C20910yM.A00(this.A07, "stickerSendCountIsFirstParty", A0u);
        C20910yM.A00(this.A08, "stickerSendCountStickerPickerTabEmotion", A0u);
        C20910yM.A00(this.A09, "stickerSendCountStickerPickerTabFavorites", A0u);
        C20910yM.A00(this.A0A, "stickerSendCountStickerPickerTabPack", A0u);
        C20910yM.A00(this.A0B, "stickerSendCountStickerPickerTabRecents", A0u);
        return C36321k7.A0C(this.A0C, "stickerSendCountStickerSearch", A0u);
    }
}
