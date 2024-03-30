package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Os  reason: invalid class name and case insensitive filesystem */
public final class C44752Os extends C20890yK {
    public Integer A00;
    public Integer A01;

    public C44752Os() {
        super(2214, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(2, this.A00);
        r3.Bpz(1, this.A01);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        C36321k7.A1I(C36331k8.A0J(C36361kB.A0j(), this.A00, A1G), this.A01, A1G);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamSettingsClick {");
        C20910yM.A00(C36331k8.A0h(this.A00), "settingsClickEntryPoint", A0u);
        return C36321k7.A0C(C36331k8.A0h(this.A01), "settingsItem", A0u);
    }
}
