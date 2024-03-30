package X;

import android.util.Log;
import com.facebook.android.exoplayer2.util.Util;
import java.util.Objects;

/* renamed from: X.9XX  reason: invalid class name */
public final class AnonymousClass9XX {
    public long A00;
    public AnonymousClass9XX A01;
    public AnonymousClass9NQ A02;
    public C206419tN A03;
    public AnonymousClass9MF A04;
    public AnonymousClass9MF A05;
    public boolean A06;
    public boolean A07;
    public final B5S A08;
    public final Object A09;
    public final B26[] A0A;
    public final B2j[] A0B;
    public final boolean[] A0C;
    public final B38 A0D;
    public final AnonymousClass9GL A0E;

    public long A00(boolean[] zArr, long j, boolean z) {
        AnonymousClass9MF r7;
        AnonymousClass9MF r6;
        int i = 0;
        while (true) {
            r7 = this.A05;
            boolean z2 = true;
            if (i >= r7.A00) {
                break;
            }
            boolean[] zArr2 = this.A0C;
            if (z || (r6 = this.A04) == null || !Util.A0E(r7.A03[i], r6.A03[i]) || !Util.A0E(r7.A04[i], r6.A04[i])) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        B2j[] b2jArr = this.A0B;
        this.A04 = r7;
        B5T[] b5tArr = r7.A04;
        long Bpe = this.A08.Bpe(b2jArr, b5tArr, this.A0C, zArr, j);
        this.A06 = false;
        for (int i2 = 0; i2 < b2jArr.length; i2++) {
            if (b2jArr[i2] != null) {
                C200319h9.A02(AnonymousClass000.A1V(this.A05.A03[i2]));
                this.A06 = true;
            } else {
                C200319h9.A02(AnonymousClass000.A1W(b5tArr[i2]));
            }
        }
        return Bpe;
    }

    public void A01() {
        this.A04 = null;
        try {
            if (this.A02.A02 != Long.MIN_VALUE) {
                this.A0D.BnT(((C209349zr) this.A08).A04);
            } else {
                this.A0D.BnT(this.A08);
            }
        } catch (RuntimeException e) {
            Log.e("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: int[][][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: int[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v81, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: int[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v6, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v124, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v129, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v132, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v1, resolved type: int[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v8, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v144, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v151, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: int[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v9, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v37, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v169, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v0, resolved type: int[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v8, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v17, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v194, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v252, resolved type: int[][]} */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0280, code lost:
        if (r7 == -1) goto L_0x0282;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02a3, code lost:
        if (r7 == -1) goto L_0x02b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02ab, code lost:
        if (r6 == -1) goto L_0x0282;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02b0, code lost:
        if (r6 == -1) goto L_0x02b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x02b2, code lost:
        r15 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01ad, code lost:
        if (r19 != r13) goto L_0x01af;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:430:0x0269 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A02() {
        /*
            r35 = this;
            r34 = r35
            r0 = r34
            X.9GL r0 = r0.A0E
            r23 = r0
            r0 = r34
            X.B26[] r12 = r0.A0A
            X.9tN r13 = r0.A03
            r22 = 0
            r0 = r23
            X.83B r0 = (X.AnonymousClass83B) r0
            r23 = r0
            int r14 = r12.length
            int r3 = r14 + 1
            int[] r11 = new int[r3]
            X.9tK[][] r10 = new X.C206389tK[r3][]
            int[][][] r4 = new int[r3][][]
            r9 = 0
            r2 = 0
        L_0x0021:
            if (r2 >= r3) goto L_0x0030
            int r1 = r13.A01
            X.9tK[] r0 = new X.C206389tK[r1]
            r10[r2] = r0
            int[][] r0 = new int[r1][]
            r4[r2] = r0
            int r2 = r2 + 1
            goto L_0x0021
        L_0x0030:
            int[] r8 = new int[r14]
            r1 = 0
        L_0x0033:
            if (r1 >= r14) goto L_0x0044
            r0 = r12[r1]
            boolean r0 = r0 instanceof X.AnonymousClass82E
            if (r0 == 0) goto L_0x0042
            r0 = 8
        L_0x003d:
            r8[r1] = r0
            int r1 = r1 + 1
            goto L_0x0033
        L_0x0042:
            r0 = 0
            goto L_0x003d
        L_0x0044:
            r7 = 0
        L_0x0045:
            int r0 = r13.A01
            if (r7 >= r0) goto L_0x00a6
            X.9tK r6 = X.C165597tg.A0H(r13, r7)
            int r1 = r6.A01
            r0 = 5
            boolean r16 = X.AnonymousClass000.A1S(r1, r0)
            r5 = r14
            r3 = 0
            r2 = 0
            r15 = 1
        L_0x0058:
            if (r3 >= r14) goto L_0x0080
            r1 = r12[r3]
            X.9uY[] r0 = r6.A02
            r0 = r0[r9]
            int r0 = r1.BvJ(r0)
            r0 = r0 & 7
            int r0 = java.lang.Math.max(r9, r0)
            r1 = r11[r3]
            boolean r1 = X.AnonymousClass000.A1Q(r1)
            if (r0 > r2) goto L_0x007a
            if (r0 != r2) goto L_0x007d
            if (r16 == 0) goto L_0x007d
            if (r15 != 0) goto L_0x007d
            if (r1 == 0) goto L_0x007d
        L_0x007a:
            r5 = r3
            r15 = r1
            r2 = r0
        L_0x007d:
            int r3 = r3 + 1
            goto L_0x0058
        L_0x0080:
            if (r5 != r14) goto L_0x0096
            r0 = 1
            int[] r1 = new int[r0]
        L_0x0085:
            r2 = r11[r5]
            r0 = r10[r5]
            r0[r2] = r6
            r0 = r4[r5]
            r0[r2] = r1
            int r0 = r2 + 1
            r11[r5] = r0
            int r7 = r7 + 1
            goto L_0x0045
        L_0x0096:
            r2 = r12[r5]
            r0 = 1
            int[] r1 = new int[r0]
            X.9uY[] r0 = r6.A02
            r0 = r0[r9]
            int r0 = r2.BvJ(r0)
            r1[r9] = r0
            goto L_0x0085
        L_0x00a6:
            X.9tN[] r6 = new X.C206419tN[r14]
            java.lang.String[] r5 = new java.lang.String[r14]
            int[] r3 = new int[r14]
        L_0x00ac:
            if (r9 >= r14) goto L_0x00ea
            r2 = r11[r9]
            r1 = r10[r9]
            int r0 = r1.length
            boolean r0 = X.C90504aG.A1U(r2, r0)
            X.C200319h9.A01(r0)
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            X.9tK[] r1 = (X.C206389tK[]) r1
            X.9tN r0 = new X.9tN
            r0.<init>(r1)
            r6[r9] = r0
            r1 = r4[r9]
            int r0 = r1.length
            boolean r0 = X.C90504aG.A1U(r2, r0)
            X.C200319h9.A01(r0)
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r2)
            r4[r9] = r0
            r0 = r12[r9]
            java.lang.String r0 = r0.getName()
            r5[r9] = r0
            r0 = r12[r9]
            X.9zD r0 = (X.C208949zD) r0
            int r0 = r0.A0B
            r3[r9] = r0
            int r9 = r9 + 1
            goto L_0x00ac
        L_0x00ea:
            r2 = r11[r14]
            r1 = r10[r14]
            int r0 = r1.length
            boolean r0 = X.C90504aG.A1U(r2, r0)
            X.C200319h9.A01(r0)
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            X.9tK[] r1 = (X.C206389tK[]) r1
            X.9tN r0 = new X.9tN
            r0.<init>(r1)
            X.9SN r2 = new X.9SN
            r9 = r2
            r10 = r0
            r11 = r3
            r12 = r8
            r13 = r6
            r14 = r5
            r15 = r4
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r0 = r23
            java.util.concurrent.atomic.AtomicReference r0 = r0.A02
            java.lang.Object r5 = r0.get()
            X.83A r5 = (X.AnonymousClass83A) r5
            int r0 = r2.A00
            r33 = r0
            X.B5T[] r3 = new X.B5T[r0]
            r7 = 0
            r9 = 0
            r31 = 0
        L_0x0121:
            r1 = 1
            r0 = r33
            if (r9 >= r0) goto L_0x02de
            int[] r0 = r2.A03
            r6 = r0[r9]
            r0 = 2
            if (r0 != r6) goto L_0x02d2
            if (r7 != 0) goto L_0x02c7
            X.9tN[] r0 = r2.A04
            r30 = r0[r9]
            r29 = r4[r9]
            r0 = r23
            X.9SG r6 = r0.A01
            boolean r0 = r5.A0N
            r28 = r0
            if (r0 != 0) goto L_0x0152
            if (r6 == 0) goto L_0x0152
            r6 = 0
        L_0x0142:
            r0 = r30
            int r0 = r0.A01
            if (r6 >= r0) goto L_0x0152
            r0 = r30
            X.1Ak r0 = r0.A02
            r0.get(r6)
            int r6 = r6 + 1
            goto L_0x0142
        L_0x0152:
            r11 = -1
            r10 = 0
            r27 = 0
            r8 = 0
            r26 = 0
            r7 = -1
            r6 = -1
        L_0x015b:
            r0 = r30
            int r0 = r0.A01
            if (r10 >= r0) goto L_0x02bc
            r0 = r30
            X.9tK r25 = X.C165597tg.A0H(r0, r10)
            int r12 = r5.A0F
            int r0 = r5.A0E
            r32 = r0
            boolean r0 = r5.A0P
            r24 = r0
            java.util.ArrayList r21 = X.C36441kJ.A14(r1)
            java.lang.Integer r20 = java.lang.Integer.valueOf(r8)
            r13 = r20
            r0 = r21
            r0.add(r13)
            r13 = 2147483647(0x7fffffff, float:NaN)
            if (r12 == r13) goto L_0x0212
            r0 = r32
            if (r0 == r13) goto L_0x0212
            r19 = 0
            r0 = r25
            X.9uY[] r0 = r0.A02
            r18 = r0
            r17 = r0[r8]
            r0 = r17
            int r14 = r0.A0I
            if (r14 <= 0) goto L_0x0212
            int r15 = r0.A09
            if (r15 <= 0) goto L_0x0212
            r16 = r32
            if (r24 == 0) goto L_0x020d
            r13 = 1
            if (r14 <= r15) goto L_0x01a6
            r19 = 1
        L_0x01a6:
            r0 = r32
            if (r12 > r0) goto L_0x01ab
            r13 = 0
        L_0x01ab:
            r0 = r19
            if (r0 == r13) goto L_0x020d
        L_0x01af:
            int r13 = r14 * r12
            int r0 = r15 * r16
            if (r13 < r0) goto L_0x0203
            int r0 = r0 + r14
            int r12 = r0 + -1
            int r12 = r12 / r14
            android.graphics.Point r13 = new android.graphics.Point
            r0 = r16
            r13.<init>(r0, r12)
        L_0x01c0:
            int r12 = r14 * r15
            int r0 = r13.x
            float r0 = (float) r0
            r15 = 1065017672(0x3f7ae148, float:0.98)
            float r0 = r0 * r15
            int r0 = (int) r0
            if (r14 < r0) goto L_0x0212
            r0 = r17
            int r14 = r0.A09
            int r0 = r13.y
            float r0 = (float) r0
            float r0 = r0 * r15
            int r0 = (int) r0
            if (r14 < r0) goto L_0x0212
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r12 >= r0) goto L_0x0212
            int r13 = r21.size()
        L_0x01e0:
            int r13 = r13 + -1
            if (r13 < 0) goto L_0x0212
            r0 = r21
            java.lang.Object r0 = r0.get(r13)
            int r0 = X.AnonymousClass000.A0I(r0)
            r0 = r18[r0]
            int r14 = r0.A0I
            if (r14 == r11) goto L_0x01fd
            int r0 = r0.A09
            if (r0 == r11) goto L_0x01fd
            int r14 = r14 * r0
            if (r14 == r11) goto L_0x01fd
            if (r14 <= r12) goto L_0x01e0
        L_0x01fd:
            r0 = r21
            r0.remove(r13)
            goto L_0x01e0
        L_0x0203:
            int r13 = r13 + r15
            int r0 = r13 + -1
            int r0 = r0 / r15
            android.graphics.Point r13 = new android.graphics.Point
            r13.<init>(r0, r12)
            goto L_0x01c0
        L_0x020d:
            r16 = r12
            r12 = r32
            goto L_0x01af
        L_0x0212:
            r15 = r29[r10]
            r12 = r15[r8]
            boolean r0 = r5.A07
            r12 = r12 & 7
            r14 = 4
            if (r12 == r14) goto L_0x0222
            if (r0 == 0) goto L_0x0269
            r0 = 3
            if (r12 != r0) goto L_0x0269
        L_0x0222:
            r0 = r25
            X.9uY[] r0 = r0.A02
            r13 = r0[r8]
            r12 = r20
            r0 = r21
            boolean r0 = r0.contains(r12)
            if (r0 == 0) goto L_0x02b4
            int r12 = r13.A0I
            if (r12 == r11) goto L_0x023a
            int r0 = r5.A06
            if (r12 > r0) goto L_0x02b4
        L_0x023a:
            int r12 = r13.A09
            if (r12 == r11) goto L_0x0242
            int r0 = r5.A05
            if (r12 > r0) goto L_0x02b4
        L_0x0242:
            int r12 = r13.A04
            if (r12 == r11) goto L_0x024a
            int r0 = r5.A03
            if (r12 > r0) goto L_0x02b4
        L_0x024a:
            r17 = 1
            r12 = 2
        L_0x024d:
            r0 = r15[r8]
            r0 = r0 & 7
            r16 = 0
            if (r0 != r14) goto L_0x0259
            r16 = 1
            int r12 = r12 + 1000
        L_0x0259:
            r0 = r26
            boolean r14 = X.C90474aD.A1T(r12, r0)
            if (r12 != r0) goto L_0x026d
            if (r28 == 0) goto L_0x0270
            int r15 = r13.A04
            if (r15 != r11) goto L_0x029b
            if (r6 != r11) goto L_0x0289
        L_0x0269:
            int r10 = r10 + 1
            goto L_0x015b
        L_0x026d:
            if (r14 == 0) goto L_0x0269
            goto L_0x0289
        L_0x0270:
            int r15 = r13.A0I
            r14 = -1
            if (r15 == r11) goto L_0x027b
            int r0 = r13.A09
            if (r0 == r11) goto L_0x027b
            int r14 = r15 * r0
        L_0x027b:
            if (r14 == r7) goto L_0x02a6
            r15 = -1
            if (r14 != r11) goto L_0x02a1
            if (r7 != r11) goto L_0x0283
        L_0x0282:
            r15 = 0
        L_0x0283:
            if (r16 == 0) goto L_0x029e
            if (r17 == 0) goto L_0x029e
            if (r15 <= 0) goto L_0x0269
        L_0x0289:
            int r6 = r13.A04
            int r0 = r13.A0I
            r7 = -1
            if (r0 == r11) goto L_0x0296
            int r13 = r13.A09
            if (r13 == r11) goto L_0x0296
            int r7 = r0 * r13
        L_0x0296:
            r27 = r25
            r26 = r12
            goto L_0x0269
        L_0x029b:
            if (r6 == r11) goto L_0x0269
            int r15 = r15 - r6
        L_0x029e:
            if (r15 >= 0) goto L_0x0269
            goto L_0x0289
        L_0x02a1:
            int r15 = r14 - r7
            if (r7 != r11) goto L_0x0283
            goto L_0x02b2
        L_0x02a6:
            int r0 = r13.A04
            r15 = -1
            if (r0 != r11) goto L_0x02ae
            if (r6 != r11) goto L_0x0283
            goto L_0x0282
        L_0x02ae:
            int r15 = r0 - r6
            if (r6 != r11) goto L_0x0283
        L_0x02b2:
            r15 = 1
            goto L_0x0283
        L_0x02b4:
            r17 = 0
            boolean r0 = r5.A08
            if (r0 == 0) goto L_0x0269
            r12 = 1
            goto L_0x024d
        L_0x02bc:
            if (r27 != 0) goto L_0x02d6
            r6 = 0
        L_0x02bf:
            r3[r9] = r6
            r0 = r3[r9]
            boolean r7 = X.AnonymousClass000.A1V(r0)
        L_0x02c7:
            X.9tN[] r0 = r2.A04
            r0 = r0[r9]
            int r0 = r0.A01
            if (r0 > 0) goto L_0x02d0
            r1 = 0
        L_0x02d0:
            r31 = r31 | r1
        L_0x02d2:
            int r9 = r9 + 1
            goto L_0x0121
        L_0x02d6:
            X.837 r6 = new X.837
            r0 = r27
            r6.<init>(r0, r8)
            goto L_0x02bf
        L_0x02de:
            r21 = 0
            r7 = 0
            r20 = 0
        L_0x02e3:
            r0 = r33
            if (r7 >= r0) goto L_0x0480
            int[] r0 = r2.A03
            r6 = r0[r7]
            if (r6 == r1) goto L_0x03c1
            r0 = 2
            if (r6 == r0) goto L_0x0476
            r0 = 3
            if (r6 == r0) goto L_0x033c
            X.9tN[] r0 = r2.A04
            r15 = r0[r7]
            r17 = r4[r7]
            r14 = 0
            r13 = r14
            r12 = 0
            r11 = 0
            r10 = 0
        L_0x02fe:
            int r0 = r15.A01
            if (r12 >= r0) goto L_0x0331
            X.9tK r9 = X.C165597tg.A0H(r15, r12)
            r16 = r17[r12]
            r6 = r16[r11]
            boolean r0 = r5.A07
            r6 = r6 & 7
            r8 = 4
            if (r6 == r8) goto L_0x0316
            if (r0 == 0) goto L_0x032e
            r0 = 3
            if (r6 != r0) goto L_0x032e
        L_0x0316:
            X.9uY[] r0 = r9.A02
            r0 = r0[r11]
            int r0 = r0.A0G
            r6 = 1
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0322
            r6 = 2
        L_0x0322:
            r0 = r16[r11]
            r0 = r0 & 7
            if (r0 != r8) goto L_0x032a
            int r6 = r6 + 1000
        L_0x032a:
            if (r6 <= r10) goto L_0x032e
            r13 = r9
            r10 = r6
        L_0x032e:
            int r12 = r12 + 1
            goto L_0x02fe
        L_0x0331:
            if (r13 == 0) goto L_0x0338
            X.837 r14 = new X.837
            r14.<init>(r13, r11)
        L_0x0338:
            r3[r7] = r14
            goto L_0x0476
        L_0x033c:
            if (r20 != 0) goto L_0x0476
            X.9tN[] r0 = r2.A04
            r13 = r0[r7]
            r19 = r4[r7]
            r12 = 0
            r11 = 0
            r10 = 0
            r9 = 0
        L_0x0348:
            int r0 = r13.A01
            if (r12 >= r0) goto L_0x046b
            X.9tK r8 = X.C165597tg.A0H(r13, r12)
            r18 = r19[r12]
            r0 = r18[r10]
            boolean r14 = r5.A07
            r6 = r0 & 7
            r0 = 4
            if (r6 == r0) goto L_0x0360
            if (r14 == 0) goto L_0x03a9
            r0 = 3
            if (r6 != r0) goto L_0x03a9
        L_0x0360:
            X.9uY[] r0 = r8.A02
            r14 = r0[r10]
            int r0 = r14.A0G
            int r6 = r5.A00
            int r6 = ~r6
            r0 = r0 & r6
            r15 = r0 & 1
            r6 = 1
            boolean r17 = X.AnonymousClass000.A1P(r15)
            r0 = r0 & 2
            boolean r16 = X.AnonymousClass000.A1P(r0)
            java.util.List r0 = r5.A0K
            boolean r15 = X.AnonymousClass83B.A00(r14, r0)
            if (r15 != 0) goto L_0x0397
            boolean r0 = r5.A0O
            if (r0 == 0) goto L_0x03b1
            java.lang.String r0 = r14.A0R
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0397
            java.lang.String r0 = "und"
            X.1Ak r0 = X.C23931Ak.of(r0)
            boolean r0 = X.AnonymousClass83B.A00(r14, r0)
            if (r0 == 0) goto L_0x03b1
        L_0x0397:
            if (r17 == 0) goto L_0x03ac
            r6 = 8
        L_0x039b:
            int r6 = r6 + r15
        L_0x039c:
            r0 = r18[r10]
            r14 = r0 & 7
            r0 = 4
            if (r14 != r0) goto L_0x03a5
            int r6 = r6 + 1000
        L_0x03a5:
            if (r6 <= r9) goto L_0x03a9
            r11 = r8
            r9 = r6
        L_0x03a9:
            int r12 = r12 + 1
            goto L_0x0348
        L_0x03ac:
            r6 = 4
            if (r16 != 0) goto L_0x039b
            r6 = 6
            goto L_0x039b
        L_0x03b1:
            if (r17 == 0) goto L_0x03b5
            r6 = 3
            goto L_0x039c
        L_0x03b5:
            if (r16 == 0) goto L_0x03a9
            java.util.List r0 = r5.A0I
            boolean r0 = X.AnonymousClass83B.A00(r14, r0)
            if (r0 == 0) goto L_0x039c
            r6 = 2
            goto L_0x039c
        L_0x03c1:
            if (r21 != 0) goto L_0x0476
            X.9tN[] r0 = r2.A04
            r9 = r0[r7]
            r19 = r4[r7]
            boolean r0 = r5.A03
            if (r0 != 0) goto L_0x040c
            if (r31 == 0) goto L_0x040c
            r11 = 0
        L_0x03d0:
            r10 = 0
            r18 = r10
            r13 = 0
            r6 = -1
            r8 = -1
        L_0x03d6:
            int r0 = r9.A01
            if (r13 >= r0) goto L_0x0411
            X.9tK r14 = X.C165597tg.A0H(r9, r13)
            r17 = r19[r13]
            r16 = 0
            r0 = r17[r16]
            boolean r15 = r5.A07
            r12 = r0 & 7
            r0 = 4
            if (r12 == r0) goto L_0x03f0
            if (r15 == 0) goto L_0x0409
            r0 = 3
            if (r12 != r0) goto L_0x0409
        L_0x03f0:
            X.9uY[] r0 = r14.A02
            r14 = r0[r16]
            X.AUi r12 = new X.AUi
            r0 = r17[r16]
            r12.<init>(r14, r5, r0)
            if (r18 == 0) goto L_0x0405
            r0 = r18
            int r0 = r12.compareTo(r0)
            if (r0 <= 0) goto L_0x0409
        L_0x0405:
            r6 = r13
            r8 = 0
            r18 = r12
        L_0x0409:
            int r13 = r13 + 1
            goto L_0x03d6
        L_0x040c:
            r0 = r23
            X.9SG r11 = r0.A01
            goto L_0x03d0
        L_0x0411:
            r0 = -1
            if (r6 == r0) goto L_0x0462
            X.9tK r9 = X.C165597tg.A0H(r9, r6)
            boolean r0 = r5.A0N
            if (r0 != 0) goto L_0x045d
            if (r11 == 0) goto L_0x045d
            r16 = r19[r6]
            boolean r11 = r5.A04
            java.util.HashSet r15 = X.C36441kJ.A16()
            r14 = 0
            r13 = 0
            X.9uY[] r12 = r9.A02
            r10 = r12[r13]
            int r6 = r10.A05
            int r0 = r10.A0F
            if (r11 != 0) goto L_0x0434
            java.lang.String r14 = r10.A0S
        L_0x0434:
            X.9U4 r11 = new X.9U4
            r11.<init>(r6, r0, r14)
            boolean r0 = r15.add(r11)
            if (r0 == 0) goto L_0x045d
            r10 = r12[r13]
            r0 = r16[r13]
            r6 = r0 & 7
            r0 = 4
            if (r6 != r0) goto L_0x045d
            int r6 = r10.A05
            int r0 = r11.A00
            if (r6 != r0) goto L_0x045d
            int r6 = r10.A0F
            int r0 = r11.A01
            if (r6 != r0) goto L_0x045d
            java.lang.String r6 = r11.A02
            if (r6 == 0) goto L_0x045d
            java.lang.String r0 = r10.A0S
            android.text.TextUtils.equals(r6, r0)
        L_0x045d:
            X.837 r10 = new X.837
            r10.<init>(r9, r8)
        L_0x0462:
            r3[r7] = r10
            r0 = r3[r7]
            boolean r21 = X.AnonymousClass000.A1V(r0)
            goto L_0x0476
        L_0x046b:
            if (r11 != 0) goto L_0x047a
            r0 = 0
        L_0x046e:
            r3[r7] = r0
            r0 = r3[r7]
            boolean r20 = X.AnonymousClass000.A1V(r0)
        L_0x0476:
            int r7 = r7 + 1
            goto L_0x02e3
        L_0x047a:
            X.837 r0 = new X.837
            r0.<init>(r11, r10)
            goto L_0x046e
        L_0x0480:
            r6 = 0
            r7 = 0
        L_0x0482:
            r0 = r33
            if (r7 >= r0) goto L_0x050b
            android.util.SparseBooleanArray r0 = r5.A02
            boolean r0 = r0.get(r7)
            if (r0 != 0) goto L_0x0508
            X.9tN[] r0 = r2.A04
            r10 = r0[r7]
            android.util.SparseArray r8 = r5.A01
            java.lang.Object r0 = r8.get(r7)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L_0x04c7
            boolean r0 = r0.containsKey(r10)
            if (r0 == 0) goto L_0x04c7
            java.lang.Object r0 = r8.get(r7)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L_0x0508
            java.lang.Object r9 = r0.get(r10)
            X.9tL r9 = (X.C206399tL) r9
            if (r9 == 0) goto L_0x0508
            int r0 = r9.A01
            if (r0 != r1) goto L_0x04ca
            int r0 = r9.A00
            X.9tK r8 = X.C165597tg.A0H(r10, r0)
            int[] r0 = r9.A02
            r0 = r0[r6]
            X.837 r9 = new X.837
            r9.<init>(r8, r0)
        L_0x04c5:
            r3[r7] = r9
        L_0x04c7:
            int r7 = r7 + 1
            goto L_0x0482
        L_0x04ca:
            r0 = r23
            X.9SG r8 = r0.A01
            int r0 = r9.A00
            X.9tK r10 = X.C165597tg.A0H(r10, r0)
            int[] r14 = r9.A02
            X.AxO r11 = r8.A00
            java.lang.String r9 = "audio"
            if (r11 == 0) goto L_0x0505
            X.9uY[] r0 = r10.A02
            r0 = r0[r6]
            java.lang.String r0 = r0.A0P
            if (r0 == 0) goto L_0x0505
            boolean r0 = r0.startsWith(r9)
            if (r0 == 0) goto L_0x0505
        L_0x04ea:
            X.Avt r12 = r8.A02
            X.9uY[] r0 = r10.A02
            r0 = r0[r6]
            java.lang.String r0 = r0.A0P
            if (r0 == 0) goto L_0x0502
            boolean r0 = r0.startsWith(r9)
            if (r0 == 0) goto L_0x0502
        L_0x04fa:
            X.AUR r13 = r8.A04
            X.838 r9 = new X.838
            r9.<init>(r10, r11, r12, r13, r14)
            goto L_0x04c5
        L_0x0502:
            X.Avt r12 = r8.A03
            goto L_0x04fa
        L_0x0505:
            X.AxO r11 = r8.A01
            goto L_0x04ea
        L_0x0508:
            r3[r7] = r22
            goto L_0x04c7
        L_0x050b:
            X.9f7[] r9 = new X.C199319f7[r0]
            r8 = 0
        L_0x050e:
            r0 = r33
            if (r8 >= r0) goto L_0x052f
            android.util.SparseBooleanArray r0 = r5.A02
            boolean r0 = r0.get(r8)
            if (r0 != 0) goto L_0x052c
            int[] r0 = r2.A03
            r7 = r0[r8]
            r0 = -2
            if (r7 == r0) goto L_0x0525
            r0 = r3[r8]
            if (r0 == 0) goto L_0x052c
        L_0x0525:
            X.9f7 r0 = X.C199319f7.A01
        L_0x0527:
            r9[r8] = r0
            int r8 = r8 + 1
            goto L_0x050e
        L_0x052c:
            r0 = r22
            goto L_0x0527
        L_0x052f:
            int r11 = r5.A00
            if (r11 == 0) goto L_0x0594
            r18 = 0
            r12 = -1
            r10 = -1
            r8 = -1
        L_0x0538:
            r0 = r33
            if (r6 >= r0) goto L_0x0580
            int[] r0 = r2.A03
            r14 = r0[r6]
            r13 = r3[r6]
            if (r14 == r1) goto L_0x0547
            r0 = 2
            if (r14 != r0) goto L_0x0577
        L_0x0547:
            if (r13 == 0) goto L_0x0577
            r17 = r4[r6]
            X.9tN[] r0 = r2.A04
            r0 = r0[r6]
            X.A0A r13 = (X.A0A) r13
            X.9tK r5 = r13.A02
            X.1Ak r0 = r0.A02
            int r16 = r0.indexOf(r5)
            if (r16 >= 0) goto L_0x055d
            r16 = -1
        L_0x055d:
            r7 = 0
        L_0x055e:
            int[] r15 = r13.A03
            int r0 = r15.length
            if (r7 >= r0) goto L_0x0572
            r5 = r17[r16]
            r0 = r15[r7]
            r0 = r5[r0]
            r5 = 32
            r0 = r0 & 32
            if (r0 != r5) goto L_0x0577
            int r7 = r7 + 1
            goto L_0x055e
        L_0x0572:
            if (r14 != r1) goto L_0x057a
            if (r8 != r12) goto L_0x057e
            r8 = r6
        L_0x0577:
            int r6 = r6 + 1
            goto L_0x0538
        L_0x057a:
            if (r10 != r12) goto L_0x057e
            r10 = r6
            goto L_0x0577
        L_0x057e:
            r0 = 0
            goto L_0x0581
        L_0x0580:
            r0 = 1
        L_0x0581:
            if (r8 == r12) goto L_0x0587
            if (r10 == r12) goto L_0x0587
            r18 = 1
        L_0x0587:
            r0 = r0 & r18
            if (r0 == 0) goto L_0x0594
            X.9f7 r0 = new X.9f7
            r0.<init>(r11)
            r9[r8] = r0
            r9[r10] = r0
        L_0x0594:
            android.util.Pair r13 = android.util.Pair.create(r9, r3)
            java.lang.Object r5 = r13.second
            X.Avj[] r5 = (X.C22773Avj[]) r5
            int r4 = r5.length
            java.util.List[] r0 = new java.util.List[r4]
            r18 = r0
            r3 = 0
        L_0x05a2:
            if (r3 >= r4) goto L_0x05b6
            r0 = r5[r3]
            if (r0 == 0) goto L_0x05b1
            X.1Ak r0 = X.C23931Ak.of(r0)
        L_0x05ac:
            r18[r3] = r0
            int r3 = r3 + 1
            goto L_0x05a2
        L_0x05b1:
            java.util.List r0 = java.util.Collections.emptyList()
            goto L_0x05ac
        L_0x05b6:
            X.8Hc r14 = new X.8Hc
            r14.<init>()
            r12 = 0
            r11 = 0
        L_0x05bd:
            r0 = r33
            if (r11 >= r0) goto L_0x0663
            X.9tN[] r15 = r2.A04
            r10 = r15[r11]
            r17 = r18[r11]
            r9 = 0
        L_0x05c8:
            int r0 = r10.A01
            if (r9 >= r0) goto L_0x065f
            X.9tK r8 = X.C165597tg.A0H(r10, r9)
            r0 = r15[r11]
            X.1Ak r0 = r0.A02
            r0.get(r9)
            int[] r6 = new int[r1]
            r4 = 0
            int[][][] r5 = r2.A05
            r0 = r5[r11]
            r0 = r0[r9]
            r0 = r0[r12]
            r3 = r0 & 7
            r0 = 4
            if (r3 != r0) goto L_0x05ea
            r4 = 1
            r6[r12] = r12
        L_0x05ea:
            int[] r7 = java.util.Arrays.copyOf(r6, r4)
            r6 = 0
            r4 = 0
            r16 = 0
        L_0x05f2:
            int r0 = r7.length
            if (r6 >= r0) goto L_0x0611
            r3 = r7[r6]
            r0 = r15[r11]
            X.9tK r0 = X.C165597tg.A0H(r0, r9)
            X.9uY[] r0 = r0.A02
            r0 = r0[r3]
            java.lang.String r3 = r0.A0S
            int r0 = r16 + 1
            if (r16 != 0) goto L_0x060d
            r4 = r3
        L_0x0608:
            int r6 = r6 + 1
            r16 = r0
            goto L_0x05f2
        L_0x060d:
            com.facebook.android.exoplayer2.util.Util.A0E(r4, r3)
            goto L_0x0608
        L_0x0611:
            int[] r7 = new int[r1]
            boolean[] r6 = new boolean[r1]
            r0 = r5[r11]
            r0 = r0[r9]
            r0 = r0[r12]
            r0 = r0 & 7
            r7[r12] = r0
            r5 = 0
        L_0x0620:
            int r3 = r17.size()
            r0 = 0
            if (r5 >= r3) goto L_0x064b
            r0 = r17
            java.lang.Object r4 = r0.get(r5)
            X.Avj r4 = (X.C22773Avj) r4
            r0 = r4
            X.A0A r0 = (X.A0A) r0
            X.9tK r0 = r0.A02
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x065c
            X.A0A r4 = (X.A0A) r4
            r3 = 0
        L_0x063d:
            int r0 = r4.A01
            if (r3 >= r0) goto L_0x065c
            int[] r0 = r4.A03
            r0 = r0[r3]
            if (r0 != r12) goto L_0x0659
            r0 = -1
            if (r3 == r0) goto L_0x065c
            r0 = 1
        L_0x064b:
            r6[r12] = r0
            X.9fN r0 = new X.9fN
            r0.<init>(r8, r7, r6)
            r14.add((java.lang.Object) r0)
            int r9 = r9 + 1
            goto L_0x05c8
        L_0x0659:
            int r3 = r3 + 1
            goto L_0x063d
        L_0x065c:
            int r5 = r5 + 1
            goto L_0x0620
        L_0x065f:
            int r11 = r11 + 1
            goto L_0x05bd
        L_0x0663:
            X.9tN r7 = r2.A01
            r6 = 0
        L_0x0666:
            int r0 = r7.A01
            if (r6 >= r0) goto L_0x0680
            X.9tK r5 = X.C165597tg.A0H(r7, r6)
            int[] r4 = new int[r1]
            java.util.Arrays.fill(r4, r12)
            boolean[] r3 = new boolean[r1]
            X.9fN r0 = new X.9fN
            r0.<init>(r5, r4, r3)
            r14.add((java.lang.Object) r0)
            int r6 = r6 + 1
            goto L_0x0666
        L_0x0680:
            X.7c0 r0 = X.C199329f8.A01
            X.1Ak r0 = r14.build()
            X.9f8 r5 = new X.9f8
            r5.<init>(r0)
            java.lang.Object r3 = r13.first
            X.9f7[] r3 = (X.C199319f7[]) r3
            java.lang.Object r0 = r13.second
            X.B5T[] r0 = (X.B5T[]) r0
            X.9MF r4 = new X.9MF
            r4.<init>(r5, r2, r3, r0)
            r0 = r34
            X.9MF r8 = r0.A04
            if (r8 == 0) goto L_0x06c5
            X.B5T[] r7 = r8.A04
            int r0 = r7.length
            X.B5T[] r6 = r4.A04
            int r5 = r6.length
            if (r0 != r5) goto L_0x06c5
            r3 = 0
        L_0x06a7:
            if (r3 >= r5) goto L_0x06c4
            X.9f7[] r0 = r4.A03
            r2 = r0[r3]
            X.9f7[] r0 = r8.A03
            r0 = r0[r3]
            boolean r0 = com.facebook.android.exoplayer2.util.Util.A0E(r2, r0)
            if (r0 == 0) goto L_0x06c5
            r2 = r6[r3]
            r0 = r7[r3]
            boolean r0 = com.facebook.android.exoplayer2.util.Util.A0E(r2, r0)
            if (r0 == 0) goto L_0x06c5
            int r3 = r3 + 1
            goto L_0x06a7
        L_0x06c4:
            return r12
        L_0x06c5:
            r2 = 0
            r0 = r34
            r0.A05 = r4
            X.B5T[] r0 = r4.A04
            int r0 = r0.length
        L_0x06cd:
            if (r2 >= r0) goto L_0x06d2
            int r2 = r2 + 1
            goto L_0x06cd
        L_0x06d2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9XX.A02():boolean");
    }

    public AnonymousClass9XX(AnonymousClass9NQ r7, B38 b38, AnonymousClass9GL r9, C195899Ws r10, Object obj, B26[] b26Arr, long j) {
        this.A0A = b26Arr;
        long j2 = r7.A03;
        this.A00 = j - j2;
        this.A0E = r9;
        this.A0D = b38;
        Objects.requireNonNull(obj);
        this.A09 = obj;
        this.A02 = r7;
        int length = b26Arr.length;
        this.A0B = new B2j[length];
        this.A0C = new boolean[length];
        B5S B4q = b38.B4q(r7.A04, r10, j2);
        long j3 = r7.A02;
        this.A08 = j3 != Long.MIN_VALUE ? new C209349zr(B4q, j3) : B4q;
    }
}
