package X;

import java.util.Arrays;
import java.util.Objects;

/* renamed from: X.62Z  reason: invalid class name */
public final class AnonymousClass62Z {
    public C118755og A00;
    public final C118755og A01;
    public final String A02;

    public String toString() {
        StringBuilder A0h = C90524aI.A0h(32);
        A0h.append(this.A02);
        A0h.append('{');
        String str = "";
        for (C118755og r3 = this.A01.A00; r3 != null; r3 = r3.A00) {
            Object obj = r3.A01;
            A0h.append(str);
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

    public AnonymousClass62Z(String str) {
        C118755og r0 = new C118755og();
        this.A01 = r0;
        this.A00 = r0;
        Objects.requireNonNull(str);
        this.A02 = str;
    }
}
