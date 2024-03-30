package X;

/* renamed from: X.9fO  reason: invalid class name and case insensitive filesystem */
public final class C199489fO {
    public C201299jI A00;
    public C202039kw A01;
    public boolean A02;
    public final AUY A03;

    public static int A00(C199489fO r2, int i, int i2, int i3) {
        boolean A032;
        boolean z = r2.A02;
        AUY auy = r2.A03;
        if (z) {
            A032 = auy.A03(i2, i);
        } else {
            A032 = auy.A03(i, i2);
        }
        int i4 = i3 << 1;
        if (A032) {
            return i4 | 1;
        }
        return i4;
    }

    public C201299jI A01() {
        C201299jI r0 = this.A00;
        if (r0 == null) {
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < 6; i3++) {
                i2 = A00(this, i3, 8, i2);
            }
            int A002 = A00(this, 8, 7, A00(this, 8, 8, A00(this, 7, 8, i2)));
            int i4 = 5;
            do {
                A002 = A00(this, 8, i4, A002);
                i4--;
            } while (i4 >= 0);
            int i5 = this.A03.A00;
            int i6 = i5 - 7;
            for (int i7 = i5 - 1; i7 >= i6; i7--) {
                i = A00(this, 8, i7, i);
            }
            for (int i8 = i5 - 8; i8 < i5; i8++) {
                i = A00(this, i8, 8, i);
            }
            r0 = C201299jI.A00(A002, i);
            if (r0 == null) {
                r0 = C201299jI.A00(A002 ^ 21522, i ^ 21522);
            }
            this.A00 = r0;
            if (r0 == null) {
                throw C173668So.A00();
            }
        }
        return r0;
    }

    public C202039kw A02() {
        int i;
        C202039kw r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        int i2 = this.A03.A00;
        int i3 = (i2 - 17) / 4;
        if (i3 <= 6) {
            return C202039kw.A02(i3);
        }
        int i4 = i2 - 11;
        int i5 = 5;
        int i6 = 0;
        int i7 = 5;
        int i8 = 0;
        do {
            int i9 = i2 - 9;
            i = i9;
            while (i9 >= i4) {
                i8 = A00(this, i9, i7, i8);
                i9--;
            }
            i7--;
        } while (i7 >= 0);
        C202039kw A012 = C202039kw.A01(i8);
        if (A012 == null || (A012.A01 * 4) + 17 != i2) {
            do {
                for (int i10 = i; i10 >= i4; i10--) {
                    i6 = A00(this, i5, i10, i6);
                }
                i5--;
            } while (i5 >= 0);
            A012 = C202039kw.A01(i6);
            if (A012 == null || (A012.A01 * 4) + 17 != i2) {
                throw C173668So.A00();
            }
        }
        this.A01 = A012;
        return A012;
    }

    public C199489fO(AUY auy) {
        int i = auy.A00;
        if (i < 21 || (i & 3) != 1) {
            throw C173668So.A00();
        }
        this.A03 = auy;
    }
}
