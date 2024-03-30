package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2PU  reason: invalid class name */
public final class AnonymousClass2PU extends C20890yK {
    public Boolean A00;
    public Boolean A01;
    public String A02;

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(2, this.A00);
        r3.Bpz(1, this.A01);
        r3.Bpz(3, this.A02);
    }

    public AnonymousClass2PU() {
        super(1156, C20890yK.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0L(C36331k8.A0J(C36361kB.A0j(), this.A00, A1G), this.A01, A1G), this.A02);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamDeepLinkClick {");
        C20910yM.A00(this.A00, "deepLinkHasPhoneNumber", A0u);
        C20910yM.A00(this.A01, "deepLinkHasText", A0u);
        return C36321k7.A0C(this.A02, "deepLinkSessionId", A0u);
    }
}
