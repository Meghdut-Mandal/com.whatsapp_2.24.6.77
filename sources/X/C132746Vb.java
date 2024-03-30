package X;

import androidx.compose.ui.unit.Constraints;

/* renamed from: X.6Vb  reason: invalid class name and case insensitive filesystem */
public abstract class C132746Vb {
    public static final long A00(int i, int i2, int i3, int i4) {
        if (!C36371kC.A1T(i2, i)) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("maxWidth(");
            A0u.append(i2);
            A0u.append(") must be >= than minWidth(");
            A0u.append(i);
            A0u.append(')');
            throw AnonymousClass000.A0b(A0u);
        } else if (i4 < i3) {
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("maxHeight(");
            A0u2.append(i4);
            A0u2.append(") must be >= than minHeight(");
            A0u2.append(i3);
            A0u2.append(')');
            throw AnonymousClass000.A0b(A0u2);
        } else if (i >= 0 && i3 >= 0) {
            return Constraints.A01.A01(i, i2, i3, i4);
        } else {
            StringBuilder A0u3 = AnonymousClass000.A0u();
            A0u3.append("minWidth(");
            A0u3.append(i);
            A0u3.append(") and minHeight(");
            A0u3.append(i3);
            throw AnonymousClass000.A0c(") must be >= 0", A0u3);
        }
    }

    public static final long A01(int i, int i2, long j) {
        int A03 = Constraints.A03(j) + i;
        if (A03 < 0) {
            A03 = 0;
        }
        int A01 = Constraints.A01(j);
        if (A01 != Integer.MAX_VALUE && (A01 = A01 + i) < 0) {
            A01 = 0;
        }
        int A02 = Constraints.A02(j) + i2;
        if (A02 < 0) {
            A02 = 0;
        }
        int A00 = Constraints.A00(j);
        if (A00 != Integer.MAX_VALUE && (A00 = A00 + i2) < 0) {
            A00 = 0;
        }
        return A00(A03, A01, A02, A00);
    }
}
