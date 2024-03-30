package X;

import java.util.Objects;

/* renamed from: X.3GD  reason: invalid class name */
public final class AnonymousClass3GD {
    public final int A00;
    public final int A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !C36381kD.A1Y(this, obj)) {
                return false;
            }
            AnonymousClass3GD r5 = (AnonymousClass3GD) obj;
            if (this.A00 != r5.A00 || this.A01 != r5.A01) {
                return false;
            }
            String str = this.A02;
            int length = str.length();
            String str2 = r5.A02;
            return length == 0 ? str2.length() == 0 : str.equals(str2);
        }
    }

    public AnonymousClass3GD(int i, int i2, String str) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = str;
    }

    public int hashCode() {
        Object[] A1Q = C36441kJ.A1Q();
        AnonymousClass000.A1J(A1Q, this.A00);
        AnonymousClass000.A1K(A1Q, this.A01);
        A1Q[2] = this.A02;
        return Objects.hash(A1Q);
    }
}
