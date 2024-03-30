package X;

import java.util.Objects;

/* renamed from: X.66u  reason: invalid class name and case insensitive filesystem */
public class C1270666u {
    public final String A00;
    public final int A01;
    public final C175818b6 A02;

    public boolean equals(Object obj) {
        boolean equals;
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C1270666u r6 = (C1270666u) obj;
                C175818b6 r2 = this.A02;
                if (r2 == null) {
                    String str = this.A00;
                    if (str == null || this.A01 != r6.A01) {
                        return false;
                    }
                    equals = str.equals(r6.A00);
                } else if (this.A01 != r6.A01) {
                    return false;
                } else {
                    equals = r2.equals(r6.A02);
                }
                return equals;
            }
            return false;
        }
    }

    public C1270666u(C175818b6 r1, String str, int i) {
        this.A01 = i;
        this.A02 = r1;
        this.A00 = str;
    }

    public int hashCode() {
        Object[] A1Q = C36441kJ.A1Q();
        AnonymousClass000.A1J(A1Q, this.A01);
        A1Q[1] = this.A02;
        A1Q[2] = this.A00;
        return Objects.hash(A1Q);
    }
}
