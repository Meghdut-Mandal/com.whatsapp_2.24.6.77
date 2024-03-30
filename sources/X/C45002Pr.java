package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Pr  reason: invalid class name and case insensitive filesystem */
public final class C45002Pr extends C20890yK {
    public Integer A00;
    public Integer A01;
    public String A02;

    public C45002Pr() {
        super(3560, C36431kI.A0q(), 2, 0);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A00);
        r3.Bpz(2, this.A02);
        r3.Bpz(3, this.A01);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0L(C36331k8.A0K(C36361kB.A0i(), this.A00, A1G), this.A02, A1G), this.A01);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamStatusReplyReceived {");
        C20910yM.A00(C36331k8.A0h(this.A00), "statusMediaType", A0u);
        C20910yM.A00(this.A02, "statusPosterJid", A0u);
        return C36321k7.A0C(C36331k8.A0h(this.A01), "statusReplyMessageType", A0u);
    }
}
