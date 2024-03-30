package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2R6  reason: invalid class name */
public final class AnonymousClass2R6 extends C20890yK {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Integer A04;

    public AnonymousClass2R6() {
        super(1842, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A04);
        r3.Bpz(5, this.A00);
        r3.Bpz(4, this.A01);
        r3.Bpz(8, this.A02);
        r3.Bpz(9, this.A03);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        C36321k7.A1I(C36331k8.A0N(C36361kB.A0i(), this.A04, A1G), this.A00, A1G);
        A1G.put(C36331k8.A0R(C36331k8.A0Q(C36331k8.A0O(C36331k8.A0K(C36371kC.A0o(), this.A01, A1G), (Object) null, A1G), (Object) null, A1G), this.A02, A1G), this.A03);
        C36321k7.A1b(A1G, 7);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamStickerAddToFavorite {");
        C20910yM.A00(C36331k8.A0h(this.A04), "stickerAddToFavoriteOrigin", A0u);
        C20910yM.A00(this.A00, "stickerIsAi", A0u);
        C20910yM.A00(this.A01, "stickerIsAvatar", A0u);
        C20910yM.A00(this.A02, "stickerIsGiphy", A0u);
        return C36321k7.A0C(this.A03, "stickerIsTenor", A0u);
    }
}
