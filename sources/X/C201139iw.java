package X;

import java.util.List;

/* renamed from: X.9iw  reason: invalid class name and case insensitive filesystem */
public class C201139iw {
    public boolean A00;
    public final AUY A01;
    public final List A02 = AnonymousClass001.A0I();
    public final int[] A03 = new int[5];

    public static boolean A01(int[] iArr) {
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = iArr[i];
            if (i3 == 0) {
                break;
            }
            i2 += i3;
            i++;
            if (i >= 5) {
                if (i2 >= 7) {
                    float f = ((float) i2) / 7.0f;
                    float f2 = f / 2.0f;
                    return C165587tf.A01(iArr, f, 0) < f2 && C165587tf.A01(iArr, f, 1) < f2 && C165587tf.A01(iArr, f * 3.0f, 2) < 3.0f * f2 && C165587tf.A01(iArr, f, 3) < f2 && C165587tf.A01(iArr, f, 4) < f2;
                }
            }
        }
    }

    public static boolean A00(C201139iw r9) {
        List<C173678Sp> list = r9.A02;
        int size = list.size();
        float f = 0.0f;
        int i = 0;
        float f2 = 0.0f;
        for (C173678Sp r2 : list) {
            if (r2.A01 >= 2) {
                i++;
                f2 += r2.A00;
            }
        }
        if (i >= 3) {
            float f3 = f2 / ((float) size);
            for (C173678Sp r0 : list) {
                f += C90494aF.A01(r0.A00, f3);
            }
            if (f <= f2 * 0.05f) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0052, code lost:
        if (r9[1] <= r1) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0078, code lost:
        if (r5 < 0) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007e, code lost:
        if (r13.A03(r6, r5) == false) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0080, code lost:
        r0 = r9[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0082, code lost:
        if (r0 > r1) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0084, code lost:
        r9[0] = r0 + 1;
        r5 = r5 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008d, code lost:
        if (r9[0] <= r1) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0090, code lost:
        r10 = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0092, code lost:
        if (r10 >= r12) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0098, code lost:
        if (r13.A03(r6, r10) == false) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009a, code lost:
        X.C165587tf.A1V(r9, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009e, code lost:
        if (r10 != r12) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a2, code lost:
        if (r10 >= r12) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a8, code lost:
        if (r13.A03(r6, r10) != false) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00aa, code lost:
        r0 = r9[3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ac, code lost:
        if (r0 >= r1) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ae, code lost:
        r9[3] = r0 + 1;
        r10 = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b5, code lost:
        if (r10 == r12) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00b9, code lost:
        if (r9[3] < r1) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00bd, code lost:
        if (r10 >= r12) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00c3, code lost:
        if (r13.A03(r6, r10) == false) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00c5, code lost:
        r0 = r9[4];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00c7, code lost:
        if (r0 >= r1) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00c9, code lost:
        r9[4] = r0 + 1;
        r10 = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00d0, code lost:
        r7 = r9[4];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00d2, code lost:
        if (r7 >= r1) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00d4, code lost:
        r5 = r9[2];
        r1 = r9[3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00e8, code lost:
        if ((X.AnonymousClass000.A05((((r9[0] + r9[1]) + r5) + r1) + r7, r2) * 5) >= (r2 * 2)) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00ee, code lost:
        if (A01(r9) == false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00f0, code lost:
        r10 = X.C165587tf.A00(r10 - r7, r1, r5);
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x015d A[LOOP:14: B:100:0x015d->B:106:0x016b, LOOP_START, PHI: r6 
      PHI: (r6v10 int) = (r6v9 int), (r6v14 int) binds: [B:99:0x015a, B:106:0x016b] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A02(int[] r19, int r20, int r21) {
        /*
            r18 = this;
            r10 = r20
            r3 = 0
            r2 = r19[r3]
            r8 = 1
            r0 = r19[r8]
            int r2 = r2 + r0
            r11 = 2
            r1 = r19[r11]
            int r2 = r2 + r1
            r0 = 3
            r4 = r19[r0]
            int r2 = r2 + r4
            r0 = 4
            r0 = r19[r0]
            int r2 = r2 + r0
            int r5 = r21 - r0
            float r0 = X.C165587tf.A00(r5, r4, r1)
            int r6 = (int) r0
            r4 = r18
            X.AUY r13 = r4.A01
            int r12 = r13.A00
            int[] r9 = r4.A03
            r5 = 0
        L_0x0025:
            r9[r5] = r3
            int r5 = r5 + 1
            r0 = 5
            if (r5 < r0) goto L_0x0025
            r5 = r10
        L_0x002d:
            r17 = 1
            if (r5 < 0) goto L_0x0054
            boolean r0 = r13.A03(r6, r5)
            if (r0 == 0) goto L_0x003f
            X.C165587tf.A1V(r9, r11)
            int r5 = r5 + -1
            goto L_0x002d
        L_0x003d:
            if (r5 < 0) goto L_0x0054
        L_0x003f:
            boolean r0 = r13.A03(r6, r5)
            if (r0 != 0) goto L_0x0050
            r0 = r9[r8]
            if (r0 > r1) goto L_0x0050
            int r0 = r0 + 1
            r9[r8] = r0
            int r5 = r5 + -1
            goto L_0x003d
        L_0x0050:
            r0 = r9[r8]
            if (r0 <= r1) goto L_0x007a
        L_0x0054:
            r10 = 2143289344(0x7fc00000, float:NaN)
        L_0x0056:
            boolean r0 = java.lang.Float.isNaN(r10)
            if (r0 != 0) goto L_0x01b6
            int r7 = (int) r10
            r1 = r19[r11]
            int r14 = r13.A02
            r5 = 0
        L_0x0062:
            r9[r5] = r3
            int r5 = r5 + 1
            r0 = 5
            if (r5 < r0) goto L_0x0062
            r5 = r6
        L_0x006a:
            if (r5 < 0) goto L_0x010e
            boolean r0 = r13.A03(r5, r7)
            if (r0 == 0) goto L_0x00f9
            X.C165587tf.A1V(r9, r11)
            int r5 = r5 + -1
            goto L_0x006a
        L_0x0078:
            if (r5 < 0) goto L_0x008b
        L_0x007a:
            boolean r0 = r13.A03(r6, r5)
            if (r0 == 0) goto L_0x008b
            r0 = r9[r3]
            if (r0 > r1) goto L_0x008b
            int r0 = r0 + 1
            r9[r3] = r0
            int r5 = r5 + -1
            goto L_0x0078
        L_0x008b:
            r0 = r9[r3]
            if (r0 <= r1) goto L_0x0090
            goto L_0x0054
        L_0x0090:
            int r10 = r10 + 1
            if (r10 >= r12) goto L_0x009e
            boolean r0 = r13.A03(r6, r10)
            if (r0 == 0) goto L_0x009e
            X.C165587tf.A1V(r9, r11)
            goto L_0x0090
        L_0x009e:
            if (r10 != r12) goto L_0x00a1
            goto L_0x0054
        L_0x00a1:
            r15 = 3
            if (r10 >= r12) goto L_0x00b5
            boolean r0 = r13.A03(r6, r10)
            if (r0 != 0) goto L_0x00b5
            r0 = r9[r15]
            if (r0 >= r1) goto L_0x00b5
            int r0 = r0 + 1
            r9[r15] = r0
            int r10 = r10 + 1
            goto L_0x00a1
        L_0x00b5:
            if (r10 == r12) goto L_0x0054
            r0 = r9[r15]
            if (r0 < r1) goto L_0x00bc
            goto L_0x0054
        L_0x00bc:
            r5 = 4
            if (r10 >= r12) goto L_0x00d0
            boolean r0 = r13.A03(r6, r10)
            if (r0 == 0) goto L_0x00d0
            r0 = r9[r5]
            if (r0 >= r1) goto L_0x00d0
            int r0 = r0 + 1
            r9[r5] = r0
            int r10 = r10 + 1
            goto L_0x00bc
        L_0x00d0:
            r7 = r9[r5]
            if (r7 >= r1) goto L_0x0054
            r14 = r9[r3]
            r0 = r9[r8]
            int r14 = r14 + r0
            r5 = r9[r11]
            int r14 = r14 + r5
            r1 = r9[r15]
            int r14 = r14 + r1
            int r14 = r14 + r7
            int r0 = X.AnonymousClass000.A05(r14, r2)
            int r14 = r0 * 5
            int r0 = r2 * 2
            if (r14 >= r0) goto L_0x0054
            boolean r0 = A01(r9)
            if (r0 == 0) goto L_0x0054
            int r10 = r10 - r7
            float r10 = X.C165587tf.A00(r10, r1, r5)
            goto L_0x0056
        L_0x00f7:
            if (r5 < 0) goto L_0x010e
        L_0x00f9:
            boolean r0 = r13.A03(r5, r7)
            if (r0 != 0) goto L_0x010a
            r0 = r9[r8]
            if (r0 > r1) goto L_0x010a
            int r0 = r0 + 1
            r9[r8] = r0
            int r5 = r5 + -1
            goto L_0x00f7
        L_0x010a:
            r0 = r9[r8]
            if (r0 <= r1) goto L_0x0136
        L_0x010e:
            r1 = 2143289344(0x7fc00000, float:NaN)
        L_0x0110:
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 != 0) goto L_0x01b6
            int r6 = (int) r1
            r5 = 0
        L_0x0118:
            r9[r5] = r3
            int r5 = r5 + 1
            r0 = 5
            if (r5 < r0) goto L_0x0118
            r5 = 0
        L_0x0120:
            if (r7 < r5) goto L_0x01b2
            if (r6 < r5) goto L_0x01b2
            int r15 = r6 - r5
            int r0 = r7 - r5
            boolean r0 = r13.A03(r15, r0)
            if (r0 == 0) goto L_0x01b2
            X.C165587tf.A1V(r9, r11)
            int r5 = r5 + 1
            goto L_0x0120
        L_0x0134:
            if (r5 < 0) goto L_0x0147
        L_0x0136:
            boolean r0 = r13.A03(r5, r7)
            if (r0 == 0) goto L_0x0147
            r0 = r9[r3]
            if (r0 > r1) goto L_0x0147
            int r0 = r0 + 1
            r9[r3] = r0
            int r5 = r5 + -1
            goto L_0x0134
        L_0x0147:
            r0 = r9[r3]
            if (r0 <= r1) goto L_0x014c
            goto L_0x010e
        L_0x014c:
            int r6 = r6 + 1
            if (r6 >= r14) goto L_0x015a
            boolean r0 = r13.A03(r6, r7)
            if (r0 == 0) goto L_0x015a
            X.C165587tf.A1V(r9, r11)
            goto L_0x014c
        L_0x015a:
            if (r6 != r14) goto L_0x015d
            goto L_0x010e
        L_0x015d:
            r16 = 3
            if (r6 >= r14) goto L_0x0172
            boolean r0 = r13.A03(r6, r7)
            if (r0 != 0) goto L_0x0172
            r0 = r9[r16]
            if (r0 >= r1) goto L_0x0172
            int r0 = r0 + 1
            r9[r16] = r0
            int r6 = r6 + 1
            goto L_0x015d
        L_0x0172:
            if (r6 == r14) goto L_0x010e
            r0 = r9[r16]
            if (r0 < r1) goto L_0x0179
            goto L_0x010e
        L_0x0179:
            r5 = 4
            if (r6 >= r14) goto L_0x018d
            boolean r0 = r13.A03(r6, r7)
            if (r0 == 0) goto L_0x018d
            r0 = r9[r5]
            if (r0 >= r1) goto L_0x018d
            int r0 = r0 + 1
            r9[r5] = r0
            int r6 = r6 + 1
            goto L_0x0179
        L_0x018d:
            r15 = r9[r5]
            if (r15 >= r1) goto L_0x010e
            r0 = r9[r3]
            r1 = r9[r8]
            int r0 = r0 + r1
            r5 = r9[r11]
            int r0 = r0 + r5
            r1 = r9[r16]
            int r0 = r0 + r1
            int r0 = r0 + r15
            int r0 = X.AnonymousClass000.A05(r0, r2)
            int r0 = r0 * 5
            if (r0 >= r2) goto L_0x010e
            boolean r0 = A01(r9)
            if (r0 == 0) goto L_0x010e
            int r6 = r6 - r15
            float r1 = X.C165587tf.A00(r6, r1, r5)
            goto L_0x0110
        L_0x01b2:
            r0 = r9[r11]
            if (r0 != 0) goto L_0x01b7
        L_0x01b6:
            return r3
        L_0x01b7:
            if (r7 < r5) goto L_0x01cb
            if (r6 < r5) goto L_0x01cb
            int r15 = r6 - r5
            int r0 = r7 - r5
            boolean r0 = r13.A03(r15, r0)
            if (r0 != 0) goto L_0x01cb
            X.C165587tf.A1V(r9, r8)
            int r5 = r5 + 1
            goto L_0x01b7
        L_0x01cb:
            r0 = r9[r8]
            if (r0 != 0) goto L_0x01d0
            return r3
        L_0x01d0:
            if (r7 < r5) goto L_0x01e4
            if (r6 < r5) goto L_0x01e4
            int r15 = r6 - r5
            int r0 = r7 - r5
            boolean r0 = r13.A03(r15, r0)
            if (r0 == 0) goto L_0x01e4
            X.C165587tf.A1V(r9, r3)
            int r5 = r5 + 1
            goto L_0x01d0
        L_0x01e4:
            r0 = r9[r3]
            if (r0 != 0) goto L_0x01e9
            return r3
        L_0x01e9:
            int r5 = r7 + r17
            if (r5 >= r12) goto L_0x01fd
            int r0 = r6 + r17
            if (r0 >= r14) goto L_0x01fd
            boolean r0 = r13.A03(r0, r5)
            if (r0 == 0) goto L_0x01fd
            X.C165587tf.A1V(r9, r11)
            int r17 = r17 + 1
            goto L_0x01e9
        L_0x01fd:
            int r15 = r7 + r17
            r5 = 3
            if (r15 >= r12) goto L_0x0212
            int r0 = r6 + r17
            if (r0 >= r14) goto L_0x0212
            boolean r0 = r13.A03(r0, r15)
            if (r0 != 0) goto L_0x0212
            X.C165587tf.A1V(r9, r5)
            int r17 = r17 + 1
            goto L_0x01fd
        L_0x0212:
            r0 = r9[r5]
            if (r0 != 0) goto L_0x0217
            return r3
        L_0x0217:
            int r15 = r7 + r17
            r5 = 4
            if (r15 >= r12) goto L_0x022c
            int r0 = r6 + r17
            if (r0 >= r14) goto L_0x022c
            boolean r0 = r13.A03(r0, r15)
            if (r0 == 0) goto L_0x022c
            X.C165587tf.A1V(r9, r5)
            int r17 = r17 + 1
            goto L_0x0217
        L_0x022c:
            r7 = r9[r5]
            if (r7 == 0) goto L_0x01b6
            r6 = 0
            r5 = 0
        L_0x0232:
            r0 = r9[r6]
            if (r0 == 0) goto L_0x01b6
            int r5 = r5 + r0
            int r6 = r6 + 1
            r0 = 5
            if (r6 < r0) goto L_0x0232
            r0 = 7
            if (r5 < r0) goto L_0x01b6
            float r6 = (float) r5
            r0 = 1088421888(0x40e00000, float:7.0)
            float r6 = r6 / r0
            r0 = 1068146622(0x3faa9fbe, float:1.333)
            float r12 = r6 / r0
            float r0 = X.C165587tf.A01(r9, r6, r3)
            int r0 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x01b6
            float r0 = X.C165587tf.A01(r9, r6, r8)
            int r0 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x01b6
            r5 = 1077936128(0x40400000, float:3.0)
            float r0 = r6 * r5
            float r0 = X.C165587tf.A01(r9, r0, r11)
            float r5 = r5 * r12
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x01b6
            r0 = 3
            float r0 = X.C165587tf.A01(r9, r6, r0)
            int r0 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x01b6
            float r0 = (float) r7
            float r0 = X.C90494aF.A01(r6, r0)
            int r0 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x01b6
            float r9 = (float) r2
            r0 = 1088421888(0x40e00000, float:7.0)
            float r9 = r9 / r0
            r7 = 0
        L_0x027c:
            java.util.List r6 = r4.A02
            int r0 = r6.size()
            if (r7 >= r0) goto L_0x02d1
            java.lang.Object r11 = r6.get(r7)
            X.8Sp r11 = (X.C173678Sp) r11
            float r0 = r11.A01
            float r0 = X.C90494aF.A01(r10, r0)
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x02ce
            float r0 = r11.A00
            float r0 = X.C90494aF.A01(r1, r0)
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x02ce
            float r3 = r11.A00
            float r2 = X.C90494aF.A01(r9, r3)
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x02ae
            int r0 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x02ce
        L_0x02ae:
            int r0 = r11.A01
            int r5 = r0 + 1
            float r4 = (float) r0
            float r0 = r11.A00
            float r3 = r4 * r0
            float r3 = r3 + r1
            float r2 = (float) r5
            float r3 = r3 / r2
            float r0 = r11.A01
            float r1 = r4 * r0
            float r1 = r1 + r10
            float r1 = r1 / r2
            float r0 = r11.A00
            float r4 = r4 * r0
            float r4 = r4 + r9
            float r4 = r4 / r2
            X.8Sp r0 = new X.8Sp
            r0.<init>(r3, r1, r4, r5)
            r6.set(r7, r0)
            return r8
        L_0x02ce:
            int r7 = r7 + 1
            goto L_0x027c
        L_0x02d1:
            X.8Sp r0 = new X.8Sp
            r0.<init>(r1, r10, r9, r8)
            r6.add(r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C201139iw.A02(int[], int, int):boolean");
    }

    public C201139iw(AUY auy) {
        this.A01 = auy;
    }
}
