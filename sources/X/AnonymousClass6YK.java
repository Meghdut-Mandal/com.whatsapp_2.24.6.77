package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.6YK  reason: invalid class name */
public final class AnonymousClass6YK {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public AnonymousClass6Ne A0C;
    public ArrayList A0D;
    public HashMap A0E;
    public boolean A0F;
    public int[] A0G;
    public Object[] A0H;
    public final AnonymousClass61S A0I = new AnonymousClass61S();
    public final C1496372c A0J;
    public final AnonymousClass61S A0K = new AnonymousClass61S();
    public final AnonymousClass61S A0L = new AnonymousClass61S();

    public static final boolean A0H(AnonymousClass6YK r9, int i, int i2) {
        boolean z = false;
        if (i2 > 0) {
            ArrayList arrayList = r9.A0D;
            A08(r9, i);
            if (C36411kG.A1a(arrayList)) {
                HashMap hashMap = r9.A0E;
                int i3 = i2 + i;
                int length = (r9.A0G.length / 5) - r9.A04;
                ArrayList arrayList2 = r9.A0D;
                int A012 = AnonymousClass6QR.A01(arrayList2, i3, length);
                if (A012 < 0) {
                    A012 = -(A012 + 1);
                }
                if (A012 >= arrayList2.size()) {
                    A012--;
                }
                int i4 = A012 + 1;
                int i5 = 0;
                while (A012 >= 0) {
                    AnonymousClass606 r2 = (AnonymousClass606) r9.A0D.get(A012);
                    int i6 = r2.A00;
                    if (i6 < 0) {
                        i6 += A00(r9);
                    }
                    if (i6 < i) {
                        break;
                    }
                    if (i6 < i3) {
                        r2.A00 = Integer.MIN_VALUE;
                        if (hashMap != null) {
                            hashMap.remove(r2);
                        }
                        if (i5 == 0) {
                            i5 = A012 + 1;
                        }
                        i4 = A012;
                    }
                    A012--;
                }
                if (i4 < i5) {
                    z = true;
                    r9.A0D.subList(i4, i5).clear();
                }
            }
            r9.A05 = i;
            r9.A04 += i2;
            int i7 = r9.A0A;
            if (i7 > i) {
                r9.A0A = AnonymousClass001.A02(i7, i2, i);
            }
            int i8 = r9.A01;
            if (i8 >= i) {
                r9.A01 = i8 - i2;
            }
            int i9 = r9.A08;
            if (i9 >= 0 && (r9.A0G[(A01(r9, i9) * 5) + 1] & 67108864) != 0) {
                A0A(r9, i9);
            }
        }
        return z;
    }

    public final void A0L() {
        this.A0F = true;
        if (this.A0L.A00 == 0) {
            A08(this, A00(this));
            A0C(this, this.A0H.length - this.A09, this.A05);
            int i = this.A0B;
            AnonymousClass02Q.A04(this.A0H, i, this.A09 + i);
            A06(this);
        }
        C1496372c r8 = this.A0J;
        int[] iArr = this.A0G;
        int i2 = this.A05;
        Object[] objArr = this.A0H;
        int i3 = this.A0B;
        ArrayList arrayList = this.A0D;
        HashMap hashMap = this.A0E;
        if (r8 != r8 || !r8.A06) {
            throw AnonymousClass001.A08("Unexpected writer close()");
        }
        r8.A06 = false;
        r8.A07 = iArr;
        r8.A00 = i2;
        r8.A08 = objArr;
        r8.A02 = i3;
        r8.A04 = arrayList;
        r8.A05 = hashMap;
    }

    public static int A00(AnonymousClass6YK r2) {
        return (r2.A0G.length / 5) - r2.A04;
    }

    public static final int A01(AnonymousClass6YK r1, int i) {
        if (i >= r1.A05) {
            return i + r1.A04;
        }
        return i;
    }

    public static final int A03(AnonymousClass6YK r3, int[] iArr, int i) {
        if (i >= r3.A0G.length / 5) {
            return r3.A0H.length - r3.A09;
        }
        int i2 = iArr[(i * 5) + 4];
        int i3 = r3.A09;
        int length = r3.A0H.length;
        if (i2 < 0) {
            return (length - i3) + i2 + 1;
        }
        return i2;
    }

    public static final int A05(AnonymousClass6YK r3, int[] iArr, int i) {
        if (i >= r3.A0G.length / 5) {
            return r3.A0H.length - r3.A09;
        }
        int A022 = AnonymousClass6QR.A02(iArr, i);
        int i2 = r3.A09;
        int length = r3.A0H.length;
        if (A022 < 0) {
            return (length - i2) + A022 + 1;
        }
        return A022;
    }

    public static final void A06(AnonymousClass6YK r9) {
        boolean z;
        int i;
        AnonymousClass6Ne r6 = r9.A0C;
        if (r6 != null) {
            while (C36401kF.A1a(r6.A00)) {
                int A002 = r6.A00();
                int A012 = A01(r9, A002);
                int i2 = A002 + 1;
                int[] iArr = r9.A0G;
                int i3 = A012 * 5;
                int i4 = A002 + iArr[i3 + 3];
                while (true) {
                    if (i2 >= i4) {
                        z = false;
                        break;
                    } else if ((iArr[(A01(r9, i2) * 5) + 1] & 201326592) != 0) {
                        z = true;
                        break;
                    } else {
                        i2 += C90524aI.A05(iArr, A01(r9, i2));
                    }
                }
                boolean z2 = true;
                int i5 = i3 + 1;
                int i6 = iArr[i5];
                if ((67108864 & i6) == 0) {
                    z2 = false;
                }
                if (z2 != z) {
                    if (z) {
                        i = i6 | 67108864;
                    } else {
                        i = i6 & -67108865;
                    }
                    iArr[i5] = i;
                    int A042 = A04(r9, iArr, A002);
                    if (A042 >= 0) {
                        r6.A01(A042);
                    }
                }
            }
        }
    }

    public static final void A07(AnonymousClass6YK r12, int i) {
        int i2;
        if (i > 0) {
            int i3 = r12.A00;
            A08(r12, i3);
            int i4 = r12.A05;
            int i5 = r12.A04;
            int[] iArr = r12.A0G;
            int length = iArr.length / 5;
            int i6 = length - i5;
            int i7 = 0;
            if (i5 < i) {
                int max = Math.max(Math.max(length * 2, i6 + i), 32);
                int[] iArr2 = new int[(max * 5)];
                int i8 = max - i6;
                AnonymousClass02Q.A03(0, 0, i4 * 5, iArr, iArr2);
                AnonymousClass02Q.A03((i4 + i8) * 5, (i5 + i4) * 5, length * 5, iArr, iArr2);
                r12.A0G = iArr2;
                iArr = iArr2;
                i5 = i8;
            }
            int i9 = r12.A01;
            if (i9 >= i4) {
                r12.A01 = i9 + i;
            }
            int i10 = i4 + i;
            r12.A05 = i10;
            r12.A04 = i5 - i;
            if (i6 > 0) {
                i2 = A02(r12, iArr, i3 + i);
            } else {
                i2 = 0;
            }
            int i11 = r12.A0A;
            if (i11 >= i4) {
                i7 = r12.A0B;
            }
            int i12 = r12.A09;
            int length2 = r12.A0H.length;
            if (i2 > i7) {
                i2 = -(((length2 - i12) - i2) + 1);
            }
            for (int i13 = i4; i13 < i10; i13++) {
                iArr[(i13 * 5) + 4] = i2;
            }
            if (i11 >= i4) {
                r12.A0A = i11 + i;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
        r1 = (X.AnonymousClass606) r5.get(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004d, code lost:
        r1 = (X.AnonymousClass606) r5.get(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A08(X.AnonymousClass6YK r8, int r9) {
        /*
            int r4 = r8.A04
            int r3 = r8.A05
            if (r3 == r9) goto L_0x00b6
            java.util.ArrayList r0 = r8.A0D
            boolean r0 = r0.isEmpty()
            r7 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x005f
            int r1 = r8.A04
            int[] r0 = r8.A0G
            int r0 = r0.length
            int r6 = r0 / 5
            int r6 = r6 - r1
            java.util.ArrayList r5 = r8.A0D
            if (r3 >= r9) goto L_0x003e
            int r2 = X.AnonymousClass6QR.A01(r5, r3, r6)
            if (r2 >= 0) goto L_0x0026
            int r0 = r2 + 1
            int r2 = -r0
        L_0x0026:
            int r0 = r5.size()
            if (r2 >= r0) goto L_0x005f
            java.lang.Object r1 = r5.get(r2)
            X.606 r1 = (X.AnonymousClass606) r1
            int r0 = r1.A00
            if (r0 >= 0) goto L_0x005f
            int r0 = r0 + r6
            if (r0 >= r9) goto L_0x005f
            r1.A00 = r0
            int r2 = r2 + 1
            goto L_0x0026
        L_0x003e:
            int r2 = X.AnonymousClass6QR.A01(r5, r9, r6)
            if (r2 >= 0) goto L_0x0047
            int r0 = r2 + 1
            int r2 = -r0
        L_0x0047:
            int r0 = r5.size()
            if (r2 >= r0) goto L_0x005f
            java.lang.Object r1 = r5.get(r2)
            X.606 r1 = (X.AnonymousClass606) r1
            int r0 = r1.A00
            if (r0 < 0) goto L_0x005f
            int r0 = r6 - r0
            int r0 = -r0
            r1.A00 = r0
            int r2 = r2 + 1
            goto L_0x0047
        L_0x005f:
            if (r4 <= 0) goto L_0x006f
            int[] r6 = r8.A0G
            int r5 = r9 * 5
            int r2 = r4 * 5
            int r1 = r3 * 5
            if (r9 >= r3) goto L_0x00af
            int r2 = r2 + r5
            X.AnonymousClass02Q.A03(r2, r5, r1, r6, r6)
        L_0x006f:
            if (r9 >= r3) goto L_0x0073
            int r3 = r9 + r4
        L_0x0073:
            int[] r0 = r8.A0G
            int r0 = r0.length
            int r5 = r0 / 5
            if (r3 < r5) goto L_0x007b
            r7 = 0
        L_0x007b:
            X.AnonymousClass6XJ.A06(r7)
        L_0x007e:
            if (r3 >= r5) goto L_0x00b6
            int[] r2 = r8.A0G
            int r0 = r3 * 5
            int r0 = r0 + 2
            r7 = r2[r0]
            r6 = r7
            r0 = -2
            if (r7 > r0) goto L_0x0095
            int r0 = r2.length
            int r1 = r0 / 5
            int r0 = r8.A04
            int r1 = r1 - r0
            int r1 = r1 + r7
            int r6 = r1 + 2
        L_0x0095:
            if (r6 < r9) goto L_0x00a1
            int r0 = r2.length
            int r1 = r0 / 5
            int r0 = r8.A04
            int r1 = r1 - r0
            int r1 = r1 - r6
            int r0 = r1 + 2
            int r6 = -r0
        L_0x00a1:
            if (r6 == r7) goto L_0x00a9
            int r0 = r3 * 5
            int r0 = r0 + 2
            r2[r0] = r6
        L_0x00a9:
            int r3 = r3 + 1
            if (r3 != r9) goto L_0x007e
            int r3 = r3 + r4
            goto L_0x007e
        L_0x00af:
            int r0 = r1 + r2
            int r5 = r5 + r2
            X.AnonymousClass02Q.A03(r1, r0, r5, r6, r6)
            goto L_0x006f
        L_0x00b6:
            r8.A05 = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6YK.A08(X.6YK, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        r1 = r3.A0D;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A09(X.AnonymousClass6YK r3, int r4) {
        /*
            java.util.HashMap r2 = r3.A0E
            if (r2 == 0) goto L_0x001d
            if (r4 < 0) goto L_0x001d
            int r0 = A00(r3)
            if (r4 >= r0) goto L_0x001d
            java.util.ArrayList r1 = r3.A0D
            int r0 = X.AnonymousClass6QR.A01(r1, r4, r0)
            if (r0 < 0) goto L_0x001d
            java.lang.Object r0 = r1.get(r0)
            if (r0 == 0) goto L_0x001d
            r2.get(r0)
        L_0x001d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6YK.A09(X.6YK, int):void");
    }

    public static final void A0A(AnonymousClass6YK r3, int i) {
        if (i >= 0) {
            AnonymousClass6Ne r2 = r3.A0C;
            if (r2 == null) {
                r2 = new AnonymousClass6Ne((List) null, 1, (C05250Oz) null);
                r3.A0C = r2;
            }
            r2.A01(i);
        }
    }

    public static final void A0B(AnonymousClass6YK r10, int i, int i2) {
        if (i > 0) {
            A0C(r10, r10.A02, i2);
            int i3 = r10.A0B;
            int i4 = r10.A09;
            if (i4 < i) {
                Object[] objArr = r10.A0H;
                int length = objArr.length;
                int i5 = length - i4;
                int max = Math.max(Math.max(length * 2, i5 + i), 32);
                Object[] objArr2 = new Object[max];
                for (int i6 = 0; i6 < max; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = max - i5;
                AnonymousClass02Q.A05(objArr, 0, objArr2, 0, i3);
                AnonymousClass02Q.A05(objArr, i3 + i7, objArr2, i4 + i3, length);
                r10.A0H = objArr2;
                i4 = i7;
            }
            int i8 = r10.A03;
            if (i8 >= i3) {
                r10.A03 = i8 + i;
            }
            r10.A0B = i3 + i;
            r10.A09 = i4 - i;
        }
    }

    public static final void A0C(AnonymousClass6YK r9, int i, int i2) {
        int i3 = r9.A09;
        int i4 = r9.A0B;
        int i5 = r9.A0A;
        if (i4 != i) {
            Object[] objArr = r9.A0H;
            if (i < i4) {
                AnonymousClass02Q.A05(objArr, i + i3, objArr, i, i4);
            } else {
                AnonymousClass02Q.A05(objArr, i4, objArr, i4 + i3, i + i3);
            }
        }
        int[] iArr = r9.A0G;
        int i6 = r9.A04;
        int min = Math.min(i2 + 1, (iArr.length / 5) - i6);
        if (i5 != min) {
            int length = r9.A0H.length - i3;
            if (min < i5) {
                int A012 = A01(r9, min);
                int A013 = A01(r9, i5);
                int i7 = r9.A05;
                while (A012 < A013) {
                    int i8 = (A012 * 5) + 4;
                    int i9 = iArr[i8];
                    if (i9 >= 0) {
                        iArr[i8] = -((length - i9) + 1);
                        A012++;
                        if (A012 == i7) {
                            A012 += i6;
                        }
                    } else {
                        throw AnonymousClass6XJ.A01("Unexpected anchor value, expected a positive anchor");
                    }
                }
            } else {
                int A014 = A01(r9, i5);
                int A015 = A01(r9, min);
                while (A014 < A015) {
                    int i10 = iArr[(A014 * 5) + 4];
                    if (i10 < 0) {
                        iArr[(A014 * 5) + 4] = i10 + length + 1;
                        A014++;
                        if (A014 == r9.A05) {
                            A014 += i6;
                        }
                    } else {
                        throw AnonymousClass6XJ.A01("Unexpected anchor value, expected a negative anchor");
                    }
                }
            }
            r9.A0A = min;
        }
        r9.A0B = i;
    }

    public static final void A0D(AnonymousClass6YK r3, int i, int i2, int i3) {
        if (i >= r3.A05) {
            i = -((A00(r3) - i) + 2);
        }
        while (i3 < i2) {
            int[] iArr = r3.A0G;
            int A012 = A01(r3, i3) * 5;
            iArr[A012 + 2] = i;
            int i4 = iArr[A012 + 3] + i3;
            A0D(r3, i3, i4, i3 + 1);
            i3 = i4;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0025, code lost:
        if (r15 == r0) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0F(X.AnonymousClass6YK r13, java.lang.Object r14, java.lang.Object r15, int r16, boolean r17) {
        /*
            int r4 = r13.A08
            int r0 = r13.A06
            r3 = 0
            r5 = 1
            boolean r2 = X.AnonymousClass000.A1R(r0)
            X.61S r1 = r13.A0K
            int r0 = r13.A07
            r1.A01(r0)
            if (r2 == 0) goto L_0x0088
            A07(r13, r5)
            int r5 = r13.A00
            int r1 = A01(r13, r5)
            java.lang.Object r0 = X.C129736Ig.A00
            boolean r12 = X.C36371kC.A1W(r14, r0)
            if (r17 != 0) goto L_0x0027
            r11 = 1
            if (r15 != r0) goto L_0x0028
        L_0x0027:
            r11 = 0
        L_0x0028:
            int[] r7 = r13.A0G
            int r9 = r13.A08
            int r6 = r13.A02
            r10 = 0
            if (r17 == 0) goto L_0x0033
            r10 = 1073741824(0x40000000, float:2.0)
        L_0x0033:
            r8 = 0
            if (r12 == 0) goto L_0x0038
            r8 = 536870912(0x20000000, float:1.0842022E-19)
        L_0x0038:
            r2 = 0
            if (r11 == 0) goto L_0x003d
            r2 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x003d:
            int r1 = r1 * 5
            r7[r1] = r16
            int r0 = r1 + 1
            r10 = r10 | r8
            r10 = r10 | r2
            r7[r0] = r10
            int r0 = r1 + 2
            r7[r0] = r9
            int r0 = r1 + 3
            r7[r0] = r3
            int r0 = r1 + 4
            r7[r0] = r6
            r13.A03 = r6
            int r0 = r17 + r12
            int r0 = r0 + r11
            if (r0 <= 0) goto L_0x0078
            A0B(r13, r0, r5)
            java.lang.Object[] r2 = r13.A0H
            int r1 = r13.A02
            if (r17 == 0) goto L_0x0068
            int r0 = r1 + 1
            r2[r1] = r15
            r1 = r0
        L_0x0068:
            if (r12 == 0) goto L_0x006f
            int r0 = r1 + 1
            r2[r1] = r14
            r1 = r0
        L_0x006f:
            if (r11 == 0) goto L_0x0076
            int r0 = r1 + 1
            r2[r1] = r15
            r1 = r0
        L_0x0076:
            r13.A02 = r1
        L_0x0078:
            r13.A07 = r3
            int r3 = r5 + 1
            r13.A08 = r5
            r13.A00 = r3
            if (r4 < 0) goto L_0x0085
            A09(r13, r4)
        L_0x0085:
            r13.A01 = r3
            return
        L_0x0088:
            X.61S r0 = r13.A0L
            r0.A01(r4)
            X.61S r2 = r13.A0I
            int r1 = A00(r13)
            int r0 = r13.A01
            int r1 = r1 - r0
            r2.A01(r1)
            int r3 = r13.A00
            int r1 = A01(r13, r3)
            java.lang.Object r0 = X.C129736Ig.A00
            boolean r0 = X.AnonymousClass00C.A0J(r15, r0)
            if (r0 != 0) goto L_0x00ae
            if (r17 == 0) goto L_0x00d4
            int r0 = r13.A00
            A0E(r13, r15, r0)
        L_0x00ae:
            int[] r2 = r13.A0G
            int r0 = A05(r13, r2, r1)
            r13.A02 = r0
            int r0 = r13.A00
            int r0 = r0 + 1
            int r0 = A02(r13, r2, r0)
            r13.A03 = r0
            int r1 = r1 * 5
            int r0 = X.C90494aF.A0C(r2, r1)
            r13.A07 = r0
            r13.A08 = r3
            int r0 = r3 + 1
            r13.A00 = r0
            int r0 = r1 + 3
            r0 = r2[r0]
            int r3 = r3 + r0
            goto L_0x0085
        L_0x00d4:
            r13.A0Q(r15)
            goto L_0x00ae
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6YK.A0F(X.6YK, java.lang.Object, java.lang.Object, int, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        if (r5 >= 67108863) goto L_0x0008;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0G(int[] r3, int r4, int r5) {
        /*
            if (r5 < 0) goto L_0x0008
            r1 = 67108863(0x3ffffff, float:1.5046327E-36)
            r0 = 1
            if (r5 < r1) goto L_0x0009
        L_0x0008:
            r0 = 0
        L_0x0009:
            X.AnonymousClass6XJ.A06(r0)
            int r0 = r4 * 5
            int r2 = r0 + 1
            r1 = r3[r2]
            r0 = -67108864(0xfffffffffc000000, float:-2.658456E36)
            r1 = r1 & r0
            r5 = r5 | r1
            r3[r2] = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6YK.A0G(int[], int, int):void");
    }

    public final AnonymousClass606 A0I(int i) {
        ArrayList arrayList = this.A0D;
        int A002 = A00(this);
        int A012 = AnonymousClass6QR.A01(arrayList, i, A002);
        if (A012 >= 0) {
            return (AnonymousClass606) arrayList.get(A012);
        }
        if (i > this.A05) {
            i = -(A002 - i);
        }
        AnonymousClass606 r0 = new AnonymousClass606(i);
        arrayList.add(-(A012 + 1), r0);
        return r0;
    }

    public final void A0K() {
        int i = this.A06;
        this.A06 = i + 1;
        if (i == 0) {
            this.A0I.A01(A00(this) - this.A01);
        }
    }

    public final void A0M() {
        int i;
        int i2 = 1;
        int i3 = 0;
        boolean A1R = AnonymousClass000.A1R(this.A06);
        int i4 = this.A00;
        int i5 = this.A01;
        int i6 = this.A08;
        int A012 = A01(this, i6);
        int i7 = this.A07;
        int i8 = i4 - i6;
        int[] iArr = this.A0G;
        boolean A032 = AnonymousClass6QR.A03(iArr, A012);
        if (A1R) {
            AnonymousClass6XJ.A06(C36401kF.A1U(i8));
            iArr[(A012 * 5) + 3] = i8;
            A0G(iArr, A012, i7);
            int A002 = AnonymousClass61S.A00(this.A0K);
            if (!A032) {
                i2 = i7;
            }
            this.A07 = A002 + i2;
            this.A08 = A04(this, iArr, i6);
        } else if (i4 == i5) {
            int i9 = A012 * 5;
            int i10 = i9 + 3;
            int i11 = iArr[i10];
            int A0C2 = C90494aF.A0C(iArr, i9);
            AnonymousClass6XJ.A06(C36401kF.A1U(i8));
            iArr[i10] = i8;
            A0G(iArr, A012, i7);
            int A003 = AnonymousClass61S.A00(this.A0L);
            this.A01 = A00(this) - AnonymousClass61S.A00(this.A0I);
            this.A08 = A003;
            int A042 = A04(this, iArr, i6);
            int A004 = AnonymousClass61S.A00(this.A0K);
            this.A07 = A004;
            if (A042 == A003) {
                if (!A032) {
                    i3 = i7 - A0C2;
                }
                i = A004 + i3;
            } else {
                int i12 = i8 - i11;
                int i13 = i7 - A0C2;
                if (A032) {
                    i13 = 0;
                }
                if (!(i12 == 0 && i13 == 0)) {
                    while (A042 != 0 && A042 != A003 && (i13 != 0 || i12 != 0)) {
                        int A013 = A01(this, A042);
                        if (i12 != 0) {
                            int A052 = C90524aI.A05(iArr, A013) + i12;
                            AnonymousClass6XJ.A06(C36401kF.A1U(A052));
                            iArr[(A013 * 5) + 3] = A052;
                        }
                        if (i13 != 0) {
                            A0G(iArr, A013, C90494aF.A0C(iArr, A013 * 5) + i13);
                        }
                        if (AnonymousClass6QR.A03(iArr, A013)) {
                            i13 = 0;
                        }
                        A042 = A04(this, iArr, A042);
                    }
                }
                i = A004 + i13;
            }
            this.A07 = i;
        } else {
            throw AnonymousClass6XJ.A01("Expected to be at the end of a group");
        }
    }

    public final void A0N() {
        int i = this.A06;
        if (i > 0) {
            int i2 = i - 1;
            this.A06 = i2;
            if (i2 != 0) {
                return;
            }
            if (this.A0K.A00 == this.A0L.A00) {
                this.A01 = A00(this) - AnonymousClass61S.A00(this.A0I);
                return;
            }
            throw AnonymousClass6XJ.A01("startGroup/endGroup mismatch while inserting");
        }
        throw AnonymousClass001.A09("Unbalanced begin/end insert");
    }

    public final void A0O(int i) {
        int i2 = this.A06;
        if (i2 <= 0) {
            int i3 = this.A08;
            if (i3 == i) {
                return;
            }
            if (i < i3 || i >= this.A01) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("Started group at ");
                A0u.append(i);
                throw AnonymousClass6XJ.A01(AnonymousClass000.A0r(" must be a subgroup of the group at ", A0u, i3));
            }
            int i4 = this.A00;
            int i5 = this.A02;
            int i6 = this.A03;
            this.A00 = i;
            if (i2 == 0) {
                Object obj = C129736Ig.A00;
                A0F(this, obj, obj, 0, false);
                this.A00 = i4;
                this.A02 = i5;
                this.A03 = i6;
                return;
            }
            throw AnonymousClass6XJ.A01("Key must be supplied when inserting");
        }
        throw AnonymousClass6XJ.A01("Cannot call ensureStarted() while inserting");
    }

    /* JADX WARNING: type inference failed for: r13v5, types: [java.util.AbstractCollection, java.util.Collection, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0081, code lost:
        if ((r6[r1 + 1] & 201326592) == 0) goto L_0x0083;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0P(X.C1496372c r22, int r23) {
        /*
            r21 = this;
            r9 = r21
            int r0 = r9.A06
            boolean r0 = X.AnonymousClass000.A1R(r0)
            X.AnonymousClass6XJ.A06(r0)
            r10 = r22
            r12 = r23
            if (r23 != 0) goto L_0x005a
            int r0 = r9.A00
            if (r0 != 0) goto L_0x005a
            X.72c r0 = r9.A0J
            int r0 = r0.A00
            if (r0 != 0) goto L_0x005a
            int[] r11 = r10.A07
            r0 = 3
            r0 = r11[r0]
            int r8 = r10.A00
            if (r0 != r8) goto L_0x005a
            int[] r7 = r9.A0G
            java.lang.Object[] r6 = r9.A0H
            java.util.ArrayList r5 = r9.A0D
            java.util.HashMap r4 = r9.A0E
            java.lang.Object[] r3 = r10.A08
            int r2 = r10.A02
            java.util.HashMap r1 = r10.A05
            r9.A0G = r11
            r9.A0H = r3
            java.util.ArrayList r0 = r10.A04
            r9.A0D = r0
            r9.A05 = r8
            int r0 = r11.length
            int r0 = r0 / 5
            int r0 = r0 - r8
            r9.A04 = r0
            r9.A0B = r2
            int r0 = r3.length
            int r0 = r0 - r2
            r9.A09 = r0
            r9.A0A = r8
            r9.A0E = r1
            r0 = 0
            r10.A07 = r7
            r10.A00 = r0
            r10.A08 = r6
            r10.A02 = r0
            r10.A04 = r5
            r10.A05 = r4
            return
        L_0x005a:
            X.6YK r8 = r10.A02()
            int[] r6 = r8.A0G     // Catch:{ all -> 0x0195 }
            int r4 = A01(r8, r12)     // Catch:{ all -> 0x0195 }
            int r1 = r4 * 5
            int r0 = r1 + 3
            r3 = r6[r0]     // Catch:{ all -> 0x0195 }
            int r2 = r23 + r3
            int r13 = A03(r8, r6, r4)     // Catch:{ all -> 0x0195 }
            int r5 = A02(r8, r6, r2)     // Catch:{ all -> 0x0195 }
            int r7 = r5 - r13
            if (r23 < 0) goto L_0x0083
            int r0 = r1 + 1
            r1 = r6[r0]     // Catch:{ all -> 0x0195 }
            r0 = 201326592(0xc000000, float:9.8607613E-32)
            r1 = r1 & r0
            r20 = 1
            if (r1 != 0) goto L_0x0085
        L_0x0083:
            r20 = 0
        L_0x0085:
            A07(r9, r3)     // Catch:{ all -> 0x0195 }
            int r0 = r9.A00     // Catch:{ all -> 0x0195 }
            A0B(r9, r7, r0)     // Catch:{ all -> 0x0195 }
            int r0 = r8.A05     // Catch:{ all -> 0x0195 }
            if (r0 >= r2) goto L_0x0094
            A08(r8, r2)     // Catch:{ all -> 0x0195 }
        L_0x0094:
            int r0 = r8.A0B     // Catch:{ all -> 0x0195 }
            if (r0 >= r5) goto L_0x009b
            A0C(r8, r5, r2)     // Catch:{ all -> 0x0195 }
        L_0x009b:
            int[] r10 = r9.A0G     // Catch:{ all -> 0x0195 }
            int r11 = r9.A00     // Catch:{ all -> 0x0195 }
            int[] r6 = r8.A0G     // Catch:{ all -> 0x0195 }
            int r4 = r11 * 5
            int r1 = r23 * 5
            int r0 = r2 * 5
            X.AnonymousClass02Q.A03(r4, r1, r0, r6, r10)     // Catch:{ all -> 0x0195 }
            java.lang.Object[] r1 = r9.A0H     // Catch:{ all -> 0x0195 }
            int r6 = r9.A02     // Catch:{ all -> 0x0195 }
            java.lang.Object[] r0 = r8.A0H     // Catch:{ all -> 0x0195 }
            X.AnonymousClass02Q.A05(r0, r6, r1, r13, r5)     // Catch:{ all -> 0x0195 }
            int r5 = r9.A08     // Catch:{ all -> 0x0195 }
            int r4 = r11 * 5
            int r0 = r4 + 2
            r10[r0] = r5     // Catch:{ all -> 0x0195 }
            int r19 = r11 - r23
            int r3 = r3 + r11
            int r0 = A03(r9, r10, r11)     // Catch:{ all -> 0x0195 }
            int r18 = r6 - r0
            int r14 = r9.A0A     // Catch:{ all -> 0x0195 }
            int r0 = r9.A09     // Catch:{ all -> 0x0195 }
            r17 = r0
            int r15 = r1.length     // Catch:{ all -> 0x0195 }
            r13 = r11
        L_0x00cc:
            r0 = 0
            if (r13 >= r3) goto L_0x00fa
            if (r13 == r11) goto L_0x00db
            int r1 = r13 * 5
            int r16 = r1 + 2
            r1 = r10[r16]     // Catch:{ all -> 0x0195 }
            int r1 = r1 + r19
            r10[r16] = r1     // Catch:{ all -> 0x0195 }
        L_0x00db:
            int r1 = A03(r9, r10, r13)     // Catch:{ all -> 0x0195 }
            int r1 = r1 + r18
            if (r14 < r13) goto L_0x00e5
            int r0 = r9.A0B     // Catch:{ all -> 0x0195 }
        L_0x00e5:
            if (r1 <= r0) goto L_0x00ed
            int r0 = r15 - r17
            int r0 = r0 - r1
            int r0 = r0 + 1
            int r1 = -r0
        L_0x00ed:
            int r0 = r13 * 5
            int r0 = r0 + 4
            r10[r0] = r1     // Catch:{ all -> 0x0195 }
            if (r13 != r14) goto L_0x00f7
            int r14 = r14 + 1
        L_0x00f7:
            int r13 = r13 + 1
            goto L_0x00cc
        L_0x00fa:
            r9.A0A = r14     // Catch:{ all -> 0x0195 }
            java.util.ArrayList r14 = r8.A0D     // Catch:{ all -> 0x0195 }
            int r1 = A00(r8)     // Catch:{ all -> 0x0195 }
            int r12 = X.AnonymousClass6QR.A01(r14, r12, r1)     // Catch:{ all -> 0x0195 }
            if (r12 >= 0) goto L_0x010b
            int r0 = r12 + 1
            int r12 = -r0
        L_0x010b:
            int r2 = X.AnonymousClass6QR.A01(r14, r2, r1)     // Catch:{ all -> 0x0195 }
            if (r2 >= 0) goto L_0x0114
            int r0 = r2 + 1
            int r2 = -r0
        L_0x0114:
            if (r12 >= r2) goto L_0x014d
            int r0 = r2 - r12
            java.util.ArrayList r13 = X.C36441kJ.A14(r0)     // Catch:{ all -> 0x0195 }
            r15 = r12
        L_0x011d:
            if (r15 >= r2) goto L_0x0131
            java.lang.Object r1 = r14.get(r15)     // Catch:{ all -> 0x0195 }
            X.606 r1 = (X.AnonymousClass606) r1     // Catch:{ all -> 0x0195 }
            int r0 = r1.A00     // Catch:{ all -> 0x0195 }
            int r0 = r0 + r19
            r1.A00 = r0     // Catch:{ all -> 0x0195 }
            r13.add(r1)     // Catch:{ all -> 0x0195 }
            int r15 = r15 + 1
            goto L_0x011d
        L_0x0131:
            java.util.ArrayList r1 = r9.A0D     // Catch:{ all -> 0x0195 }
            int r15 = r9.A00     // Catch:{ all -> 0x0195 }
            int r0 = A00(r9)     // Catch:{ all -> 0x0195 }
            int r0 = X.AnonymousClass6QR.A01(r1, r15, r0)     // Catch:{ all -> 0x0195 }
            if (r0 >= 0) goto L_0x0142
            int r0 = r0 + 1
            int r0 = -r0
        L_0x0142:
            r1.addAll(r0, r13)     // Catch:{ all -> 0x0195 }
            java.util.List r0 = r14.subList(r12, r2)     // Catch:{ all -> 0x0195 }
            r0.clear()     // Catch:{ all -> 0x0195 }
            goto L_0x014f
        L_0x014d:
            X.09w r13 = X.C023409w.A00     // Catch:{ all -> 0x0195 }
        L_0x014f:
            boolean r0 = X.C36401kF.A1a(r13)     // Catch:{ all -> 0x0195 }
            if (r0 == 0) goto L_0x0173
            java.util.HashMap r12 = r8.A0E     // Catch:{ all -> 0x0195 }
            if (r12 == 0) goto L_0x0173
            int r2 = r13.size()     // Catch:{ all -> 0x0195 }
            r1 = 0
        L_0x015e:
            if (r1 >= r2) goto L_0x016a
            java.lang.Object r0 = r13.get(r1)     // Catch:{ all -> 0x0195 }
            r12.get(r0)     // Catch:{ all -> 0x0195 }
            int r1 = r1 + 1
            goto L_0x015e
        L_0x016a:
            boolean r0 = r12.isEmpty()     // Catch:{ all -> 0x0195 }
            if (r0 == 0) goto L_0x0173
            r0 = 0
            r8.A0E = r0     // Catch:{ all -> 0x0195 }
        L_0x0173:
            A09(r9, r5)     // Catch:{ all -> 0x0195 }
            int r1 = r9.A07     // Catch:{ all -> 0x0195 }
            boolean r0 = X.AnonymousClass6QR.A03(r10, r11)     // Catch:{ all -> 0x0195 }
            if (r0 == 0) goto L_0x0180
            r0 = 1
            goto L_0x0184
        L_0x0180:
            int r0 = X.C90494aF.A0C(r10, r4)     // Catch:{ all -> 0x0195 }
        L_0x0184:
            int r1 = r1 + r0
            r9.A07 = r1     // Catch:{ all -> 0x0195 }
            r9.A00 = r3     // Catch:{ all -> 0x0195 }
            int r6 = r6 + r7
            r9.A02 = r6     // Catch:{ all -> 0x0195 }
            if (r20 == 0) goto L_0x0191
            A0A(r9, r5)     // Catch:{ all -> 0x0195 }
        L_0x0191:
            r8.A0L()
            return
        L_0x0195:
            r0 = move-exception
            r8.A0L()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6YK.A0P(X.72c, int):void");
    }

    public final void A0Q(Object obj) {
        int A012 = A01(this, this.A00);
        int[] iArr = this.A0G;
        int i = iArr[(A012 * 5) + 1];
        if ((268435456 & i) != 0) {
            Object[] objArr = this.A0H;
            int A032 = A03(this, iArr, A012) + AnonymousClass6QR.A00(i >> 29);
            if (A032 >= this.A0B) {
                A032 += this.A09;
            }
            objArr[A032] = obj;
            return;
        }
        throw AnonymousClass6XJ.A01("Updating the data of a group that was not created with a data slot");
    }

    public AnonymousClass6YK(C1496372c r5) {
        this.A0J = r5;
        int[] iArr = r5.A07;
        this.A0G = iArr;
        Object[] objArr = r5.A08;
        this.A0H = objArr;
        this.A0D = r5.A04;
        this.A0E = r5.A05;
        int i = r5.A00;
        this.A05 = i;
        this.A04 = (iArr.length / 5) - i;
        int i2 = r5.A02;
        this.A0B = i2;
        this.A09 = objArr.length - i2;
        this.A0A = i;
        this.A01 = i;
        this.A08 = -1;
    }

    public static int A02(AnonymousClass6YK r1, int[] iArr, int i) {
        return A03(r1, iArr, A01(r1, i));
    }

    public static final int A04(AnonymousClass6YK r2, int[] iArr, int i) {
        int i2 = iArr[(A01(r2, i) * 5) + 2];
        if (i2 <= -2) {
            return A00(r2) + i2 + 2;
        }
        return i2;
    }

    public static final void A0E(AnonymousClass6YK r4, Object obj, int i) {
        int A012 = A01(r4, i);
        int[] iArr = r4.A0G;
        if (A012 >= iArr.length || !AnonymousClass6QR.A03(iArr, A012)) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Updating the node of a group at ");
            A0u.append(i);
            throw AnonymousClass6XJ.A01(AnonymousClass000.A0q(" that was not created with as a node group", A0u));
        }
        Object[] objArr = r4.A0H;
        int A032 = A03(r4, iArr, A012);
        if (A032 >= r4.A0B) {
            A032 += r4.A09;
        }
        objArr[A032] = obj;
    }

    public final Object A0J(Object obj, int i, int i2) {
        int A012 = A01(this, i);
        int[] iArr = this.A0G;
        int A052 = A05(this, iArr, A012);
        int A022 = A02(this, iArr, i + 1);
        int i3 = A052 + i2;
        if (i3 < A052 || i3 >= A022) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Write to an invalid slot index ");
            A0u.append(i2);
            throw AnonymousClass6XJ.A01(AnonymousClass000.A0r(" for group ", A0u, i));
        }
        if (i3 >= this.A0B) {
            i3 += this.A09;
        }
        Object[] objArr = this.A0H;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        return obj2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SlotWriter(current = ");
        A0u.append(this.A00);
        A0u.append(" end=");
        A0u.append(this.A01);
        A0u.append(" size = ");
        int i = this.A04;
        A0u.append((this.A0G.length / 5) - i);
        A0u.append(" gap=");
        int i2 = this.A05;
        A0u.append(i2);
        A0u.append('-');
        return C36321k7.A0G(A0u, i2 + i);
    }
}
