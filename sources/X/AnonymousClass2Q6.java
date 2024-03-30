package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Q6  reason: invalid class name */
public final class AnonymousClass2Q6 extends C20890yK {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;

    public AnonymousClass2Q6() {
        super(3894, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A02);
        r3.Bpz(2, this.A03);
        r3.Bpz(3, this.A00);
        r3.Bpz(4, this.A01);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0O(C36331k8.A0N(C36331k8.A0M(C36331k8.A0L(C36331k8.A0K(C36361kB.A0i(), this.A02, A1G), this.A03, A1G), this.A00, A1G), this.A01, A1G), (Object) null, A1G), (Object) null);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamAvatarStickerSend {");
        C20910yM.A00(C36331k8.A0h(this.A02), "avatarStickerSendMessageType", A0u);
        C20910yM.A00(C36331k8.A0h(this.A03), "avatarStickerSendOriginType", A0u);
        C20910yM.A00(this.A00, "stickerIsAnimated", A0u);
        return C36321k7.A0C(this.A01, "stickerIsCountry", A0u);
    }
}
