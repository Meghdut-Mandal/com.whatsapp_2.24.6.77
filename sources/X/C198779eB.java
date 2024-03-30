package X;

import java.util.Arrays;
import java.util.Objects;

/* renamed from: X.9eB  reason: invalid class name and case insensitive filesystem */
public final class C198779eB {
    public AnonymousClass9JC A00;
    public final AnonymousClass9JC A01;
    public final String A02;

    public static void A00(C198779eB r2, Object obj, String str) {
        AnonymousClass9JC r1 = new AnonymousClass9JC();
        r2.A00.A02 = r1;
        r2.A00 = r1;
        r1.A00 = obj;
        Objects.requireNonNull(str);
        r1.A01 = str;
    }

    public String toString() {
        StringBuilder A0h = C90524aI.A0h(32);
        A0h.append(this.A02);
        A0h.append('{');
        String str = "";
        for (AnonymousClass9JC r3 = this.A01.A02; r3 != null; r3 = r3.A02) {
            Object obj = r3.A00;
            A0h.append(str);
            if (r3.A01 != null) {
                A0h.append(r3.A01);
                A0h.append('=');
            }
            if (obj == null || !obj.getClass().isArray()) {
                A0h.append(obj);
            } else {
                String deepToString = Arrays.deepToString(C36431kI.A1Z(obj, 1));
                A0h.append(deepToString, 1, deepToString.length() - 1);
            }
            str = ", ";
        }
        return AnonymousClass000.A0s(A0h);
    }

    public C198779eB(String str) {
        AnonymousClass9JC r0 = new AnonymousClass9JC();
        this.A01 = r0;
        this.A00 = r0;
        Objects.requireNonNull(str);
        this.A02 = str;
    }

    public static void A01(C198779eB r1, String str, boolean z) {
        A00(r1, String.valueOf(z), str);
    }
}
