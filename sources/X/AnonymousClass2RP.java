package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2RP  reason: invalid class name */
public final class AnonymousClass2RP extends C20890yK {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Double A04;
    public Integer A05;

    public AnonymousClass2RP() {
        super(1734, new C18950u5(1, 1, 5, false), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(3, this.A04);
        r3.Bpz(1, this.A05);
        r3.Bpz(6, this.A00);
        r3.Bpz(5, this.A01);
        r3.Bpz(2, this.A02);
        r3.Bpz(9, this.A03);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        C36321k7.A1b(A1G, 4);
        A1G.put(C36331k8.A0K(C36331k8.A0N(C36331k8.A0O(C36331k8.A0J(C36371kC.A0n(), this.A04, A1G), this.A05, A1G), this.A00, A1G), this.A01, A1G), this.A02);
        C36321k7.A1b(A1G, 7);
        A1G.put(C36401kF.A0i(), this.A03);
        C36321k7.A1b(A1G, 8);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamMessageMediaDownload {");
        C20910yM.A00(this.A04, "mediaSize", A0u);
        C20910yM.A00(C36331k8.A0h(this.A05), "messageMediaType", A0u);
        C20910yM.A00(this.A00, "stickerIsAi", A0u);
        C20910yM.A00(this.A01, "stickerIsAvatar", A0u);
        C20910yM.A00(this.A02, "stickerIsFirstParty", A0u);
        return C36321k7.A0C(this.A03, "stickerIsLottie", A0u);
    }
}
