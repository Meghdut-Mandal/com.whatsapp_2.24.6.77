package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Pj  reason: invalid class name and case insensitive filesystem */
public final class C44922Pj extends C20890yK {
    public Integer A00;
    public Long A01;
    public Long A02;

    public C44922Pj() {
        super(3256, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A01);
        r3.Bpz(3, this.A00);
        r3.Bpz(4, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36361kB.A0i(), this.A01);
        C36321k7.A1b(A1G, 2);
        A1G.put(C36371kC.A0n(), this.A00);
        C36321k7.A1b(A1G, 5);
        A1G.put(C36371kC.A0o(), this.A02);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamPrivacyNoticeBadging {");
        C20910yM.A00(this.A01, "noticeBadgingId", A0u);
        C20910yM.A00(C36331k8.A0h(this.A00), "noticeBadgingStage", A0u);
        return C36321k7.A0C(this.A02, "noticeBadgingVersion", A0u);
    }
}
