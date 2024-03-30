package X;

import android.view.View;

/* renamed from: X.6Qd  reason: invalid class name and case insensitive filesystem */
public abstract class C131696Qd {
    public static final int A00(long j) {
        AnonymousClass6F0 A00 = AnonymousClass5YU.A00((int) j);
        int A03 = A00.A03(j);
        int A01 = A00.A01(j);
        int i = 1073741824;
        if (A03 != A01) {
            i = Integer.MIN_VALUE;
            if (A01 == Integer.MAX_VALUE) {
                return View.MeasureSpec.makeMeasureSpec(0, 0);
            }
        }
        return View.MeasureSpec.makeMeasureSpec(A01, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0037, code lost:
        if (r1.A02(r10) < r4) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0043, code lost:
        if (r1 > r4) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0061, code lost:
        if (r4 != X.C90474aD.A03(r12)) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0074, code lost:
        if (r1.A01(r10) < r4) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007e, code lost:
        if (r1 > r4) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0020, code lost:
        if (r4 != X.C90474aD.A03(r12 >> 32)) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A02(long r8, long r10, long r12) {
        /*
            r7 = 1
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x008c
            int r0 = X.C90514aH.A0D(r8)
            X.6F0 r0 = X.AnonymousClass5YU.A00(r0)
            int r4 = r0.A02(r8)
            int r3 = r0.A04(r8)
            if (r4 != r3) goto L_0x0022
            r0 = 32
            long r0 = r12 >> r0
            int r0 = X.C90474aD.A03(r0)
            r6 = 1
            if (r4 == r0) goto L_0x0023
        L_0x0022:
            r6 = 0
        L_0x0023:
            r5 = 32
            long r0 = r10 >>> r5
            int r2 = (int) r0
            X.6F0 r1 = X.AnonymousClass5YU.A00(r2)
            int r0 = r1.A04(r10)
            if (r0 > r3) goto L_0x0039
            int r0 = r1.A02(r10)
            r2 = 1
            if (r0 >= r4) goto L_0x003a
        L_0x0039:
            r2 = 0
        L_0x003a:
            long r0 = r12 >> r5
            int r1 = X.C90474aD.A03(r0)
            if (r3 > r1) goto L_0x0045
            r0 = 1
            if (r1 <= r4) goto L_0x0046
        L_0x0045:
            r0 = 0
        L_0x0046:
            if (r6 != 0) goto L_0x004c
            if (r2 == 0) goto L_0x008f
            if (r0 == 0) goto L_0x008f
        L_0x004c:
            r6 = 1
        L_0x004d:
            int r0 = (int) r8
            X.6F0 r0 = X.AnonymousClass5YU.A00(r0)
            int r4 = r0.A01(r8)
            int r5 = r0.A03(r8)
            if (r4 != r5) goto L_0x0063
            int r0 = X.C90474aD.A03(r12)
            r3 = 1
            if (r4 == r0) goto L_0x0064
        L_0x0063:
            r3 = 0
        L_0x0064:
            int r0 = (int) r10
            X.6F0 r1 = X.AnonymousClass5YU.A00(r0)
            int r0 = r1.A03(r10)
            if (r0 > r5) goto L_0x0076
            int r0 = r1.A01(r10)
            r2 = 1
            if (r0 >= r4) goto L_0x0077
        L_0x0076:
            r2 = 0
        L_0x0077:
            int r1 = X.C90474aD.A03(r12)
            if (r5 > r1) goto L_0x0080
            r0 = 1
            if (r1 <= r4) goto L_0x0081
        L_0x0080:
            r0 = 0
        L_0x0081:
            if (r3 != 0) goto L_0x0087
            if (r2 == 0) goto L_0x008d
            if (r0 == 0) goto L_0x008d
        L_0x0087:
            r0 = 1
        L_0x0088:
            if (r6 == 0) goto L_0x0091
            if (r0 == 0) goto L_0x0091
        L_0x008c:
            return r7
        L_0x008d:
            r0 = 0
            goto L_0x0088
        L_0x008f:
            r6 = 0
            goto L_0x004d
        L_0x0091:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C131696Qd.A02(long, long, long):boolean");
    }

    public static final int A01(long j) {
        AnonymousClass6F0 A00 = AnonymousClass5YU.A00(C90514aH.A0D(j));
        int A04 = A00.A04(j);
        int A02 = A00.A02(j);
        int i = 1073741824;
        if (A04 != A02) {
            i = Integer.MIN_VALUE;
            if (A02 == Integer.MAX_VALUE) {
                return View.MeasureSpec.makeMeasureSpec(0, 0);
            }
        }
        return View.MeasureSpec.makeMeasureSpec(A02, i);
    }
}
