package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2NY  reason: invalid class name */
public final class AnonymousClass2NY extends C20890yK {
    public String A00;

    public AnonymousClass2NY() {
        super(2190, new C18950u5(1, 20, 20, false), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A00);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36361kB.A0i(), this.A00);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamLanguageNotRenderable {");
        return C36321k7.A0C(this.A00, "missingLanguage", A0u);
    }
}
