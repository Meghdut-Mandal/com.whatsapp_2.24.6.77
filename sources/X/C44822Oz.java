package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Oz  reason: invalid class name and case insensitive filesystem */
public final class C44822Oz extends C20890yK {
    public Integer A00;
    public Integer A01;

    public C44822Oz() {
        super(4880, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(3, this.A00);
        r3.Bpz(4, this.A01);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0M(C36371kC.A0n(), this.A00, A1G), this.A01);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamUsernameMdBannerAction {");
        C20910yM.A00(C36331k8.A0h(this.A00), "usernameBannerAction", A0u);
        return C36321k7.A0C(C36331k8.A0h(this.A01), "usernameBannerEntrypoint", A0u);
    }
}
