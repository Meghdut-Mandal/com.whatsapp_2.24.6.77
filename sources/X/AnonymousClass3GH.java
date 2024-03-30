package X;

import java.util.Arrays;

/* renamed from: X.3GH  reason: invalid class name */
public class AnonymousClass3GH {
    public final int A00;
    public final C600336f A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass3GH r5 = (AnonymousClass3GH) obj;
            if (!C1901797e.A00(this.A01, r5.A01) || !C1901797e.A00(Boolean.valueOf(this.A02), Boolean.valueOf(r5.A02)) || !C1901797e.A00(Integer.valueOf(this.A00), Integer.valueOf(r5.A00))) {
                return false;
            }
        }
        return true;
    }

    public AnonymousClass3GH(C600336f r1, int i, boolean z) {
        this.A01 = r1;
        this.A02 = z;
        this.A00 = i;
    }

    public int hashCode() {
        Object[] A1Q = C36441kJ.A1Q();
        A1Q[0] = this.A01;
        C36421kH.A1R(A1Q, this.A02);
        C36331k8.A1V(A1Q, this.A00);
        return Arrays.hashCode(A1Q);
    }
}
