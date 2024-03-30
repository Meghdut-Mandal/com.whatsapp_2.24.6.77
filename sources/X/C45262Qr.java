package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Qr  reason: invalid class name and case insensitive filesystem */
public final class C45262Qr extends C20890yK {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public Long A04;

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A02);
        r3.Bpz(3, this.A00);
        r3.Bpz(4, this.A03);
        r3.Bpz(5, this.A01);
        r3.Bpz(2, this.A04);
    }

    public C45262Qr() {
        super(3022, C36331k8.A0H(), 2, 113760892);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0K(C36331k8.A0N(C36331k8.A0M(C36331k8.A0L(C36361kB.A0i(), this.A02, A1G), this.A00, A1G), this.A03, A1G), this.A01, A1G), this.A04);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamCtwaWelcomeMessage {");
        C20910yM.A00(C36331k8.A0h(this.A02), "ctwaWelcomeMessageAction", A0u);
        C20910yM.A00(this.A00, "ctwaWelcomeMessageContainsIcebreakers", A0u);
        C20910yM.A00(C36331k8.A0h(this.A03), "ctwaWelcomeMessageError", A0u);
        C20910yM.A00(this.A01, "ctwaWelcomeMessageIcebreakersContainAutoreply", A0u);
        return C36321k7.A0C(this.A04, "firstWelcomeMessageImpressionTime", A0u);
    }
}
