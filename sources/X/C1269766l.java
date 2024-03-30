package X;

import java.util.Arrays;

/* renamed from: X.66l  reason: invalid class name and case insensitive filesystem */
public class C1269766l {
    public int A00;
    public int A01;
    public boolean A02;

    public boolean equals(Object obj) {
        if (!(obj instanceof C1269766l)) {
            return false;
        }
        C1269766l r4 = (C1269766l) obj;
        if (this.A01 == r4.A01 && this.A02 == r4.A02 && this.A00 == r4.A00) {
            return true;
        }
        return false;
    }

    public C1269766l(int i, int i2, boolean z) {
        this.A01 = i;
        this.A02 = z;
        this.A00 = i2;
    }

    public int hashCode() {
        Object[] A1Q = C36441kJ.A1Q();
        AnonymousClass000.A1J(A1Q, this.A01);
        C36421kH.A1R(A1Q, this.A02);
        C36331k8.A1V(A1Q, this.A00);
        return Arrays.hashCode(A1Q);
    }
}
