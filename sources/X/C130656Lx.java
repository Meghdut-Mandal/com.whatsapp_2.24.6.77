package X;

import androidx.compose.ui.unit.Constraints;

/* renamed from: X.6Lx  reason: invalid class name and case insensitive filesystem */
public final class C130656Lx {
    public static final int A00(int i) {
        if (i < 8191) {
            return 13;
        }
        if (i < 32767) {
            return 15;
        }
        if (i < 65535) {
            return 16;
        }
        if (i < 262143) {
            return 18;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Can't represent a size of ");
        A0u.append(i);
        throw AnonymousClass000.A0c(" in Constraints", A0u);
    }

    public final long A01(int i, int i2, int i3, int i4) {
        long j;
        int i5 = i4;
        if (i4 == Integer.MAX_VALUE) {
            i5 = i3;
        }
        int A00 = A00(i5);
        int i6 = i2;
        if (i2 == Integer.MAX_VALUE) {
            i6 = i;
        }
        int A002 = A00(i6);
        if (A00 + A002 <= 31) {
            if (A002 == 13) {
                j = 3;
            } else if (A002 == 18) {
                j = 1;
            } else if (A002 == 15) {
                j = 2;
            } else if (A002 == 16) {
                j = 0;
            } else {
                throw AnonymousClass001.A09("Should only have the provided constants.");
            }
            int i7 = 0;
            int i8 = i2 + 1;
            if (i2 == Integer.MAX_VALUE) {
                i8 = 0;
            }
            if (i4 != Integer.MAX_VALUE) {
                i7 = i4 + 1;
            }
            int i9 = Constraints.A03[(int) j];
            return (((long) i8) << 33) | j | (((long) i) << 2) | (((long) i3) << i9) | (((long) i7) << (i9 + 31));
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Can't represent a width of ");
        A0u.append(i6);
        A0u.append(" and height of ");
        A0u.append(i5);
        throw AnonymousClass000.A0c(" in Constraints", A0u);
    }
}
