package X;

import java.util.Arrays;

/* renamed from: X.69y  reason: invalid class name and case insensitive filesystem */
public final class C1278669y {
    public final int A00;
    public final int A01;

    public boolean equals(Object obj) {
        if (!(obj instanceof C1278669y)) {
            return false;
        }
        C1278669y r4 = (C1278669y) obj;
        if (this.A01 == r4.A01 && this.A00 == r4.A00) {
            return true;
        }
        return false;
    }

    public C1278669y(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass001.A0M();
        AnonymousClass000.A1J(A0M, this.A01);
        AnonymousClass000.A1K(A0M, this.A00);
        return Arrays.hashCode(A0M);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        C90494aF.A1L(A0u, this.A01);
        return C36381kD.A10(A0u, this.A00);
    }
}
