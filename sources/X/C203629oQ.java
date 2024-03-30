package X;

import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.9oQ  reason: invalid class name and case insensitive filesystem */
public class C203629oQ {
    public C201489jh A00;
    public int A01;
    public short A02;
    public short A03;
    public int[] A04;
    public int[] A05;
    public int[] A06;
    public int[] A07;
    public int[] A08;

    private void A09(String str, C203329nn r6) {
        int i = 0;
        if (str.charAt(0) == '(') {
            int i2 = 1;
            while (str.charAt(i2) != ')') {
                while (str.charAt(i2) == '[') {
                    i2++;
                }
                int i3 = i2 + 1;
                if (str.charAt(i2) == 'L') {
                    i2 = Math.max(i3, str.indexOf(59, i3) + 1);
                } else {
                    i2 = i3;
                }
            }
            i = i2 + 1;
        }
        int A022 = A02(str, r6, i);
        if (A022 != 0) {
            A06(A022);
            if (A022 == 4194308 || A022 == 4194307) {
                A06(4194304);
            }
        }
    }

    private int A00() {
        short s = this.A03;
        if (s > 0) {
            int[] iArr = this.A08;
            short s2 = (short) (s - 1);
            this.A03 = s2;
            return iArr[s2];
        }
        short s3 = (short) (this.A02 - 1);
        this.A02 = s3;
        return 25165824 | (-s3);
    }

    public static int A01(Object obj, C203329nn r19) {
        int i;
        int A002;
        Object obj2 = obj;
        if (obj2 instanceof Integer) {
            return 4194304 | AnonymousClass000.A0I(obj2);
        }
        C203329nn r6 = r19;
        if (obj2 instanceof String) {
            String str = (String) obj2;
            int i2 = 12;
            if (str.charAt(0) == '[') {
                i2 = 9;
            }
            return A02(new C203309nl(i2, 0, str, str.length()).A06(), r6, 0);
        }
        C201489jh r7 = (C201489jh) obj2;
        if ((r7.A05 & 4) == 0) {
            i = EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
            C193279Kv[] r10 = r6.A0A;
            if (r10 == null) {
                r10 = new C193279Kv[16];
                r6.A0A = r10;
                r6.A0B = new C193279Kv[16];
            }
            int identityHashCode = System.identityHashCode(r7);
            int length = r10.length;
            C193279Kv r4 = r10[identityHashCode % length];
            while (true) {
                if (r4 != null) {
                    if (r4.A02 == r7) {
                        break;
                    }
                    r4 = r4.A00;
                } else {
                    int i3 = r6.A02;
                    if (i3 > (length * 3) / 4) {
                        int i4 = (length * 2) + 1;
                        C193279Kv[] r5 = new C193279Kv[i4];
                        for (int i5 = length - 1; i5 >= 0; i5--) {
                            C193279Kv r3 = r10[i5];
                            while (r3 != null) {
                                int identityHashCode2 = System.identityHashCode(r3.A02) % i4;
                                C193279Kv r1 = r3.A00;
                                r3.A00 = r5[identityHashCode2];
                                r5[identityHashCode2] = r3;
                                r3 = r1;
                            }
                        }
                        r6.A0A = r5;
                    }
                    C193279Kv[] r32 = r6.A0B;
                    int length2 = r32.length;
                    if (i3 == length2) {
                        C193279Kv[] r12 = new C193279Kv[(length2 * 2)];
                        System.arraycopy(r32, 0, r12, 0, length2);
                        r6.A0B = r12;
                        r32 = r12;
                    }
                    int i6 = r6.A02;
                    r4 = new C193279Kv(r7, i6);
                    C193279Kv[] r13 = r6.A0A;
                    int length3 = identityHashCode % r13.length;
                    r4.A00 = r13[length3];
                    r13[length3] = r4;
                    r6.A02 = i6 + 1;
                    r32[i6] = r4;
                }
            }
            int i7 = r4.A01;
            int i8 = (130 + i7) & Integer.MAX_VALUE;
            C202499m2 A042 = C203329nn.A04(r6, i8);
            while (true) {
                if (A042 != null) {
                    if (A042.A03 == 130 && A042.A04 == i8 && A042.A05 == ((long) i7) && A042.A08.equals("")) {
                        A002 = A042.A02;
                        break;
                    }
                    A042 = A042.A01;
                } else {
                    A002 = C203329nn.A00(new C202499m2("", r6.A04, 130, i8, (long) i7), r6);
                    break;
                }
            }
        } else {
            i = 12582912;
            A002 = r6.A0A("", r7.A00);
        }
        return A002 | i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0032, code lost:
        if ((r9 & 1048576) != 0) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001f, code lost:
        if ((r9 & 1048576) != 0) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A03(X.C203629oQ r8, int r9, int r10) {
        /*
            r7 = -67108864(0xfffffffffc000000, float:-2.658456E36)
            r7 = r7 & r9
            r1 = 62914560(0x3c00000, float:1.1284746E-36)
            r1 = r1 & r9
            r6 = 4194307(0x400003, float:5.877476E-39)
            r5 = 4194304(0x400000, float:5.877472E-39)
            r4 = 4194308(0x400004, float:5.877477E-39)
            r3 = 1048576(0x100000, float:1.469368E-39)
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r0 = 20971520(0x1400000, float:3.526483E-38)
            if (r1 != r0) goto L_0x0026
            int[] r1 = r8.A05
            r0 = r9 & r2
            r0 = r1[r0]
            int r7 = r7 + r0
            r9 = r9 & r3
            if (r9 == 0) goto L_0x0035
        L_0x0021:
            if (r7 == r4) goto L_0x0025
            if (r7 != r6) goto L_0x0035
        L_0x0025:
            return r5
        L_0x0026:
            r0 = 25165824(0x1800000, float:4.7019774E-38)
            if (r1 != r0) goto L_0x0036
            int[] r0 = r8.A06
            r2 = r2 & r9
            int r10 = r10 - r2
            r0 = r0[r10]
            int r7 = r7 + r0
            r9 = r9 & r3
            if (r9 == 0) goto L_0x0035
            goto L_0x0021
        L_0x0035:
            return r7
        L_0x0036:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203629oQ.A03(X.9oQ, int, int):int");
    }

    private void A05(int i) {
        short s;
        short s2 = this.A03;
        if (s2 >= i) {
            s = (short) (s2 - i);
        } else {
            this.A02 = (short) (this.A02 - (i - s2));
            s = 0;
        }
        this.A03 = s;
    }

    private void A06(int i) {
        int[] iArr = this.A08;
        if (iArr == null) {
            iArr = new int[10];
            this.A08 = iArr;
        }
        int length = iArr.length;
        short s = this.A03;
        if (s >= length) {
            int[] iArr2 = new int[Math.max(s + 1, length * 2)];
            System.arraycopy(iArr, 0, iArr2, 0, length);
            this.A08 = iArr2;
            iArr = iArr2;
        }
        short s2 = this.A03;
        short s3 = (short) (s2 + 1);
        this.A03 = s3;
        iArr[s2] = i;
        short s4 = (short) (this.A02 + s3);
        C201489jh r1 = this.A00;
        if (s4 > r1.A08) {
            r1.A08 = s4;
        }
    }

    private void A07(int i, int i2) {
        int[] iArr = this.A07;
        if (iArr == null) {
            iArr = new int[10];
            this.A07 = iArr;
        }
        int length = iArr.length;
        if (i >= length) {
            int[] iArr2 = new int[Math.max(i + 1, length * 2)];
            System.arraycopy(iArr, 0, iArr2, 0, length);
            this.A07 = iArr2;
            iArr = iArr2;
        }
        iArr[i] = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00f1, code lost:
        if (r6 == 8388608) goto L_0x00f3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0A(X.C203329nn r15, int[] r16, int r17, int r18) {
        /*
            r6 = r17
            r3 = r16[r18]
            r4 = 0
            if (r3 == r6) goto L_0x001a
            r0 = 67108863(0x3ffffff, float:1.5046327E-36)
            r0 = r0 & r17
            r1 = 4194309(0x400005, float:5.877479E-39)
            if (r0 != r1) goto L_0x0016
            if (r3 == r1) goto L_0x001a
            r6 = 4194309(0x400005, float:5.877479E-39)
        L_0x0016:
            if (r3 != 0) goto L_0x001b
            r16[r18] = r6
        L_0x001a:
            return
        L_0x001b:
            r9 = -67108864(0xfffffffffc000000, float:-2.658456E36)
            r8 = r3 & r9
            r2 = 4194304(0x400000, float:5.877472E-39)
            r7 = 62914560(0x3c00000, float:1.1284746E-36)
            r5 = 8388608(0x800000, float:1.17549435E-38)
            if (r8 != 0) goto L_0x003d
            r0 = r3 & r7
            if (r0 == r5) goto L_0x003d
            if (r3 != r1) goto L_0x0038
            r0 = r6 & r9
            if (r0 != 0) goto L_0x0037
            r0 = r6 & r7
            if (r0 == r5) goto L_0x0037
            r6 = 4194304(0x400000, float:5.877472E-39)
        L_0x0037:
            r2 = r6
        L_0x0038:
            if (r2 == r3) goto L_0x001a
            r16[r18] = r2
            return
        L_0x003d:
            if (r6 == r1) goto L_0x001a
            r1 = -4194304(0xffffffffffc00000, float:NaN)
            r0 = r6 & r1
            r1 = r1 & r3
            java.lang.String r10 = "java/lang/Object"
            if (r0 != r1) goto L_0x00ec
            r0 = r3 & r7
            if (r0 != r5) goto L_0x0103
            r2 = r6 & r9
            r2 = r2 | r5
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r6 & r5
            r5 = r5 & r3
            r7 = 32
            if (r6 >= r5) goto L_0x00e8
            long r12 = (long) r6
            long r0 = (long) r5
        L_0x005a:
            long r0 = r0 << r7
            long r12 = r12 | r0
            int r0 = r6 + r5
            r11 = 131(0x83, float:1.84E-43)
            int r14 = r11 + r0
            r0 = 2147483647(0x7fffffff, float:NaN)
            r14 = r14 & r0
            X.9m2 r7 = X.C203329nn.A04(r15, r14)
        L_0x006a:
            if (r7 == 0) goto L_0x0081
            int r0 = r7.A03
            if (r0 != r11) goto L_0x007e
            int r0 = r7.A04
            if (r0 != r14) goto L_0x007e
            long r0 = r7.A05
            int r8 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r8 != 0) goto L_0x007e
            int r0 = r7.A00
        L_0x007c:
            r2 = r2 | r0
            goto L_0x0038
        L_0x007e:
            X.9m2 r7 = r7.A01
            goto L_0x006a
        L_0x0081:
            X.9m2[] r1 = r15.A09
            r0 = r1[r6]
            java.lang.String r8 = r0.A08
            r0 = r1[r5]
            java.lang.String r7 = r0.A08
            X.9Xc r0 = r15.A0D
            java.lang.Class r0 = r0.getClass()
            java.lang.ClassLoader r6 = r0.getClassLoader()
            r5 = 46
            r1 = 47
            java.lang.String r0 = r8.replace(r1, r5)     // Catch:{ ClassNotFoundException -> 0x0115 }
            java.lang.Class r0 = java.lang.Class.forName(r0, r4, r6)     // Catch:{ ClassNotFoundException -> 0x0115 }
            java.lang.String r9 = r7.replace(r1, r5)     // Catch:{ ClassNotFoundException -> 0x010e }
            java.lang.Class r4 = java.lang.Class.forName(r9, r4, r6)     // Catch:{ ClassNotFoundException -> 0x010e }
            boolean r6 = r0.isAssignableFrom(r4)
            if (r6 != 0) goto L_0x00b6
            boolean r6 = r4.isAssignableFrom(r0)
            if (r6 == 0) goto L_0x00c7
            r8 = r7
        L_0x00b6:
            int r0 = r15.A09(r8)
            int r10 = r15.A04
            X.9m2 r9 = new X.9m2
            r9.<init>((int) r10, (int) r11, (long) r12, (int) r14)
            X.C203329nn.A07(r9, r15)
            r9.A00 = r0
            goto L_0x007c
        L_0x00c7:
            boolean r6 = r0.isInterface()
            if (r6 != 0) goto L_0x00d3
            boolean r6 = r4.isInterface()
            if (r6 == 0) goto L_0x00d5
        L_0x00d3:
            r8 = r10
            goto L_0x00b6
        L_0x00d5:
            java.lang.Class r0 = r0.getSuperclass()
            boolean r6 = r0.isAssignableFrom(r4)
            if (r6 == 0) goto L_0x00d5
            java.lang.String r0 = r0.getName()
            java.lang.String r8 = r0.replace(r5, r1)
            goto L_0x00b6
        L_0x00e8:
            long r12 = (long) r5
            long r0 = (long) r6
            goto L_0x005a
        L_0x00ec:
            r1 = r6 & r9
            r6 = r6 & r7
            if (r1 != 0) goto L_0x00ff
            if (r6 != r5) goto L_0x0038
        L_0x00f3:
            if (r8 == 0) goto L_0x00fa
            r0 = r3 & r7
            if (r0 == r5) goto L_0x00fa
            int r8 = r8 + r9
        L_0x00fa:
            int r6 = java.lang.Math.min(r1, r8)
            goto L_0x0105
        L_0x00ff:
            if (r6 == r5) goto L_0x00f3
            int r1 = r1 + r9
            goto L_0x00f3
        L_0x0103:
            r6 = r6 & r9
            int r6 = r6 + r9
        L_0x0105:
            r6 = r6 | r5
            int r0 = r15.A09(r10)
            r2 = r6 | r0
            goto L_0x0038
        L_0x010e:
            r0 = move-exception
            java.lang.TypeNotPresentException r1 = new java.lang.TypeNotPresentException
            r1.<init>(r7, r0)
            throw r1
        L_0x0115:
            r0 = move-exception
            java.lang.TypeNotPresentException r1 = new java.lang.TypeNotPresentException
            r1.<init>(r8, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203629oQ.A0A(X.9nn, int[], int, int):void");
    }

    public final void A0B(String str, C203329nn r12, int i, int i2) {
        int i3;
        int[] iArr = new int[i2];
        this.A05 = iArr;
        this.A06 = new int[0];
        int i4 = 1;
        if ((i & 8) == 0) {
            int i5 = 4194310;
            if ((i & 262144) == 0) {
                i5 = 8388608 | r12.A09(r12.A05);
            }
            iArr[0] = i5;
        } else {
            i4 = 0;
        }
        int A002 = C203309nl.A00(str);
        C203309nl[] r5 = new C203309nl[A002];
        int i6 = 0;
        int i7 = 1;
        while (str.charAt(i7) != ')') {
            int i8 = i7;
            while (str.charAt(i8) == '[') {
                i8++;
            }
            int i9 = i8 + 1;
            if (str.charAt(i8) == 'L') {
                i9 = Math.max(i9, str.indexOf(59, i9) + 1);
            }
            r5[i6] = C203309nl.A04(str, i7, i9);
            i6++;
            i7 = i9;
        }
        for (int i10 = 0; i10 < A002; i10++) {
            int A022 = A02(r5[i10].A06(), r12, 0);
            int[] iArr2 = this.A05;
            int i11 = i3 + 1;
            iArr2[i3] = A022;
            if (A022 != 4194308) {
                i3 = i11;
                if (A022 != 4194307) {
                }
            }
            i3 = i11 + 1;
            iArr2[i11] = 4194304;
        }
        while (i3 < i2) {
            this.A05[i3] = 4194304;
            i3++;
        }
    }

    public final void A0C(C203189nU r14) {
        int i;
        int i2;
        int i3;
        int i4;
        int[] iArr = this.A05;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        loop0:
        while (true) {
            int i8 = 0;
            do {
                int i9 = 2;
                if (i6 >= iArr.length) {
                    break loop0;
                }
                i4 = iArr[i6];
                if (!(i4 == 4194308 || i4 == 4194307)) {
                    i9 = 1;
                }
                i6 += i9;
                i8++;
            } while (i4 == 4194304);
            i7 += i8;
        }
        int[] iArr2 = this.A06;
        int i10 = 0;
        int i11 = 0;
        while (i10 < iArr2.length) {
            int i12 = iArr2[i10];
            if (i12 != 4194308) {
                i3 = 1;
                if (i12 != 4194307) {
                    i10 += i3;
                    i11++;
                }
            }
            i3 = 2;
            i10 += i3;
            i11++;
        }
        int i13 = this.A00.A00;
        int i14 = i7 + 3 + i11;
        int[] iArr3 = r14.A0W;
        if (iArr3 == null || iArr3.length < i14) {
            iArr3 = new int[i14];
            r14.A0W = iArr3;
        }
        iArr3[0] = i13;
        iArr3[1] = i7;
        iArr3[2] = i11;
        int i15 = 3;
        int i16 = 0;
        while (true) {
            int i17 = i7 - 1;
            if (i7 <= 0) {
                break;
            }
            int i18 = iArr[i16];
            if (i18 != 4194308) {
                i2 = 1;
                if (i18 != 4194307) {
                    i16 += i2;
                    iArr3[i15] = i18;
                    i7 = i17;
                    i15++;
                }
            }
            i2 = 2;
            i16 += i2;
            iArr3[i15] = i18;
            i7 = i17;
            i15++;
        }
        while (true) {
            int i19 = i11 - 1;
            if (i11 > 0) {
                int i20 = iArr2[i5];
                if (i20 != 4194308) {
                    i = 1;
                    if (i20 != 4194307) {
                        i5 += i;
                        iArr3[i15] = i20;
                        i15++;
                        i11 = i19;
                    }
                }
                i = 2;
                i5 += i;
                iArr3[i15] = i20;
                i15++;
                i11 = i19;
            } else {
                r14.A06();
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01eb, code lost:
        A05(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0219, code lost:
        r1 = r1.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x021b, code lost:
        A09(r1, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x021e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x021f, code lost:
        r0 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0220, code lost:
        A05(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0223, code lost:
        A06(4194305);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0226, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x022a, code lost:
        A06(4194308);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0231, code lost:
        A06(4194306);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0234, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0238, code lost:
        A06(4194307);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x023b, code lost:
        A06(4194304);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x023e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0247, code lost:
        r0 = r3.A09(r1) | 8388608;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0257, code lost:
        r0 = r0 | r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0258, code lost:
        A06(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x025b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008c, code lost:
        A05(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0091, code lost:
        A05(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0094, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b6, code lost:
        A06(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c9, code lost:
        A06(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e6, code lost:
        A06(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e9, code lost:
        A06(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0187, code lost:
        if (r1.charAt(0) == '[') goto L_0x021b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x018b, code lost:
        A05(2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0191, code lost:
        r0 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0192, code lost:
        A05(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01bf, code lost:
        if (r20 <= 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01c1, code lost:
        r3 = r20 - 1;
        r2 = r4.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01c5, code lost:
        if (r2 == null) goto L_0x01e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01c8, code lost:
        if (r3 >= r2.length) goto L_0x01e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01ca, code lost:
        r1 = r2[r3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01cc, code lost:
        if (r1 != 0) goto L_0x01d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01ce, code lost:
        r1 = r3 | 20971520;
        r2[r3] = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01d2, code lost:
        if (r1 == 4194308) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01d4, code lost:
        if (r1 == 4194307) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01d6, code lost:
        r0 = r1 & 62914560;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01d8, code lost:
        if (r0 == 20971520) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01da, code lost:
        if (r0 != 25165824) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01dc, code lost:
        A07(r3, r1 | 1048576);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01e2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01e3, code lost:
        r1 = r3 | 20971520;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01e6, code lost:
        A07(r3, 4194304);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01e9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01ea, code lost:
        r0 = 2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0D(X.C202499m2 r17, X.C203329nn r18, int r19, int r20) {
        /*
            r16 = this;
            r10 = r20
            r11 = 4194306(0x400002, float:5.877475E-39)
            r15 = 8388608(0x800000, float:1.17549435E-38)
            r12 = 4194305(0x400001, float:5.877473E-39)
            r9 = 4194307(0x400003, float:5.877476E-39)
            r8 = 4194308(0x400004, float:5.877477E-39)
            r6 = 4194304(0x400000, float:5.877472E-39)
            r4 = r16
            r3 = r18
            r2 = r19
            r1 = r17
            switch(r19) {
                case 0: goto L_0x025f;
                case 1: goto L_0x024d;
                case 2: goto L_0x0223;
                case 3: goto L_0x0223;
                case 4: goto L_0x0223;
                case 5: goto L_0x0223;
                case 6: goto L_0x0223;
                case 7: goto L_0x0223;
                case 8: goto L_0x0223;
                case 9: goto L_0x022a;
                case 10: goto L_0x022a;
                case 11: goto L_0x0231;
                case 12: goto L_0x0231;
                case 13: goto L_0x0231;
                case 14: goto L_0x0238;
                case 15: goto L_0x0238;
                case 16: goto L_0x0223;
                case 17: goto L_0x0223;
                case 18: goto L_0x0205;
                default: goto L_0x001d;
            }
        L_0x001d:
            switch(r19) {
                case 21: goto L_0x0223;
                case 22: goto L_0x022a;
                case 23: goto L_0x0231;
                case 24: goto L_0x0238;
                case 25: goto L_0x01ef;
                default: goto L_0x0020;
            }
        L_0x0020:
            r7 = 25165824(0x1800000, float:4.7019774E-38)
            r5 = 20971520(0x1400000, float:3.526483E-38)
            r14 = 62914560(0x3c00000, float:1.1284746E-36)
            r13 = 1
            switch(r19) {
                case 46: goto L_0x021f;
                case 47: goto L_0x01ea;
                case 48: goto L_0x018b;
                case 49: goto L_0x0191;
                case 50: goto L_0x0197;
                case 51: goto L_0x021f;
                case 52: goto L_0x021f;
                case 53: goto L_0x021f;
                case 54: goto L_0x01a8;
                case 55: goto L_0x01b0;
                case 56: goto L_0x01a8;
                case 57: goto L_0x01b0;
                case 58: goto L_0x01a8;
                default: goto L_0x002a;
            }
        L_0x002a:
            r14 = 3
            r5 = 91
            r7 = 0
            r0 = 4
            switch(r19) {
                case 79: goto L_0x025c;
                case 80: goto L_0x0091;
                case 81: goto L_0x025c;
                case 82: goto L_0x0091;
                case 83: goto L_0x025c;
                case 84: goto L_0x025c;
                case 85: goto L_0x025c;
                case 86: goto L_0x025c;
                case 87: goto L_0x008c;
                case 88: goto L_0x0090;
                case 89: goto L_0x0044;
                case 90: goto L_0x0095;
                case 91: goto L_0x009e;
                case 92: goto L_0x00ab;
                case 93: goto L_0x00ba;
                case 94: goto L_0x00cd;
                case 95: goto L_0x00ee;
                case 96: goto L_0x021f;
                case 97: goto L_0x01eb;
                case 98: goto L_0x018b;
                case 99: goto L_0x0192;
                case 100: goto L_0x021f;
                case 101: goto L_0x01eb;
                case 102: goto L_0x018b;
                case 103: goto L_0x0192;
                case 104: goto L_0x021f;
                case 105: goto L_0x01eb;
                case 106: goto L_0x018b;
                case 107: goto L_0x0192;
                case 108: goto L_0x021f;
                case 109: goto L_0x01eb;
                case 110: goto L_0x018b;
                case 111: goto L_0x0192;
                case 112: goto L_0x021f;
                case 113: goto L_0x01eb;
                case 114: goto L_0x018b;
                case 115: goto L_0x0192;
                case 116: goto L_0x025f;
                case 117: goto L_0x025f;
                case 118: goto L_0x025f;
                case 119: goto L_0x025f;
                case 120: goto L_0x021f;
                case 121: goto L_0x003f;
                case 122: goto L_0x021f;
                case 123: goto L_0x003f;
                case 124: goto L_0x021f;
                case 125: goto L_0x003f;
                case 126: goto L_0x021f;
                case 127: goto L_0x01eb;
                case 128: goto L_0x021f;
                case 129: goto L_0x01eb;
                case 130: goto L_0x021f;
                case 131: goto L_0x01eb;
                case 132: goto L_0x00fd;
                case 133: goto L_0x0227;
                case 134: goto L_0x022e;
                case 135: goto L_0x0235;
                case 136: goto L_0x021f;
                case 137: goto L_0x018b;
                case 138: goto L_0x0191;
                case 139: goto L_0x003a;
                case 140: goto L_0x0227;
                case 141: goto L_0x0235;
                case 142: goto L_0x021f;
                case 143: goto L_0x01ea;
                case 144: goto L_0x018b;
                case 145: goto L_0x025f;
                case 146: goto L_0x025f;
                case 147: goto L_0x025f;
                case 148: goto L_0x0220;
                case 149: goto L_0x021f;
                case 150: goto L_0x021f;
                case 151: goto L_0x0220;
                case 152: goto L_0x0220;
                case 153: goto L_0x008c;
                case 154: goto L_0x008c;
                case 155: goto L_0x008c;
                case 156: goto L_0x008c;
                case 157: goto L_0x008c;
                case 158: goto L_0x008c;
                case 159: goto L_0x0090;
                case 160: goto L_0x0090;
                case 161: goto L_0x0090;
                case 162: goto L_0x0090;
                case 163: goto L_0x0090;
                case 164: goto L_0x0090;
                case 165: goto L_0x0090;
                case 166: goto L_0x0090;
                case 167: goto L_0x025f;
                case 168: goto L_0x0052;
                case 169: goto L_0x0052;
                case 170: goto L_0x008c;
                case 171: goto L_0x008c;
                case 172: goto L_0x008c;
                case 173: goto L_0x0090;
                case 174: goto L_0x008c;
                case 175: goto L_0x0090;
                case 176: goto L_0x008c;
                case 177: goto L_0x025f;
                case 178: goto L_0x0219;
                case 179: goto L_0x0101;
                case 180: goto L_0x004d;
                case 181: goto L_0x0107;
                case 182: goto L_0x0110;
                case 183: goto L_0x0110;
                case 184: goto L_0x0110;
                case 185: goto L_0x0110;
                case 186: goto L_0x0156;
                case 187: goto L_0x015f;
                case 188: goto L_0x0059;
                case 189: goto L_0x0169;
                case 190: goto L_0x003a;
                case 191: goto L_0x008c;
                case 192: goto L_0x017e;
                case 193: goto L_0x003a;
                case 194: goto L_0x008c;
                case 195: goto L_0x008c;
                default: goto L_0x0032;
            }
        L_0x0032:
            switch(r19) {
                case 197: goto L_0x0216;
                case 198: goto L_0x008c;
                case 199: goto L_0x008c;
                default: goto L_0x0035;
            }
        L_0x0035:
            java.lang.IllegalArgumentException r0 = X.C165617ti.A0U()
            throw r0
        L_0x003a:
            r4.A05(r13)
            goto L_0x0223
        L_0x003f:
            r4.A05(r14)
            goto L_0x022a
        L_0x0044:
            int r0 = r4.A00()
            r4.A06(r0)
            goto L_0x0258
        L_0x004d:
            r4.A05(r13)
            goto L_0x0219
        L_0x0052:
            java.lang.String r0 = "JSR/RET are not supported with computeFrames option"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x0059:
            r4.A00()
            switch(r20) {
                case 4: goto L_0x0064;
                case 5: goto L_0x0069;
                case 6: goto L_0x006e;
                case 7: goto L_0x0073;
                case 8: goto L_0x0078;
                case 9: goto L_0x007d;
                case 10: goto L_0x0082;
                case 11: goto L_0x0087;
                default: goto L_0x005f;
            }
        L_0x005f:
            java.lang.IllegalArgumentException r0 = X.C165617ti.A0U()
            throw r0
        L_0x0064:
            r0 = 71303177(0x4400009, float:2.2569508E-36)
            goto L_0x0258
        L_0x0069:
            r0 = 71303179(0x440000b, float:2.2569511E-36)
            goto L_0x0258
        L_0x006e:
            r0 = 71303170(0x4400002, float:2.2569495E-36)
            goto L_0x0258
        L_0x0073:
            r0 = 71303171(0x4400003, float:2.2569497E-36)
            goto L_0x0258
        L_0x0078:
            r0 = 71303178(0x440000a, float:2.256951E-36)
            goto L_0x0258
        L_0x007d:
            r0 = 71303180(0x440000c, float:2.2569513E-36)
            goto L_0x0258
        L_0x0082:
            r0 = 71303169(0x4400001, float:2.2569493E-36)
            goto L_0x0258
        L_0x0087:
            r0 = 71303172(0x4400004, float:2.2569499E-36)
            goto L_0x0258
        L_0x008c:
            r4.A05(r13)
            return
        L_0x0090:
            r0 = 2
        L_0x0091:
            r4.A05(r0)
            return
        L_0x0095:
            int r0 = r4.A00()
            int r3 = r4.A00()
            goto L_0x00b6
        L_0x009e:
            int r0 = r4.A00()
            int r3 = r4.A00()
            int r2 = r4.A00()
            goto L_0x00c9
        L_0x00ab:
            int r0 = r4.A00()
            int r3 = r4.A00()
            r4.A06(r3)
        L_0x00b6:
            r4.A06(r0)
            goto L_0x00e9
        L_0x00ba:
            int r0 = r4.A00()
            int r3 = r4.A00()
            int r2 = r4.A00()
            r4.A06(r3)
        L_0x00c9:
            r4.A06(r0)
            goto L_0x00e6
        L_0x00cd:
            int r0 = r4.A00()
            int r3 = r4.A00()
            int r2 = r4.A00()
            int r1 = r4.A00()
            r4.A06(r3)
            r4.A06(r0)
            r4.A06(r1)
        L_0x00e6:
            r4.A06(r2)
        L_0x00e9:
            r4.A06(r3)
            goto L_0x0258
        L_0x00ee:
            int r1 = r4.A00()
            int r0 = r4.A00()
            r4.A06(r1)
            r4.A06(r0)
            return
        L_0x00fd:
            r4.A07(r10, r12)
            return
        L_0x0101:
            java.lang.String r0 = r1.A08
            r4.A08(r0)
            return
        L_0x0107:
            java.lang.String r0 = r1.A08
            r4.A08(r0)
            r4.A00()
            return
        L_0x0110:
            java.lang.String r6 = r1.A08
            r4.A08(r6)
            r0 = 184(0xb8, float:2.58E-43)
            if (r2 == r0) goto L_0x0152
            int r8 = r4.A00()
            r0 = 183(0xb7, float:2.56E-43)
            if (r2 != r0) goto L_0x0152
            java.lang.String r0 = r1.A06
            char r1 = r0.charAt(r7)
            r0 = 60
            if (r1 != r0) goto L_0x0152
            int[] r5 = r4.A04
            if (r5 != 0) goto L_0x0135
            int[] r5 = X.C36441kJ.A1O()
            r4.A04 = r5
        L_0x0135:
            int r2 = r5.length
            int r0 = r4.A01
            if (r0 < r2) goto L_0x014a
            int r1 = r0 + 1
            int r0 = r2 * 2
            int r0 = java.lang.Math.max(r1, r0)
            int[] r0 = new int[r0]
            java.lang.System.arraycopy(r5, r7, r0, r7, r2)
            r4.A04 = r0
            r5 = r0
        L_0x014a:
            int r1 = r4.A01
            int r0 = r1 + 1
            r4.A01 = r0
            r5[r1] = r8
        L_0x0152:
            r4.A09(r6, r3)
            return
        L_0x0156:
            java.lang.String r0 = r1.A08
            r4.A08(r0)
            r4.A09(r0, r3)
            return
        L_0x015f:
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            java.lang.String r1 = r1.A08
            int r2 = r3.A0A(r1, r10)
            goto L_0x0257
        L_0x0169:
            java.lang.String r1 = r1.A08
            r4.A00()
            char r0 = r1.charAt(r7)
            if (r0 != r5) goto L_0x0251
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0u()
            java.lang.String r1 = X.C90464aC.A0f(r1, r0, r5)
            goto L_0x021b
        L_0x017e:
            java.lang.String r1 = r1.A08
            r4.A00()
            char r0 = r1.charAt(r7)
            if (r0 != r5) goto L_0x0247
            goto L_0x021b
        L_0x018b:
            r0 = 2
            r4.A05(r0)
            goto L_0x0231
        L_0x0191:
            r0 = 2
        L_0x0192:
            r4.A05(r0)
            goto L_0x0238
        L_0x0197:
            r4.A05(r13)
            int r0 = r4.A00()
            r1 = 4194309(0x400005, float:5.877479E-39)
            if (r0 == r1) goto L_0x0258
            r1 = -67108864(0xfffffffffc000000, float:-2.658456E36)
            int r0 = r0 + r1
            goto L_0x0258
        L_0x01a8:
            int r0 = r4.A00()
            r4.A07(r10, r0)
            goto L_0x01bf
        L_0x01b0:
            r4.A05(r13)
            int r0 = r4.A00()
            r4.A07(r10, r0)
            int r0 = r20 + 1
            r4.A07(r0, r6)
        L_0x01bf:
            if (r20 <= 0) goto L_0x025f
            int r3 = r20 + -1
            int[] r2 = r4.A07
            if (r2 == 0) goto L_0x01e3
            int r0 = r2.length
            if (r3 >= r0) goto L_0x01e3
            r1 = r2[r3]
            if (r1 != 0) goto L_0x01d2
            r1 = r3 | r5
            r2[r3] = r1
        L_0x01d2:
            if (r1 == r8) goto L_0x01e6
            if (r1 == r9) goto L_0x01e6
            r0 = r1 & r14
            if (r0 == r5) goto L_0x01dc
            if (r0 != r7) goto L_0x025f
        L_0x01dc:
            r0 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 | r0
            r4.A07(r3, r1)
            return
        L_0x01e3:
            r1 = r3 | r5
            goto L_0x01d2
        L_0x01e6:
            r4.A07(r3, r6)
            return
        L_0x01ea:
            r0 = 2
        L_0x01eb:
            r4.A05(r0)
            goto L_0x022a
        L_0x01ef:
            int[] r2 = r4.A07
            r1 = 20971520(0x1400000, float:3.526483E-38)
            if (r2 == 0) goto L_0x0201
            int r0 = r2.length
            if (r10 >= r0) goto L_0x0201
            r0 = r2[r20]
            if (r0 != 0) goto L_0x0258
            r0 = r20 | r1
            r2[r20] = r0
            goto L_0x0258
        L_0x0201:
            r10 = r20 | r1
            r0 = r10
            goto L_0x0258
        L_0x0205:
            int r0 = r1.A03
            switch(r0) {
                case 3: goto L_0x0223;
                case 4: goto L_0x0231;
                case 5: goto L_0x022a;
                case 6: goto L_0x0238;
                case 7: goto L_0x023f;
                case 8: goto L_0x0242;
                default: goto L_0x020a;
            }
        L_0x020a:
            switch(r0) {
                case 15: goto L_0x0213;
                case 16: goto L_0x0245;
                case 17: goto L_0x0219;
                default: goto L_0x020d;
            }
        L_0x020d:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x0213:
            java.lang.String r1 = "java/lang/invoke/MethodHandle"
            goto L_0x0247
        L_0x0216:
            r4.A05(r10)
        L_0x0219:
            java.lang.String r1 = r1.A08
        L_0x021b:
            r4.A09(r1, r3)
            return
        L_0x021f:
            r0 = 2
        L_0x0220:
            r4.A05(r0)
        L_0x0223:
            r4.A06(r12)
            return
        L_0x0227:
            r4.A05(r13)
        L_0x022a:
            r4.A06(r8)
            goto L_0x023b
        L_0x022e:
            r4.A05(r13)
        L_0x0231:
            r4.A06(r11)
            return
        L_0x0235:
            r4.A05(r13)
        L_0x0238:
            r4.A06(r9)
        L_0x023b:
            r4.A06(r6)
            return
        L_0x023f:
            java.lang.String r1 = "java/lang/Class"
            goto L_0x0247
        L_0x0242:
            java.lang.String r1 = "java/lang/String"
            goto L_0x0247
        L_0x0245:
            java.lang.String r1 = "java/lang/invoke/MethodType"
        L_0x0247:
            int r0 = r3.A09(r1)
            r0 = r0 | r15
            goto L_0x0258
        L_0x024d:
            r0 = 4194309(0x400005, float:5.877479E-39)
            goto L_0x0258
        L_0x0251:
            r2 = 75497472(0x4800000, float:3.0092655E-36)
            int r0 = r3.A09(r1)
        L_0x0257:
            r0 = r0 | r2
        L_0x0258:
            r4.A06(r0)
            return
        L_0x025c:
            r4.A05(r14)
        L_0x025f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203629oQ.A0D(X.9m2, X.9nn, int, int):void");
    }

    public C203629oQ(C201489jh r1) {
        this.A00 = r1;
    }

    public static int A02(String str, C203329nn r13, int i) {
        char charAt = str.charAt(i);
        int i2 = 4194306;
        if (charAt == 'F') {
            return 4194306;
        }
        if (charAt == 'L') {
            return r13.A09(str.substring(i + 1, str.length() - 1)) | 8388608;
        }
        if (charAt != 'S') {
            if (charAt == 'V') {
                return 0;
            }
            if (charAt != 'I') {
                if (charAt == 'J') {
                    return 4194308;
                }
                if (charAt != 'Z') {
                    if (charAt != '[') {
                        switch (charAt) {
                            case 'B':
                            case AnonymousClass8SX.BOT_INVOKE_MESSAGE_FIELD_NUMBER:
                                break;
                            case 'D':
                                return 4194307;
                            default:
                                StringBuilder A0u = AnonymousClass000.A0u();
                                A0u.append("Invalid descriptor: ");
                                throw AnonymousClass000.A0c(str.substring(i), A0u);
                        }
                    } else {
                        int i3 = i + 1;
                        while (str.charAt(i3) == '[') {
                            i3++;
                        }
                        char charAt2 = str.charAt(i3);
                        if (charAt2 != 'F') {
                            if (charAt2 == 'L') {
                                i2 = r13.A09(str.substring(i3 + 1, str.length() - 1)) | 8388608;
                            } else if (charAt2 == 'S') {
                                i2 = 4194316;
                            } else if (charAt2 == 'Z') {
                                i2 = 4194313;
                            } else if (charAt2 == 'I') {
                                i2 = 4194305;
                            } else if (charAt2 != 'J') {
                                switch (charAt2) {
                                    case 'B':
                                        i2 = 4194314;
                                        break;
                                    case AnonymousClass8SX.BOT_INVOKE_MESSAGE_FIELD_NUMBER:
                                        i2 = 4194315;
                                        break;
                                    case 'D':
                                        i2 = 4194307;
                                        break;
                                    default:
                                        StringBuilder A0u2 = AnonymousClass000.A0u();
                                        A0u2.append("Invalid descriptor fragment: ");
                                        throw AnonymousClass000.A0c(str.substring(i3), A0u2);
                                }
                            } else {
                                i2 = 4194308;
                            }
                        }
                        return ((i3 - i) << 26) | i2;
                    }
                }
            }
        }
        return 4194305;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043 A[LOOP:0: B:7:0x0011->B:20:0x0043, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x002f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A04(X.C203629oQ r8, X.C203329nn r9, int r10) {
        /*
            r6 = 4194310(0x400006, float:5.87748E-39)
            if (r10 == r6) goto L_0x0010
            r1 = -4194304(0xffffffffffc00000, float:NaN)
            r1 = r1 & r10
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            if (r1 == r0) goto L_0x0010
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            if (r1 != r0) goto L_0x0051
        L_0x0010:
            r7 = 0
        L_0x0011:
            int r0 = r8.A01
            if (r7 >= r0) goto L_0x0051
            int[] r0 = r8.A04
            r1 = r0[r7]
            r5 = -67108864(0xfffffffffc000000, float:-2.658456E36)
            r5 = r5 & r1
            r4 = 62914560(0x3c00000, float:1.1284746E-36)
            r4 = r4 & r1
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r1 & r3
            r0 = 20971520(0x1400000, float:3.526483E-38)
            if (r4 != r0) goto L_0x0046
            int[] r0 = r8.A05
            r1 = r0[r2]
        L_0x002c:
            int r1 = r1 + r5
        L_0x002d:
            if (r10 != r1) goto L_0x0043
            r1 = 8388608(0x800000, float:1.17549435E-38)
            if (r10 != r6) goto L_0x003b
            java.lang.String r0 = r9.A05
        L_0x0035:
            int r0 = r9.A09(r0)
            r0 = r0 | r1
            return r0
        L_0x003b:
            r10 = r10 & r3
            X.9m2[] r0 = r9.A09
            r0 = r0[r10]
            java.lang.String r0 = r0.A08
            goto L_0x0035
        L_0x0043:
            int r7 = r7 + 1
            goto L_0x0011
        L_0x0046:
            r0 = 25165824(0x1800000, float:4.7019774E-38)
            if (r4 != r0) goto L_0x002d
            int[] r1 = r8.A06
            int r0 = r1.length
            int r0 = r0 - r2
            r1 = r1[r0]
            goto L_0x002c
        L_0x0051:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203629oQ.A04(X.9oQ, X.9nn, int):int");
    }

    private void A08(String str) {
        char A002 = C165597tg.A00(str);
        if (A002 == '(') {
            A05((C203309nl.A01(str) >> 2) - 1);
        } else if (A002 == 'J' || A002 == 'D') {
            A05(2);
        } else {
            A05(1);
        }
    }
}
