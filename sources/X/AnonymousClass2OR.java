package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2OR  reason: invalid class name */
public final class AnonymousClass2OR extends C20890yK {
    public Boolean A00;
    public Integer A01;

    public AnonymousClass2OR() {
        super(4698, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A01);
        r3.Bpz(2, this.A00);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0K(C36361kB.A0i(), this.A01, A1G), this.A00);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamFabButtonClick {");
        C20910yM.A00(C36331k8.A0h(this.A01), "settingsPageType", A0u);
        return C36321k7.A0C(this.A00, "tooltipImpressionInSession", A0u);
    }
}