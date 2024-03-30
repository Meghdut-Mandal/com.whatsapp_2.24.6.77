package X;

/* renamed from: X.6M5  reason: invalid class name */
public final class AnonymousClass6M5 {
    public static final AnonymousClass6M5 A00 = new AnonymousClass6M5();

    public final long A00(int i, int i2, int i3, int i4) {
        AnonymousClass6F0 r14;
        AnonymousClass6F0 r13;
        int i5 = i;
        int i6 = i2;
        if (i5 == i6) {
            r14 = C98214r4.A00;
        } else if (i == 0) {
            r14 = C98234r6.A00;
        } else {
            r14 = C98224r5.A00;
        }
        int i7 = i3;
        int i8 = i4;
        if (i7 == i8) {
            r13 = C98214r4.A00;
        } else if (i3 == 0) {
            r13 = C98234r6.A00;
        } else {
            r13 = C98224r5.A00;
        }
        C15020mZ r1 = r14.A01;
        int i9 = r1.A00;
        int i10 = r1.A01;
        C15020mZ r0 = r13.A01;
        int i11 = r0.A00;
        int i12 = r0.A01;
        if (i < 0) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("minWidth must be >= 0, but was: ");
            A0u.append(i5);
            C90464aC.A1K(". minWidth=", ", maxWidth=", A0u, i5, i6);
            A0u.append(", minHeight=");
            A0u.append(i7);
            throw AnonymousClass000.A0d(", maxHeight=", A0u, i8);
        } else if (i3 >= 0) {
            int i13 = i9;
            if (i5 <= i13 || i5 == Integer.MAX_VALUE) {
                int i14 = i10;
                if (i6 > i14 && i6 != Integer.MAX_VALUE) {
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    C90464aC.A1K("maxWidth must be <= ", ", but was: ", A0u2, i14, i6);
                    C90464aC.A1K(". Components this big may affect performance and lead to out of memory errors. minWidth=", ", maxWidth=", A0u2, i5, i6);
                    A0u2.append(", minHeight=");
                    A0u2.append(i7);
                    throw AnonymousClass000.A0d(", maxHeight=", A0u2, i8);
                } else if (i7 > i11 && i7 != Integer.MAX_VALUE) {
                    StringBuilder A0u3 = AnonymousClass000.A0u();
                    C90464aC.A1K("minHeight must be <= ", ", but was: ", A0u3, i11, i7);
                    C90464aC.A1K(". Components this big may affect performance and lead to out of memory errors. minWidth=", ", maxWidth=", A0u3, i5, i6);
                    A0u3.append(", minHeight=");
                    A0u3.append(i7);
                    throw AnonymousClass000.A0d(", maxHeight=", A0u3, i8);
                } else if (i8 > i12 && i8 != Integer.MAX_VALUE) {
                    StringBuilder A0u4 = AnonymousClass000.A0u();
                    C90464aC.A1K("maxHeight must be <= ", ", but was: ", A0u4, i12, i8);
                    C90464aC.A1K(". Components this big may affect performance and lead to out of memory errors. minWidth=", ", maxWidth=", A0u4, i5, i6);
                    A0u4.append(", minHeight=");
                    A0u4.append(i7);
                    throw AnonymousClass000.A0d(", maxHeight=", A0u4, i8);
                } else if (i5 > i6) {
                    StringBuilder A0u5 = AnonymousClass000.A0u();
                    A0u5.append("maxWidth must be >= minWidth, but was: maxWidth=");
                    A0u5.append(i6);
                    A0u5.append("; minWidth=");
                    A0u5.append(i5);
                    C90464aC.A1K(". minWidth=", ", maxWidth=", A0u5, i5, i6);
                    A0u5.append(", minHeight=");
                    A0u5.append(i7);
                    throw AnonymousClass000.A0d(", maxHeight=", A0u5, i8);
                } else if (i7 <= i8) {
                    return (r14.A05(i5, i6) << 32) | r13.A05(i7, i8);
                } else {
                    StringBuilder A0u6 = AnonymousClass000.A0u();
                    A0u6.append("maxHeight must be >= minHeight, but was: maxHeight=");
                    A0u6.append(i8);
                    C90464aC.A1K("; minHeight=", ". minWidth=", A0u6, i7, i5);
                    C90464aC.A1K(", maxWidth=", ", minHeight=", A0u6, i6, i7);
                    throw AnonymousClass000.A0d(", maxHeight=", A0u6, i8);
                }
            } else {
                StringBuilder A0u7 = AnonymousClass000.A0u();
                C90464aC.A1K("minWidth must be <= ", ", but was: ", A0u7, i13, i5);
                C90464aC.A1K(". Components this big may affect performance and lead to out of memory errors. minWidth=", ", maxWidth=", A0u7, i5, i6);
                A0u7.append(", minHeight=");
                A0u7.append(i7);
                throw AnonymousClass000.A0d(", maxHeight=", A0u7, i8);
            }
        } else {
            StringBuilder A0u8 = AnonymousClass000.A0u();
            C90464aC.A1K("minHeight must be >= 0, but was: ", ". minWidth=", A0u8, i7, i5);
            C90464aC.A1K(", maxWidth=", ", minHeight=", A0u8, i6, i7);
            throw AnonymousClass000.A0d(", maxHeight=", A0u8, i8);
        }
    }
}
