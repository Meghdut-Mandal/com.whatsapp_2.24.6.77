package X;

import java.util.Objects;

/* renamed from: X.3GF  reason: invalid class name */
public class AnonymousClass3GF {
    public Long A00;
    public String A01;
    public boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass3GF r5 = (AnonymousClass3GF) obj;
            if (this.A02 != r5.A02 || !Objects.equals(this.A01, r5.A01) || !Objects.equals(this.A00, r5.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] A1Q = C36441kJ.A1Q();
        A1Q[0] = this.A01;
        C36421kH.A1R(A1Q, this.A02);
        A1Q[2] = this.A00;
        return Objects.hash(A1Q);
    }
}
