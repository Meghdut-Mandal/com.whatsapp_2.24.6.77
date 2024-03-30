package X;

import java.util.Collections;
import java.util.List;
import sun.misc.Unsafe;

/* renamed from: X.A3e  reason: case insensitive filesystem */
public final class C21015A3e implements B3S {
    public static final Unsafe A0F = C203609oO.A03();
    public final C22801AwC A00;
    public final boolean A01;
    public final int[] A02;
    public final Object[] A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final AnonymousClass95O A07;
    public final C199239ex A08;
    public final C23118B5x A09;
    public final C22803AwE A0A;
    public final AnonymousClass95P A0B;
    public final int[] A0C;
    public final int[] A0D;
    public final int[] A0E;

    public C21015A3e(AnonymousClass95O r1, C199239ex r2, C22801AwC awC, C23118B5x b5x, C22803AwE awE, AnonymousClass95P r6, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, Object[] objArr, int i, int i2, int i3, boolean z) {
        this.A02 = iArr;
        this.A03 = objArr;
        this.A04 = i;
        this.A05 = i2;
        this.A06 = i3;
        this.A01 = z;
        this.A0C = iArr2;
        this.A0D = iArr3;
        this.A0E = iArr4;
        this.A0A = awE;
        this.A08 = r2;
        this.A0B = r6;
        this.A07 = r1;
        this.A09 = b5x;
        this.A00 = awC;
    }

    private final int A00(int i) {
        int i2;
        int i3 = this.A04;
        if (i >= i3) {
            int i4 = this.A06;
            if (i < i4) {
                i2 = (i - i3) << 2;
                if (this.A02[i2] == i) {
                    return i2;
                }
            } else if (i <= this.A05) {
                int i5 = i4 - i3;
                int[] iArr = this.A02;
                int length = (iArr.length / 4) - 1;
                while (i5 <= length) {
                    int i6 = (length + i5) >>> 1;
                    i2 = i6 << 2;
                    int i7 = iArr[i2];
                    if (i != i7) {
                        if (i < i7) {
                            length = i6 - 1;
                        } else {
                            i5 = i6 + 1;
                        }
                    }
                }
            }
            return i2;
        }
        return -1;
    }

    public static int A03(C192929Je r2, B3S b3s, byte[] bArr, int i, int i2, int i3) {
        C21015A3e a3e = (C21015A3e) b3s;
        Object BQ9 = a3e.BQ9();
        int A042 = a3e.A04(r2, BQ9, bArr, i, i2, i3);
        a3e.Byd(BQ9);
        r2.A02 = BQ9;
        return A042;
    }

    public static int A01(int i, int i2, int i3) {
        return i3 + (i2 * AnonymousClass8D7.A00(i << 3));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r5 >= 0) goto L_0x0010;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A02(X.C192929Je r6, X.B3S r7, byte[] r8, int r9, int r10) {
        /*
            int r4 = r9 + 1
            r3 = r8
            byte r5 = r8[r9]
            r1 = r6
            if (r5 >= 0) goto L_0x0010
            int r4 = X.C203009n7.A04(r6, r8, r5, r4)
            int r5 = r6.A00
            if (r5 < 0) goto L_0x0022
        L_0x0010:
            int r10 = r10 - r4
            if (r5 > r10) goto L_0x0022
            r0 = r7
            java.lang.Object r2 = r7.BQ9()
            int r5 = r5 + r4
            r0.ByN(r1, r2, r3, r4, r5)
            r7.Byd(r2)
            r6.A02 = r2
            return r5
        L_0x0022:
            java.lang.String r1 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            X.8xd r0 = new X.8xd
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21015A3e.A02(X.9Je, X.B3S, byte[], int, int):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a6, code lost:
        r8.putObject(r4, r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b2, code lost:
        r3 = r7.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x010a, code lost:
        r12 = r12 | r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0129, code lost:
        r8.putObject(r4, r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0143, code lost:
        r2 = r7.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01b6, code lost:
        r9 = r5 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01cd, code lost:
        r9 = r5 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01cf, code lost:
        r12 = r12 | r16;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int A04(X.C192929Je r38, java.lang.Object r39, byte[] r40, int r41, int r42, int r43) {
        /*
            r37 = this;
            r9 = r41
            sun.misc.Unsafe r8 = A0F
            r2 = -1
            r13 = 0
            r12 = 0
            r20 = -1
        L_0x0009:
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r9
            r10 = r37
            r27 = r42
            r4 = r39
            r21 = r43
            r0 = r27
            if (r9 >= r0) goto L_0x026a
            int r5 = r9 + 1
            r6 = r40
            byte r13 = r40[r9]
            r7 = r38
            if (r13 >= 0) goto L_0x0029
            int r5 = X.C203009n7.A04(r7, r6, r13, r5)
            int r13 = r7.A00
        L_0x0029:
            int r18 = r13 >>> 3
            r9 = r13 & 7
            r0 = r18
            int r11 = r10.A00(r0)
            if (r11 == r2) goto L_0x006a
            int[] r3 = r10.A02
            int r0 = r11 + 1
            r17 = r3[r0]
            int r15 = X.C165587tf.A02(r17)
            r0 = r17 & r19
            long r0 = (long) r0
            r2 = 17
            if (r15 > r2) goto L_0x01d3
            int r2 = r11 + 2
            r14 = r3[r2]
            int r2 = r14 >>> 20
            r16 = 1
            int r16 = r16 << r2
            r14 = r14 & r19
            r2 = r20
            if (r14 == r2) goto L_0x0066
            r2 = -1
            r3 = r20
            if (r3 == r2) goto L_0x005f
            long r2 = (long) r3
            r8.putInt(r4, r2, r12)
        L_0x005f:
            long r2 = (long) r14
            int r12 = r8.getInt(r4, r2)
            r20 = r14
        L_0x0066:
            r2 = 5
            switch(r15) {
                case 0: goto L_0x01b9;
                case 1: goto L_0x01a7;
                case 2: goto L_0x0193;
                case 3: goto L_0x0193;
                case 4: goto L_0x0187;
                case 5: goto L_0x0176;
                case 6: goto L_0x016c;
                case 7: goto L_0x0156;
                case 8: goto L_0x012e;
                case 9: goto L_0x010e;
                case 10: goto L_0x00aa;
                case 11: goto L_0x0187;
                case 12: goto L_0x00dd;
                case 13: goto L_0x016c;
                case 14: goto L_0x0176;
                case 15: goto L_0x00cc;
                case 16: goto L_0x00b5;
                case 17: goto L_0x0080;
                default: goto L_0x006a;
            }
        L_0x006a:
            r0 = r21
            if (r13 != r0) goto L_0x0070
            if (r43 != 0) goto L_0x026a
        L_0x0070:
            X.9js r1 = X.AnonymousClass8DG.A01(r4)
            r0 = r7
            r2 = r6
            r3 = r13
            r4 = r5
            r5 = r27
            int r9 = X.C203009n7.A00(r0, r1, r2, r3, r4, r5)
        L_0x007e:
            r2 = -1
            goto L_0x0009
        L_0x0080:
            r2 = 3
            if (r9 != r2) goto L_0x006a
            int r2 = r18 << 3
            r26 = r2 | 4
            X.B3S r22 = r10.A0A(r11)
            r2 = -1
            r21 = r7
            r23 = r6
            r24 = r5
            r25 = r27
            int r9 = A03(r21, r22, r23, r24, r25, r26)
            r3 = r12 & r16
            if (r3 == 0) goto L_0x00b2
            java.lang.Object r5 = r8.getObject(r4, r0)
            java.lang.Object r3 = r7.A02
            X.8DG r3 = X.C197079b6.A00(r5, r3)
        L_0x00a6:
            r8.putObject(r4, r0, r3)
            goto L_0x010a
        L_0x00aa:
            r3 = 2
            r2 = -1
            if (r9 != r3) goto L_0x006a
            int r9 = X.C203009n7.A01(r7, r6, r5)
        L_0x00b2:
            java.lang.Object r3 = r7.A02
            goto L_0x00a6
        L_0x00b5:
            r2 = -1
            if (r9 != 0) goto L_0x006a
            int r9 = X.C203009n7.A03(r7, r6, r5)
            long r5 = r7.A01
            long r25 = X.C165567td.A06(r5)
            r22 = r4
            r21 = r8
            r23 = r0
            r21.putLong(r22, r23, r25)
            goto L_0x010a
        L_0x00cc:
            r2 = -1
            if (r9 != 0) goto L_0x006a
            int r9 = X.C203009n7.A02(r7, r6, r5)
            int r3 = r7.A00
            int r3 = X.C165597tg.A02(r3)
            r8.putInt(r4, r0, r3)
            goto L_0x010a
        L_0x00dd:
            r2 = -1
            if (r9 != 0) goto L_0x006a
            int r9 = X.C203009n7.A02(r7, r6, r5)
            int r5 = r7.A00
            java.lang.Object[] r6 = r10.A03
            int r3 = r11 / 4
            int r3 = r3 << 1
            int r3 = r3 + 1
            r3 = r6[r3]
            X.Axj r3 = (X.C22888Axj) r3
            if (r3 == 0) goto L_0x0107
            X.AwB r3 = r3.ByR(r5)
            if (r3 != 0) goto L_0x0107
            X.9js r1 = X.AnonymousClass8DG.A01(r4)
            java.lang.Long r0 = X.C36441kJ.A0y(r5)
            r1.A01(r13, r0)
            goto L_0x0009
        L_0x0107:
            r8.putInt(r4, r0, r5)
        L_0x010a:
            r12 = r12 | r16
            goto L_0x0009
        L_0x010e:
            r2 = 2
            if (r9 != r2) goto L_0x006a
            X.B3S r3 = r10.A0A(r11)
            r2 = r27
            int r9 = A02(r7, r3, r6, r5, r2)
            r2 = r12 & r16
            if (r2 == 0) goto L_0x0143
            java.lang.Object r3 = r8.getObject(r4, r0)
            java.lang.Object r2 = r7.A02
            X.8DG r2 = X.C197079b6.A00(r3, r2)
        L_0x0129:
            r8.putObject(r4, r0, r2)
            goto L_0x01cf
        L_0x012e:
            r2 = 2
            if (r9 != r2) goto L_0x006a
            r2 = 536870912(0x20000000, float:1.0842022E-19)
            r17 = r17 & r2
            if (r17 != 0) goto L_0x0151
            int r9 = X.C203009n7.A02(r7, r6, r5)
            int r5 = r7.A00
            if (r5 != 0) goto L_0x0146
            java.lang.String r2 = ""
            r7.A02 = r2
        L_0x0143:
            java.lang.Object r2 = r7.A02
            goto L_0x0129
        L_0x0146:
            java.nio.charset.Charset r3 = X.C197079b6.A00
            java.lang.String r2 = new java.lang.String
            r2.<init>(r6, r9, r5, r3)
            r7.A02 = r2
            int r9 = r9 + r5
            goto L_0x0143
        L_0x0151:
            int r9 = A07(r7, r6, r5)
            goto L_0x0143
        L_0x0156:
            if (r9 != 0) goto L_0x006a
            int r9 = X.C203009n7.A03(r7, r6, r5)
            long r2 = r7.A01
            r6 = 0
            int r5 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            boolean r3 = X.AnonymousClass000.A1P(r5)
            X.9Yh r2 = X.C203609oO.A02
            r2.A0D(r4, r0, r3)
            goto L_0x01cf
        L_0x016c:
            if (r9 != r2) goto L_0x006a
            int r2 = X.C165567td.A04(r6, r5)
            r8.putInt(r4, r0, r2)
            goto L_0x01b6
        L_0x0176:
            r2 = 1
            if (r9 != r2) goto L_0x006a
            long r25 = X.C165567td.A0A(r6, r5)
            r22 = r4
            r21 = r8
            r23 = r0
            r21.putLong(r22, r23, r25)
            goto L_0x01cd
        L_0x0187:
            if (r9 != 0) goto L_0x006a
            int r9 = X.C203009n7.A02(r7, r6, r5)
            int r2 = r7.A00
            r8.putInt(r4, r0, r2)
            goto L_0x01cf
        L_0x0193:
            if (r9 != 0) goto L_0x006a
            int r9 = X.C203009n7.A03(r7, r6, r5)
            long r2 = r7.A01
            r22 = r4
            r21 = r8
            r23 = r0
            r25 = r2
            r21.putLong(r22, r23, r25)
            goto L_0x01cf
        L_0x01a7:
            if (r9 != r2) goto L_0x006a
            int r2 = X.C165567td.A04(r6, r5)
            float r3 = java.lang.Float.intBitsToFloat(r2)
            X.9Yh r2 = X.C203609oO.A02
            r2.A0A(r4, r0, r3)
        L_0x01b6:
            int r9 = r5 + 4
            goto L_0x01cf
        L_0x01b9:
            r2 = 1
            if (r9 != r2) goto L_0x006a
            long r2 = X.C165567td.A0A(r6, r5)
            double r25 = java.lang.Double.longBitsToDouble(r2)
            X.9Yh r21 = X.C203609oO.A02
            r22 = r4
            r23 = r0
            r21.A09(r22, r23, r25)
        L_0x01cd:
            int r9 = r5 + 8
        L_0x01cf:
            r12 = r12 | r16
            goto L_0x007e
        L_0x01d3:
            r2 = 27
            if (r15 != r2) goto L_0x0214
            r2 = 2
            if (r9 != r2) goto L_0x006a
            java.lang.Object r2 = r8.getObject(r4, r0)
            X.B6a r2 = (X.C23120B6a) r2
            r3 = r2
            X.Ac8 r3 = (X.C21882Ac8) r3
            boolean r3 = r3.A00
            if (r3 != 0) goto L_0x01f2
            int r3 = X.C165597tg.A07(r2)
            X.B6a r2 = r2.Byu(r3)
            r8.putObject(r4, r0, r2)
        L_0x01f2:
            X.B3S r3 = r10.A0A(r11)
            r0 = r27
            int r9 = A02(r7, r3, r6, r5, r0)
        L_0x01fc:
            java.lang.Object r0 = r7.A02
            r2.add(r0)
            r0 = r27
            if (r9 >= r0) goto L_0x007e
            int r1 = X.C203009n7.A02(r7, r6, r9)
            int r0 = r7.A00
            if (r13 != r0) goto L_0x007e
            r0 = r27
            int r9 = A02(r7, r3, r6, r1, r0)
            goto L_0x01fc
        L_0x0214:
            r2 = 49
            if (r15 > r2) goto L_0x023c
            r2 = r17
            long r2 = (long) r2
            r23 = r7
            r24 = r4
            r25 = r6
            r30 = r9
            r31 = r11
            r32 = r15
            r33 = r2
            r35 = r0
            r22 = r10
            r26 = r5
            r28 = r13
            r29 = r18
            int r9 = r22.A06(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r35)
        L_0x0237:
            if (r9 != r5) goto L_0x007e
            r5 = r9
            goto L_0x006a
        L_0x023c:
            r2 = 50
            if (r15 != r2) goto L_0x024d
            r2 = 2
            if (r9 != r2) goto L_0x006a
            r8.getObject(r4, r0)
            java.lang.String r0 = "isMutable"
            java.lang.NullPointerException r1 = X.AnonymousClass001.A0A(r0)
            throw r1
        L_0x024d:
            r23 = r7
            r24 = r4
            r25 = r6
            r30 = r9
            r31 = r17
            r32 = r15
            r33 = r11
            r34 = r0
            r22 = r10
            r26 = r5
            r28 = r13
            r29 = r18
            int r9 = r22.A05(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            goto L_0x0237
        L_0x026a:
            r1 = -1
            r0 = r20
            if (r0 == r1) goto L_0x0273
            long r0 = (long) r0
            r8.putInt(r4, r0, r12)
        L_0x0273:
            int[] r6 = r10.A0D
            if (r6 == 0) goto L_0x02a1
            int r3 = r6.length
            r2 = 0
        L_0x0279:
            if (r2 >= r3) goto L_0x02a1
            r7 = r6[r2]
            int[] r1 = r10.A02
            int r0 = r7 + 1
            r0 = r1[r0]
            r0 = r0 & r19
            long r0 = (long) r0
            java.lang.Object r0 = X.C203609oO.A01(r4, r0)
            if (r0 == 0) goto L_0x029e
            java.lang.Object[] r1 = r10.A03
            int r0 = r7 / 4
            int r0 = r0 << 1
            int r0 = r0 + 1
            r0 = r1[r0]
            if (r0 == 0) goto L_0x029e
            java.lang.NoSuchMethodError r1 = new java.lang.NoSuchMethodError
            r1.<init>()
            throw r1
        L_0x029e:
            int r2 = r2 + 1
            goto L_0x0279
        L_0x02a1:
            r0 = r27
            if (r43 != 0) goto L_0x02a8
            if (r5 != r0) goto L_0x02af
            return r5
        L_0x02a8:
            if (r5 > r0) goto L_0x02af
            r0 = r21
            if (r13 != r0) goto L_0x02af
            return r5
        L_0x02af:
            java.lang.String r0 = "Failed to parse the message."
            X.8xd r1 = new X.8xd
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21015A3e.A04(X.9Je, java.lang.Object, byte[], int, int, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b3, code lost:
        if (r7.getInt(r10, r2) != r15) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b5, code lost:
        r4 = r7.getObject(r10, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b9, code lost:
        r5 = r11.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00bb, code lost:
        if (r4 == null) goto L_0x013a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0023, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00bd, code lost:
        r5 = X.C197079b6.A00(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c2, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f0, code lost:
        r7.putObject(r10, r0, r5);
        r8 = r8 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0129, code lost:
        r5 = java.lang.Integer.valueOf(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0136, code lost:
        r5 = java.lang.Long.valueOf(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x013a, code lost:
        r7.putObject(r10, r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x014c, code lost:
        r7.putObject(r10, r0, r4);
        r8 = r26 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0161, code lost:
        r7.putObject(r10, r0, r4);
        r8 = r26 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0166, code lost:
        r7.putInt(r10, r2, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0169, code lost:
        return r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int A05(X.C192929Je r23, java.lang.Object r24, byte[] r25, int r26, int r27, int r28, int r29, int r30, int r31, int r32, int r33, long r34) {
        /*
            r22 = this;
            r8 = r26
            sun.misc.Unsafe r7 = A0F
            r6 = r22
            int[] r0 = r6.A02
            r12 = r33
            long r2 = X.C165577te.A0H(r0, r12)
            r5 = 5
            r4 = 2
            r11 = r23
            r9 = r25
            r16 = r27
            r14 = r28
            r15 = r29
            r13 = r30
            r0 = r34
            r10 = r24
            switch(r32) {
                case 51: goto L_0x0152;
                case 52: goto L_0x013e;
                case 53: goto L_0x012e;
                case 54: goto L_0x012e;
                case 55: goto L_0x0121;
                case 56: goto L_0x0115;
                case 57: goto L_0x010a;
                case 58: goto L_0x00f5;
                case 59: goto L_0x00c4;
                case 60: goto L_0x00a3;
                case 61: goto L_0x0089;
                case 62: goto L_0x0121;
                case 63: goto L_0x0058;
                case 64: goto L_0x010a;
                case 65: goto L_0x0115;
                case 66: goto L_0x004a;
                case 67: goto L_0x003c;
                case 68: goto L_0x0024;
                default: goto L_0x0023;
            }
        L_0x0023:
            return r8
        L_0x0024:
            r4 = 3
            if (r13 != r4) goto L_0x0023
            r4 = r28 & -8
            r21 = r4 | 4
            X.B3S r17 = r6.A0A(r12)
            r20 = r16
            r18 = r9
            r19 = r8
            r16 = r11
            int r8 = A03(r16, r17, r18, r19, r20, r21)
            goto L_0x00af
        L_0x003c:
            if (r30 != 0) goto L_0x0023
            int r8 = X.C203009n7.A03(r11, r9, r8)
            long r4 = r11.A01
            long r4 = X.C165567td.A06(r4)
            goto L_0x0136
        L_0x004a:
            if (r30 != 0) goto L_0x0023
            int r8 = X.C203009n7.A02(r11, r9, r8)
            int r4 = r11.A00
            int r4 = X.C165597tg.A02(r4)
            goto L_0x0129
        L_0x0058:
            if (r30 != 0) goto L_0x0023
            int r8 = X.C203009n7.A02(r11, r9, r8)
            int r5 = r11.A00
            java.lang.Object[] r6 = r6.A03
            int r4 = r33 / 4
            int r4 = r4 << 1
            int r4 = r4 + 1
            r4 = r6[r4]
            X.Axj r4 = (X.C22888Axj) r4
            if (r4 == 0) goto L_0x0080
            X.AwB r4 = r4.ByR(r5)
            if (r4 != 0) goto L_0x0080
            X.9js r1 = X.AnonymousClass8DG.A01(r10)
            java.lang.Long r0 = X.C36441kJ.A0y(r5)
            r1.A01(r14, r0)
            return r8
        L_0x0080:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r7.putObject(r10, r0, r4)
            goto L_0x0166
        L_0x0089:
            if (r13 != r4) goto L_0x0023
            int r8 = X.C203009n7.A02(r11, r9, r8)
            int r6 = r11.A00
            if (r6 != 0) goto L_0x0097
            X.AUv r5 = X.AUv.A00
            goto L_0x013a
        L_0x0097:
            X.Axi r4 = X.AUv.A01
            byte[] r4 = r4.Byf(r9, r8, r6)
            X.8D2 r5 = new X.8D2
            r5.<init>(r4)
            goto L_0x00f0
        L_0x00a3:
            if (r13 != r4) goto L_0x0023
            X.B3S r5 = r6.A0A(r12)
            r4 = r16
            int r8 = A02(r11, r5, r9, r8, r4)
        L_0x00af:
            int r4 = r7.getInt(r10, r2)
            if (r4 != r15) goto L_0x00c2
            java.lang.Object r4 = r7.getObject(r10, r0)
        L_0x00b9:
            java.lang.Object r5 = r11.A02
            if (r4 == 0) goto L_0x013a
            X.8DG r5 = X.C197079b6.A00(r4, r5)
            goto L_0x013a
        L_0x00c2:
            r4 = 0
            goto L_0x00b9
        L_0x00c4:
            if (r13 != r4) goto L_0x0023
            int r8 = X.C203009n7.A02(r11, r9, r8)
            int r6 = r11.A00
            if (r6 != 0) goto L_0x00d1
            java.lang.String r5 = ""
            goto L_0x013a
        L_0x00d1:
            r4 = 536870912(0x20000000, float:1.0842022E-19)
            r31 = r31 & r4
            if (r31 == 0) goto L_0x00e9
            int r5 = r8 + r6
            X.9fe r4 = X.C201819kT.A00
            int r4 = r4.A02(r9, r8, r5)
            if (r4 == 0) goto L_0x00e9
            java.lang.String r1 = "Protocol message had invalid UTF-8."
            X.8xd r0 = new X.8xd
            r0.<init>(r1)
            throw r0
        L_0x00e9:
            java.nio.charset.Charset r4 = X.C197079b6.A00
            java.lang.String r5 = new java.lang.String
            r5.<init>(r9, r8, r6, r4)
        L_0x00f0:
            r7.putObject(r10, r0, r5)
            int r8 = r8 + r6
            goto L_0x0166
        L_0x00f5:
            if (r30 != 0) goto L_0x0023
            int r8 = X.C203009n7.A03(r11, r9, r8)
            long r4 = r11.A01
            r11 = 0
            int r6 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            boolean r4 = X.AnonymousClass000.A1P(r6)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
            goto L_0x013a
        L_0x010a:
            if (r13 != r5) goto L_0x0023
            int r4 = X.C165567td.A04(r9, r8)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x014c
        L_0x0115:
            r4 = 1
            if (r13 != r4) goto L_0x0023
            long r4 = X.C165567td.A0A(r9, r8)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            goto L_0x0161
        L_0x0121:
            if (r30 != 0) goto L_0x0023
            int r8 = X.C203009n7.A02(r11, r9, r8)
            int r4 = r11.A00
        L_0x0129:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            goto L_0x013a
        L_0x012e:
            if (r30 != 0) goto L_0x0023
            int r8 = X.C203009n7.A03(r11, r9, r8)
            long r4 = r11.A01
        L_0x0136:
            java.lang.Long r5 = java.lang.Long.valueOf(r4)
        L_0x013a:
            r7.putObject(r10, r0, r5)
            goto L_0x0166
        L_0x013e:
            if (r13 != r5) goto L_0x0023
            int r4 = X.C165567td.A04(r9, r8)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
        L_0x014c:
            r7.putObject(r10, r0, r4)
            int r8 = r26 + 4
            goto L_0x0166
        L_0x0152:
            r4 = 1
            if (r13 != r4) goto L_0x0023
            long r4 = X.C165567td.A0A(r9, r8)
            double r4 = java.lang.Double.longBitsToDouble(r4)
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
        L_0x0161:
            r7.putObject(r10, r0, r4)
            int r8 = r26 + 8
        L_0x0166:
            r7.putInt(r10, r2, r15)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21015A3e.A05(X.9Je, java.lang.Object, byte[], int, int, int, int, int, int, int, int, long):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int A06(X.C192929Je r20, java.lang.Object r21, byte[] r22, int r23, int r24, int r25, int r26, int r27, int r28, int r29, long r30, long r32) {
        /*
            r19 = this;
            r7 = r21
            r4 = r23
            sun.misc.Unsafe r8 = A0F
            r0 = r32
            java.lang.Object r3 = r8.getObject(r7, r0)
            X.B6a r3 = (X.C23120B6a) r3
            r2 = r3
            X.Ac8 r2 = (X.C21882Ac8) r2
            boolean r5 = r2.A00
            r2 = 1
            if (r5 != 0) goto L_0x0027
            int r6 = r3.size()
            int r5 = r6 << r2
            if (r6 != 0) goto L_0x0020
            r5 = 10
        L_0x0020:
            X.B6a r3 = r3.Byu(r5)
            r8.putObject(r7, r0, r3)
        L_0x0027:
            r8 = 5
            r11 = 0
            r1 = 2
            r0 = r19
            r13 = r20
            r15 = r22
            r6 = r24
            r5 = r25
            r9 = r27
            r10 = r28
            switch(r29) {
                case 18: goto L_0x0082;
                case 19: goto L_0x009d;
                case 20: goto L_0x00b8;
                case 21: goto L_0x00b8;
                case 22: goto L_0x0057;
                case 23: goto L_0x003c;
                case 24: goto L_0x00d9;
                case 25: goto L_0x00f4;
                case 26: goto L_0x0115;
                case 27: goto L_0x0172;
                case 28: goto L_0x0190;
                case 29: goto L_0x0057;
                case 30: goto L_0x022d;
                case 31: goto L_0x00d9;
                case 32: goto L_0x003c;
                case 33: goto L_0x01be;
                case 34: goto L_0x01df;
                case 35: goto L_0x0082;
                case 36: goto L_0x009d;
                case 37: goto L_0x00b8;
                case 38: goto L_0x00b8;
                case 39: goto L_0x0057;
                case 40: goto L_0x003c;
                case 41: goto L_0x00d9;
                case 42: goto L_0x00f4;
                case 43: goto L_0x0057;
                case 44: goto L_0x022d;
                case 45: goto L_0x00d9;
                case 46: goto L_0x003c;
                case 47: goto L_0x01be;
                case 48: goto L_0x01df;
                case 49: goto L_0x020a;
                default: goto L_0x003c;
            }
        L_0x003c:
            if (r9 != r1) goto L_0x004e
            int r4 = X.C203009n7.A02(r13, r15, r4)
            int r0 = r13.A00
            int r0 = r0 + r4
            if (r4 >= r0) goto L_0x01f4
            java.lang.String r0 = "zzm"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x004e:
            if (r9 != r2) goto L_0x02dd
            java.lang.String r0 = "zzm"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x0057:
            if (r9 != r1) goto L_0x0076
            int r4 = X.C203009n7.A02(r13, r15, r4)
            int r0 = r13.A00
            int r0 = r0 + r4
            if (r4 >= r0) goto L_0x006c
            X.C203009n7.A02(r13, r15, r4)
            java.lang.String r0 = "zzac"
            java.lang.NullPointerException r1 = X.AnonymousClass001.A0A(r0)
            throw r1
        L_0x006c:
            if (r4 == r0) goto L_0x02dd
            java.lang.String r0 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            X.8xd r1 = new X.8xd
            r1.<init>(r0)
            throw r1
        L_0x0076:
            if (r27 != 0) goto L_0x02dd
            X.C203009n7.A02(r13, r15, r4)
            java.lang.String r0 = "zzac"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x0082:
            if (r9 != r1) goto L_0x0094
            int r4 = X.C203009n7.A02(r13, r15, r4)
            int r0 = r13.A00
            int r0 = r0 + r4
            if (r4 >= r0) goto L_0x01f4
            java.lang.String r0 = "zzc"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x0094:
            if (r9 != r2) goto L_0x02dd
            java.lang.String r0 = "zzc"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x009d:
            if (r9 != r1) goto L_0x00af
            int r4 = X.C203009n7.A02(r13, r15, r4)
            int r0 = r13.A00
            int r0 = r0 + r4
            if (r4 >= r0) goto L_0x01f4
            java.lang.String r0 = "zzc"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x00af:
            if (r9 != r8) goto L_0x02dd
            java.lang.String r0 = "zzc"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x00b8:
            if (r9 != r1) goto L_0x00cd
            int r4 = X.C203009n7.A02(r13, r15, r4)
            int r0 = r13.A00
            int r0 = r0 + r4
            if (r4 >= r0) goto L_0x01f4
            X.C203009n7.A03(r13, r15, r4)
            java.lang.String r0 = "zzm"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x00cd:
            if (r27 != 0) goto L_0x02dd
            X.C203009n7.A03(r13, r15, r4)
            java.lang.String r0 = "zzm"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x00d9:
            if (r9 != r1) goto L_0x00eb
            int r4 = X.C203009n7.A02(r13, r15, r4)
            int r0 = r13.A00
            int r0 = r0 + r4
            if (r4 >= r0) goto L_0x01f4
            java.lang.String r0 = "zzac"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x00eb:
            if (r9 != r8) goto L_0x02dd
            java.lang.String r0 = "zzac"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x00f4:
            if (r9 != r1) goto L_0x0109
            int r4 = X.C203009n7.A02(r13, r15, r4)
            int r0 = r13.A00
            int r0 = r0 + r4
            if (r4 >= r0) goto L_0x01f4
            X.C203009n7.A03(r13, r15, r4)
            java.lang.String r0 = "addBoolean"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x0109:
            if (r27 != 0) goto L_0x02dd
            X.C203009n7.A03(r13, r15, r4)
            java.lang.String r0 = "addBoolean"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x0115:
            if (r9 != r1) goto L_0x02dd
            r0 = 536870912(0x20000000, double:2.652494739E-315)
            long r30 = r30 & r0
            java.lang.String r7 = ""
            int r0 = (r30 > r11 ? 1 : (r30 == r11 ? 0 : -1))
            int r4 = X.C203009n7.A02(r13, r15, r4)
            if (r0 != 0) goto L_0x0143
        L_0x0126:
            int r1 = r13.A00
            if (r1 != 0) goto L_0x013c
            r3.add(r7)
        L_0x012d:
            if (r4 >= r6) goto L_0x02dd
            int r1 = X.C203009n7.A02(r13, r15, r4)
            int r0 = r13.A00
            if (r5 != r0) goto L_0x02dd
            int r4 = X.C203009n7.A02(r13, r15, r1)
            goto L_0x0126
        L_0x013c:
            java.nio.charset.Charset r0 = X.C197079b6.A00
            X.C165597tg.A1L(r0, r3, r15, r4, r1)
            int r4 = r4 + r1
            goto L_0x012d
        L_0x0143:
            int r2 = r13.A00
            if (r2 != 0) goto L_0x0159
            r3.add(r7)
        L_0x014a:
            if (r4 >= r6) goto L_0x02dd
            int r1 = X.C203009n7.A02(r13, r15, r4)
            int r0 = r13.A00
            if (r5 != r0) goto L_0x02dd
            int r4 = X.C203009n7.A02(r13, r15, r1)
            goto L_0x0143
        L_0x0159:
            int r1 = r4 + r2
            X.9fe r0 = X.C201819kT.A00
            int r0 = r0.A02(r15, r4, r1)
            if (r0 != 0) goto L_0x016a
            java.nio.charset.Charset r0 = X.C197079b6.A00
            X.C165597tg.A1L(r0, r3, r15, r4, r2)
            r4 = r1
            goto L_0x014a
        L_0x016a:
            java.lang.String r1 = "Protocol message had invalid UTF-8."
            X.8xd r0 = new X.8xd
            r0.<init>(r1)
            throw r0
        L_0x0172:
            if (r9 != r1) goto L_0x02dd
            X.B3S r2 = r0.A0A(r10)
            int r4 = A02(r13, r2, r15, r4, r6)
        L_0x017c:
            java.lang.Object r0 = r13.A02
            r3.add(r0)
            if (r4 >= r6) goto L_0x02dd
            int r1 = X.C203009n7.A02(r13, r15, r4)
            int r0 = r13.A00
            if (r5 != r0) goto L_0x02dd
            int r4 = A02(r13, r2, r15, r1, r6)
            goto L_0x017c
        L_0x0190:
            if (r9 != r1) goto L_0x02dd
            int r4 = X.C203009n7.A02(r13, r15, r4)
        L_0x0196:
            int r2 = r13.A00
            if (r2 != 0) goto L_0x01ae
            X.AUv r0 = X.AUv.A00
            r3.add(r0)
        L_0x019f:
            if (r4 >= r6) goto L_0x02dd
            int r1 = X.C203009n7.A02(r13, r15, r4)
            int r0 = r13.A00
            if (r5 != r0) goto L_0x02dd
            int r4 = X.C203009n7.A02(r13, r15, r1)
            goto L_0x0196
        L_0x01ae:
            X.Axi r0 = X.AUv.A01
            byte[] r1 = r0.Byf(r15, r4, r2)
            X.8D2 r0 = new X.8D2
            r0.<init>(r1)
            r3.add(r0)
            int r4 = r4 + r2
            goto L_0x019f
        L_0x01be:
            if (r9 != r1) goto L_0x01d3
            int r4 = X.C203009n7.A02(r13, r15, r4)
            int r0 = r13.A00
            int r0 = r0 + r4
            if (r4 >= r0) goto L_0x01f4
            X.C203009n7.A02(r13, r15, r4)
            java.lang.String r0 = "zzac"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x01d3:
            if (r27 != 0) goto L_0x02dd
            X.C203009n7.A02(r13, r15, r4)
            java.lang.String r0 = "zzac"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x01df:
            if (r9 != r1) goto L_0x01fe
            int r4 = X.C203009n7.A02(r13, r15, r4)
            int r0 = r13.A00
            int r0 = r0 + r4
            if (r4 >= r0) goto L_0x01f4
            X.C203009n7.A03(r13, r15, r4)
            java.lang.String r0 = "zzm"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x01f4:
            if (r4 == r0) goto L_0x02dd
            java.lang.String r1 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            X.8xd r0 = new X.8xd
            r0.<init>(r1)
            throw r0
        L_0x01fe:
            if (r27 != 0) goto L_0x02dd
            X.C203009n7.A03(r13, r15, r4)
            java.lang.String r0 = "zzm"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x020a:
            r1 = 3
            if (r9 != r1) goto L_0x02dd
            X.B3S r14 = r0.A0A(r10)
            r0 = r25 & -8
            r18 = r0 | 4
            r16 = r4
        L_0x0217:
            r17 = r6
            int r4 = A03(r13, r14, r15, r16, r17, r18)
            java.lang.Object r0 = r13.A02
            r3.add(r0)
            if (r4 >= r6) goto L_0x02dd
            int r16 = X.C203009n7.A02(r13, r15, r4)
            int r0 = r13.A00
            if (r5 != r0) goto L_0x02dd
            goto L_0x0217
        L_0x022d:
            if (r9 != r1) goto L_0x02c4
            int r4 = X.C203009n7.A02(r13, r15, r4)
            int r1 = r13.A00
            int r1 = r1 + r4
            if (r4 >= r1) goto L_0x0242
            X.C203009n7.A02(r13, r15, r4)
            java.lang.String r0 = "zzac"
            java.lang.NullPointerException r1 = X.AnonymousClass001.A0A(r0)
            throw r1
        L_0x0242:
            if (r4 != r1) goto L_0x02bc
            X.8DG r7 = (X.AnonymousClass8DG) r7
            X.9js r6 = r7.zzjp
            X.9js r1 = X.C201559js.A05
            if (r6 != r1) goto L_0x024d
            r6 = 0
        L_0x024d:
            java.lang.Object[] r1 = r0.A03
            int r0 = r28 / 4
            int r0 = r0 << 1
            int r0 = r0 + 1
            r8 = r1[r0]
            X.Axj r8 = (X.C22888Axj) r8
            java.lang.Class r0 = X.C203819ov.A03
            if (r8 == 0) goto L_0x02d9
            boolean r0 = r3 instanceof java.util.RandomAccess
            if (r0 == 0) goto L_0x0293
            int r10 = r3.size()
            r9 = 0
            r5 = 0
        L_0x0267:
            if (r9 >= r10) goto L_0x02d0
            int r1 = X.C36351kA.A06(r3, r9)
            X.AwB r0 = r8.ByR(r1)
            if (r0 == 0) goto L_0x0281
            if (r9 == r5) goto L_0x027c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r3.set(r5, r0)
        L_0x027c:
            int r5 = r5 + 1
        L_0x027e:
            int r9 = r9 + 1
            goto L_0x0267
        L_0x0281:
            if (r6 != 0) goto L_0x0288
            X.9js r6 = new X.9js
            r6.<init>()
        L_0x0288:
            long r0 = (long) r1
            int r2 = r26 << 3
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.A01(r2, r0)
            goto L_0x027e
        L_0x0293:
            java.util.Iterator r5 = r3.iterator()
        L_0x0297:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x02d9
            int r1 = X.C36341k9.A0A(r5)
            X.AwB r0 = r8.ByR(r1)
            if (r0 != 0) goto L_0x0297
            if (r6 != 0) goto L_0x02ae
            X.9js r6 = new X.9js
            r6.<init>()
        L_0x02ae:
            long r2 = (long) r1
            int r1 = r26 << 3
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r6.A01(r1, r0)
            r5.remove()
            goto L_0x0297
        L_0x02bc:
            java.lang.String r0 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            X.8xd r1 = new X.8xd
            r1.<init>(r0)
            throw r1
        L_0x02c4:
            if (r27 != 0) goto L_0x02dd
            X.C203009n7.A02(r13, r15, r4)
            java.lang.String r0 = "zzac"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x02d0:
            if (r5 == r10) goto L_0x02d9
            java.util.List r0 = r3.subList(r5, r10)
            r0.clear()
        L_0x02d9:
            if (r6 == 0) goto L_0x02dd
            r7.zzjp = r6
        L_0x02dd:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21015A3e.A06(X.9Je, java.lang.Object, byte[], int, int, int, int, int, int, int, long, long):int");
    }

    public static int A08(Object obj) {
        Class cls = C203819ov.A03;
        return ((List) obj).size();
    }

    private final B3S A0A(int i) {
        int i2 = (i / 4) << 1;
        Object[] objArr = this.A03;
        B3S b3s = (B3S) objArr[i2];
        if (b3s != null) {
            return b3s;
        }
        B3S A002 = C198719e5.A02.A00((Class) objArr[i2 + 1]);
        objArr[i2] = A002;
        return A002;
    }

    public static void A0C(C22890Axl axl, Object obj, int i) {
        if (obj instanceof String) {
            ((C21017A3g) axl).A00.A08(i, (String) obj);
            return;
        }
        ((C21017A3g) axl).A00.A0B((AUv) obj, i);
    }

    private final boolean A0D(Object obj, int i) {
        boolean z = this.A01;
        int[] iArr = this.A02;
        if (z) {
            int i2 = iArr[i + 1];
            long j = (long) (i2 & 1048575);
            switch (C165587tf.A02(i2)) {
                case 0:
                    if (C203609oO.A02.A02(obj, j) != 0.0d) {
                        return true;
                    }
                    break;
                case 1:
                    if (C203609oO.A02.A03(obj, j) != 0.0f) {
                        return true;
                    }
                    break;
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    if (C203609oO.A02.A05(obj, j) != 0) {
                        return true;
                    }
                    break;
                case 4:
                case 6:
                case 11:
                case 12:
                case 13:
                case 15:
                    if (C203609oO.A02.A04(obj, j) != 0) {
                        return true;
                    }
                    break;
                case 7:
                    return C203609oO.A02.A0F(obj, j);
                case 8:
                    Object A012 = C203609oO.A01(obj, j);
                    if (A012 instanceof String) {
                        if (!((String) A012).isEmpty()) {
                            return true;
                        }
                    } else if (!(A012 instanceof AUv)) {
                        throw C165617ti.A0U();
                    } else if (!AUv.A00.equals(A012)) {
                        return true;
                    }
                    break;
                case 9:
                case 17:
                    if (C203609oO.A01(obj, j) != null) {
                        return true;
                    }
                    break;
                case 10:
                    if (!AUv.A00.equals(C203609oO.A01(obj, j))) {
                        return true;
                    }
                    break;
                default:
                    throw C165617ti.A0U();
            }
        } else {
            int i3 = iArr[i + 2];
            if ((C203609oO.A02.A04(obj, (long) (i3 & 1048575)) & (1 << (i3 >>> 20))) != 0) {
                return true;
            }
        }
        return false;
    }

    private final boolean A0E(Object obj, int i, int i2) {
        return AnonymousClass000.A1S(C203609oO.A02.A04(obj, C165577te.A0H(this.A02, i2)), i);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0077, code lost:
        if (r3 == r0) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0079, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean B6j(java.lang.Object r11, java.lang.Object r12) {
        /*
            r10 = this;
            int[] r7 = r10.A02
            int r6 = r7.length
            r9 = 0
            r5 = 0
        L_0x0005:
            r2 = 1
            if (r5 >= r6) goto L_0x007a
            int r0 = r5 + 1
            r4 = r7[r0]
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r4 & r3
            long r1 = (long) r0
            int r0 = X.C165587tf.A02(r4)
            switch(r0) {
                case 0: goto L_0x0089;
                case 1: goto L_0x002f;
                case 2: goto L_0x0089;
                case 3: goto L_0x0089;
                case 4: goto L_0x002f;
                case 5: goto L_0x0089;
                case 6: goto L_0x002f;
                case 7: goto L_0x0063;
                case 8: goto L_0x0044;
                case 9: goto L_0x0044;
                case 10: goto L_0x0044;
                case 11: goto L_0x002f;
                case 12: goto L_0x002f;
                case 13: goto L_0x002f;
                case 14: goto L_0x0089;
                case 15: goto L_0x002f;
                case 16: goto L_0x0089;
                case 17: goto L_0x0044;
                case 18: goto L_0x004e;
                case 19: goto L_0x004e;
                case 20: goto L_0x004e;
                case 21: goto L_0x004e;
                case 22: goto L_0x004e;
                case 23: goto L_0x004e;
                case 24: goto L_0x004e;
                case 25: goto L_0x004e;
                case 26: goto L_0x004e;
                case 27: goto L_0x004e;
                case 28: goto L_0x004e;
                case 29: goto L_0x004e;
                case 30: goto L_0x004e;
                case 31: goto L_0x004e;
                case 32: goto L_0x004e;
                case 33: goto L_0x004e;
                case 34: goto L_0x004e;
                case 35: goto L_0x004e;
                case 36: goto L_0x004e;
                case 37: goto L_0x004e;
                case 38: goto L_0x004e;
                case 39: goto L_0x004e;
                case 40: goto L_0x004e;
                case 41: goto L_0x004e;
                case 42: goto L_0x004e;
                case 43: goto L_0x004e;
                case 44: goto L_0x004e;
                case 45: goto L_0x004e;
                case 46: goto L_0x004e;
                case 47: goto L_0x004e;
                case 48: goto L_0x004e;
                case 49: goto L_0x004e;
                case 50: goto L_0x004e;
                case 51: goto L_0x001c;
                case 52: goto L_0x001c;
                case 53: goto L_0x001c;
                case 54: goto L_0x001c;
                case 55: goto L_0x001c;
                case 56: goto L_0x001c;
                case 57: goto L_0x001c;
                case 58: goto L_0x001c;
                case 59: goto L_0x001c;
                case 60: goto L_0x001c;
                case 61: goto L_0x001c;
                case 62: goto L_0x001c;
                case 63: goto L_0x001c;
                case 64: goto L_0x001c;
                case 65: goto L_0x001c;
                case 66: goto L_0x001c;
                case 67: goto L_0x001c;
                case 68: goto L_0x001c;
                default: goto L_0x0019;
            }
        L_0x0019:
            int r5 = r5 + 4
            goto L_0x0005
        L_0x001c:
            int r0 = r5 + 2
            r0 = r7[r0]
            r0 = r0 & r3
            long r3 = (long) r0
            X.9Yh r0 = X.C203609oO.A02
            int r8 = r0.A04(r11, r3)
            int r0 = r0.A04(r12, r3)
            if (r8 != r0) goto L_0x00a1
            goto L_0x004e
        L_0x002f:
            boolean r3 = r10.A0D(r11, r5)
            boolean r0 = r10.A0D(r12, r5)
            if (r3 != r0) goto L_0x00a1
            X.9Yh r0 = X.C203609oO.A02
            int r3 = r0.A04(r11, r1)
            int r0 = r0.A04(r12, r1)
            goto L_0x0077
        L_0x0044:
            boolean r3 = r10.A0D(r11, r5)
            boolean r0 = r10.A0D(r12, r5)
            if (r3 != r0) goto L_0x00a1
        L_0x004e:
            java.lang.Object r3 = X.C203609oO.A01(r11, r1)
            java.lang.Object r1 = X.C203609oO.A01(r12, r1)
            java.lang.Class r0 = X.C203819ov.A03
            if (r3 == r1) goto L_0x0019
            if (r3 == 0) goto L_0x00a1
            boolean r0 = r3.equals(r1)
            if (r0 == 0) goto L_0x00a1
            goto L_0x0019
        L_0x0063:
            boolean r3 = r10.A0D(r11, r5)
            boolean r0 = r10.A0D(r12, r5)
            if (r3 != r0) goto L_0x00a1
            X.9Yh r0 = X.C203609oO.A02
            boolean r3 = r0.A0F(r11, r1)
            boolean r0 = r0.A0F(r12, r1)
        L_0x0077:
            if (r3 == r0) goto L_0x0019
            return r9
        L_0x007a:
            X.8DG r11 = (X.AnonymousClass8DG) r11
            X.9js r1 = r11.zzjp
            X.8DG r12 = (X.AnonymousClass8DG) r12
            X.9js r0 = r12.zzjp
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00a1
            return r2
        L_0x0089:
            boolean r3 = r10.A0D(r11, r5)
            boolean r0 = r10.A0D(r12, r5)
            if (r3 != r0) goto L_0x00a1
            X.9Yh r0 = X.C203609oO.A02
            long r3 = r0.A05(r11, r1)
            long r1 = r0.A05(r12, r1)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0019
        L_0x00a1:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21015A3e.B6j(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006b, code lost:
        r1 = java.lang.Double.doubleToLongBits(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0081, code lost:
        r0 = java.lang.Float.floatToIntBits(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00bc, code lost:
        r0 = X.C197079b6.A04;
        r0 = X.C36341k9.A01(r1 ? 1 : 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c9, code lost:
        r6 = r6 * 53;
        r0 = ((java.lang.String) X.C203609oO.A01(r10, r1)).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001b, code lost:
        r3 = r3 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0106, code lost:
        r6 = r6 * 53;
        r0 = X.AnonymousClass000.A0I(X.C203609oO.A01(r10, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0117, code lost:
        r6 = r6 * 53;
        r1 = A09(r10, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x011d, code lost:
        r0 = X.C197079b6.A04;
        r0 = X.AnonymousClass000.A08(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x012a, code lost:
        r6 = r6 * 53;
        r0 = X.C203609oO.A01(r10, r1).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0134, code lost:
        r6 = r6 + r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int BK8(java.lang.Object r10) {
        /*
            r9 = this;
            int[] r5 = r9.A02
            int r4 = r5.length
            r3 = 0
            r6 = 0
        L_0x0005:
            if (r3 >= r4) goto L_0x0137
            int r0 = r3 + 1
            r7 = r5[r0]
            r8 = r5[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r7
            long r1 = (long) r0
            int r0 = X.C165587tf.A02(r7)
            r7 = 37
            switch(r0) {
                case 0: goto L_0x001e;
                case 1: goto L_0x0027;
                case 2: goto L_0x0030;
                case 3: goto L_0x0030;
                case 4: goto L_0x003a;
                case 5: goto L_0x0030;
                case 6: goto L_0x003a;
                case 7: goto L_0x0044;
                case 8: goto L_0x00c9;
                case 9: goto L_0x004d;
                case 10: goto L_0x012a;
                case 11: goto L_0x003a;
                case 12: goto L_0x003a;
                case 13: goto L_0x003a;
                case 14: goto L_0x0030;
                case 15: goto L_0x003a;
                case 16: goto L_0x0030;
                case 17: goto L_0x004d;
                case 18: goto L_0x012a;
                case 19: goto L_0x012a;
                case 20: goto L_0x012a;
                case 21: goto L_0x012a;
                case 22: goto L_0x012a;
                case 23: goto L_0x012a;
                case 24: goto L_0x012a;
                case 25: goto L_0x012a;
                case 26: goto L_0x012a;
                case 27: goto L_0x012a;
                case 28: goto L_0x012a;
                case 29: goto L_0x012a;
                case 30: goto L_0x012a;
                case 31: goto L_0x012a;
                case 32: goto L_0x012a;
                case 33: goto L_0x012a;
                case 34: goto L_0x012a;
                case 35: goto L_0x012a;
                case 36: goto L_0x012a;
                case 37: goto L_0x012a;
                case 38: goto L_0x012a;
                case 39: goto L_0x012a;
                case 40: goto L_0x012a;
                case 41: goto L_0x012a;
                case 42: goto L_0x012a;
                case 43: goto L_0x012a;
                case 44: goto L_0x012a;
                case 45: goto L_0x012a;
                case 46: goto L_0x012a;
                case 47: goto L_0x012a;
                case 48: goto L_0x012a;
                case 49: goto L_0x012a;
                case 50: goto L_0x012a;
                case 51: goto L_0x005b;
                case 52: goto L_0x0071;
                case 53: goto L_0x0087;
                case 54: goto L_0x008f;
                case 55: goto L_0x0097;
                case 56: goto L_0x009e;
                case 57: goto L_0x00a5;
                case 58: goto L_0x00ac;
                case 59: goto L_0x00c3;
                case 60: goto L_0x00d6;
                case 61: goto L_0x00dd;
                case 62: goto L_0x00e4;
                case 63: goto L_0x00eb;
                case 64: goto L_0x00f2;
                case 65: goto L_0x00f9;
                case 66: goto L_0x0100;
                case 67: goto L_0x0111;
                case 68: goto L_0x0124;
                default: goto L_0x001b;
            }
        L_0x001b:
            int r3 = r3 + 4
            goto L_0x0005
        L_0x001e:
            int r6 = r6 * 53
            X.9Yh r0 = X.C203609oO.A02
            double r0 = r0.A02(r10, r1)
            goto L_0x006b
        L_0x0027:
            int r6 = r6 * 53
            X.9Yh r0 = X.C203609oO.A02
            float r0 = r0.A03(r10, r1)
            goto L_0x0081
        L_0x0030:
            int r6 = r6 * 53
            X.9Yh r0 = X.C203609oO.A02
            long r1 = r0.A05(r10, r1)
            goto L_0x011d
        L_0x003a:
            int r6 = r6 * 53
            X.9Yh r0 = X.C203609oO.A02
            int r0 = r0.A04(r10, r1)
            goto L_0x0134
        L_0x0044:
            int r6 = r6 * 53
            X.9Yh r0 = X.C203609oO.A02
            boolean r1 = r0.A0F(r10, r1)
            goto L_0x00bc
        L_0x004d:
            java.lang.Object r0 = X.C203609oO.A01(r10, r1)
            if (r0 == 0) goto L_0x0057
            int r7 = r0.hashCode()
        L_0x0057:
            int r6 = r6 * 53
            int r6 = r6 + r7
            goto L_0x001b
        L_0x005b:
            boolean r0 = r9.A0E(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            int r6 = r6 * 53
            java.lang.Object r0 = X.C203609oO.A01(r10, r1)
            double r0 = X.C90504aG.A01(r0)
        L_0x006b:
            long r1 = java.lang.Double.doubleToLongBits(r0)
            goto L_0x011d
        L_0x0071:
            boolean r0 = r9.A0E(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            int r6 = r6 * 53
            java.lang.Object r0 = X.C203609oO.A01(r10, r1)
            float r0 = X.C36441kJ.A03(r0)
        L_0x0081:
            int r0 = java.lang.Float.floatToIntBits(r0)
            goto L_0x0134
        L_0x0087:
            boolean r0 = r9.A0E(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x0117
        L_0x008f:
            boolean r0 = r9.A0E(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x0117
        L_0x0097:
            boolean r0 = r9.A0E(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x0106
        L_0x009e:
            boolean r0 = r9.A0E(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x0117
        L_0x00a5:
            boolean r0 = r9.A0E(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x0106
        L_0x00ac:
            boolean r0 = r9.A0E(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            int r6 = r6 * 53
            java.lang.Object r0 = X.C203609oO.A01(r10, r1)
            boolean r1 = X.AnonymousClass000.A1X(r0)
        L_0x00bc:
            java.nio.charset.Charset r0 = X.C197079b6.A04
            int r0 = X.C36341k9.A01(r1)
            goto L_0x0134
        L_0x00c3:
            boolean r0 = r9.A0E(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
        L_0x00c9:
            int r6 = r6 * 53
            java.lang.Object r0 = X.C203609oO.A01(r10, r1)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r0.hashCode()
            goto L_0x0134
        L_0x00d6:
            boolean r0 = r9.A0E(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x012a
        L_0x00dd:
            boolean r0 = r9.A0E(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x012a
        L_0x00e4:
            boolean r0 = r9.A0E(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x0106
        L_0x00eb:
            boolean r0 = r9.A0E(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x0106
        L_0x00f2:
            boolean r0 = r9.A0E(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x0106
        L_0x00f9:
            boolean r0 = r9.A0E(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x0117
        L_0x0100:
            boolean r0 = r9.A0E(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
        L_0x0106:
            int r6 = r6 * 53
            java.lang.Object r0 = X.C203609oO.A01(r10, r1)
            int r0 = X.AnonymousClass000.A0I(r0)
            goto L_0x0134
        L_0x0111:
            boolean r0 = r9.A0E(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
        L_0x0117:
            int r6 = r6 * 53
            long r1 = A09(r10, r1)
        L_0x011d:
            java.nio.charset.Charset r0 = X.C197079b6.A04
            int r0 = X.AnonymousClass000.A08(r1)
            goto L_0x0134
        L_0x0124:
            boolean r0 = r9.A0E(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
        L_0x012a:
            int r6 = r6 * 53
            java.lang.Object r0 = X.C203609oO.A01(r10, r1)
            int r0 = r0.hashCode()
        L_0x0134:
            int r6 = r6 + r0
            goto L_0x001b
        L_0x0137:
            int r1 = r6 * 53
            X.8DG r10 = (X.AnonymousClass8DG) r10
            X.9js r0 = r10.zzjp
            int r0 = X.C36401kF.A02(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21015A3e.BK8(java.lang.Object):int");
    }

    public final Object BQ9() {
        return ((AnonymousClass8DG) this.A09).A06(4);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02d6, code lost:
        ((X.C21017A3g) r6).A00.A07(r7, java.lang.Double.doubleToRawLongBits(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02f5, code lost:
        ((X.C21017A3g) r6).A00.A06(r7, java.lang.Float.floatToRawIntBits(r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0310, code lost:
        X.C194279Ox.A06(((X.C21017A3g) r6).A00, r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0327, code lost:
        X.C194279Ox.A06(((X.C21017A3g) r6).A00, r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0342, code lost:
        ((X.C21017A3g) r6).A00.A05(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0359, code lost:
        ((X.C21017A3g) r6).A00.A07(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0374, code lost:
        ((X.C21017A3g) r6).A00.A06(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x038f, code lost:
        r1 = ((X.C21017A3g) r6).A00;
        r1.A03(r7 << 3);
        r1.A02(r11 ? (byte) 1 : 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x03a5, code lost:
        A0C(r6, X.C203609oO.A01(r5, (long) (r1 & 1048575)), r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x03b7, code lost:
        r11 = X.C203609oO.A01(r5, (long) (r1 & 1048575));
        ((X.C21017A3g) r6).A00.A0C((X.C23118B5x) r11, A0A(r2), r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x03d4, code lost:
        ((X.C21017A3g) r6).A00.A0B((X.AUv) X.C203609oO.A01(r5, (long) (r1 & 1048575)), r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x03f8, code lost:
        r1 = ((X.C21017A3g) r6).A00;
        r1.A03(r7 << 3);
        r1.A03(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0418, code lost:
        ((X.C21017A3g) r6).A00.A05(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0433, code lost:
        ((X.C21017A3g) r6).A00.A06(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x044a, code lost:
        ((X.C21017A3g) r6).A00.A07(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0465, code lost:
        X.C194279Ox.A05(((X.C21017A3g) r6).A00, r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x047c, code lost:
        X.C194279Ox.A06(((X.C21017A3g) r6).A00, r7, (r0 >> 63) ^ (r0 << 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0492, code lost:
        r6.ByY(A0A(r2), X.C203609oO.A01(r5, (long) (r1 & 1048575)), r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x04d3, code lost:
        r3 = r3 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x06db, code lost:
        X.C203819ov.A0B(r6, (java.util.List) r7.getObject(r5, r0), r8[r3], r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x06e9, code lost:
        X.C203819ov.A0C(r6, (java.util.List) r7.getObject(r5, r0), r8[r3], r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x06f7, code lost:
        X.C203819ov.A0D(r6, (java.util.List) r7.getObject(r5, r0), r8[r3], r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0705, code lost:
        X.C203819ov.A0E(r6, (java.util.List) r7.getObject(r5, r0), r8[r3], r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0713, code lost:
        X.C203819ov.A0I(r6, (java.util.List) r7.getObject(r5, r0), r8[r3], r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0721, code lost:
        X.C203819ov.A0G(r6, (java.util.List) r7.getObject(r5, r0), r8[r3], r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x0811, code lost:
        X.C194279Ox.A06(((X.C21017A3g) r6).A00, r2, A09(r5, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x08c3, code lost:
        ((X.C21017A3g) r6).A00.A05(r2, X.AnonymousClass000.A0I(X.C203609oO.A01(r5, r0)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x08db, code lost:
        ((X.C21017A3g) r6).A00.A06(r2, X.AnonymousClass000.A0I(X.C203609oO.A01(r5, r0)));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ByM(X.C22890Axl r21, java.lang.Object r22) {
        /*
            r20 = this;
            r5 = r22
            r18 = 267386880(0xff00000, float:2.3665827E-29)
            r9 = 1
            r10 = 0
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r20
            boolean r0 = r4.A01
            r6 = r21
            if (r0 == 0) goto L_0x04a2
            int[] r3 = r4.A02
            int r8 = r3.length
            r2 = 0
        L_0x0015:
            if (r2 >= r8) goto L_0x0949
            int r0 = r2 + 1
            r1 = r3[r0]
            r7 = r3[r2]
            r0 = r1 & r18
            int r0 = r0 >>> 20
            switch(r0) {
                case 0: goto L_0x0027;
                case 1: goto L_0x0038;
                case 2: goto L_0x0049;
                case 3: goto L_0x005a;
                case 4: goto L_0x006b;
                case 5: goto L_0x007c;
                case 6: goto L_0x008d;
                case 7: goto L_0x009e;
                case 8: goto L_0x00af;
                case 9: goto L_0x00b7;
                case 10: goto L_0x00bf;
                case 11: goto L_0x00c7;
                case 12: goto L_0x00d8;
                case 13: goto L_0x00e9;
                case 14: goto L_0x00fa;
                case 15: goto L_0x010b;
                case 16: goto L_0x011c;
                case 17: goto L_0x012d;
                case 18: goto L_0x0135;
                case 19: goto L_0x0140;
                case 20: goto L_0x014b;
                case 21: goto L_0x0156;
                case 22: goto L_0x0161;
                case 23: goto L_0x016c;
                case 24: goto L_0x0177;
                case 25: goto L_0x0182;
                case 26: goto L_0x018d;
                case 27: goto L_0x0198;
                case 28: goto L_0x01a7;
                case 29: goto L_0x01b2;
                case 30: goto L_0x01bd;
                case 31: goto L_0x01c8;
                case 32: goto L_0x01d3;
                case 33: goto L_0x01de;
                case 34: goto L_0x01e9;
                case 35: goto L_0x01f4;
                case 36: goto L_0x01ff;
                case 37: goto L_0x020a;
                case 38: goto L_0x0215;
                case 39: goto L_0x0220;
                case 40: goto L_0x022b;
                case 41: goto L_0x0236;
                case 42: goto L_0x0241;
                case 43: goto L_0x024c;
                case 44: goto L_0x0257;
                case 45: goto L_0x0262;
                case 46: goto L_0x026d;
                case 47: goto L_0x0278;
                case 48: goto L_0x0283;
                case 49: goto L_0x028e;
                case 50: goto L_0x02b6;
                case 51: goto L_0x02c5;
                case 52: goto L_0x02e4;
                case 53: goto L_0x0303;
                case 54: goto L_0x031a;
                case 55: goto L_0x0331;
                case 56: goto L_0x034c;
                case 57: goto L_0x0363;
                case 58: goto L_0x037e;
                case 59: goto L_0x039f;
                case 60: goto L_0x03b1;
                case 61: goto L_0x03ce;
                case 62: goto L_0x03e7;
                case 63: goto L_0x0407;
                case 64: goto L_0x0422;
                case 65: goto L_0x043d;
                case 66: goto L_0x0454;
                case 67: goto L_0x046f;
                case 68: goto L_0x048c;
                default: goto L_0x0024;
            }
        L_0x0024:
            int r2 = r2 + 4
            goto L_0x0015
        L_0x0027:
            boolean r0 = r4.A0D(r5, r2)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            X.9Yh r11 = X.C203609oO.A02
            double r12 = r11.A02(r5, r0)
            goto L_0x02d6
        L_0x0038:
            boolean r0 = r4.A0D(r5, r2)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            X.9Yh r11 = X.C203609oO.A02
            float r11 = r11.A03(r5, r0)
            goto L_0x02f5
        L_0x0049:
            boolean r0 = r4.A0D(r5, r2)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            X.9Yh r11 = X.C203609oO.A02
            long r0 = r11.A05(r5, r0)
            goto L_0x0310
        L_0x005a:
            boolean r0 = r4.A0D(r5, r2)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            X.9Yh r11 = X.C203609oO.A02
            long r0 = r11.A05(r5, r0)
            goto L_0x0327
        L_0x006b:
            boolean r0 = r4.A0D(r5, r2)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            X.9Yh r11 = X.C203609oO.A02
            int r1 = r11.A04(r5, r0)
            goto L_0x0342
        L_0x007c:
            boolean r0 = r4.A0D(r5, r2)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            X.9Yh r11 = X.C203609oO.A02
            long r0 = r11.A05(r5, r0)
            goto L_0x0359
        L_0x008d:
            boolean r0 = r4.A0D(r5, r2)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            X.9Yh r11 = X.C203609oO.A02
            int r1 = r11.A04(r5, r0)
            goto L_0x0374
        L_0x009e:
            boolean r0 = r4.A0D(r5, r2)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            X.9Yh r11 = X.C203609oO.A02
            boolean r11 = r11.A0F(r5, r0)
            goto L_0x038f
        L_0x00af:
            boolean r0 = r4.A0D(r5, r2)
            if (r0 == 0) goto L_0x0024
            goto L_0x03a5
        L_0x00b7:
            boolean r0 = r4.A0D(r5, r2)
            if (r0 == 0) goto L_0x0024
            goto L_0x03b7
        L_0x00bf:
            boolean r0 = r4.A0D(r5, r2)
            if (r0 == 0) goto L_0x0024
            goto L_0x03d4
        L_0x00c7:
            boolean r0 = r4.A0D(r5, r2)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            X.9Yh r11 = X.C203609oO.A02
            int r11 = r11.A04(r5, r0)
            goto L_0x03f8
        L_0x00d8:
            boolean r0 = r4.A0D(r5, r2)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            X.9Yh r11 = X.C203609oO.A02
            int r1 = r11.A04(r5, r0)
            goto L_0x0418
        L_0x00e9:
            boolean r0 = r4.A0D(r5, r2)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            X.9Yh r11 = X.C203609oO.A02
            int r1 = r11.A04(r5, r0)
            goto L_0x0433
        L_0x00fa:
            boolean r0 = r4.A0D(r5, r2)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            X.9Yh r11 = X.C203609oO.A02
            long r0 = r11.A05(r5, r0)
            goto L_0x044a
        L_0x010b:
            boolean r0 = r4.A0D(r5, r2)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            X.9Yh r11 = X.C203609oO.A02
            int r1 = r11.A04(r5, r0)
            goto L_0x0465
        L_0x011c:
            boolean r0 = r4.A0D(r5, r2)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            X.9Yh r11 = X.C203609oO.A02
            long r0 = r11.A05(r5, r0)
            goto L_0x047c
        L_0x012d:
            boolean r0 = r4.A0D(r5, r2)
            if (r0 == 0) goto L_0x0024
            goto L_0x0492
        L_0x0135:
            r7 = r3[r2]
            java.util.List r0 = A0B(r1, r5)
            X.C203819ov.A0B(r6, r0, r7, r10)
            goto L_0x0024
        L_0x0140:
            r7 = r3[r2]
            java.util.List r0 = A0B(r1, r5)
            X.C203819ov.A0C(r6, r0, r7, r10)
            goto L_0x0024
        L_0x014b:
            r7 = r3[r2]
            java.util.List r0 = A0B(r1, r5)
            X.C203819ov.A0D(r6, r0, r7, r10)
            goto L_0x0024
        L_0x0156:
            r7 = r3[r2]
            java.util.List r0 = A0B(r1, r5)
            X.C203819ov.A0E(r6, r0, r7, r10)
            goto L_0x0024
        L_0x0161:
            r7 = r3[r2]
            java.util.List r0 = A0B(r1, r5)
            X.C203819ov.A0I(r6, r0, r7, r10)
            goto L_0x0024
        L_0x016c:
            r7 = r3[r2]
            java.util.List r0 = A0B(r1, r5)
            X.C203819ov.A0G(r6, r0, r7, r10)
            goto L_0x0024
        L_0x0177:
            r7 = r3[r2]
            java.util.List r0 = A0B(r1, r5)
            X.C203819ov.A0L(r6, r0, r7, r10)
            goto L_0x0024
        L_0x0182:
            r7 = r3[r2]
            java.util.List r0 = A0B(r1, r5)
            X.C203819ov.A0O(r6, r0, r7, r10)
            goto L_0x0024
        L_0x018d:
            r7 = r3[r2]
            java.util.List r0 = A0B(r1, r5)
            X.C203819ov.A09(r6, r0, r7)
            goto L_0x0024
        L_0x0198:
            r7 = r3[r2]
            java.util.List r1 = A0B(r1, r5)
            X.B3S r0 = r4.A0A(r2)
            X.C203819ov.A08(r0, r6, r1, r7)
            goto L_0x0024
        L_0x01a7:
            r7 = r3[r2]
            java.util.List r0 = A0B(r1, r5)
            X.C203819ov.A0A(r6, r0, r7)
            goto L_0x0024
        L_0x01b2:
            r7 = r3[r2]
            java.util.List r0 = A0B(r1, r5)
            X.C203819ov.A0J(r6, r0, r7, r10)
            goto L_0x0024
        L_0x01bd:
            r7 = r3[r2]
            java.util.List r0 = A0B(r1, r5)
            X.C203819ov.A0N(r6, r0, r7, r10)
            goto L_0x0024
        L_0x01c8:
            r7 = r3[r2]
            java.util.List r0 = A0B(r1, r5)
            X.C203819ov.A0M(r6, r0, r7, r10)
            goto L_0x0024
        L_0x01d3:
            r7 = r3[r2]
            java.util.List r0 = A0B(r1, r5)
            X.C203819ov.A0H(r6, r0, r7, r10)
            goto L_0x0024
        L_0x01de:
            r7 = r3[r2]
            java.util.List r0 = A0B(r1, r5)
            X.C203819ov.A0K(r6, r0, r7, r10)
            goto L_0x0024
        L_0x01e9:
            r7 = r3[r2]
            java.util.List r0 = A0B(r1, r5)
            X.C203819ov.A0F(r6, r0, r7, r10)
            goto L_0x0024
        L_0x01f4:
            r7 = r3[r2]
            java.util.List r0 = A0B(r1, r5)
            X.C203819ov.A0B(r6, r0, r7, r9)
            goto L_0x0024
        L_0x01ff:
            r7 = r3[r2]
            java.util.List r0 = A0B(r1, r5)
            X.C203819ov.A0C(r6, r0, r7, r9)
            goto L_0x0024
        L_0x020a:
            r7 = r3[r2]
            java.util.List r0 = A0B(r1, r5)
            X.C203819ov.A0D(r6, r0, r7, r9)
            goto L_0x0024
        L_0x0215:
            r7 = r3[r2]
            java.util.List r0 = A0B(r1, r5)
            X.C203819ov.A0E(r6, r0, r7, r9)
            goto L_0x0024
        L_0x0220:
            r7 = r3[r2]
            java.util.List r0 = A0B(r1, r5)
            X.C203819ov.A0I(r6, r0, r7, r9)
            goto L_0x0024
        L_0x022b:
            r7 = r3[r2]
            java.util.List r0 = A0B(r1, r5)
            X.C203819ov.A0G(r6, r0, r7, r9)
            goto L_0x0024
        L_0x0236:
            r7 = r3[r2]
            java.util.List r0 = A0B(r1, r5)
            X.C203819ov.A0L(r6, r0, r7, r9)
            goto L_0x0024
        L_0x0241:
            r7 = r3[r2]
            java.util.List r0 = A0B(r1, r5)
            X.C203819ov.A0O(r6, r0, r7, r9)
            goto L_0x0024
        L_0x024c:
            r7 = r3[r2]
            java.util.List r0 = A0B(r1, r5)
            X.C203819ov.A0J(r6, r0, r7, r9)
            goto L_0x0024
        L_0x0257:
            r7 = r3[r2]
            java.util.List r0 = A0B(r1, r5)
            X.C203819ov.A0N(r6, r0, r7, r9)
            goto L_0x0024
        L_0x0262:
            r7 = r3[r2]
            java.util.List r0 = A0B(r1, r5)
            X.C203819ov.A0M(r6, r0, r7, r9)
            goto L_0x0024
        L_0x026d:
            r7 = r3[r2]
            java.util.List r0 = A0B(r1, r5)
            X.C203819ov.A0H(r6, r0, r7, r9)
            goto L_0x0024
        L_0x0278:
            r7 = r3[r2]
            java.util.List r0 = A0B(r1, r5)
            X.C203819ov.A0K(r6, r0, r7, r9)
            goto L_0x0024
        L_0x0283:
            r7 = r3[r2]
            java.util.List r0 = A0B(r1, r5)
            X.C203819ov.A0F(r6, r0, r7, r9)
            goto L_0x0024
        L_0x028e:
            r12 = r3[r2]
            java.util.List r13 = A0B(r1, r5)
            X.B3S r11 = r4.A0A(r2)
            java.lang.Class r0 = X.C203819ov.A03
            if (r13 == 0) goto L_0x0024
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L_0x0024
            r7 = r6
            X.A3g r7 = (X.C21017A3g) r7
            r1 = 0
        L_0x02a6:
            int r0 = r13.size()
            if (r1 >= r0) goto L_0x0024
            java.lang.Object r0 = r13.get(r1)
            r7.ByY(r11, r0, r12)
            int r1 = r1 + 1
            goto L_0x02a6
        L_0x02b6:
            r1 = r1 & r17
            long r0 = (long) r1
            java.lang.Object r0 = X.C203609oO.A01(r5, r0)
            if (r0 == 0) goto L_0x0024
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        L_0x02c5:
            boolean r0 = r4.A0E(r5, r7, r2)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            java.lang.Object r0 = X.C203609oO.A01(r5, r0)
            double r12 = X.C90504aG.A01(r0)
        L_0x02d6:
            r0 = r6
            X.A3g r0 = (X.C21017A3g) r0
            X.8D7 r11 = r0.A00
            long r0 = java.lang.Double.doubleToRawLongBits(r12)
            r11.A07(r7, r0)
            goto L_0x0024
        L_0x02e4:
            boolean r0 = r4.A0E(r5, r7, r2)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            java.lang.Object r0 = X.C203609oO.A01(r5, r0)
            float r11 = X.C36441kJ.A03(r0)
        L_0x02f5:
            r0 = r6
            X.A3g r0 = (X.C21017A3g) r0
            X.8D7 r1 = r0.A00
            int r0 = java.lang.Float.floatToRawIntBits(r11)
            r1.A06(r7, r0)
            goto L_0x0024
        L_0x0303:
            boolean r0 = r4.A0E(r5, r7, r2)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            long r0 = A09(r5, r0)
        L_0x0310:
            r11 = r6
            X.A3g r11 = (X.C21017A3g) r11
            X.8D7 r11 = r11.A00
            X.C194279Ox.A06(r11, r7, r0)
            goto L_0x0024
        L_0x031a:
            boolean r0 = r4.A0E(r5, r7, r2)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            long r0 = A09(r5, r0)
        L_0x0327:
            r11 = r6
            X.A3g r11 = (X.C21017A3g) r11
            X.8D7 r11 = r11.A00
            X.C194279Ox.A06(r11, r7, r0)
            goto L_0x0024
        L_0x0331:
            boolean r0 = r4.A0E(r5, r7, r2)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            java.lang.Object r0 = X.C203609oO.A01(r5, r0)
            int r1 = X.AnonymousClass000.A0I(r0)
        L_0x0342:
            r0 = r6
            X.A3g r0 = (X.C21017A3g) r0
            X.8D7 r0 = r0.A00
            r0.A05(r7, r1)
            goto L_0x0024
        L_0x034c:
            boolean r0 = r4.A0E(r5, r7, r2)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            long r0 = A09(r5, r0)
        L_0x0359:
            r11 = r6
            X.A3g r11 = (X.C21017A3g) r11
            X.8D7 r11 = r11.A00
            r11.A07(r7, r0)
            goto L_0x0024
        L_0x0363:
            boolean r0 = r4.A0E(r5, r7, r2)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            java.lang.Object r0 = X.C203609oO.A01(r5, r0)
            int r1 = X.AnonymousClass000.A0I(r0)
        L_0x0374:
            r0 = r6
            X.A3g r0 = (X.C21017A3g) r0
            X.8D7 r0 = r0.A00
            r0.A06(r7, r1)
            goto L_0x0024
        L_0x037e:
            boolean r0 = r4.A0E(r5, r7, r2)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            java.lang.Object r0 = X.C203609oO.A01(r5, r0)
            boolean r11 = X.AnonymousClass000.A1X(r0)
        L_0x038f:
            r0 = r6
            X.A3g r0 = (X.C21017A3g) r0
            X.8D7 r1 = r0.A00
            int r0 = r7 << 3
            r1.A03(r0)
            byte r0 = (byte) r11
            r1.A02(r0)
            goto L_0x0024
        L_0x039f:
            boolean r0 = r4.A0E(r5, r7, r2)
            if (r0 == 0) goto L_0x0024
        L_0x03a5:
            r1 = r1 & r17
            long r0 = (long) r1
            java.lang.Object r0 = X.C203609oO.A01(r5, r0)
            A0C(r6, r0, r7)
            goto L_0x0024
        L_0x03b1:
            boolean r0 = r4.A0E(r5, r7, r2)
            if (r0 == 0) goto L_0x0024
        L_0x03b7:
            r1 = r1 & r17
            long r0 = (long) r1
            java.lang.Object r11 = X.C203609oO.A01(r5, r0)
            X.B3S r1 = r4.A0A(r2)
            r0 = r6
            X.A3g r0 = (X.C21017A3g) r0
            X.8D7 r0 = r0.A00
            X.B5x r11 = (X.C23118B5x) r11
            r0.A0C(r11, r1, r7)
            goto L_0x0024
        L_0x03ce:
            boolean r0 = r4.A0E(r5, r7, r2)
            if (r0 == 0) goto L_0x0024
        L_0x03d4:
            r1 = r1 & r17
            long r0 = (long) r1
            java.lang.Object r1 = X.C203609oO.A01(r5, r0)
            X.AUv r1 = (X.AUv) r1
            r0 = r6
            X.A3g r0 = (X.C21017A3g) r0
            X.8D7 r0 = r0.A00
            r0.A0B(r1, r7)
            goto L_0x0024
        L_0x03e7:
            boolean r0 = r4.A0E(r5, r7, r2)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            java.lang.Object r0 = X.C203609oO.A01(r5, r0)
            int r11 = X.AnonymousClass000.A0I(r0)
        L_0x03f8:
            r0 = r6
            X.A3g r0 = (X.C21017A3g) r0
            X.8D7 r1 = r0.A00
            int r0 = r7 << 3
            r1.A03(r0)
            r1.A03(r11)
            goto L_0x0024
        L_0x0407:
            boolean r0 = r4.A0E(r5, r7, r2)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            java.lang.Object r0 = X.C203609oO.A01(r5, r0)
            int r1 = X.AnonymousClass000.A0I(r0)
        L_0x0418:
            r0 = r6
            X.A3g r0 = (X.C21017A3g) r0
            X.8D7 r0 = r0.A00
            r0.A05(r7, r1)
            goto L_0x0024
        L_0x0422:
            boolean r0 = r4.A0E(r5, r7, r2)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            java.lang.Object r0 = X.C203609oO.A01(r5, r0)
            int r1 = X.AnonymousClass000.A0I(r0)
        L_0x0433:
            r0 = r6
            X.A3g r0 = (X.C21017A3g) r0
            X.8D7 r0 = r0.A00
            r0.A06(r7, r1)
            goto L_0x0024
        L_0x043d:
            boolean r0 = r4.A0E(r5, r7, r2)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            long r0 = A09(r5, r0)
        L_0x044a:
            r11 = r6
            X.A3g r11 = (X.C21017A3g) r11
            X.8D7 r11 = r11.A00
            r11.A07(r7, r0)
            goto L_0x0024
        L_0x0454:
            boolean r0 = r4.A0E(r5, r7, r2)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            java.lang.Object r0 = X.C203609oO.A01(r5, r0)
            int r1 = X.AnonymousClass000.A0I(r0)
        L_0x0465:
            r0 = r6
            X.A3g r0 = (X.C21017A3g) r0
            X.8D7 r0 = r0.A00
            X.C194279Ox.A05(r0, r1, r7)
            goto L_0x0024
        L_0x046f:
            boolean r0 = r4.A0E(r5, r7, r2)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            long r0 = A09(r5, r0)
        L_0x047c:
            r11 = r6
            X.A3g r11 = (X.C21017A3g) r11
            X.8D7 r12 = r11.A00
            long r13 = r0 << r9
            r11 = 63
            long r0 = r0 >> r11
            long r0 = r0 ^ r13
            X.C194279Ox.A06(r12, r7, r0)
            goto L_0x0024
        L_0x048c:
            boolean r0 = r4.A0E(r5, r7, r2)
            if (r0 == 0) goto L_0x0024
        L_0x0492:
            r1 = r1 & r17
            long r0 = (long) r1
            java.lang.Object r1 = X.C203609oO.A01(r5, r0)
            X.B3S r0 = r4.A0A(r2)
            r6.ByY(r0, r1, r7)
            goto L_0x0024
        L_0x04a2:
            r11 = -1
            int[] r8 = r4.A02
            int r12 = r8.length
            sun.misc.Unsafe r7 = A0F
            r3 = 0
            r19 = 0
        L_0x04ab:
            if (r3 >= r12) goto L_0x0949
            int r0 = r3 + 1
            r15 = r8[r0]
            r2 = r8[r3]
            r0 = r18 & r15
            int r13 = r0 >>> 20
            r0 = 17
            if (r13 > r0) goto L_0x0946
            int r0 = r3 + 2
            r16 = r8[r0]
            r14 = r16 & r17
            if (r14 == r11) goto L_0x04c9
            long r0 = (long) r14
            int r19 = r7.getInt(r5, r0)
            r11 = r14
        L_0x04c9:
            int r0 = r16 >>> 20
            int r14 = r9 << r0
        L_0x04cd:
            r15 = r15 & r17
            long r0 = (long) r15
            switch(r13) {
                case 0: goto L_0x04d6;
                case 1: goto L_0x04ed;
                case 2: goto L_0x0504;
                case 3: goto L_0x0515;
                case 4: goto L_0x0526;
                case 5: goto L_0x0537;
                case 6: goto L_0x0548;
                case 7: goto L_0x055a;
                case 8: goto L_0x0574;
                case 9: goto L_0x0581;
                case 10: goto L_0x0599;
                case 11: goto L_0x05ad;
                case 12: goto L_0x05c4;
                case 13: goto L_0x05d6;
                case 14: goto L_0x05e8;
                case 15: goto L_0x05fa;
                case 16: goto L_0x060c;
                case 17: goto L_0x0624;
                case 18: goto L_0x0635;
                case 19: goto L_0x0638;
                case 20: goto L_0x063b;
                case 21: goto L_0x063e;
                case 22: goto L_0x0641;
                case 23: goto L_0x0644;
                case 24: goto L_0x0647;
                case 25: goto L_0x0654;
                case 26: goto L_0x0661;
                case 27: goto L_0x066e;
                case 28: goto L_0x067f;
                case 29: goto L_0x068c;
                case 30: goto L_0x0699;
                case 31: goto L_0x06a6;
                case 32: goto L_0x06b3;
                case 33: goto L_0x06c0;
                case 34: goto L_0x06cd;
                case 35: goto L_0x06da;
                case 36: goto L_0x06e8;
                case 37: goto L_0x06f6;
                case 38: goto L_0x0704;
                case 39: goto L_0x0712;
                case 40: goto L_0x0720;
                case 41: goto L_0x072e;
                case 42: goto L_0x073b;
                case 43: goto L_0x0748;
                case 44: goto L_0x0755;
                case 45: goto L_0x0762;
                case 46: goto L_0x076f;
                case 47: goto L_0x077c;
                case 48: goto L_0x0789;
                case 49: goto L_0x0796;
                case 50: goto L_0x07c0;
                case 51: goto L_0x07cc;
                case 52: goto L_0x07e8;
                case 53: goto L_0x0804;
                case 54: goto L_0x080b;
                case 55: goto L_0x081f;
                case 56: goto L_0x0827;
                case 57: goto L_0x083b;
                case 58: goto L_0x0843;
                case 59: goto L_0x0861;
                case 60: goto L_0x0870;
                case 61: goto L_0x088a;
                case 62: goto L_0x08a0;
                case 63: goto L_0x08bd;
                case 64: goto L_0x08d5;
                case 65: goto L_0x08ed;
                case 66: goto L_0x0901;
                case 67: goto L_0x0919;
                case 68: goto L_0x0933;
                default: goto L_0x04d3;
            }
        L_0x04d3:
            int r3 = r3 + 4
            goto L_0x04ab
        L_0x04d6:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04d3
            X.9Yh r13 = X.C203609oO.A02
            double r14 = r13.A02(r5, r0)
            r0 = r6
            X.A3g r0 = (X.C21017A3g) r0
            X.8D7 r13 = r0.A00
            long r0 = java.lang.Double.doubleToRawLongBits(r14)
            r13.A07(r2, r0)
            goto L_0x04d3
        L_0x04ed:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04d3
            X.9Yh r13 = X.C203609oO.A02
            float r13 = r13.A03(r5, r0)
            r0 = r6
            X.A3g r0 = (X.C21017A3g) r0
            X.8D7 r1 = r0.A00
            int r0 = java.lang.Float.floatToRawIntBits(r13)
            r1.A06(r2, r0)
            goto L_0x04d3
        L_0x0504:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04d3
            long r0 = r7.getLong(r5, r0)
            r13 = r6
            X.A3g r13 = (X.C21017A3g) r13
            X.8D7 r13 = r13.A00
            X.C194279Ox.A06(r13, r2, r0)
            goto L_0x04d3
        L_0x0515:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04d3
            long r0 = r7.getLong(r5, r0)
            r13 = r6
            X.A3g r13 = (X.C21017A3g) r13
            X.8D7 r13 = r13.A00
            X.C194279Ox.A06(r13, r2, r0)
            goto L_0x04d3
        L_0x0526:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04d3
            int r1 = r7.getInt(r5, r0)
            r0 = r6
            X.A3g r0 = (X.C21017A3g) r0
            X.8D7 r0 = r0.A00
            r0.A05(r2, r1)
            goto L_0x04d3
        L_0x0537:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04d3
            long r0 = r7.getLong(r5, r0)
            r13 = r6
            X.A3g r13 = (X.C21017A3g) r13
            X.8D7 r13 = r13.A00
            r13.A07(r2, r0)
            goto L_0x04d3
        L_0x0548:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04d3
            int r1 = r7.getInt(r5, r0)
            r0 = r6
            X.A3g r0 = (X.C21017A3g) r0
            X.8D7 r0 = r0.A00
            r0.A06(r2, r1)
            goto L_0x04d3
        L_0x055a:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04d3
            X.9Yh r13 = X.C203609oO.A02
            boolean r13 = r13.A0F(r5, r0)
            r0 = r6
            X.A3g r0 = (X.C21017A3g) r0
            X.8D7 r1 = r0.A00
            int r0 = r2 << 3
            r1.A03(r0)
            byte r0 = (byte) r13
            r1.A02(r0)
            goto L_0x04d3
        L_0x0574:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04d3
            java.lang.Object r0 = r7.getObject(r5, r0)
            A0C(r6, r0, r2)
            goto L_0x04d3
        L_0x0581:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04d3
            java.lang.Object r13 = r7.getObject(r5, r0)
            X.B3S r1 = r4.A0A(r3)
            r0 = r6
            X.A3g r0 = (X.C21017A3g) r0
            X.8D7 r0 = r0.A00
            X.B5x r13 = (X.C23118B5x) r13
            r0.A0C(r13, r1, r2)
            goto L_0x04d3
        L_0x0599:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04d3
            java.lang.Object r1 = r7.getObject(r5, r0)
            X.AUv r1 = (X.AUv) r1
            r0 = r6
            X.A3g r0 = (X.C21017A3g) r0
            X.8D7 r0 = r0.A00
            r0.A0B(r1, r2)
            goto L_0x04d3
        L_0x05ad:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04d3
            int r13 = r7.getInt(r5, r0)
            r0 = r6
            X.A3g r0 = (X.C21017A3g) r0
            X.8D7 r1 = r0.A00
            int r0 = r2 << 3
            r1.A03(r0)
            r1.A03(r13)
            goto L_0x04d3
        L_0x05c4:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04d3
            int r1 = r7.getInt(r5, r0)
            r0 = r6
            X.A3g r0 = (X.C21017A3g) r0
            X.8D7 r0 = r0.A00
            r0.A05(r2, r1)
            goto L_0x04d3
        L_0x05d6:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04d3
            int r1 = r7.getInt(r5, r0)
            r0 = r6
            X.A3g r0 = (X.C21017A3g) r0
            X.8D7 r0 = r0.A00
            r0.A06(r2, r1)
            goto L_0x04d3
        L_0x05e8:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04d3
            long r0 = r7.getLong(r5, r0)
            r13 = r6
            X.A3g r13 = (X.C21017A3g) r13
            X.8D7 r13 = r13.A00
            r13.A07(r2, r0)
            goto L_0x04d3
        L_0x05fa:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04d3
            int r1 = r7.getInt(r5, r0)
            r0 = r6
            X.A3g r0 = (X.C21017A3g) r0
            X.8D7 r0 = r0.A00
            X.C194279Ox.A05(r0, r1, r2)
            goto L_0x04d3
        L_0x060c:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04d3
            long r0 = r7.getLong(r5, r0)
            r13 = r6
            X.A3g r13 = (X.C21017A3g) r13
            X.8D7 r13 = r13.A00
            long r15 = r0 << r9
            r14 = 63
            long r0 = r0 >> r14
            long r0 = r0 ^ r15
            X.C194279Ox.A06(r13, r2, r0)
            goto L_0x04d3
        L_0x0624:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04d3
            java.lang.Object r1 = r7.getObject(r5, r0)
            X.B3S r0 = r4.A0A(r3)
            r6.ByY(r0, r1, r2)
            goto L_0x04d3
        L_0x0635:
            r13 = 0
            goto L_0x06db
        L_0x0638:
            r13 = 0
            goto L_0x06e9
        L_0x063b:
            r13 = 0
            goto L_0x06f7
        L_0x063e:
            r13 = 0
            goto L_0x0705
        L_0x0641:
            r13 = 0
            goto L_0x0713
        L_0x0644:
            r13 = 0
            goto L_0x0721
        L_0x0647:
            r2 = r8[r3]
            java.lang.Object r0 = r7.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C203819ov.A0L(r6, r0, r2, r10)
            goto L_0x04d3
        L_0x0654:
            r2 = r8[r3]
            java.lang.Object r0 = r7.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C203819ov.A0O(r6, r0, r2, r10)
            goto L_0x04d3
        L_0x0661:
            r2 = r8[r3]
            java.lang.Object r0 = r7.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C203819ov.A09(r6, r0, r2)
            goto L_0x04d3
        L_0x066e:
            r2 = r8[r3]
            java.lang.Object r1 = r7.getObject(r5, r0)
            java.util.List r1 = (java.util.List) r1
            X.B3S r0 = r4.A0A(r3)
            X.C203819ov.A08(r0, r6, r1, r2)
            goto L_0x04d3
        L_0x067f:
            r2 = r8[r3]
            java.lang.Object r0 = r7.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C203819ov.A0A(r6, r0, r2)
            goto L_0x04d3
        L_0x068c:
            r2 = r8[r3]
            java.lang.Object r0 = r7.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C203819ov.A0J(r6, r0, r2, r10)
            goto L_0x04d3
        L_0x0699:
            r2 = r8[r3]
            java.lang.Object r0 = r7.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C203819ov.A0N(r6, r0, r2, r10)
            goto L_0x04d3
        L_0x06a6:
            r2 = r8[r3]
            java.lang.Object r0 = r7.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C203819ov.A0M(r6, r0, r2, r10)
            goto L_0x04d3
        L_0x06b3:
            r2 = r8[r3]
            java.lang.Object r0 = r7.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C203819ov.A0H(r6, r0, r2, r10)
            goto L_0x04d3
        L_0x06c0:
            r2 = r8[r3]
            java.lang.Object r0 = r7.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C203819ov.A0K(r6, r0, r2, r10)
            goto L_0x04d3
        L_0x06cd:
            r2 = r8[r3]
            java.lang.Object r0 = r7.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C203819ov.A0F(r6, r0, r2, r10)
            goto L_0x04d3
        L_0x06da:
            r13 = 1
        L_0x06db:
            r2 = r8[r3]
            java.lang.Object r0 = r7.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C203819ov.A0B(r6, r0, r2, r13)
            goto L_0x04d3
        L_0x06e8:
            r13 = 1
        L_0x06e9:
            r2 = r8[r3]
            java.lang.Object r0 = r7.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C203819ov.A0C(r6, r0, r2, r13)
            goto L_0x04d3
        L_0x06f6:
            r13 = 1
        L_0x06f7:
            r2 = r8[r3]
            java.lang.Object r0 = r7.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C203819ov.A0D(r6, r0, r2, r13)
            goto L_0x04d3
        L_0x0704:
            r13 = 1
        L_0x0705:
            r2 = r8[r3]
            java.lang.Object r0 = r7.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C203819ov.A0E(r6, r0, r2, r13)
            goto L_0x04d3
        L_0x0712:
            r13 = 1
        L_0x0713:
            r2 = r8[r3]
            java.lang.Object r0 = r7.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C203819ov.A0I(r6, r0, r2, r13)
            goto L_0x04d3
        L_0x0720:
            r13 = 1
        L_0x0721:
            r2 = r8[r3]
            java.lang.Object r0 = r7.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C203819ov.A0G(r6, r0, r2, r13)
            goto L_0x04d3
        L_0x072e:
            r2 = r8[r3]
            java.lang.Object r0 = r7.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C203819ov.A0L(r6, r0, r2, r9)
            goto L_0x04d3
        L_0x073b:
            r2 = r8[r3]
            java.lang.Object r0 = r7.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C203819ov.A0O(r6, r0, r2, r9)
            goto L_0x04d3
        L_0x0748:
            r2 = r8[r3]
            java.lang.Object r0 = r7.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C203819ov.A0J(r6, r0, r2, r9)
            goto L_0x04d3
        L_0x0755:
            r2 = r8[r3]
            java.lang.Object r0 = r7.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C203819ov.A0N(r6, r0, r2, r9)
            goto L_0x04d3
        L_0x0762:
            r2 = r8[r3]
            java.lang.Object r0 = r7.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C203819ov.A0M(r6, r0, r2, r9)
            goto L_0x04d3
        L_0x076f:
            r2 = r8[r3]
            java.lang.Object r0 = r7.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C203819ov.A0H(r6, r0, r2, r9)
            goto L_0x04d3
        L_0x077c:
            r2 = r8[r3]
            java.lang.Object r0 = r7.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C203819ov.A0K(r6, r0, r2, r9)
            goto L_0x04d3
        L_0x0789:
            r2 = r8[r3]
            java.lang.Object r0 = r7.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C203819ov.A0F(r6, r0, r2, r9)
            goto L_0x04d3
        L_0x0796:
            r13 = r8[r3]
            java.lang.Object r15 = r7.getObject(r5, r0)
            java.util.List r15 = (java.util.List) r15
            X.B3S r14 = r4.A0A(r3)
            java.lang.Class r0 = X.C203819ov.A03
            if (r15 == 0) goto L_0x04d3
            boolean r0 = r15.isEmpty()
            if (r0 != 0) goto L_0x04d3
            r2 = r6
            X.A3g r2 = (X.C21017A3g) r2
            r1 = 0
        L_0x07b0:
            int r0 = r15.size()
            if (r1 >= r0) goto L_0x04d3
            java.lang.Object r0 = r15.get(r1)
            r2.ByY(r14, r0, r13)
            int r1 = r1 + 1
            goto L_0x07b0
        L_0x07c0:
            java.lang.Object r0 = r7.getObject(r5, r0)
            if (r0 == 0) goto L_0x04d3
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        L_0x07cc:
            boolean r13 = r4.A0E(r5, r2, r3)
            if (r13 == 0) goto L_0x04d3
            java.lang.Object r0 = X.C203609oO.A01(r5, r0)
            double r14 = X.C90504aG.A01(r0)
            r0 = r6
            X.A3g r0 = (X.C21017A3g) r0
            X.8D7 r13 = r0.A00
            long r0 = java.lang.Double.doubleToRawLongBits(r14)
            r13.A07(r2, r0)
            goto L_0x04d3
        L_0x07e8:
            boolean r13 = r4.A0E(r5, r2, r3)
            if (r13 == 0) goto L_0x04d3
            java.lang.Object r0 = X.C203609oO.A01(r5, r0)
            float r13 = X.C36441kJ.A03(r0)
            r0 = r6
            X.A3g r0 = (X.C21017A3g) r0
            X.8D7 r1 = r0.A00
            int r0 = java.lang.Float.floatToRawIntBits(r13)
            r1.A06(r2, r0)
            goto L_0x04d3
        L_0x0804:
            boolean r13 = r4.A0E(r5, r2, r3)
            if (r13 == 0) goto L_0x04d3
            goto L_0x0811
        L_0x080b:
            boolean r13 = r4.A0E(r5, r2, r3)
            if (r13 == 0) goto L_0x04d3
        L_0x0811:
            long r0 = A09(r5, r0)
            r13 = r6
            X.A3g r13 = (X.C21017A3g) r13
            X.8D7 r13 = r13.A00
            X.C194279Ox.A06(r13, r2, r0)
            goto L_0x04d3
        L_0x081f:
            boolean r13 = r4.A0E(r5, r2, r3)
            if (r13 == 0) goto L_0x04d3
            goto L_0x08c3
        L_0x0827:
            boolean r13 = r4.A0E(r5, r2, r3)
            if (r13 == 0) goto L_0x04d3
            long r0 = A09(r5, r0)
            r13 = r6
            X.A3g r13 = (X.C21017A3g) r13
            X.8D7 r13 = r13.A00
            r13.A07(r2, r0)
            goto L_0x04d3
        L_0x083b:
            boolean r13 = r4.A0E(r5, r2, r3)
            if (r13 == 0) goto L_0x04d3
            goto L_0x08db
        L_0x0843:
            boolean r13 = r4.A0E(r5, r2, r3)
            if (r13 == 0) goto L_0x04d3
            java.lang.Object r0 = X.C203609oO.A01(r5, r0)
            boolean r13 = X.AnonymousClass000.A1X(r0)
            r0 = r6
            X.A3g r0 = (X.C21017A3g) r0
            X.8D7 r1 = r0.A00
            int r0 = r2 << 3
            r1.A03(r0)
            byte r0 = (byte) r13
            r1.A02(r0)
            goto L_0x04d3
        L_0x0861:
            boolean r13 = r4.A0E(r5, r2, r3)
            if (r13 == 0) goto L_0x04d3
            java.lang.Object r0 = r7.getObject(r5, r0)
            A0C(r6, r0, r2)
            goto L_0x04d3
        L_0x0870:
            boolean r13 = r4.A0E(r5, r2, r3)
            if (r13 == 0) goto L_0x04d3
            java.lang.Object r13 = r7.getObject(r5, r0)
            X.B3S r1 = r4.A0A(r3)
            r0 = r6
            X.A3g r0 = (X.C21017A3g) r0
            X.8D7 r0 = r0.A00
            X.B5x r13 = (X.C23118B5x) r13
            r0.A0C(r13, r1, r2)
            goto L_0x04d3
        L_0x088a:
            boolean r13 = r4.A0E(r5, r2, r3)
            if (r13 == 0) goto L_0x04d3
            java.lang.Object r1 = r7.getObject(r5, r0)
            X.AUv r1 = (X.AUv) r1
            r0 = r6
            X.A3g r0 = (X.C21017A3g) r0
            X.8D7 r0 = r0.A00
            r0.A0B(r1, r2)
            goto L_0x04d3
        L_0x08a0:
            boolean r13 = r4.A0E(r5, r2, r3)
            if (r13 == 0) goto L_0x04d3
            java.lang.Object r0 = X.C203609oO.A01(r5, r0)
            int r13 = X.AnonymousClass000.A0I(r0)
            r0 = r6
            X.A3g r0 = (X.C21017A3g) r0
            X.8D7 r1 = r0.A00
            int r0 = r2 << 3
            r1.A03(r0)
            r1.A03(r13)
            goto L_0x04d3
        L_0x08bd:
            boolean r13 = r4.A0E(r5, r2, r3)
            if (r13 == 0) goto L_0x04d3
        L_0x08c3:
            java.lang.Object r0 = X.C203609oO.A01(r5, r0)
            int r1 = X.AnonymousClass000.A0I(r0)
            r0 = r6
            X.A3g r0 = (X.C21017A3g) r0
            X.8D7 r0 = r0.A00
            r0.A05(r2, r1)
            goto L_0x04d3
        L_0x08d5:
            boolean r13 = r4.A0E(r5, r2, r3)
            if (r13 == 0) goto L_0x04d3
        L_0x08db:
            java.lang.Object r0 = X.C203609oO.A01(r5, r0)
            int r1 = X.AnonymousClass000.A0I(r0)
            r0 = r6
            X.A3g r0 = (X.C21017A3g) r0
            X.8D7 r0 = r0.A00
            r0.A06(r2, r1)
            goto L_0x04d3
        L_0x08ed:
            boolean r13 = r4.A0E(r5, r2, r3)
            if (r13 == 0) goto L_0x04d3
            long r0 = A09(r5, r0)
            r13 = r6
            X.A3g r13 = (X.C21017A3g) r13
            X.8D7 r13 = r13.A00
            r13.A07(r2, r0)
            goto L_0x04d3
        L_0x0901:
            boolean r13 = r4.A0E(r5, r2, r3)
            if (r13 == 0) goto L_0x04d3
            java.lang.Object r0 = X.C203609oO.A01(r5, r0)
            int r1 = X.AnonymousClass000.A0I(r0)
            r0 = r6
            X.A3g r0 = (X.C21017A3g) r0
            X.8D7 r0 = r0.A00
            X.C194279Ox.A05(r0, r1, r2)
            goto L_0x04d3
        L_0x0919:
            boolean r13 = r4.A0E(r5, r2, r3)
            if (r13 == 0) goto L_0x04d3
            long r0 = A09(r5, r0)
            r13 = r6
            X.A3g r13 = (X.C21017A3g) r13
            X.8D7 r14 = r13.A00
            long r15 = r0 << r9
            r13 = 63
            long r0 = r0 >> r13
            long r0 = r0 ^ r15
            X.C194279Ox.A06(r14, r2, r0)
            goto L_0x04d3
        L_0x0933:
            boolean r13 = r4.A0E(r5, r2, r3)
            if (r13 == 0) goto L_0x04d3
            java.lang.Object r1 = r7.getObject(r5, r0)
            X.B3S r0 = r4.A0A(r3)
            r6.ByY(r0, r1, r2)
            goto L_0x04d3
        L_0x0946:
            r14 = 0
            goto L_0x04cd
        L_0x0949:
            X.8DG r5 = (X.AnonymousClass8DG) r5
            X.9js r0 = r5.zzjp
            r0.A02(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21015A3e.ByM(X.Axl, java.lang.Object):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: byte} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a7, code lost:
        r0 = r6.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a9, code lost:
        r7.putObject(r5, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f3, code lost:
        r7.putInt(r5, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0100, code lost:
        r7.putLong(r5, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0118, code lost:
        r10 = r9 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x012d, code lost:
        r10 = r9 + 8;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ByN(X.C192929Je r31, java.lang.Object r32, byte[] r33, int r34, int r35) {
        /*
            r30 = this;
            r10 = r34
            r29 = r30
            r0 = r29
            boolean r0 = r0.A01
            r6 = r31
            r5 = r32
            r4 = r33
            r8 = r35
            if (r0 == 0) goto L_0x01cb
            sun.misc.Unsafe r7 = A0F
        L_0x0014:
            if (r10 >= r8) goto L_0x01c1
            int r9 = r10 + 1
            byte r11 = r33[r10]
            if (r11 >= 0) goto L_0x0022
            int r9 = X.C203009n7.A04(r6, r4, r11, r9)
            int r11 = r6.A00
        L_0x0022:
            int r12 = r11 >>> 3
            r13 = r11 & 7
            r0 = r29
            int r10 = r0.A00(r12)
            if (r10 < 0) goto L_0x0048
            int[] r1 = r0.A02
            int r0 = r10 + 1
            r1 = r1[r0]
            r0 = 267386880(0xff00000, float:2.3665827E-29)
            r0 = r0 & r1
            int r14 = r0 >>> 20
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r1
            long r2 = (long) r0
            r15 = 17
            r0 = 2
            if (r14 > r15) goto L_0x0131
            r15 = 5
            r12 = 1
            switch(r14) {
                case 0: goto L_0x011c;
                case 1: goto L_0x0109;
                case 2: goto L_0x00f8;
                case 3: goto L_0x00f8;
                case 4: goto L_0x00eb;
                case 5: goto L_0x00de;
                case 6: goto L_0x00d4;
                case 7: goto L_0x00be;
                case 8: goto L_0x0094;
                case 9: goto L_0x007b;
                case 10: goto L_0x0074;
                case 11: goto L_0x00eb;
                case 12: goto L_0x00eb;
                case 13: goto L_0x00d4;
                case 14: goto L_0x00de;
                case 15: goto L_0x0066;
                case 16: goto L_0x0058;
                default: goto L_0x0048;
            }
        L_0x0048:
            X.9js r13 = X.AnonymousClass8DG.A01(r5)
            r12 = r6
            r14 = r4
            r15 = r11
            r16 = r9
            r17 = r8
            int r10 = X.C203009n7.A00(r12, r13, r14, r15, r16, r17)
            goto L_0x0014
        L_0x0058:
            if (r13 != 0) goto L_0x0048
            int r10 = X.C203009n7.A03(r6, r4, r9)
            long r0 = r6.A01
            long r0 = X.C165567td.A06(r0)
            goto L_0x0100
        L_0x0066:
            if (r13 != 0) goto L_0x0048
            int r10 = X.C203009n7.A02(r6, r4, r9)
            int r0 = r6.A00
            int r0 = X.C165597tg.A02(r0)
            goto L_0x00f3
        L_0x0074:
            if (r13 != r0) goto L_0x0048
            int r10 = X.C203009n7.A01(r6, r4, r9)
            goto L_0x00a7
        L_0x007b:
            if (r13 != r0) goto L_0x0048
            r0 = r29
            X.B3S r0 = r0.A0A(r10)
            int r10 = A02(r6, r0, r4, r9, r8)
            java.lang.Object r1 = r7.getObject(r5, r2)
            if (r1 == 0) goto L_0x00a7
            java.lang.Object r0 = r6.A02
            X.8DG r0 = X.C197079b6.A00(r1, r0)
            goto L_0x00a9
        L_0x0094:
            if (r13 != r0) goto L_0x0048
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r1
            if (r0 != 0) goto L_0x00b9
            int r10 = X.C203009n7.A02(r6, r4, r9)
            int r9 = r6.A00
            if (r9 != 0) goto L_0x00ae
            java.lang.String r0 = ""
            r6.A02 = r0
        L_0x00a7:
            java.lang.Object r0 = r6.A02
        L_0x00a9:
            r7.putObject(r5, r2, r0)
            goto L_0x0014
        L_0x00ae:
            java.nio.charset.Charset r1 = X.C197079b6.A00
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r10, r9, r1)
            r6.A02 = r0
            int r10 = r10 + r9
            goto L_0x00a7
        L_0x00b9:
            int r10 = A07(r6, r4, r9)
            goto L_0x00a7
        L_0x00be:
            if (r13 != 0) goto L_0x0048
            int r10 = X.C203009n7.A03(r6, r4, r9)
            long r0 = r6.A01
            r13 = 0
            int r9 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r9 != 0) goto L_0x00cd
            r12 = 0
        L_0x00cd:
            X.9Yh r0 = X.C203609oO.A02
            r0.A0D(r5, r2, r12)
            goto L_0x0014
        L_0x00d4:
            if (r13 != r15) goto L_0x0048
            int r0 = X.C165567td.A04(r4, r9)
            r7.putInt(r5, r2, r0)
            goto L_0x0118
        L_0x00de:
            if (r13 != r12) goto L_0x0048
            long r14 = X.C165567td.A0A(r4, r9)
            r10 = r7
            r11 = r5
            r12 = r2
            r10.putLong(r11, r12, r14)
            goto L_0x012d
        L_0x00eb:
            if (r13 != 0) goto L_0x0048
            int r10 = X.C203009n7.A02(r6, r4, r9)
            int r0 = r6.A00
        L_0x00f3:
            r7.putInt(r5, r2, r0)
            goto L_0x0014
        L_0x00f8:
            if (r13 != 0) goto L_0x0048
            int r10 = X.C203009n7.A03(r6, r4, r9)
            long r0 = r6.A01
        L_0x0100:
            r11 = r7
            r12 = r5
            r13 = r2
            r15 = r0
            r11.putLong(r12, r13, r15)
            goto L_0x0014
        L_0x0109:
            if (r13 != r15) goto L_0x0048
            int r0 = X.C165567td.A04(r4, r9)
            float r1 = java.lang.Float.intBitsToFloat(r0)
            X.9Yh r0 = X.C203609oO.A02
            r0.A0A(r5, r2, r1)
        L_0x0118:
            int r10 = r9 + 4
            goto L_0x0014
        L_0x011c:
            if (r13 != r12) goto L_0x0048
            long r0 = X.C165567td.A0A(r4, r9)
            double r14 = java.lang.Double.longBitsToDouble(r0)
            X.9Yh r10 = X.C203609oO.A02
            r11 = r5
            r12 = r2
            r10.A09(r11, r12, r14)
        L_0x012d:
            int r10 = r9 + 8
            goto L_0x0014
        L_0x0131:
            r15 = 27
            if (r14 != r15) goto L_0x016d
            if (r13 != r0) goto L_0x0048
            java.lang.Object r12 = r7.getObject(r5, r2)
            X.B6a r12 = (X.C23120B6a) r12
            r0 = r12
            X.Ac8 r0 = (X.C21882Ac8) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x014f
            int r0 = X.C165597tg.A07(r12)
            X.B6a r12 = r12.Byu(r0)
            r7.putObject(r5, r2, r12)
        L_0x014f:
            r0 = r29
            X.B3S r2 = r0.A0A(r10)
            int r10 = A02(r6, r2, r4, r9, r8)
        L_0x0159:
            java.lang.Object r0 = r6.A02
            r12.add(r0)
            if (r10 >= r8) goto L_0x0014
            int r1 = X.C203009n7.A02(r6, r4, r10)
            int r0 = r6.A00
            if (r11 != r0) goto L_0x0014
            int r10 = A02(r6, r2, r4, r1, r8)
            goto L_0x0159
        L_0x016d:
            r15 = 49
            if (r14 > r15) goto L_0x0192
            long r0 = (long) r1
            r22 = r14
            r23 = r0
            r25 = r2
            r18 = r11
            r19 = r12
            r20 = r13
            r21 = r10
            r17 = r8
            r16 = r9
            r13 = r6
            r14 = r5
            r15 = r4
            r12 = r29
            int r10 = r12.A06(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r25)
        L_0x018d:
            if (r10 != r9) goto L_0x0014
            r9 = r10
            goto L_0x0048
        L_0x0192:
            r15 = 50
            if (r14 != r15) goto L_0x01a2
            if (r13 != r0) goto L_0x0048
            r7.getObject(r5, r2)
            java.lang.String r0 = "isMutable"
            java.lang.NullPointerException r1 = X.AnonymousClass001.A0A(r0)
            throw r1
        L_0x01a2:
            r15 = r29
            r16 = r6
            r17 = r5
            r18 = r4
            r19 = r9
            r20 = r8
            r21 = r11
            r22 = r12
            r23 = r13
            r24 = r1
            r25 = r14
            r26 = r10
            r27 = r2
            int r10 = r15.A05(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x018d
        L_0x01c1:
            if (r10 == r8) goto L_0x01d5
            java.lang.String r0 = "Failed to parse the message."
            X.8xd r1 = new X.8xd
            r1.<init>(r0)
            throw r1
        L_0x01cb:
            r7 = 0
            r1 = r29
            r2 = r6
            r3 = r5
            r5 = r10
            r6 = r8
            r1.A04(r2, r3, r4, r5, r6, r7)
        L_0x01d5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21015A3e.ByN(X.9Je, java.lang.Object, byte[], int, int):void");
    }

    public final void Byd(Object obj) {
        Object unmodifiableList;
        int[] iArr = this.A0D;
        if (iArr != null) {
            for (int A0G : iArr) {
                if (C203609oO.A01(obj, C165577te.A0G(this.A02, A0G)) != null) {
                    throw AnonymousClass001.A0A("zzv");
                }
            }
        }
        int[] iArr2 = this.A0E;
        if (iArr2 != null) {
            for (int i : iArr2) {
                long j = (long) i;
                if (this.A08 instanceof AnonymousClass8DI) {
                    ((C21882Ac8) ((C23120B6a) C203609oO.A01(obj, j))).A00 = false;
                } else {
                    List list = (List) C203609oO.A01(obj, j);
                    if (list instanceof B6W) {
                        unmodifiableList = ((B6W) list).Byc();
                    } else if (!C165587tf.A1b(AnonymousClass8DJ.A00, list)) {
                        unmodifiableList = Collections.unmodifiableList(list);
                    }
                    C203609oO.A07(obj, j, unmodifiableList);
                }
            }
        }
        ((AnonymousClass8DG) obj).zzjp.A02 = false;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x020e, code lost:
        if (r1 < 0) goto L_0x02d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0218, code lost:
        r12 = X.C194279Ox.A02(r9) + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0226, code lost:
        r12 = X.C194279Ox.A02(r9) + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0234, code lost:
        r12 = X.C194279Ox.A02(r9) + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0248, code lost:
        if ((r2 instanceof X.AUv) != false) goto L_0x0288;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x024b, code lost:
        r2 = (java.lang.String) r2;
        r3 = X.C194279Ox.A02(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:?, code lost:
        r0 = X.C201819kT.A00(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0256, code lost:
        r0 = r2.getBytes(X.C197079b6.A00).length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0264, code lost:
        r2 = X.C203609oO.A01(r7, r0);
        r1 = A0A(r10);
        r0 = X.C203819ov.A03;
        r3 = X.C194279Ox.A02(r9);
        r0 = X.AnonymousClass8DG.A00(r1, (X.C23118B5x) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0284, code lost:
        r2 = X.C203609oO.A01(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0288, code lost:
        r12 = X.C194279Ox.A03(((X.AUv) r2).A02(), X.C194279Ox.A02(r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02a6, code lost:
        r12 = X.C194279Ox.A02(r9);
        r0 = X.AnonymousClass8D7.A01;
        r12 = r12 + X.C165567td.A00(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02c1, code lost:
        r12 = X.C194279Ox.A02(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02c5, code lost:
        if (r1 < 0) goto L_0x02d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02c7, code lost:
        r0 = X.AnonymousClass8D7.A01;
        r0 = X.C165567td.A00(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02cd, code lost:
        r12 = r12 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02d0, code lost:
        r0 = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02d9, code lost:
        r12 = X.C194279Ox.A02(r9) + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02e7, code lost:
        r12 = X.C194279Ox.A02(r9) + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x02fd, code lost:
        r12 = X.C194279Ox.A02(r9);
        r1 = (r1 >> 31) ^ (r1 << 1);
        r0 = X.AnonymousClass8D7.A01;
        r12 = r12 + X.C165567td.A00(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0319, code lost:
        r12 = X.C194279Ox.A02(r9) + X.AnonymousClass8D7.A01((r3 >> 63) ^ (r3 << 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0330, code lost:
        r1 = A0A(r10);
        r0 = X.AnonymousClass8D7.A01;
        r12 = (X.C194279Ox.A02(r9) << 1) + X.AnonymousClass8DG.A00(r1, (X.C23118B5x) X.C203609oO.A01(r7, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x04a2, code lost:
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0589, code lost:
        if ((r2 instanceof X.AUv) != false) goto L_0x08cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x0728, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0095, code lost:
        if ((r2 instanceof X.AUv) != false) goto L_0x0288;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x07fb, code lost:
        r1 = X.C194279Ox.A02(r9);
        r0 = X.AnonymousClass8D7.A01;
        r1 = (r1 + X.C165567td.A00(r2)) + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x0832, code lost:
        r8 = X.C194279Ox.A02(r9) + X.AnonymousClass8D7.A01(A09(r7, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x0853, code lost:
        if (r1 >= 0) goto L_0x090c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x0879, code lost:
        r8 = X.C194279Ox.A02(r9) + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x088d, code lost:
        if ((r2 instanceof X.AUv) != false) goto L_0x08cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x0890, code lost:
        r2 = (java.lang.String) r2;
        r8 = X.C194279Ox.A02(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:?, code lost:
        r0 = X.C201819kT.A00(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x089b, code lost:
        r0 = r2.getBytes(X.C197079b6.A00).length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x08a9, code lost:
        r2 = r5.getObject(r7, r1);
        r1 = A0A(r3);
        r0 = X.C203819ov.A03;
        r8 = X.C194279Ox.A02(r9);
        r0 = X.AnonymousClass8DG.A00(r1, (X.C23118B5x) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x08c9, code lost:
        r2 = r5.getObject(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x08cd, code lost:
        r8 = X.C194279Ox.A03(((X.AUv) r2).A02(), X.C194279Ox.A02(r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x08eb, code lost:
        r8 = X.C194279Ox.A02(r9);
        r0 = X.AnonymousClass8D7.A01;
        r8 = r8 + X.C165567td.A00(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x0906, code lost:
        r8 = X.C194279Ox.A02(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x090a, code lost:
        if (r1 < 0) goto L_0x0914;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x090c, code lost:
        r0 = X.AnonymousClass8D7.A01;
        r0 = X.C165567td.A00(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x0912, code lost:
        r8 = r8 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x0914, code lost:
        r0 = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x091d, code lost:
        r1 = X.C194279Ox.A02(r9) + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x0923, code lost:
        r15 = r15 + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x092c, code lost:
        r8 = X.C194279Ox.A02(r9) + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x0941, code lost:
        r8 = X.C194279Ox.A02(r9);
        r1 = (r1 >> 31) ^ (r1 << 1);
        r0 = X.AnonymousClass8D7.A01;
        r8 = r8 + X.C165567td.A00(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:0x095c, code lost:
        r8 = X.C194279Ox.A02(r9) + X.AnonymousClass8D7.A01((r10 >> 63) ^ (r10 << 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:418:0x0972, code lost:
        r1 = A0A(r3);
        r0 = X.AnonymousClass8D7.A01;
        r8 = (X.C194279Ox.A02(r9) << 1) + X.AnonymousClass8DG.A00(r1, (X.C23118B5x) r5.getObject(r7, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01a8, code lost:
        r12 = X.C194279Ox.A02(r9);
        r0 = X.AnonymousClass8D7.A01;
        r12 = (r12 + X.C165567td.A00(r1)) + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01bc, code lost:
        r12 = X.C194279Ox.A02(r9) + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01ca, code lost:
        r12 = X.C194279Ox.A02(r9) + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01dc, code lost:
        r12 = X.C194279Ox.A02(r9) + X.AnonymousClass8D7.A01(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01f1, code lost:
        r12 = X.C194279Ox.A02(r9) + X.AnonymousClass8D7.A01(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x020a, code lost:
        r12 = X.C194279Ox.A02(r9);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int Byv(java.lang.Object r19) {
        /*
            r18 = this;
            r7 = r19
            r6 = r18
            boolean r0 = r6.A01
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            r17 = 1
            r16 = 1048575(0xfffff, float:1.469367E-39)
            sun.misc.Unsafe r5 = A0F
            if (r0 == 0) goto L_0x04d1
            r10 = 0
            r13 = 0
        L_0x0013:
            int[] r2 = r6.A02
            int r0 = r2.length
            if (r10 >= r0) goto L_0x04c7
            int r0 = r10 + 1
            r1 = r2[r0]
            r0 = r1 & r3
            int r3 = r0 >>> 20
            r9 = r2[r10]
            r1 = r1 & r16
            long r0 = (long) r1
            X.8yG[] r2 = X.C187648yG.A00
            switch(r3) {
                case 0: goto L_0x002f;
                case 1: goto L_0x0037;
                case 2: goto L_0x003f;
                case 3: goto L_0x004d;
                case 4: goto L_0x005b;
                case 5: goto L_0x0069;
                case 6: goto L_0x0071;
                case 7: goto L_0x0079;
                case 8: goto L_0x0089;
                case 9: goto L_0x0081;
                case 10: goto L_0x0099;
                case 11: goto L_0x00a1;
                case 12: goto L_0x00af;
                case 13: goto L_0x00bd;
                case 14: goto L_0x00c5;
                case 15: goto L_0x00cd;
                case 16: goto L_0x00db;
                case 17: goto L_0x00e9;
                case 18: goto L_0x0349;
                case 19: goto L_0x035c;
                case 20: goto L_0x036f;
                case 21: goto L_0x038b;
                case 22: goto L_0x03a3;
                case 23: goto L_0x0349;
                case 24: goto L_0x035c;
                case 25: goto L_0x03bb;
                case 26: goto L_0x03ce;
                case 27: goto L_0x03da;
                case 28: goto L_0x0405;
                case 29: goto L_0x0430;
                case 30: goto L_0x0447;
                case 31: goto L_0x035c;
                case 32: goto L_0x0349;
                case 33: goto L_0x045e;
                case 34: goto L_0x0475;
                case 35: goto L_0x00f1;
                case 36: goto L_0x00ff;
                case 37: goto L_0x010d;
                case 38: goto L_0x011b;
                case 39: goto L_0x0129;
                case 40: goto L_0x0136;
                case 41: goto L_0x0143;
                case 42: goto L_0x0150;
                case 43: goto L_0x015b;
                case 44: goto L_0x0168;
                case 45: goto L_0x0175;
                case 46: goto L_0x0182;
                case 47: goto L_0x018f;
                case 48: goto L_0x019c;
                case 49: goto L_0x048e;
                case 50: goto L_0x04bd;
                case 51: goto L_0x01b6;
                case 52: goto L_0x01c4;
                case 53: goto L_0x01d2;
                case 54: goto L_0x01e7;
                case 55: goto L_0x01fc;
                case 56: goto L_0x0212;
                case 57: goto L_0x0220;
                case 58: goto L_0x022e;
                case 59: goto L_0x023c;
                case 60: goto L_0x025e;
                case 61: goto L_0x027e;
                case 62: goto L_0x0298;
                case 63: goto L_0x02b3;
                case 64: goto L_0x02d3;
                case 65: goto L_0x02e1;
                case 66: goto L_0x02ef;
                case 67: goto L_0x030f;
                case 68: goto L_0x032a;
                default: goto L_0x002a;
            }
        L_0x002a:
            int r10 = r10 + 4
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            goto L_0x0013
        L_0x002f:
            boolean r0 = r6.A0D(r7, r10)
            if (r0 == 0) goto L_0x002a
            goto L_0x01bc
        L_0x0037:
            boolean r0 = r6.A0D(r7, r10)
            if (r0 == 0) goto L_0x002a
            goto L_0x01ca
        L_0x003f:
            boolean r2 = r6.A0D(r7, r10)
            if (r2 == 0) goto L_0x002a
            X.9Yh r2 = X.C203609oO.A02
            long r0 = r2.A05(r7, r0)
            goto L_0x01dc
        L_0x004d:
            boolean r2 = r6.A0D(r7, r10)
            if (r2 == 0) goto L_0x002a
            X.9Yh r2 = X.C203609oO.A02
            long r0 = r2.A05(r7, r0)
            goto L_0x01f1
        L_0x005b:
            boolean r2 = r6.A0D(r7, r10)
            if (r2 == 0) goto L_0x002a
            X.9Yh r2 = X.C203609oO.A02
            int r1 = r2.A04(r7, r0)
            goto L_0x020a
        L_0x0069:
            boolean r0 = r6.A0D(r7, r10)
            if (r0 == 0) goto L_0x002a
            goto L_0x0218
        L_0x0071:
            boolean r0 = r6.A0D(r7, r10)
            if (r0 == 0) goto L_0x002a
            goto L_0x0226
        L_0x0079:
            boolean r0 = r6.A0D(r7, r10)
            if (r0 == 0) goto L_0x002a
            goto L_0x0234
        L_0x0081:
            boolean r2 = r6.A0D(r7, r10)
            if (r2 == 0) goto L_0x002a
            goto L_0x0264
        L_0x0089:
            boolean r2 = r6.A0D(r7, r10)
            if (r2 == 0) goto L_0x002a
            java.lang.Object r2 = X.C203609oO.A01(r7, r0)
            boolean r0 = r2 instanceof X.AUv
            if (r0 == 0) goto L_0x024b
            goto L_0x0288
        L_0x0099:
            boolean r2 = r6.A0D(r7, r10)
            if (r2 == 0) goto L_0x002a
            goto L_0x0284
        L_0x00a1:
            boolean r2 = r6.A0D(r7, r10)
            if (r2 == 0) goto L_0x002a
            X.9Yh r2 = X.C203609oO.A02
            int r1 = r2.A04(r7, r0)
            goto L_0x02a6
        L_0x00af:
            boolean r2 = r6.A0D(r7, r10)
            if (r2 == 0) goto L_0x002a
            X.9Yh r2 = X.C203609oO.A02
            int r1 = r2.A04(r7, r0)
            goto L_0x02c1
        L_0x00bd:
            boolean r0 = r6.A0D(r7, r10)
            if (r0 == 0) goto L_0x002a
            goto L_0x02d9
        L_0x00c5:
            boolean r0 = r6.A0D(r7, r10)
            if (r0 == 0) goto L_0x002a
            goto L_0x02e7
        L_0x00cd:
            boolean r2 = r6.A0D(r7, r10)
            if (r2 == 0) goto L_0x002a
            X.9Yh r2 = X.C203609oO.A02
            int r1 = r2.A04(r7, r0)
            goto L_0x02fd
        L_0x00db:
            boolean r2 = r6.A0D(r7, r10)
            if (r2 == 0) goto L_0x002a
            X.9Yh r2 = X.C203609oO.A02
            long r3 = r2.A05(r7, r0)
            goto L_0x0319
        L_0x00e9:
            boolean r2 = r6.A0D(r7, r10)
            if (r2 == 0) goto L_0x002a
            goto L_0x0330
        L_0x00f1:
            java.lang.Object r0 = r5.getObject(r7, r0)
            int r0 = A08(r0)
            int r1 = r0 << 3
            if (r1 <= 0) goto L_0x002a
            goto L_0x01a8
        L_0x00ff:
            java.lang.Object r0 = r5.getObject(r7, r0)
            int r0 = A08(r0)
            int r1 = r0 << 2
            if (r1 <= 0) goto L_0x002a
            goto L_0x01a8
        L_0x010d:
            java.lang.Object r0 = r5.getObject(r7, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C203819ov.A00(r0)
            if (r1 <= 0) goto L_0x002a
            goto L_0x01a8
        L_0x011b:
            java.lang.Object r0 = r5.getObject(r7, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C203819ov.A01(r0)
            if (r1 <= 0) goto L_0x002a
            goto L_0x01a8
        L_0x0129:
            java.lang.Object r0 = r5.getObject(r7, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C203819ov.A04(r0)
            if (r1 <= 0) goto L_0x002a
            goto L_0x01a8
        L_0x0136:
            java.lang.Object r0 = r5.getObject(r7, r0)
            int r0 = A08(r0)
            int r1 = r0 << 3
            if (r1 <= 0) goto L_0x002a
            goto L_0x01a8
        L_0x0143:
            java.lang.Object r0 = r5.getObject(r7, r0)
            int r0 = A08(r0)
            int r1 = r0 << 2
            if (r1 <= 0) goto L_0x002a
            goto L_0x01a8
        L_0x0150:
            java.lang.Object r0 = r5.getObject(r7, r0)
            int r1 = A08(r0)
            if (r1 <= 0) goto L_0x002a
            goto L_0x01a8
        L_0x015b:
            java.lang.Object r0 = r5.getObject(r7, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C203819ov.A05(r0)
            if (r1 <= 0) goto L_0x002a
            goto L_0x01a8
        L_0x0168:
            java.lang.Object r0 = r5.getObject(r7, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C203819ov.A03(r0)
            if (r1 <= 0) goto L_0x002a
            goto L_0x01a8
        L_0x0175:
            java.lang.Object r0 = r5.getObject(r7, r0)
            int r0 = A08(r0)
            int r1 = r0 << 2
            if (r1 <= 0) goto L_0x002a
            goto L_0x01a8
        L_0x0182:
            java.lang.Object r0 = r5.getObject(r7, r0)
            int r0 = A08(r0)
            int r1 = r0 << 3
            if (r1 <= 0) goto L_0x002a
            goto L_0x01a8
        L_0x018f:
            java.lang.Object r0 = r5.getObject(r7, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C203819ov.A06(r0)
            if (r1 <= 0) goto L_0x002a
            goto L_0x01a8
        L_0x019c:
            java.lang.Object r0 = r5.getObject(r7, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C203819ov.A02(r0)
            if (r1 <= 0) goto L_0x002a
        L_0x01a8:
            int r12 = X.C194279Ox.A02(r9)
            boolean r0 = X.AnonymousClass8D7.A01
            int r0 = X.C165567td.A00(r1)
            int r12 = r12 + r0
            int r12 = r12 + r1
            goto L_0x048b
        L_0x01b6:
            boolean r0 = r6.A0E(r7, r9, r10)
            if (r0 == 0) goto L_0x002a
        L_0x01bc:
            int r0 = X.C194279Ox.A02(r9)
            int r12 = r0 + 8
            goto L_0x048b
        L_0x01c4:
            boolean r0 = r6.A0E(r7, r9, r10)
            if (r0 == 0) goto L_0x002a
        L_0x01ca:
            int r0 = X.C194279Ox.A02(r9)
            int r12 = r0 + 4
            goto L_0x048b
        L_0x01d2:
            boolean r2 = r6.A0E(r7, r9, r10)
            if (r2 == 0) goto L_0x002a
            long r0 = A09(r7, r0)
        L_0x01dc:
            int r12 = X.C194279Ox.A02(r9)
            int r0 = X.AnonymousClass8D7.A01(r0)
            int r12 = r12 + r0
            goto L_0x048b
        L_0x01e7:
            boolean r2 = r6.A0E(r7, r9, r10)
            if (r2 == 0) goto L_0x002a
            long r0 = A09(r7, r0)
        L_0x01f1:
            int r12 = X.C194279Ox.A02(r9)
            int r0 = X.AnonymousClass8D7.A01(r0)
            int r12 = r12 + r0
            goto L_0x048b
        L_0x01fc:
            boolean r2 = r6.A0E(r7, r9, r10)
            if (r2 == 0) goto L_0x002a
            java.lang.Object r0 = X.C203609oO.A01(r7, r0)
            int r1 = X.AnonymousClass000.A0I(r0)
        L_0x020a:
            int r12 = X.C194279Ox.A02(r9)
            if (r1 < 0) goto L_0x02d0
            goto L_0x02c7
        L_0x0212:
            boolean r0 = r6.A0E(r7, r9, r10)
            if (r0 == 0) goto L_0x002a
        L_0x0218:
            int r0 = X.C194279Ox.A02(r9)
            int r12 = r0 + 8
            goto L_0x048b
        L_0x0220:
            boolean r0 = r6.A0E(r7, r9, r10)
            if (r0 == 0) goto L_0x002a
        L_0x0226:
            int r0 = X.C194279Ox.A02(r9)
            int r12 = r0 + 4
            goto L_0x048b
        L_0x022e:
            boolean r0 = r6.A0E(r7, r9, r10)
            if (r0 == 0) goto L_0x002a
        L_0x0234:
            int r0 = X.C194279Ox.A02(r9)
            int r12 = r0 + 1
            goto L_0x048b
        L_0x023c:
            boolean r2 = r6.A0E(r7, r9, r10)
            if (r2 == 0) goto L_0x002a
            java.lang.Object r2 = X.C203609oO.A01(r7, r0)
            boolean r0 = r2 instanceof X.AUv
            if (r0 == 0) goto L_0x024b
            goto L_0x0288
        L_0x024b:
            java.lang.String r2 = (java.lang.String) r2
            int r3 = X.C194279Ox.A02(r9)
            int r0 = X.C201819kT.A00(r2)     // Catch:{ 92I -> 0x0256 }
            goto L_0x0278
        L_0x0256:
            java.nio.charset.Charset r0 = X.C197079b6.A00
            byte[] r0 = r2.getBytes(r0)
            int r0 = r0.length
            goto L_0x0278
        L_0x025e:
            boolean r2 = r6.A0E(r7, r9, r10)
            if (r2 == 0) goto L_0x002a
        L_0x0264:
            java.lang.Object r2 = X.C203609oO.A01(r7, r0)
            X.B3S r1 = r6.A0A(r10)
            java.lang.Class r0 = X.C203819ov.A03
            X.B5x r2 = (X.C23118B5x) r2
            int r3 = X.C194279Ox.A02(r9)
            int r0 = X.AnonymousClass8DG.A00(r1, r2)
        L_0x0278:
            int r12 = X.C194279Ox.A03(r0, r3)
            goto L_0x048b
        L_0x027e:
            boolean r2 = r6.A0E(r7, r9, r10)
            if (r2 == 0) goto L_0x002a
        L_0x0284:
            java.lang.Object r2 = X.C203609oO.A01(r7, r0)
        L_0x0288:
            X.AUv r2 = (X.AUv) r2
            int r1 = X.C194279Ox.A02(r9)
            int r0 = r2.A02()
            int r12 = X.C194279Ox.A03(r0, r1)
            goto L_0x048b
        L_0x0298:
            boolean r2 = r6.A0E(r7, r9, r10)
            if (r2 == 0) goto L_0x002a
            java.lang.Object r0 = X.C203609oO.A01(r7, r0)
            int r1 = X.AnonymousClass000.A0I(r0)
        L_0x02a6:
            int r12 = X.C194279Ox.A02(r9)
            boolean r0 = X.AnonymousClass8D7.A01
            int r0 = X.C165567td.A00(r1)
            int r12 = r12 + r0
            goto L_0x048b
        L_0x02b3:
            boolean r2 = r6.A0E(r7, r9, r10)
            if (r2 == 0) goto L_0x002a
            java.lang.Object r0 = X.C203609oO.A01(r7, r0)
            int r1 = X.AnonymousClass000.A0I(r0)
        L_0x02c1:
            int r12 = X.C194279Ox.A02(r9)
            if (r1 < 0) goto L_0x02d0
        L_0x02c7:
            boolean r0 = X.AnonymousClass8D7.A01
            int r0 = X.C165567td.A00(r1)
        L_0x02cd:
            int r12 = r12 + r0
            goto L_0x048b
        L_0x02d0:
            r0 = 10
            goto L_0x02cd
        L_0x02d3:
            boolean r0 = r6.A0E(r7, r9, r10)
            if (r0 == 0) goto L_0x002a
        L_0x02d9:
            int r0 = X.C194279Ox.A02(r9)
            int r12 = r0 + 4
            goto L_0x048b
        L_0x02e1:
            boolean r0 = r6.A0E(r7, r9, r10)
            if (r0 == 0) goto L_0x002a
        L_0x02e7:
            int r0 = X.C194279Ox.A02(r9)
            int r12 = r0 + 8
            goto L_0x048b
        L_0x02ef:
            boolean r2 = r6.A0E(r7, r9, r10)
            if (r2 == 0) goto L_0x002a
            java.lang.Object r0 = X.C203609oO.A01(r7, r0)
            int r1 = X.AnonymousClass000.A0I(r0)
        L_0x02fd:
            int r12 = X.C194279Ox.A02(r9)
            int r0 = r1 << 1
            int r1 = r1 >> 31
            r1 = r1 ^ r0
            boolean r0 = X.AnonymousClass8D7.A01
            int r0 = X.C165567td.A00(r1)
            int r12 = r12 + r0
            goto L_0x048b
        L_0x030f:
            boolean r2 = r6.A0E(r7, r9, r10)
            if (r2 == 0) goto L_0x002a
            long r3 = A09(r7, r0)
        L_0x0319:
            int r12 = X.C194279Ox.A02(r9)
            long r1 = r3 << r17
            r0 = 63
            long r3 = r3 >> r0
            long r3 = r3 ^ r1
            int r0 = X.AnonymousClass8D7.A01(r3)
            int r12 = r12 + r0
            goto L_0x048b
        L_0x032a:
            boolean r2 = r6.A0E(r7, r9, r10)
            if (r2 == 0) goto L_0x002a
        L_0x0330:
            java.lang.Object r2 = X.C203609oO.A01(r7, r0)
            X.B5x r2 = (X.C23118B5x) r2
            X.B3S r1 = r6.A0A(r10)
            boolean r0 = X.AnonymousClass8D7.A01
            int r0 = X.C194279Ox.A02(r9)
            int r12 = r0 << 1
            int r0 = X.AnonymousClass8DG.A00(r1, r2)
            int r12 = r12 + r0
            goto L_0x048b
        L_0x0349:
            java.lang.Object r0 = X.C203609oO.A01(r7, r0)
            int r12 = A08(r0)
            if (r12 == 0) goto L_0x04a2
            int r0 = X.C194279Ox.A02(r9)
            int r0 = r0 + 8
            int r12 = r12 * r0
            goto L_0x048b
        L_0x035c:
            java.lang.Object r0 = X.C203609oO.A01(r7, r0)
            int r12 = A08(r0)
            if (r12 == 0) goto L_0x04a2
            int r0 = X.C194279Ox.A02(r9)
            int r0 = r0 + 4
            int r12 = r12 * r0
            goto L_0x048b
        L_0x036f:
            java.lang.Object r2 = X.C203609oO.A01(r7, r0)
            java.util.List r2 = (java.util.List) r2
            java.lang.Class r0 = X.C203819ov.A03
            int r0 = r2.size()
            if (r0 == 0) goto L_0x04a2
            int r1 = X.C203819ov.A00(r2)
            int r0 = r2.size()
            int r12 = A01(r9, r0, r1)
            goto L_0x048b
        L_0x038b:
            java.lang.Object r2 = X.C203609oO.A01(r7, r0)
            java.util.List r2 = (java.util.List) r2
            java.lang.Class r0 = X.C203819ov.A03
            int r1 = r2.size()
            if (r1 == 0) goto L_0x04a2
            int r0 = X.C203819ov.A01(r2)
            int r12 = A01(r9, r1, r0)
            goto L_0x048b
        L_0x03a3:
            java.lang.Object r2 = X.C203609oO.A01(r7, r0)
            java.util.List r2 = (java.util.List) r2
            java.lang.Class r0 = X.C203819ov.A03
            int r1 = r2.size()
            if (r1 == 0) goto L_0x04a2
            int r0 = X.C203819ov.A04(r2)
            int r12 = A01(r9, r1, r0)
            goto L_0x048b
        L_0x03bb:
            java.lang.Object r0 = X.C203609oO.A01(r7, r0)
            int r12 = A08(r0)
            if (r12 == 0) goto L_0x04a2
            int r0 = X.C194279Ox.A02(r9)
            int r0 = r0 + 1
            int r12 = r12 * r0
            goto L_0x048b
        L_0x03ce:
            java.lang.Object r0 = X.C203609oO.A01(r7, r0)
            java.util.List r0 = (java.util.List) r0
            int r12 = X.C203819ov.A07(r0, r9)
            goto L_0x048b
        L_0x03da:
            java.lang.Object r4 = X.C203609oO.A01(r7, r0)
            java.util.List r4 = (java.util.List) r4
            X.B3S r3 = r6.A0A(r10)
            java.lang.Class r0 = X.C203819ov.A03
            int r2 = r4.size()
            r1 = 0
            if (r2 == 0) goto L_0x04a2
            int r12 = X.C194279Ox.A02(r9)
            int r12 = r12 * r2
        L_0x03f2:
            if (r1 >= r2) goto L_0x048b
            java.lang.Object r0 = r4.get(r1)
            X.B5x r0 = (X.C23118B5x) r0
            int r0 = X.AnonymousClass8DG.A00(r3, r0)
            int r12 = X.C194279Ox.A03(r0, r12)
            int r1 = r1 + 1
            goto L_0x03f2
        L_0x0405:
            java.lang.Object r2 = X.C203609oO.A01(r7, r0)
            java.util.List r2 = (java.util.List) r2
            java.lang.Class r0 = X.C203819ov.A03
            int r12 = r2.size()
            r1 = 0
            if (r12 == 0) goto L_0x04a2
            int r0 = X.C194279Ox.A02(r9)
            int r12 = r12 * r0
        L_0x0419:
            int r0 = r2.size()
            if (r1 >= r0) goto L_0x048b
            java.lang.Object r0 = r2.get(r1)
            X.AUv r0 = (X.AUv) r0
            int r0 = r0.A02()
            int r12 = X.C194279Ox.A03(r0, r12)
            int r1 = r1 + 1
            goto L_0x0419
        L_0x0430:
            java.lang.Object r2 = X.C203609oO.A01(r7, r0)
            java.util.List r2 = (java.util.List) r2
            java.lang.Class r0 = X.C203819ov.A03
            int r1 = r2.size()
            if (r1 == 0) goto L_0x04a2
            int r0 = X.C203819ov.A05(r2)
            int r12 = A01(r9, r1, r0)
            goto L_0x048b
        L_0x0447:
            java.lang.Object r2 = X.C203609oO.A01(r7, r0)
            java.util.List r2 = (java.util.List) r2
            java.lang.Class r0 = X.C203819ov.A03
            int r1 = r2.size()
            if (r1 == 0) goto L_0x04a2
            int r0 = X.C203819ov.A03(r2)
            int r12 = A01(r9, r1, r0)
            goto L_0x048b
        L_0x045e:
            java.lang.Object r2 = X.C203609oO.A01(r7, r0)
            java.util.List r2 = (java.util.List) r2
            java.lang.Class r0 = X.C203819ov.A03
            int r1 = r2.size()
            if (r1 == 0) goto L_0x04a2
            int r0 = X.C203819ov.A06(r2)
            int r12 = A01(r9, r1, r0)
            goto L_0x048b
        L_0x0475:
            java.lang.Object r2 = X.C203609oO.A01(r7, r0)
            java.util.List r2 = (java.util.List) r2
            java.lang.Class r0 = X.C203819ov.A03
            int r1 = r2.size()
            if (r1 == 0) goto L_0x04a2
            int r0 = X.C203819ov.A02(r2)
            int r12 = A01(r9, r1, r0)
        L_0x048b:
            int r13 = r13 + r12
            goto L_0x002a
        L_0x048e:
            java.lang.Object r11 = X.C203609oO.A01(r7, r0)
            java.util.List r11 = (java.util.List) r11
            X.B3S r8 = r6.A0A(r10)
            java.lang.Class r0 = X.C203819ov.A03
            int r4 = r11.size()
            r3 = 0
            r12 = 0
            if (r4 != 0) goto L_0x04a4
        L_0x04a2:
            r12 = 0
            goto L_0x048b
        L_0x04a4:
            if (r3 >= r4) goto L_0x048b
            java.lang.Object r2 = r11.get(r3)
            X.B5x r2 = (X.C23118B5x) r2
            boolean r0 = X.AnonymousClass8D7.A01
            int r0 = X.C194279Ox.A02(r9)
            int r1 = r0 << 1
            int r0 = X.AnonymousClass8DG.A00(r8, r2)
            int r1 = r1 + r0
            int r12 = r12 + r1
            int r3 = r3 + 1
            goto L_0x04a4
        L_0x04bd:
            X.C203609oO.A01(r7, r0)
            java.lang.String r0 = "isEmpty"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x04c7:
            X.8DG r7 = (X.AnonymousClass8DG) r7
            X.9js r0 = r7.zzjp
            int r0 = r0.A00()
            int r13 = r13 + r0
            return r13
        L_0x04d1:
            r4 = -1
            r3 = 0
            r15 = 0
            r14 = 0
        L_0x04d5:
            int[] r1 = r6.A02
            int r0 = r1.length
            if (r3 >= r0) goto L_0x0999
            int r0 = r3 + 1
            r11 = r1[r0]
            r9 = r1[r3]
            int r10 = X.C165587tf.A02(r11)
            r0 = 17
            if (r10 > r0) goto L_0x098c
            int r0 = r3 + 2
            r0 = r1[r0]
            r2 = r0 & r16
            int r0 = r0 >>> 20
            int r8 = r17 << r0
            if (r2 == r4) goto L_0x04fa
            long r0 = (long) r2
            int r14 = r5.getInt(r7, r0)
            r4 = r2
        L_0x04fa:
            r11 = r11 & r16
            long r1 = (long) r11
            switch(r10) {
                case 0: goto L_0x0522;
                case 1: goto L_0x0516;
                case 2: goto L_0x0503;
                case 3: goto L_0x052e;
                case 4: goto L_0x0541;
                case 5: goto L_0x055b;
                case 6: goto L_0x0567;
                case 7: goto L_0x0573;
                case 8: goto L_0x057f;
                case 9: goto L_0x0579;
                case 10: goto L_0x058d;
                case 11: goto L_0x0593;
                case 12: goto L_0x059d;
                case 13: goto L_0x05a7;
                case 14: goto L_0x05ad;
                case 15: goto L_0x05b3;
                case 16: goto L_0x05bd;
                case 17: goto L_0x05c7;
                case 18: goto L_0x05cd;
                case 19: goto L_0x05e0;
                case 20: goto L_0x05f3;
                case 21: goto L_0x060f;
                case 22: goto L_0x0627;
                case 23: goto L_0x05cd;
                case 24: goto L_0x05e0;
                case 25: goto L_0x063f;
                case 26: goto L_0x0652;
                case 27: goto L_0x065e;
                case 28: goto L_0x0689;
                case 29: goto L_0x06b4;
                case 30: goto L_0x06cc;
                case 31: goto L_0x05e0;
                case 32: goto L_0x05cd;
                case 33: goto L_0x06e4;
                case 34: goto L_0x06fc;
                case 35: goto L_0x0744;
                case 36: goto L_0x0752;
                case 37: goto L_0x0760;
                case 38: goto L_0x076e;
                case 39: goto L_0x077c;
                case 40: goto L_0x0789;
                case 41: goto L_0x0796;
                case 42: goto L_0x07a3;
                case 43: goto L_0x07ae;
                case 44: goto L_0x07bb;
                case 45: goto L_0x07c8;
                case 46: goto L_0x07d5;
                case 47: goto L_0x07e2;
                case 48: goto L_0x07ef;
                case 49: goto L_0x0714;
                case 50: goto L_0x098f;
                case 51: goto L_0x0809;
                case 52: goto L_0x0817;
                case 53: goto L_0x0825;
                case 54: goto L_0x082c;
                case 55: goto L_0x0841;
                case 56: goto L_0x0857;
                case 57: goto L_0x0865;
                case 58: goto L_0x0873;
                case 59: goto L_0x0881;
                case 60: goto L_0x08a3;
                case 61: goto L_0x08c3;
                case 62: goto L_0x08dd;
                case 63: goto L_0x08f8;
                case 64: goto L_0x0917;
                case 65: goto L_0x0926;
                case 66: goto L_0x0933;
                case 67: goto L_0x0952;
                case 68: goto L_0x096c;
                default: goto L_0x0500;
            }
        L_0x0500:
            int r3 = r3 + 4
            goto L_0x04d5
        L_0x0503:
            r0 = r14 & r8
            if (r0 == 0) goto L_0x0500
            long r10 = r5.getLong(r7, r1)
            int r1 = X.C194279Ox.A02(r9)
            int r0 = X.AnonymousClass8D7.A01(r10)
            int r1 = r1 + r0
            goto L_0x0923
        L_0x0516:
            r0 = r14 & r8
            if (r0 == 0) goto L_0x0500
            int r0 = X.C194279Ox.A02(r9)
            int r8 = r0 + 4
            goto L_0x0989
        L_0x0522:
            r0 = r14 & r8
            if (r0 == 0) goto L_0x0500
            int r0 = X.C194279Ox.A02(r9)
            int r8 = r0 + 8
            goto L_0x0989
        L_0x052e:
            r0 = r14 & r8
            if (r0 == 0) goto L_0x0500
            long r10 = r5.getLong(r7, r1)
            int r1 = X.C194279Ox.A02(r9)
            int r0 = X.AnonymousClass8D7.A01(r10)
            int r1 = r1 + r0
            goto L_0x0923
        L_0x0541:
            r0 = r14 & r8
            if (r0 == 0) goto L_0x0500
            int r2 = r5.getInt(r7, r1)
            int r1 = X.C194279Ox.A02(r9)
            if (r2 < 0) goto L_0x0558
            boolean r0 = X.AnonymousClass8D7.A01
            int r0 = X.C165567td.A00(r2)
        L_0x0555:
            int r1 = r1 + r0
            goto L_0x0923
        L_0x0558:
            r0 = 10
            goto L_0x0555
        L_0x055b:
            r0 = r14 & r8
            if (r0 == 0) goto L_0x0500
            int r0 = X.C194279Ox.A02(r9)
            int r1 = r0 + 8
            goto L_0x0923
        L_0x0567:
            r0 = r14 & r8
            if (r0 == 0) goto L_0x0500
            int r0 = X.C194279Ox.A02(r9)
            int r1 = r0 + 4
            goto L_0x0923
        L_0x0573:
            r0 = r14 & r8
            if (r0 == 0) goto L_0x0500
            goto L_0x0879
        L_0x0579:
            r0 = r14 & r8
            if (r0 == 0) goto L_0x0500
            goto L_0x08a9
        L_0x057f:
            r0 = r14 & r8
            if (r0 == 0) goto L_0x0500
            java.lang.Object r2 = r5.getObject(r7, r1)
            boolean r0 = r2 instanceof X.AUv
            if (r0 == 0) goto L_0x0890
            goto L_0x08cd
        L_0x058d:
            r0 = r14 & r8
            if (r0 == 0) goto L_0x0500
            goto L_0x08c9
        L_0x0593:
            r0 = r14 & r8
            if (r0 == 0) goto L_0x0500
            int r1 = r5.getInt(r7, r1)
            goto L_0x08eb
        L_0x059d:
            r0 = r14 & r8
            if (r0 == 0) goto L_0x0500
            int r1 = r5.getInt(r7, r1)
            goto L_0x0906
        L_0x05a7:
            r0 = r14 & r8
            if (r0 == 0) goto L_0x0500
            goto L_0x091d
        L_0x05ad:
            r0 = r14 & r8
            if (r0 == 0) goto L_0x0500
            goto L_0x092c
        L_0x05b3:
            r0 = r14 & r8
            if (r0 == 0) goto L_0x0500
            int r1 = r5.getInt(r7, r1)
            goto L_0x0941
        L_0x05bd:
            r0 = r14 & r8
            if (r0 == 0) goto L_0x0500
            long r10 = r5.getLong(r7, r1)
            goto L_0x095c
        L_0x05c7:
            r0 = r14 & r8
            if (r0 == 0) goto L_0x0500
            goto L_0x0972
        L_0x05cd:
            java.lang.Object r0 = r5.getObject(r7, r1)
            int r8 = A08(r0)
            if (r8 == 0) goto L_0x0728
            int r0 = X.C194279Ox.A02(r9)
            int r0 = r0 + 8
            int r8 = r8 * r0
            goto L_0x0989
        L_0x05e0:
            java.lang.Object r0 = r5.getObject(r7, r1)
            int r8 = A08(r0)
            if (r8 == 0) goto L_0x0728
            int r0 = X.C194279Ox.A02(r9)
            int r0 = r0 + 4
            int r8 = r8 * r0
            goto L_0x0989
        L_0x05f3:
            java.lang.Object r2 = r5.getObject(r7, r1)
            java.util.List r2 = (java.util.List) r2
            java.lang.Class r0 = X.C203819ov.A03
            int r0 = r2.size()
            if (r0 == 0) goto L_0x0728
            int r1 = X.C203819ov.A00(r2)
            int r0 = r2.size()
            int r8 = A01(r9, r0, r1)
            goto L_0x0989
        L_0x060f:
            java.lang.Object r2 = r5.getObject(r7, r1)
            java.util.List r2 = (java.util.List) r2
            java.lang.Class r0 = X.C203819ov.A03
            int r1 = r2.size()
            if (r1 == 0) goto L_0x0728
            int r0 = X.C203819ov.A01(r2)
            int r8 = A01(r9, r1, r0)
            goto L_0x0989
        L_0x0627:
            java.lang.Object r2 = r5.getObject(r7, r1)
            java.util.List r2 = (java.util.List) r2
            java.lang.Class r0 = X.C203819ov.A03
            int r1 = r2.size()
            if (r1 == 0) goto L_0x0728
            int r0 = X.C203819ov.A04(r2)
            int r8 = A01(r9, r1, r0)
            goto L_0x0989
        L_0x063f:
            java.lang.Object r0 = r5.getObject(r7, r1)
            int r8 = A08(r0)
            if (r8 == 0) goto L_0x0728
            int r0 = X.C194279Ox.A02(r9)
            int r0 = r0 + 1
            int r8 = r8 * r0
            goto L_0x0989
        L_0x0652:
            java.lang.Object r0 = r5.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r8 = X.C203819ov.A07(r0, r9)
            goto L_0x0989
        L_0x065e:
            java.lang.Object r11 = r5.getObject(r7, r1)
            java.util.List r11 = (java.util.List) r11
            X.B3S r10 = r6.A0A(r3)
            java.lang.Class r0 = X.C203819ov.A03
            int r2 = r11.size()
            r1 = 0
            if (r2 == 0) goto L_0x0728
            int r8 = X.C194279Ox.A02(r9)
            int r8 = r8 * r2
        L_0x0676:
            if (r1 >= r2) goto L_0x0989
            java.lang.Object r0 = r11.get(r1)
            X.B5x r0 = (X.C23118B5x) r0
            int r0 = X.AnonymousClass8DG.A00(r10, r0)
            int r8 = X.C194279Ox.A03(r0, r8)
            int r1 = r1 + 1
            goto L_0x0676
        L_0x0689:
            java.lang.Object r2 = r5.getObject(r7, r1)
            java.util.List r2 = (java.util.List) r2
            java.lang.Class r0 = X.C203819ov.A03
            int r8 = r2.size()
            r1 = 0
            if (r8 == 0) goto L_0x0728
            int r0 = X.C194279Ox.A02(r9)
            int r8 = r8 * r0
        L_0x069d:
            int r0 = r2.size()
            if (r1 >= r0) goto L_0x0989
            java.lang.Object r0 = r2.get(r1)
            X.AUv r0 = (X.AUv) r0
            int r0 = r0.A02()
            int r8 = X.C194279Ox.A03(r0, r8)
            int r1 = r1 + 1
            goto L_0x069d
        L_0x06b4:
            java.lang.Object r2 = r5.getObject(r7, r1)
            java.util.List r2 = (java.util.List) r2
            java.lang.Class r0 = X.C203819ov.A03
            int r1 = r2.size()
            if (r1 == 0) goto L_0x0728
            int r0 = X.C203819ov.A05(r2)
            int r8 = A01(r9, r1, r0)
            goto L_0x0989
        L_0x06cc:
            java.lang.Object r2 = r5.getObject(r7, r1)
            java.util.List r2 = (java.util.List) r2
            java.lang.Class r0 = X.C203819ov.A03
            int r1 = r2.size()
            if (r1 == 0) goto L_0x0728
            int r0 = X.C203819ov.A03(r2)
            int r8 = A01(r9, r1, r0)
            goto L_0x0989
        L_0x06e4:
            java.lang.Object r2 = r5.getObject(r7, r1)
            java.util.List r2 = (java.util.List) r2
            java.lang.Class r0 = X.C203819ov.A03
            int r1 = r2.size()
            if (r1 == 0) goto L_0x0728
            int r0 = X.C203819ov.A06(r2)
            int r8 = A01(r9, r1, r0)
            goto L_0x0989
        L_0x06fc:
            java.lang.Object r2 = r5.getObject(r7, r1)
            java.util.List r2 = (java.util.List) r2
            java.lang.Class r0 = X.C203819ov.A03
            int r1 = r2.size()
            if (r1 == 0) goto L_0x0728
            int r0 = X.C203819ov.A02(r2)
            int r8 = A01(r9, r1, r0)
            goto L_0x0989
        L_0x0714:
            java.lang.Object r13 = r5.getObject(r7, r1)
            java.util.List r13 = (java.util.List) r13
            X.B3S r12 = r6.A0A(r3)
            java.lang.Class r0 = X.C203819ov.A03
            int r11 = r13.size()
            r10 = 0
            r8 = 0
            if (r11 != 0) goto L_0x072b
        L_0x0728:
            r8 = 0
            goto L_0x0989
        L_0x072b:
            if (r10 >= r11) goto L_0x0989
            java.lang.Object r2 = r13.get(r10)
            X.B5x r2 = (X.C23118B5x) r2
            boolean r0 = X.AnonymousClass8D7.A01
            int r0 = X.C194279Ox.A02(r9)
            int r1 = r0 << 1
            int r0 = X.AnonymousClass8DG.A00(r12, r2)
            int r1 = r1 + r0
            int r8 = r8 + r1
            int r10 = r10 + 1
            goto L_0x072b
        L_0x0744:
            java.lang.Object r0 = r5.getObject(r7, r1)
            int r0 = A08(r0)
            int r2 = r0 << 3
            if (r2 <= 0) goto L_0x0500
            goto L_0x07fb
        L_0x0752:
            java.lang.Object r0 = r5.getObject(r7, r1)
            int r0 = A08(r0)
            int r2 = r0 << 2
            if (r2 <= 0) goto L_0x0500
            goto L_0x07fb
        L_0x0760:
            java.lang.Object r0 = r5.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r2 = X.C203819ov.A00(r0)
            if (r2 <= 0) goto L_0x0500
            goto L_0x07fb
        L_0x076e:
            java.lang.Object r0 = r5.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r2 = X.C203819ov.A01(r0)
            if (r2 <= 0) goto L_0x0500
            goto L_0x07fb
        L_0x077c:
            java.lang.Object r0 = r5.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r2 = X.C203819ov.A04(r0)
            if (r2 <= 0) goto L_0x0500
            goto L_0x07fb
        L_0x0789:
            java.lang.Object r0 = r5.getObject(r7, r1)
            int r0 = A08(r0)
            int r2 = r0 << 3
            if (r2 <= 0) goto L_0x0500
            goto L_0x07fb
        L_0x0796:
            java.lang.Object r0 = r5.getObject(r7, r1)
            int r0 = A08(r0)
            int r2 = r0 << 2
            if (r2 <= 0) goto L_0x0500
            goto L_0x07fb
        L_0x07a3:
            java.lang.Object r0 = r5.getObject(r7, r1)
            int r2 = A08(r0)
            if (r2 <= 0) goto L_0x0500
            goto L_0x07fb
        L_0x07ae:
            java.lang.Object r0 = r5.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r2 = X.C203819ov.A05(r0)
            if (r2 <= 0) goto L_0x0500
            goto L_0x07fb
        L_0x07bb:
            java.lang.Object r0 = r5.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r2 = X.C203819ov.A03(r0)
            if (r2 <= 0) goto L_0x0500
            goto L_0x07fb
        L_0x07c8:
            java.lang.Object r0 = r5.getObject(r7, r1)
            int r0 = A08(r0)
            int r2 = r0 << 2
            if (r2 <= 0) goto L_0x0500
            goto L_0x07fb
        L_0x07d5:
            java.lang.Object r0 = r5.getObject(r7, r1)
            int r0 = A08(r0)
            int r2 = r0 << 3
            if (r2 <= 0) goto L_0x0500
            goto L_0x07fb
        L_0x07e2:
            java.lang.Object r0 = r5.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r2 = X.C203819ov.A06(r0)
            if (r2 <= 0) goto L_0x0500
            goto L_0x07fb
        L_0x07ef:
            java.lang.Object r0 = r5.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r2 = X.C203819ov.A02(r0)
            if (r2 <= 0) goto L_0x0500
        L_0x07fb:
            int r1 = X.C194279Ox.A02(r9)
            boolean r0 = X.AnonymousClass8D7.A01
            int r0 = X.C165567td.A00(r2)
            int r1 = r1 + r0
            int r1 = r1 + r2
            goto L_0x0923
        L_0x0809:
            boolean r0 = r6.A0E(r7, r9, r3)
            if (r0 == 0) goto L_0x0500
            int r0 = X.C194279Ox.A02(r9)
            int r8 = r0 + 8
            goto L_0x0989
        L_0x0817:
            boolean r0 = r6.A0E(r7, r9, r3)
            if (r0 == 0) goto L_0x0500
            int r0 = X.C194279Ox.A02(r9)
            int r1 = r0 + 4
            goto L_0x0923
        L_0x0825:
            boolean r0 = r6.A0E(r7, r9, r3)
            if (r0 == 0) goto L_0x0500
            goto L_0x0832
        L_0x082c:
            boolean r0 = r6.A0E(r7, r9, r3)
            if (r0 == 0) goto L_0x0500
        L_0x0832:
            long r0 = A09(r7, r1)
            int r8 = X.C194279Ox.A02(r9)
            int r0 = X.AnonymousClass8D7.A01(r0)
            int r8 = r8 + r0
            goto L_0x0989
        L_0x0841:
            boolean r0 = r6.A0E(r7, r9, r3)
            if (r0 == 0) goto L_0x0500
            java.lang.Object r0 = X.C203609oO.A01(r7, r1)
            int r1 = X.AnonymousClass000.A0I(r0)
            int r8 = X.C194279Ox.A02(r9)
            if (r1 < 0) goto L_0x0914
            goto L_0x090c
        L_0x0857:
            boolean r0 = r6.A0E(r7, r9, r3)
            if (r0 == 0) goto L_0x0500
            int r0 = X.C194279Ox.A02(r9)
            int r8 = r0 + 8
            goto L_0x0989
        L_0x0865:
            boolean r0 = r6.A0E(r7, r9, r3)
            if (r0 == 0) goto L_0x0500
            int r0 = X.C194279Ox.A02(r9)
            int r1 = r0 + 4
            goto L_0x0923
        L_0x0873:
            boolean r0 = r6.A0E(r7, r9, r3)
            if (r0 == 0) goto L_0x0500
        L_0x0879:
            int r0 = X.C194279Ox.A02(r9)
            int r8 = r0 + 1
            goto L_0x0989
        L_0x0881:
            boolean r0 = r6.A0E(r7, r9, r3)
            if (r0 == 0) goto L_0x0500
            java.lang.Object r2 = r5.getObject(r7, r1)
            boolean r0 = r2 instanceof X.AUv
            if (r0 == 0) goto L_0x0890
            goto L_0x08cd
        L_0x0890:
            java.lang.String r2 = (java.lang.String) r2
            int r8 = X.C194279Ox.A02(r9)
            int r0 = X.C201819kT.A00(r2)     // Catch:{ 92I -> 0x089b }
            goto L_0x08bd
        L_0x089b:
            java.nio.charset.Charset r0 = X.C197079b6.A00
            byte[] r0 = r2.getBytes(r0)
            int r0 = r0.length
            goto L_0x08bd
        L_0x08a3:
            boolean r0 = r6.A0E(r7, r9, r3)
            if (r0 == 0) goto L_0x0500
        L_0x08a9:
            java.lang.Object r2 = r5.getObject(r7, r1)
            X.B3S r1 = r6.A0A(r3)
            java.lang.Class r0 = X.C203819ov.A03
            X.B5x r2 = (X.C23118B5x) r2
            int r8 = X.C194279Ox.A02(r9)
            int r0 = X.AnonymousClass8DG.A00(r1, r2)
        L_0x08bd:
            int r8 = X.C194279Ox.A03(r0, r8)
            goto L_0x0989
        L_0x08c3:
            boolean r0 = r6.A0E(r7, r9, r3)
            if (r0 == 0) goto L_0x0500
        L_0x08c9:
            java.lang.Object r2 = r5.getObject(r7, r1)
        L_0x08cd:
            X.AUv r2 = (X.AUv) r2
            int r1 = X.C194279Ox.A02(r9)
            int r0 = r2.A02()
            int r8 = X.C194279Ox.A03(r0, r1)
            goto L_0x0989
        L_0x08dd:
            boolean r0 = r6.A0E(r7, r9, r3)
            if (r0 == 0) goto L_0x0500
            java.lang.Object r0 = X.C203609oO.A01(r7, r1)
            int r1 = X.AnonymousClass000.A0I(r0)
        L_0x08eb:
            int r8 = X.C194279Ox.A02(r9)
            boolean r0 = X.AnonymousClass8D7.A01
            int r0 = X.C165567td.A00(r1)
            int r8 = r8 + r0
            goto L_0x0989
        L_0x08f8:
            boolean r0 = r6.A0E(r7, r9, r3)
            if (r0 == 0) goto L_0x0500
            java.lang.Object r0 = X.C203609oO.A01(r7, r1)
            int r1 = X.AnonymousClass000.A0I(r0)
        L_0x0906:
            int r8 = X.C194279Ox.A02(r9)
            if (r1 < 0) goto L_0x0914
        L_0x090c:
            boolean r0 = X.AnonymousClass8D7.A01
            int r0 = X.C165567td.A00(r1)
        L_0x0912:
            int r8 = r8 + r0
            goto L_0x0989
        L_0x0914:
            r0 = 10
            goto L_0x0912
        L_0x0917:
            boolean r0 = r6.A0E(r7, r9, r3)
            if (r0 == 0) goto L_0x0500
        L_0x091d:
            int r0 = X.C194279Ox.A02(r9)
            int r1 = r0 + 4
        L_0x0923:
            int r15 = r15 + r1
            goto L_0x0500
        L_0x0926:
            boolean r0 = r6.A0E(r7, r9, r3)
            if (r0 == 0) goto L_0x0500
        L_0x092c:
            int r0 = X.C194279Ox.A02(r9)
            int r8 = r0 + 8
            goto L_0x0989
        L_0x0933:
            boolean r0 = r6.A0E(r7, r9, r3)
            if (r0 == 0) goto L_0x0500
            java.lang.Object r0 = X.C203609oO.A01(r7, r1)
            int r1 = X.AnonymousClass000.A0I(r0)
        L_0x0941:
            int r8 = X.C194279Ox.A02(r9)
            int r0 = r1 << 1
            int r1 = r1 >> 31
            r1 = r1 ^ r0
            boolean r0 = X.AnonymousClass8D7.A01
            int r0 = X.C165567td.A00(r1)
            int r8 = r8 + r0
            goto L_0x0989
        L_0x0952:
            boolean r0 = r6.A0E(r7, r9, r3)
            if (r0 == 0) goto L_0x0500
            long r10 = A09(r7, r1)
        L_0x095c:
            int r8 = X.C194279Ox.A02(r9)
            long r1 = r10 << r17
            r0 = 63
            long r10 = r10 >> r0
            long r10 = r10 ^ r1
            int r0 = X.AnonymousClass8D7.A01(r10)
            int r8 = r8 + r0
            goto L_0x0989
        L_0x096c:
            boolean r0 = r6.A0E(r7, r9, r3)
            if (r0 == 0) goto L_0x0500
        L_0x0972:
            java.lang.Object r2 = r5.getObject(r7, r1)
            X.B5x r2 = (X.C23118B5x) r2
            X.B3S r1 = r6.A0A(r3)
            boolean r0 = X.AnonymousClass8D7.A01
            int r0 = X.C194279Ox.A02(r9)
            int r8 = r0 << 1
            int r0 = X.AnonymousClass8DG.A00(r1, r2)
            int r8 = r8 + r0
        L_0x0989:
            int r15 = r15 + r8
            goto L_0x0500
        L_0x098c:
            r8 = 0
            goto L_0x04fa
        L_0x098f:
            r5.getObject(r7, r1)
            java.lang.String r0 = "isEmpty"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x0999:
            X.8DG r7 = (X.AnonymousClass8DG) r7
            X.9js r0 = r7.zzjp
            int r0 = r0.A00()
            int r15 = r15 + r0
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21015A3e.Byv(java.lang.Object):int");
    }

    public final boolean Byx(Object obj) {
        int length;
        int i;
        boolean z;
        boolean z2;
        int[] iArr = this.A0C;
        if (iArr == null || (length = iArr.length) == 0) {
            return true;
        }
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        do {
            int i5 = iArr[i3];
            int A002 = A00(i5);
            int[] iArr2 = this.A02;
            int i6 = iArr2[A002 + 1];
            boolean z3 = this.A01;
            Object obj2 = obj;
            if (!z3) {
                int i7 = iArr2[A002 + 2];
                int i8 = i7 & 1048575;
                i = 1 << (i7 >>> 20);
                if (i8 != i2) {
                    i4 = A0F.getInt(obj2, (long) i8);
                    i2 = i8;
                }
            } else {
                i = 0;
            }
            if ((268435456 & i6) != 0) {
                if (z3) {
                    if (!A0D(obj2, A002)) {
                        return false;
                    }
                } else if ((i4 & i) == 0) {
                    return false;
                }
            }
            int i9 = (267386880 & i6) >>> 20;
            if (i9 == 9 || i9 == 17) {
                z = false;
                if (z3) {
                    z2 = A0D(obj2, A002);
                } else {
                    z2 = i4 & i;
                }
            } else {
                if (i9 != 27) {
                    if (i9 == 60 || i9 == 68) {
                        z = false;
                        z2 = A0E(obj2, i5, A002);
                    } else if (i9 != 49) {
                        if (i9 == 50) {
                            C203609oO.A01(obj2, (long) (i6 & 1048575));
                            throw AnonymousClass001.A0A("isEmpty");
                        }
                        i3++;
                    }
                }
                List A0B2 = A0B(i6, obj2);
                if (!A0B2.isEmpty()) {
                    B3S A0A2 = A0A(A002);
                    for (int i10 = 0; i10 < A0B2.size(); i10++) {
                        if (!A0A2.Byx(A0B2.get(i10))) {
                            return false;
                        }
                    }
                }
                i3++;
            }
            if (z2 && !A0A(A002).Byx(C203609oO.A01(obj2, (long) (i6 & 1048575)))) {
                return z;
            }
            i3++;
        } while (i3 < length);
        return true;
    }

    public static int A07(C192929Je r5, byte[] bArr, int i) {
        int A022 = C203009n7.A02(r5, bArr, i);
        int i2 = r5.A00;
        if (i2 == 0) {
            r5.A02 = "";
            return A022;
        }
        int i3 = A022 + i2;
        if (C201819kT.A00.A02(bArr, A022, i3) == 0) {
            r5.A02 = new String(bArr, A022, i2, C197079b6.A00);
            return i3;
        }
        throw new C187308xd("Protocol message had invalid UTF-8.");
    }

    public static long A09(Object obj, long j) {
        return ((Number) C203609oO.A01(obj, j)).longValue();
    }

    public static List A0B(int i, Object obj) {
        return (List) C203609oO.A01(obj, (long) (i & 1048575));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007e, code lost:
        X.C203609oO.A07(r13, r8, X.C203609oO.A01(r14, r8));
        X.C203609oO.A02.A0B(r13, X.C165577te.A0H(r3, r2), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0187, code lost:
        if (r12.A01 != false) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0189, code lost:
        r1 = r3[r2 + 2];
        r0 = X.C165597tg.A0D(r1);
        r4 = X.C203609oO.A02;
        r4.A0B(r13, r0, r4.A04(r13, r0) | (1 << (r1 >>> 20)));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Bye(java.lang.Object r13, java.lang.Object r14) {
        /*
            r12 = this;
            java.util.Objects.requireNonNull(r14)
            r2 = 0
        L_0x0004:
            int[] r3 = r12.A02
            int r0 = r3.length
            r7 = r13
            if (r2 >= r0) goto L_0x01b0
            int r0 = r2 + 1
            r1 = r3[r0]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r1
            long r8 = (long) r0
            r4 = r3[r2]
            int r0 = X.C165587tf.A02(r1)
            switch(r0) {
                case 0: goto L_0x0176;
                case 1: goto L_0x0166;
                case 2: goto L_0x0156;
                case 3: goto L_0x0156;
                case 4: goto L_0x0146;
                case 5: goto L_0x0156;
                case 6: goto L_0x0146;
                case 7: goto L_0x0136;
                case 8: goto L_0x0128;
                case 9: goto L_0x004f;
                case 10: goto L_0x0128;
                case 11: goto L_0x0146;
                case 12: goto L_0x0146;
                case 13: goto L_0x0146;
                case 14: goto L_0x0156;
                case 15: goto L_0x0146;
                case 16: goto L_0x0156;
                case 17: goto L_0x004f;
                case 18: goto L_0x008f;
                case 19: goto L_0x008f;
                case 20: goto L_0x008f;
                case 21: goto L_0x008f;
                case 22: goto L_0x008f;
                case 23: goto L_0x008f;
                case 24: goto L_0x008f;
                case 25: goto L_0x008f;
                case 26: goto L_0x008f;
                case 27: goto L_0x008f;
                case 28: goto L_0x008f;
                case 29: goto L_0x008f;
                case 30: goto L_0x008f;
                case 31: goto L_0x008f;
                case 32: goto L_0x008f;
                case 33: goto L_0x008f;
                case 34: goto L_0x008f;
                case 35: goto L_0x008f;
                case 36: goto L_0x008f;
                case 37: goto L_0x008f;
                case 38: goto L_0x008f;
                case 39: goto L_0x008f;
                case 40: goto L_0x008f;
                case 41: goto L_0x008f;
                case 42: goto L_0x008f;
                case 43: goto L_0x008f;
                case 44: goto L_0x008f;
                case 45: goto L_0x008f;
                case 46: goto L_0x008f;
                case 47: goto L_0x008f;
                case 48: goto L_0x008f;
                case 49: goto L_0x008f;
                case 50: goto L_0x01a1;
                case 51: goto L_0x0078;
                case 52: goto L_0x0078;
                case 53: goto L_0x0078;
                case 54: goto L_0x0078;
                case 55: goto L_0x0078;
                case 56: goto L_0x0078;
                case 57: goto L_0x0078;
                case 58: goto L_0x0078;
                case 59: goto L_0x0078;
                case 60: goto L_0x001f;
                case 61: goto L_0x0071;
                case 62: goto L_0x0071;
                case 63: goto L_0x0071;
                case 64: goto L_0x0071;
                case 65: goto L_0x0071;
                case 66: goto L_0x0071;
                case 67: goto L_0x0071;
                case 68: goto L_0x001f;
                default: goto L_0x001c;
            }
        L_0x001c:
            int r2 = r2 + 4
            goto L_0x0004
        L_0x001f:
            int r0 = r2 + 1
            r0 = r3[r0]
            r6 = r3[r2]
            long r0 = X.C165597tg.A0D(r0)
            boolean r4 = r12.A0E(r14, r6, r2)
            if (r4 == 0) goto L_0x001c
            java.lang.Object r5 = X.C203609oO.A01(r13, r0)
            java.lang.Object r4 = X.C203609oO.A01(r14, r0)
            if (r5 == 0) goto L_0x004c
            if (r4 == 0) goto L_0x001c
            X.8DG r4 = X.C197079b6.A00(r5, r4)
        L_0x003f:
            X.C203609oO.A07(r13, r0, r4)
            long r0 = X.C165577te.A0H(r3, r2)
            X.9Yh r3 = X.C203609oO.A02
            r3.A0B(r13, r0, r6)
            goto L_0x001c
        L_0x004c:
            if (r4 == 0) goto L_0x001c
            goto L_0x003f
        L_0x004f:
            long r0 = X.C165577te.A0G(r3, r2)
            boolean r4 = r12.A0D(r14, r2)
            if (r4 == 0) goto L_0x001c
            java.lang.Object r5 = X.C203609oO.A01(r13, r0)
            java.lang.Object r4 = X.C203609oO.A01(r14, r0)
            if (r5 == 0) goto L_0x006e
            if (r4 == 0) goto L_0x001c
            X.8DG r4 = X.C197079b6.A00(r5, r4)
        L_0x0069:
            X.C203609oO.A07(r13, r0, r4)
            goto L_0x0185
        L_0x006e:
            if (r4 == 0) goto L_0x001c
            goto L_0x0069
        L_0x0071:
            boolean r0 = r12.A0E(r14, r4, r2)
            if (r0 == 0) goto L_0x001c
            goto L_0x007e
        L_0x0078:
            boolean r0 = r12.A0E(r14, r4, r2)
            if (r0 == 0) goto L_0x001c
        L_0x007e:
            java.lang.Object r0 = X.C203609oO.A01(r14, r8)
            X.C203609oO.A07(r13, r8, r0)
            long r0 = X.C165577te.A0H(r3, r2)
            X.9Yh r3 = X.C203609oO.A02
            r3.A0B(r13, r0, r4)
            goto L_0x001c
        L_0x008f:
            X.9ex r0 = r12.A08
            boolean r0 = r0 instanceof X.AnonymousClass8DI
            if (r0 == 0) goto L_0x00c2
            java.lang.Object r5 = X.C203609oO.A01(r13, r8)
            X.B6a r5 = (X.C23120B6a) r5
            java.lang.Object r4 = X.C203609oO.A01(r14, r8)
            java.util.List r4 = (java.util.List) r4
            int r3 = r5.size()
            int r1 = r4.size()
            if (r3 <= 0) goto L_0x00bd
            if (r1 <= 0) goto L_0x00bc
            r0 = r5
            X.Ac8 r0 = (X.C21882Ac8) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x00b9
            int r1 = r1 + r3
            X.B6a r5 = r5.Byu(r1)
        L_0x00b9:
            r5.addAll(r4)
        L_0x00bc:
            r4 = r5
        L_0x00bd:
            X.C203609oO.A07(r13, r8, r4)
            goto L_0x001c
        L_0x00c2:
            java.lang.Object r4 = X.C203609oO.A01(r14, r8)
            java.util.List r4 = (java.util.List) r4
            int r1 = r4.size()
            java.lang.Object r3 = X.C203609oO.A01(r13, r8)
            java.util.List r3 = (java.util.List) r3
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x0104
            boolean r0 = r3 instanceof X.B6W
            if (r0 == 0) goto L_0x00ff
            X.8Cz r0 = X.C170328Cz.A01
            java.util.ArrayList r0 = X.C36441kJ.A14(r1)
            X.8Cz r3 = new X.8Cz
            r3.<init>(r0)
        L_0x00e7:
            X.C203609oO.A07(r13, r8, r3)
        L_0x00ea:
            int r1 = r3.size()
            int r0 = r4.size()
            if (r1 <= 0) goto L_0x00fa
            if (r0 <= 0) goto L_0x00f9
            r3.addAll(r4)
        L_0x00f9:
            r4 = r3
        L_0x00fa:
            X.C203609oO.A07(r13, r8, r4)
            goto L_0x001c
        L_0x00ff:
            java.util.ArrayList r3 = X.C36441kJ.A14(r1)
            goto L_0x00e7
        L_0x0104:
            java.lang.Class r0 = X.AnonymousClass8DJ.A00
            boolean r0 = X.C165587tf.A1b(r0, r3)
            if (r0 == 0) goto L_0x0118
            java.util.ArrayList r1 = X.C165587tf.A0n(r3, r1)
        L_0x0110:
            r1.addAll(r3)
            X.C203609oO.A07(r13, r8, r1)
            r3 = r1
            goto L_0x00ea
        L_0x0118:
            boolean r0 = r3 instanceof X.C21883Ac9
            if (r0 == 0) goto L_0x00ea
            X.8Cz r0 = X.C170328Cz.A01
            java.util.ArrayList r0 = X.C165587tf.A0n(r3, r1)
            X.8Cz r1 = new X.8Cz
            r1.<init>(r0)
            goto L_0x0110
        L_0x0128:
            boolean r0 = r12.A0D(r14, r2)
            if (r0 == 0) goto L_0x001c
            java.lang.Object r0 = X.C203609oO.A01(r14, r8)
            X.C203609oO.A07(r13, r8, r0)
            goto L_0x0185
        L_0x0136:
            boolean r0 = r12.A0D(r14, r2)
            if (r0 == 0) goto L_0x001c
            X.9Yh r1 = X.C203609oO.A02
            boolean r0 = r1.A0F(r14, r8)
            r1.A0D(r13, r8, r0)
            goto L_0x0185
        L_0x0146:
            boolean r0 = r12.A0D(r14, r2)
            if (r0 == 0) goto L_0x001c
            X.9Yh r1 = X.C203609oO.A02
            int r0 = r1.A04(r14, r8)
            r1.A0B(r13, r8, r0)
            goto L_0x0185
        L_0x0156:
            boolean r0 = r12.A0D(r14, r2)
            if (r0 == 0) goto L_0x001c
            X.9Yh r6 = X.C203609oO.A02
            long r10 = r6.A05(r14, r8)
            r6.A0C(r7, r8, r10)
            goto L_0x0185
        L_0x0166:
            boolean r0 = r12.A0D(r14, r2)
            if (r0 == 0) goto L_0x001c
            X.9Yh r1 = X.C203609oO.A02
            float r0 = r1.A03(r14, r8)
            r1.A0A(r13, r8, r0)
            goto L_0x0185
        L_0x0176:
            boolean r0 = r12.A0D(r14, r2)
            if (r0 == 0) goto L_0x001c
            X.9Yh r6 = X.C203609oO.A02
            double r10 = r6.A02(r14, r8)
            r6.A09(r7, r8, r10)
        L_0x0185:
            boolean r0 = r12.A01
            if (r0 != 0) goto L_0x001c
            int r0 = r2 + 2
            r1 = r3[r0]
            r5 = 1
            int r0 = r1 >>> 20
            int r5 = r5 << r0
            long r0 = X.C165597tg.A0D(r1)
            X.9Yh r4 = X.C203609oO.A02
            int r3 = r4.A04(r13, r0)
            r3 = r3 | r5
            r4.A0B(r13, r0, r3)
            goto L_0x001c
        L_0x01a1:
            java.lang.Class r0 = X.C203819ov.A03
            X.C203609oO.A01(r13, r8)
            X.C203609oO.A01(r14, r8)
            java.lang.String r0 = "isEmpty"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x01b0:
            boolean r0 = r12.A01
            if (r0 != 0) goto L_0x01b7
            X.C203819ov.A0P(r13, r14)
        L_0x01b7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21015A3e.Bye(java.lang.Object, java.lang.Object):void");
    }
}
