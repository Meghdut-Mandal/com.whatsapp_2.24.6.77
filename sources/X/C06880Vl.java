package X;

import java.util.Comparator;

/* renamed from: X.0Vl  reason: invalid class name and case insensitive filesystem */
public abstract class C06880Vl {
    public static final Comparator A00 = new C18420t8(0);

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0085, code lost:
        if (r4[r2 - 1] < r4[r2 + 1]) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00b2, code lost:
        r9 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b3, code lost:
        if (r9 > r10) goto L_0x01b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b5, code lost:
        r2 = r9 + r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b9, code lost:
        if (r2 == (r10 + r19)) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00bd, code lost:
        if (r2 == (r8 + r19)) goto L_0x0115;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00bf, code lost:
        r14 = r23 + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c9, code lost:
        if (r3[r14 - 1] >= r3[r14 + 1]) goto L_0x0115;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00cb, code lost:
        r1 = r3[(r23 + r2) - 1];
        r17 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d2, code lost:
        r16 = r1 - r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d4, code lost:
        if (r1 <= 0) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d6, code lost:
        if (r16 <= 0) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00e6, code lost:
        if (r25.A04((r21 + r1) - 1, (r20 + r16) - 1) == false) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e8, code lost:
        r1 = r1 - 1;
        r16 = r16 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ed, code lost:
        r0 = r23 + r2;
        r3[r0] = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f1, code lost:
        if (r18 != false) goto L_0x0112;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f3, code lost:
        if (r2 < r8) goto L_0x0112;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f5, code lost:
        if (r2 > r10) goto L_0x0112;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00f7, code lost:
        r14 = r4[r0];
        r1 = r3[r0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00fb, code lost:
        if (r14 < r1) goto L_0x0112;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00fd, code lost:
        r8 = new X.AnonymousClass0TK();
        r8.A01 = r1;
        r8.A02 = r1 - r2;
        r8.A00 = r14 - r1;
        r8.A03 = r17;
        r8.A04 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0112, code lost:
        r9 = r9 + 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0115, code lost:
        r1 = r3[(r23 + r2) + 1] - 1;
        r17 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01b8, code lost:
        r10 = r10 + 1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a3 A[LOOP:3: B:16:0x0091->B:20:0x00a3, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01b4 A[LOOP:2: B:9:0x0075->B:79:0x01b4, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0136 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x011f A[EDGE_INSN: B:99:0x011f->B:46:0x011f ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass0X4 A00(X.C06730Uv r25) {
        /*
            r7 = 1
            int r2 = r25.A01()
            int r1 = r25.A00()
            java.util.ArrayList r24 = X.AnonymousClass001.A0I()
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()
            X.0Wb r0 = new X.0Wb
            r0.<init>(r2, r1)
            r6.add(r0)
            int r23 = r2 + r1
            int r0 = X.AnonymousClass000.A05(r2, r1)
            int r23 = r23 + r0
            int r0 = r23 * 2
            int[] r4 = new int[r0]
            int[] r3 = new int[r0]
            java.util.ArrayList r22 = X.AnonymousClass001.A0I()
        L_0x002b:
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x01ca
            int r0 = r6.size()
            int r0 = r0 + -1
            java.lang.Object r5 = r6.remove(r0)
            X.0Wb r5 = (X.C07030Wb) r5
            int r0 = r5.A03
            r21 = r0
            int r12 = r5.A02
            int r0 = r5.A01
            r20 = r0
            int r13 = r5.A00
            int r12 = r12 - r21
            int r13 = r13 - r0
            if (r12 < r7) goto L_0x01bc
            if (r13 < r7) goto L_0x01bc
            int r19 = r12 - r13
            int r0 = r12 + r13
            int r0 = r0 + 1
            int r11 = r0 / 2
            int r2 = r23 - r11
            int r2 = r2 - r7
            int r0 = r23 + r11
            int r1 = r0 + 1
            r0 = 0
            java.util.Arrays.fill(r4, r2, r1, r0)
            int r2 = r2 + r19
            int r1 = r1 + r19
            java.util.Arrays.fill(r3, r2, r1, r12)
            int r0 = r19 % 2
            boolean r18 = X.AnonymousClass000.A1P(r0)
            r10 = 0
        L_0x0071:
            if (r10 > r11) goto L_0x01c3
            int r8 = -r10
            r9 = r8
        L_0x0075:
            if (r9 > r10) goto L_0x00b2
            if (r9 == r8) goto L_0x0087
            if (r9 == r10) goto L_0x00a8
            int r2 = r23 + r9
            int r0 = r2 + -1
            r1 = r4[r0]
            int r0 = r2 + 1
            r0 = r4[r0]
            if (r1 >= r0) goto L_0x00a8
        L_0x0087:
            int r0 = r23 + r9
            int r0 = r0 + 1
            r14 = r4[r0]
            r16 = 0
        L_0x008f:
            int r15 = r14 - r9
        L_0x0091:
            if (r14 >= r12) goto L_0x011f
            if (r15 >= r13) goto L_0x011f
            int r1 = r21 + r14
            int r0 = r20 + r15
            r2 = r1
            r1 = r0
            r0 = r25
            boolean r0 = r0.A04(r2, r1)
            if (r0 == 0) goto L_0x011f
            int r14 = r14 + 1
            int r15 = r15 + 1
            goto L_0x0091
        L_0x00a8:
            int r0 = r23 + r9
            int r0 = r0 - r7
            r0 = r4[r0]
            int r14 = r0 + 1
            r16 = 1
            goto L_0x008f
        L_0x00b2:
            r9 = r8
        L_0x00b3:
            if (r9 > r10) goto L_0x01b8
            int r2 = r9 + r19
            int r0 = r10 + r19
            if (r2 == r0) goto L_0x00cb
            int r0 = r8 + r19
            if (r2 == r0) goto L_0x0115
            int r14 = r23 + r2
            int r0 = r14 + -1
            r1 = r3[r0]
            int r0 = r14 + 1
            r0 = r3[r0]
            if (r1 >= r0) goto L_0x0115
        L_0x00cb:
            int r0 = r23 + r2
            int r0 = r0 - r7
            r1 = r3[r0]
            r17 = 0
        L_0x00d2:
            int r16 = r1 - r2
        L_0x00d4:
            if (r1 <= 0) goto L_0x00ed
            if (r16 <= 0) goto L_0x00ed
            int r0 = r21 + r1
            int r15 = r0 + -1
            int r0 = r20 + r16
            int r14 = r0 + -1
            r0 = r25
            boolean r0 = r0.A04(r15, r14)
            if (r0 == 0) goto L_0x00ed
            int r1 = r1 + -1
            int r16 = r16 + -1
            goto L_0x00d4
        L_0x00ed:
            int r0 = r23 + r2
            r3[r0] = r1
            if (r18 != 0) goto L_0x0112
            if (r2 < r8) goto L_0x0112
            if (r2 > r10) goto L_0x0112
            r14 = r4[r0]
            r1 = r3[r0]
            if (r14 < r1) goto L_0x0112
            X.0TK r8 = new X.0TK
            r8.<init>()
            r8.A01 = r1
            int r0 = r1 - r2
            r8.A02 = r0
            int r14 = r14 - r1
            r8.A00 = r14
            r0 = r17
            r8.A03 = r0
            r8.A04 = r7
            goto L_0x014b
        L_0x0112:
            int r9 = r9 + 2
            goto L_0x00b3
        L_0x0115:
            int r0 = r23 + r2
            int r0 = r0 + 1
            r1 = r3[r0]
            int r1 = r1 - r7
            r17 = 1
            goto L_0x00d2
        L_0x011f:
            int r1 = r23 + r9
            r4[r1] = r14
            if (r18 == 0) goto L_0x01b4
            int r0 = r19 - r10
            int r0 = r0 + 1
            if (r9 < r0) goto L_0x01b4
            int r0 = r19 + r10
            int r0 = r0 - r7
            if (r9 > r0) goto L_0x01b4
            r2 = r4[r1]
            r1 = r3[r1]
            if (r2 < r1) goto L_0x01b4
            X.0TK r8 = new X.0TK
            r8.<init>()
            r8.A01 = r1
            int r0 = r1 - r9
            r8.A02 = r0
            int r2 = r2 - r1
            r8.A00 = r2
            r0 = r16
            r8.A03 = r0
            r0 = 0
            r8.A04 = r0
        L_0x014b:
            int r9 = r8.A00
            if (r9 <= 0) goto L_0x0154
            r0 = r24
            r0.add(r8)
        L_0x0154:
            int r10 = r8.A01
            int r12 = r5.A03
            int r10 = r10 + r12
            r8.A01 = r10
            int r2 = r8.A02
            int r11 = r5.A01
            int r2 = r2 + r11
            r8.A02 = r2
            boolean r0 = r22.isEmpty()
            if (r0 == 0) goto L_0x01a5
            X.0Wb r0 = new X.0Wb
            r0.<init>()
        L_0x016d:
            r0.A03 = r12
            r0.A01 = r11
            boolean r11 = r8.A04
            if (r11 == 0) goto L_0x0199
            r1 = r10
        L_0x0176:
            r0.A02 = r1
            r1 = r2
        L_0x0179:
            r0.A00 = r1
            r6.add(r0)
            if (r11 == 0) goto L_0x0197
            boolean r0 = r8.A03
            int r10 = r10 + r9
            if (r0 == 0) goto L_0x0191
            int r10 = r10 + 1
        L_0x0187:
            r5.A03 = r10
            int r2 = r2 + r9
        L_0x018a:
            r5.A01 = r2
            r6.add(r5)
            goto L_0x002b
        L_0x0191:
            r5.A03 = r10
            int r2 = r2 + r9
            int r2 = r2 + 1
            goto L_0x018a
        L_0x0197:
            int r10 = r10 + r9
            goto L_0x0187
        L_0x0199:
            boolean r1 = r8.A03
            if (r1 == 0) goto L_0x01a0
            int r1 = r10 + -1
            goto L_0x0176
        L_0x01a0:
            r0.A02 = r10
            int r1 = r2 + -1
            goto L_0x0179
        L_0x01a5:
            int r0 = r22.size()
            int r1 = r0 + -1
            r0 = r22
            java.lang.Object r0 = r0.remove(r1)
            X.0Wb r0 = (X.C07030Wb) r0
            goto L_0x016d
        L_0x01b4:
            int r9 = r9 + 2
            goto L_0x0075
        L_0x01b8:
            int r10 = r10 + 1
            goto L_0x0071
        L_0x01bc:
            r0 = r22
            r0.add(r5)
            goto L_0x002b
        L_0x01c3:
            java.lang.String r0 = "DiffUtil hit an unexpected case while trying to calculate the optimal path. Please make sure your data is not changing during the diff calculation."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x01ca:
            java.util.Comparator r1 = A00
            r0 = r24
            java.util.Collections.sort(r0, r1)
            X.0X4 r2 = new X.0X4
            r1 = r0
            r0 = r25
            r2.<init>(r0, r1, r4, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06880Vl.A00(X.0Uv):X.0X4");
    }
}
