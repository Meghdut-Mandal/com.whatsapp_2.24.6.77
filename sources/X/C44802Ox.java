package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Ox  reason: invalid class name and case insensitive filesystem */
public final class C44802Ox extends C20890yK {
    public Double A00;
    public Integer A01;

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A01);
        r3.Bpz(2, this.A00);
    }

    public C44802Ox() {
        super(2958, C36331k8.A0H(), 2, 248614979);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0K(C36361kB.A0i(), this.A01, A1G), this.A00);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamTestAnonymousDailyId {");
        C20910yM.A00(C36331k8.A0h(this.A01), "psTestEnumField", A0u);
        return C36321k7.A0C(this.A00, "psTestFloatField", A0u);
    }
}
