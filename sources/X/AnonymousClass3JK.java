package X;

import java.util.Arrays;

/* renamed from: X.3JK  reason: invalid class name */
public class AnonymousClass3JK {
    public final int A00;
    public final int A01;
    public final long A02;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass3JK)) {
            return false;
        }
        AnonymousClass3JK r7 = (AnonymousClass3JK) obj;
        return this.A00 == r7.A00 && this.A01 == r7.A01 && this.A02 == r7.A02;
    }

    public AnonymousClass3JK(int i, long j, int i2) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = j;
    }

    public int hashCode() {
        Object[] A1Q = C36441kJ.A1Q();
        AnonymousClass000.A1J(A1Q, this.A00);
        AnonymousClass000.A1K(A1Q, this.A01);
        C36361kB.A1W(A1Q, this.A02);
        return Arrays.hashCode(A1Q);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("FutureStageTiming{stage=");
        A0u.append(this.A00);
        A0u.append(", type=");
        A0u.append(this.A01);
        A0u.append(", timeInMillis=");
        A0u.append(this.A02);
        return AnonymousClass000.A0s(A0u);
    }
}
