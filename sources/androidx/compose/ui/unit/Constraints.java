package androidx.compose.ui.unit;

import X.AnonymousClass000;
import X.C130656Lx;
import X.C15040mb;
import X.C36321k7;

public final class Constraints {
    public static final C130656Lx A01 = new C130656Lx();
    public static final int[] A02 = {32767, 8191, 65535, 262143};
    public static final int[] A03 = {18, 20, 17, 15};
    public static final int[] A04 = {65535, 262143, 32767, 8191};
    public final long A00;

    public static final int A00(long j) {
        int A042 = A04(j, (int) (j & 3));
        int i = A042 - 1;
        if (A042 == 0) {
            return Integer.MAX_VALUE;
        }
        return i;
    }

    public static final int A01(long j) {
        int i = ((int) (j >> 33)) & A04[(int) (j & 3)];
        int i2 = i - 1;
        if (i == 0) {
            return Integer.MAX_VALUE;
        }
        return i2;
    }

    public static final int A02(long j) {
        int i = (int) (j & 3);
        return ((int) (j >> A03[i])) & A02[i];
    }

    public static final int A03(long j) {
        return ((int) (j >> 2)) & A04[(int) (j & 3)];
    }

    public static int A04(long j, int i) {
        return ((int) (j >> (A03[i] + 31))) & A02[i];
    }

    public static final long A07(int i, int i2, int i3, int i4) {
        if (i3 < 0 || i < 0) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("minHeight(");
            A0u.append(i3);
            A0u.append(") and minWidth(");
            A0u.append(i);
            throw AnonymousClass000.A0c(") must be >= 0", A0u);
        }
        boolean z = true;
        if (i2 < i) {
            z = false;
        }
        if (!z) {
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("maxWidth(");
            A0u2.append(i2);
            A0u2.append(") must be >= minWidth(");
            A0u2.append(i);
            A0u2.append(')');
            throw AnonymousClass000.A0b(A0u2);
        } else if (i4 >= i3) {
            return A01.A01(i, i2, i3, i4);
        } else {
            StringBuilder A0u3 = AnonymousClass000.A0u();
            A0u3.append("maxHeight(");
            A0u3.append(i4);
            A0u3.append(") must be >= minHeight(");
            A0u3.append(i3);
            A0u3.append(')');
            throw AnonymousClass000.A0b(A0u3);
        }
    }

    public boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof Constraints) || j != ((Constraints) obj).A00) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A08(this.A00);
    }

    public String toString() {
        return A08(this.A00);
    }

    public /* synthetic */ Constraints(long j) {
        this.A00 = j;
    }

    public static int A05(long j, int i) {
        return C15040mb.A02(i, A02(j), A00(j));
    }

    public static int A06(long j, int i) {
        return C15040mb.A02(i, A03(j), A01(j));
    }

    public static String A08(long j) {
        String valueOf;
        int A012 = A01(j);
        String str = "Infinity";
        if (A012 == Integer.MAX_VALUE) {
            valueOf = str;
        } else {
            valueOf = String.valueOf(A012);
        }
        int A002 = A00(j);
        if (A002 != Integer.MAX_VALUE) {
            str = String.valueOf(A002);
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Constraints(minWidth = ");
        A0u.append(A03(j));
        A0u.append(", maxWidth = ");
        A0u.append(valueOf);
        A0u.append(", minHeight = ");
        A0u.append(A02(j));
        A0u.append(", maxHeight = ");
        return C36321k7.A0E(str, A0u);
    }
}
