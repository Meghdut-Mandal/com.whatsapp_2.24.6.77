package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8c1  reason: invalid class name and case insensitive filesystem */
public final class C176378c1 extends C20890yK {
    public Integer A00;
    public Integer A01;
    public Long A02;
    public Long A03;
    public Long A04;

    public C176378c1() {
        super(3522, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A02);
        r3.Bpz(2, this.A03);
        r3.Bpz(3, this.A04);
        r3.Bpz(4, this.A00);
        r3.Bpz(5, this.A01);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0N(C36331k8.A0M(C36331k8.A0L(C36331k8.A0K(C36361kB.A0i(), this.A02, A1G), this.A03, A1G), this.A04, A1G), this.A00, A1G), this.A01);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamPrivacyHighlightDaily {");
        C20910yM.A00(this.A02, "dialogAppearCount", A0u);
        C20910yM.A00(this.A03, "dialogSelectCount", A0u);
        C20910yM.A00(this.A04, "narrativeAppearCount", A0u);
        C20910yM.A00(C36331k8.A0h(this.A00), "privacyHighlightCategory", A0u);
        return C36321k7.A0C(C36331k8.A0h(this.A01), "privacyHighlightSurface", A0u);
    }
}
