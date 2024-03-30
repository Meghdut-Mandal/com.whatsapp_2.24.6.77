package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.57l  reason: invalid class name and case insensitive filesystem */
public final class C1038857l extends C20890yK {
    public final String A00;
    public final C122295uc[] A01;

    public void serialize(C28991Ux r6) {
        for (C122295uc r0 : this.A01) {
            r6.Bpz(r0.A02, r0.A01);
        }
    }

    public String toString() {
        StringBuilder A0h = C90524aI.A0h(256);
        A0h.append(this.A00);
        A0h.append(" {");
        for (C122295uc r2 : this.A01) {
            if (r2.A00 != null) {
                C20910yM.A00(String.valueOf(r2.A00), r2.A03, A0h);
            }
        }
        return AnonymousClass000.A0q("}", A0h);
    }

    public C1038857l(C18950u5 r1, String str, C122295uc[] r3, int i, int i2, int i3) {
        super(i, r1, i2, i3);
        this.A00 = str;
        this.A01 = r3;
    }

    public Map getFieldsMap() {
        HashMap A0J = AnonymousClass001.A0J();
        for (C122295uc r2 : this.A01) {
            A0J.put(Integer.valueOf(r2.A02), r2.A01);
        }
        return A0J;
    }
}
