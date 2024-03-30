package X;

/* renamed from: X.6Fy  reason: invalid class name and case insensitive filesystem */
public abstract class C129236Fy {
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long A00(float r6, int r7, long r8, boolean r10) {
        /*
            if (r10 != 0) goto L_0x0005
            r0 = 2
            if (r7 != r0) goto L_0x0032
        L_0x0005:
            int[] r5 = androidx.compose.ui.unit.Constraints.A04
            r3 = 3
            long r1 = r8 & r3
            int r0 = (int) r1
            r3 = r5[r0]
            r0 = 33
            long r1 = r8 >> r0
            int r0 = (int) r1
            r0 = r0 & r3
            if (r0 == 0) goto L_0x0032
            int r2 = androidx.compose.ui.unit.Constraints.A01(r8)
        L_0x001a:
            int r1 = androidx.compose.ui.unit.Constraints.A03(r8)
            if (r1 == r2) goto L_0x0028
            int r0 = X.C90504aG.A05(r6)
            int r2 = X.C15040mb.A02(r0, r1, r2)
        L_0x0028:
            int r1 = androidx.compose.ui.unit.Constraints.A00(r8)
            r0 = 0
            long r0 = X.C132746Vb.A00(r0, r2, r0, r1)
            return r0
        L_0x0032:
            r2 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C129236Fy.A00(float, int, long, boolean):long");
    }

    public static final long A01(C130656Lx r4, int i, int i2) {
        int i3 = 262142;
        int min = Math.min(i, 262142);
        if (min >= 8191) {
            if (min < 32767) {
                i3 = 65534;
            } else {
                i3 = 8190;
                if (min < 65535) {
                    i3 = 32766;
                }
            }
        }
        int min2 = Math.min(i2, i3);
        if (min >= 0 && min2 >= 0) {
            return r4.A01(min, min, min2, min2);
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("width(");
        A0u.append(min);
        A0u.append(") and height(");
        A0u.append(min2);
        throw AnonymousClass000.A0c(") must be >= 0", A0u);
    }
}
