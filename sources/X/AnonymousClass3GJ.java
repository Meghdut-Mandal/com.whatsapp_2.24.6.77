package X;

import java.util.Arrays;

/* renamed from: X.3GJ  reason: invalid class name */
public class AnonymousClass3GJ {
    public final int A00;
    public final int A01;
    public final int A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass3GJ r5 = (AnonymousClass3GJ) obj;
            if (!(this.A00 == r5.A00 && this.A01 == r5.A01 && this.A02 == r5.A02)) {
                return false;
            }
        }
        return true;
    }

    public AnonymousClass3GJ(int i, int i2, int i3) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
    }

    public int hashCode() {
        Object[] A1Q = C36441kJ.A1Q();
        AnonymousClass000.A1J(A1Q, this.A00);
        AnonymousClass000.A1K(A1Q, this.A01);
        C36331k8.A1V(A1Q, this.A02);
        return Arrays.hashCode(A1Q);
    }
}
