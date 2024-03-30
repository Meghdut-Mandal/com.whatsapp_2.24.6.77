package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2R7  reason: invalid class name */
public final class AnonymousClass2R7 extends C20890yK {
    public Integer A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public Long A04;

    public AnonymousClass2R7() {
        super(5190, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A01);
        r3.Bpz(2, this.A00);
        r3.Bpz(6, this.A02);
        r3.Bpz(4, this.A03);
        r3.Bpz(5, this.A04);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        C36321k7.A1I(C36331k8.A0K(C36361kB.A0i(), this.A01, A1G), this.A00, A1G);
        A1G.put(C36331k8.A0N(C36331k8.A0M(C36381kD.A0n(), this.A02, A1G), this.A03, A1G), this.A04);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamStickerSearchResult {");
        C20910yM.A00(this.A01, "giphyResultsCount", A0u);
        C20910yM.A00(C36331k8.A0h(this.A00), "stickerProviderOnSend", A0u);
        C20910yM.A00(this.A02, "totalResultsCount", A0u);
        C20910yM.A00(this.A03, "totalTimeFirstLoad", A0u);
        return C36321k7.A0C(this.A04, "wa1pResultsCount", A0u);
    }
}
