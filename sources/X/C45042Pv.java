package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Pv  reason: invalid class name and case insensitive filesystem */
public final class C45042Pv extends C20890yK {
    public Boolean A00;
    public Boolean A01;
    public String A02;

    public C45042Pv() {
        super(1846, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(2, this.A00);
        r3.Bpz(4, this.A01);
        r3.Bpz(3, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36361kB.A0j(), this.A00);
        C36321k7.A1b(A1G, 1);
        A1G.put(C36331k8.A0L(C36371kC.A0o(), this.A01, A1G), this.A02);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamStickerPackDelete {");
        C20910yM.A00(this.A00, "stickerPackIsAvatar", A0u);
        C20910yM.A00(this.A01, "stickerPackIsLottie", A0u);
        return C36321k7.A0C(this.A02, "waAvatarSessionId", A0u);
    }
}
