package com.facebook.android.exoplayer2;

import X.AnonymousClass000;
import X.AnonymousClass82C;
import X.AnonymousClass82D;
import X.AnonymousClass82K;
import X.AnonymousClass82L;
import X.AnonymousClass82M;
import X.AnonymousClass82N;
import X.AnonymousClass82O;
import X.C1690282y;
import X.C195889Wr;
import X.C197299bT;
import X.C199579fY;
import X.C200319h9;
import X.C36401kF;
import android.util.Pair;
import com.facebook.android.exoplayer2.util.Util;
import java.util.Arrays;
import java.util.Objects;

public abstract class Timeline {
    public static final Timeline A00 = new AnonymousClass82K();

    public final int A03(C195889Wr r5, C199579fY r6, int i, int i2, boolean z) {
        int i3 = A08(r5, i, false).A00;
        if (A09(r6, i3, 0).A01 != i) {
            return i + 1;
        }
        int A02 = A02(i3, i2, z);
        if (A02 == -1) {
            return -1;
        }
        return A09(r6, A02, 0).A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        r13 = (com.facebook.android.exoplayer2.Timeline) r13;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r13) {
        /*
            r12 = this;
            r5 = 1
            if (r12 == r13) goto L_0x0080
            boolean r0 = r13 instanceof com.facebook.android.exoplayer2.Timeline
            r4 = 0
            if (r0 == 0) goto L_0x007f
            com.facebook.android.exoplayer2.Timeline r13 = (com.facebook.android.exoplayer2.Timeline) r13
            int r0 = r13.A01()
            int r11 = r12.A01()
            if (r0 != r11) goto L_0x007f
            int r0 = r13.A00()
            int r7 = r12.A00()
            if (r0 != r7) goto L_0x007f
            X.9fY r10 = new X.9fY
            r10.<init>()
            X.9Wr r6 = new X.9Wr
            r6.<init>()
            X.9fY r9 = new X.9fY
            r9.<init>()
            X.9Wr r3 = new X.9Wr
            r3.<init>()
            r8 = 0
        L_0x0033:
            if (r8 >= r11) goto L_0x0048
            r0 = 0
            X.9fY r2 = r12.A09(r10, r8, r0)
            X.9fY r0 = r13.A09(r9, r8, r0)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x007f
            int r8 = r8 + 1
            goto L_0x0033
        L_0x0048:
            r2 = 0
        L_0x0049:
            if (r2 >= r7) goto L_0x005c
            X.9Wr r1 = r12.A08(r6, r2, r5)
            X.9Wr r0 = r13.A08(r3, r2, r5)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x007f
            int r2 = r2 + 1
            goto L_0x0049
        L_0x005c:
            int r3 = r12.A05(r5)
            int r0 = r13.A05(r5)
            if (r3 != r0) goto L_0x007f
            int r2 = r12.A06(r5)
            int r0 = r13.A06(r5)
            if (r2 == r0) goto L_0x0071
            return r4
        L_0x0071:
            if (r3 == r2) goto L_0x0080
            int r1 = r12.A02(r3, r4, r5)
            int r0 = r13.A02(r3, r4, r5)
            if (r1 != r0) goto L_0x007f
            r3 = r1
            goto L_0x0071
        L_0x007f:
            return r4
        L_0x0080:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.android.exoplayer2.Timeline.equals(java.lang.Object):boolean");
    }

    public int A00() {
        if (this instanceof AnonymousClass82O) {
            return 1;
        }
        if (this instanceof AnonymousClass82M) {
            return ((AnonymousClass82M) this).A00.A00();
        }
        if (this instanceof AnonymousClass82L) {
            return 1;
        }
        if (this instanceof AnonymousClass82C) {
            AnonymousClass82C r0 = (AnonymousClass82C) this;
            return r0.A00 * r0.A02;
        } else if (this instanceof AnonymousClass82D) {
            return ((AnonymousClass82D) this).A00;
        } else {
            return 0;
        }
    }

    public int A01() {
        if (this instanceof AnonymousClass82O) {
            return 1;
        }
        if (this instanceof AnonymousClass82M) {
            return ((AnonymousClass82M) this).A00.A01();
        }
        if (this instanceof AnonymousClass82L) {
            return 1;
        }
        if (this instanceof AnonymousClass82C) {
            AnonymousClass82C r0 = (AnonymousClass82C) this;
            return r0.A01 * r0.A02;
        } else if (this instanceof AnonymousClass82D) {
            return ((AnonymousClass82D) this).A01;
        } else {
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0099 A[EDGE_INSN: B:63:0x0099->B:41:0x0099 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A02(int r8, int r9, boolean r10) {
        /*
            r7 = this;
            boolean r0 = r7 instanceof X.AnonymousClass82M
            if (r0 == 0) goto L_0x0019
            r3 = r7
            X.82M r3 = (X.AnonymousClass82M) r3
            boolean r2 = r3 instanceof X.C1690182x
            com.facebook.android.exoplayer2.Timeline r0 = r3.A00
            int r1 = r0.A02(r8, r9, r10)
            if (r2 == 0) goto L_0x0018
            r0 = -1
            if (r1 != r0) goto L_0x0018
            int r1 = r3.A05(r10)
        L_0x0018:
            return r1
        L_0x0019:
            boolean r0 = r7 instanceof X.AnonymousClass82N
            if (r0 == 0) goto L_0x00a2
            r4 = r7
            X.82N r4 = (X.AnonymousClass82N) r4
            r5 = 0
            r3 = 2
            boolean r0 = r4 instanceof X.AnonymousClass82C
            if (r0 == 0) goto L_0x0073
            r0 = r4
            X.82C r0 = (X.AnonymousClass82C) r0
            int r0 = r0.A01
            int r6 = r8 / r0
        L_0x002d:
            int r2 = r4.A0A(r6)
            com.facebook.android.exoplayer2.Timeline r0 = r4.A0B(r6)
            int r8 = r8 - r2
            if (r9 == r3) goto L_0x0039
            r5 = r9
        L_0x0039:
            int r0 = r0.A02(r8, r5, r10)
            r5 = -1
            if (r0 != r5) goto L_0x0097
            if (r10 == 0) goto L_0x006a
            X.B3L r0 = r4.A01
            int r2 = r0.BEV(r6)
        L_0x0048:
            if (r2 == r5) goto L_0x0099
            com.facebook.android.exoplayer2.Timeline r1 = r4.A0B(r2)
            int r0 = r1.A01()
            boolean r0 = X.AnonymousClass000.A1Q(r0)
            if (r0 == 0) goto L_0x008d
            if (r10 == 0) goto L_0x0061
            X.B3L r0 = r4.A01
            int r2 = r0.BEV(r2)
            goto L_0x0048
        L_0x0061:
            int r0 = r4.A00
            int r0 = r0 + -1
            if (r2 >= r0) goto L_0x0099
            int r2 = r2 + 1
            goto L_0x0048
        L_0x006a:
            int r0 = r4.A00
            int r0 = r0 + -1
            if (r6 >= r0) goto L_0x0099
            int r2 = r6 + 1
            goto L_0x0048
        L_0x0073:
            r0 = r4
            X.82D r0 = (X.AnonymousClass82D) r0
            int[] r2 = r0.A04
            int r1 = r8 + 1
            int r6 = java.util.Arrays.binarySearch(r2, r1)
            if (r6 >= 0) goto L_0x0084
            int r0 = r6 + 2
            int r6 = -r0
            goto L_0x002d
        L_0x0084:
            int r6 = r6 + -1
            if (r6 < 0) goto L_0x002d
            r0 = r2[r6]
            if (r0 != r1) goto L_0x002d
            goto L_0x0084
        L_0x008d:
            if (r2 == r5) goto L_0x0099
            int r2 = r4.A0A(r2)
            int r0 = r1.A05(r10)
        L_0x0097:
            int r2 = r2 + r0
            return r2
        L_0x0099:
            if (r9 != r3) goto L_0x00a0
            int r2 = r4.A05(r10)
            return r2
        L_0x00a0:
            r2 = -1
            return r2
        L_0x00a2:
            r0 = 1
            if (r9 == 0) goto L_0x00ba
            if (r9 == r0) goto L_0x00b4
            r0 = 2
            if (r9 != r0) goto L_0x00b5
            int r0 = r7.A06(r10)
            if (r8 != r0) goto L_0x00c2
            int r8 = r7.A05(r10)
        L_0x00b4:
            return r8
        L_0x00b5:
            java.lang.IllegalStateException r0 = X.C165617ti.A0V()
            throw r0
        L_0x00ba:
            int r0 = r7.A06(r10)
            if (r8 != r0) goto L_0x00c2
            r8 = -1
            return r8
        L_0x00c2:
            int r8 = r8 + 1
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.android.exoplayer2.Timeline.A02(int, int, boolean):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:4:0x000d A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A04(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = r7 instanceof X.AnonymousClass82O
            if (r0 == 0) goto L_0x000f
            java.lang.Object r0 = X.AnonymousClass82O.A03
            boolean r1 = r0.equals(r8)
            r0 = -1
            if (r1 == 0) goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            return r0
        L_0x000f:
            boolean r0 = r7 instanceof X.AnonymousClass82L
            if (r0 == 0) goto L_0x0017
            r0 = -1
            if (r8 != 0) goto L_0x000e
            goto L_0x000d
        L_0x0017:
            boolean r0 = r7 instanceof X.AnonymousClass82M
            if (r0 == 0) goto L_0x003c
            r2 = r7
            X.82M r2 = (X.AnonymousClass82M) r2
            boolean r0 = r2 instanceof X.C1690282y
            if (r0 == 0) goto L_0x0035
            X.82y r2 = (X.C1690282y) r2
            com.facebook.android.exoplayer2.Timeline r1 = r2.A00
            java.lang.Object r0 = X.C1690282y.A02
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x0030
            java.lang.Object r8 = r2.A00
        L_0x0030:
            int r0 = r1.A04(r8)
            return r0
        L_0x0035:
            com.facebook.android.exoplayer2.Timeline r0 = r2.A00
            int r0 = r0.A04(r8)
            return r0
        L_0x003c:
            boolean r0 = r7 instanceof X.AnonymousClass82K
            if (r0 == 0) goto L_0x0042
            r0 = -1
            return r0
        L_0x0042:
            r6 = r7
            X.82N r6 = (X.AnonymousClass82N) r6
            boolean r0 = r8 instanceof android.util.Pair
            r5 = -1
            if (r0 == 0) goto L_0x0071
            android.util.Pair r8 = (android.util.Pair) r8
            java.lang.Object r2 = r8.first
            java.lang.Object r4 = r8.second
            boolean r3 = r6 instanceof X.AnonymousClass82C
            if (r3 == 0) goto L_0x0079
            boolean r0 = r2 instanceof java.lang.Integer
            if (r0 == 0) goto L_0x0071
            int r2 = X.AnonymousClass000.A0I(r2)
        L_0x005c:
            if (r2 == r5) goto L_0x0071
            com.facebook.android.exoplayer2.Timeline r0 = r6.A0B(r2)
            int r1 = r0.A04(r4)
            if (r1 == r5) goto L_0x0071
            if (r3 == 0) goto L_0x0072
            X.82C r6 = (X.AnonymousClass82C) r6
            int r0 = r6.A00
            int r2 = r2 * r0
        L_0x006f:
            int r5 = r2 + r1
        L_0x0071:
            return r5
        L_0x0072:
            X.82D r6 = (X.AnonymousClass82D) r6
            int[] r0 = r6.A03
            r2 = r0[r2]
            goto L_0x006f
        L_0x0079:
            r1 = r6
            X.82D r1 = (X.AnonymousClass82D) r1
            boolean r0 = r2 instanceof java.lang.Integer
            if (r0 == 0) goto L_0x0071
            android.util.SparseIntArray r1 = r1.A02
            int r0 = X.AnonymousClass000.A0I(r2)
            int r2 = r1.get(r0, r5)
            if (r2 != r5) goto L_0x005c
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.android.exoplayer2.Timeline.A04(java.lang.Object):int");
    }

    public int A05(boolean z) {
        int i;
        if (this instanceof AnonymousClass82M) {
            return ((AnonymousClass82M) this).A00.A05(z);
        }
        if (this instanceof AnonymousClass82N) {
            AnonymousClass82N r5 = (AnonymousClass82N) this;
            int i2 = r5.A00;
            if (i2 == 0) {
                return -1;
            }
            int i3 = 0;
            if (z) {
                i3 = r5.A01.BBt();
            }
            do {
                Timeline A0B = r5.A0B(i);
                if (!AnonymousClass000.A1Q(A0B.A01())) {
                    return r5.A0A(i) + A0B.A05(z);
                }
                if (z) {
                    i = r5.A01.BEV(i);
                    continue;
                } else if (i >= i2 - 1) {
                    return -1;
                } else {
                    i++;
                    continue;
                }
            } while (i != -1);
            return -1;
        } else if (AnonymousClass000.A1Q(A01())) {
            return -1;
        } else {
            return 0;
        }
    }

    public int A06(boolean z) {
        int i;
        int i2;
        if (this instanceof AnonymousClass82M) {
            return ((AnonymousClass82M) this).A00.A06(z);
        }
        if (this instanceof AnonymousClass82N) {
            AnonymousClass82N r4 = (AnonymousClass82N) this;
            int i3 = r4.A00;
            if (i3 != 0) {
                if (z) {
                    i = r4.A01.BDQ();
                } else {
                    i = i3 - 1;
                }
                do {
                    Timeline A0B = r4.A0B(i);
                    if (AnonymousClass000.A1Q(A0B.A01())) {
                        if (!z) {
                            if (i <= 0) {
                                break;
                            }
                            i2 = i - 1;
                            continue;
                        } else {
                            i2 = r4.A01.BGD(i);
                            continue;
                        }
                    } else {
                        return r4.A0A(i) + A0B.A06(z);
                    }
                } while (i != -1);
            }
            return -1;
        } else if (AnonymousClass000.A1Q(A01())) {
            return -1;
        } else {
            return A01() - 1;
        }
    }

    public C195889Wr A08(C195889Wr r10, int i, boolean z) {
        int binarySearch;
        int i2;
        Integer valueOf;
        Object create;
        Object obj;
        if (this instanceof AnonymousClass82O) {
            AnonymousClass82O r1 = (AnonymousClass82O) this;
            C200319h9.A00(i, 1);
            if (z) {
                obj = AnonymousClass82O.A03;
            } else {
                obj = null;
            }
            long j = r1.A00;
            C197299bT r0 = C197299bT.A01;
            r10.A04 = obj;
            r10.A00 = 0;
            r10.A01 = j;
            r10.A02 = -0;
            r10.A03 = r0;
        } else if (this instanceof AnonymousClass82L) {
            C197299bT r12 = C197299bT.A01;
            r10.A04 = null;
            r10.A00 = 0;
            r10.A01 = -9223372036854775807L;
            r10.A02 = 0;
            r10.A03 = r12;
            return r10;
        } else {
            if (this instanceof AnonymousClass82M) {
                AnonymousClass82M r2 = (AnonymousClass82M) this;
                if (!(r2 instanceof C1690282y)) {
                    return r2.A00.A08(r10, i, z);
                }
                C1690282y r22 = (C1690282y) r2;
                r22.A00.A08(r10, i, z);
                if (Util.A0E(r10.A04, r22.A00)) {
                    create = C1690282y.A02;
                }
            } else if (this instanceof AnonymousClass82K) {
                throw new IndexOutOfBoundsException();
            } else {
                AnonymousClass82N r4 = (AnonymousClass82N) this;
                boolean z2 = r4 instanceof AnonymousClass82C;
                if (z2) {
                    binarySearch = i / ((AnonymousClass82C) r4).A00;
                } else {
                    int[] iArr = ((AnonymousClass82D) r4).A03;
                    int i3 = i + 1;
                    binarySearch = Arrays.binarySearch(iArr, i3);
                    if (binarySearch < 0) {
                        binarySearch = -(binarySearch + 2);
                    } else {
                        do {
                            binarySearch--;
                            if (binarySearch < 0) {
                                break;
                            }
                        } while (iArr[binarySearch] != i3);
                    }
                }
                int A0A = r4.A0A(binarySearch);
                if (z2) {
                    i2 = binarySearch * ((AnonymousClass82C) r4).A00;
                } else {
                    i2 = ((AnonymousClass82D) r4).A03[binarySearch];
                }
                r4.A0B(binarySearch).A08(r10, i - i2, z);
                r10.A00 += A0A;
                if (z) {
                    if (z2) {
                        valueOf = Integer.valueOf(binarySearch);
                    } else {
                        valueOf = Integer.valueOf(((AnonymousClass82D) r4).A05[binarySearch]);
                    }
                    Object obj2 = r10.A04;
                    Objects.requireNonNull(obj2);
                    create = Pair.create(valueOf, obj2);
                }
            }
            r10.A04 = create;
            return r10;
        }
        return r10;
    }

    public C199579fY A09(C199579fY r10, int i, long j) {
        int binarySearch;
        int i2;
        Object valueOf;
        if (this instanceof AnonymousClass82O) {
            AnonymousClass82O r1 = (AnonymousClass82O) this;
            C200319h9.A00(i, 1);
            Object obj = C199579fY.A0D;
            boolean z = r1.A02;
            long j2 = r1.A01;
            r10.A08 = obj;
            r10.A07 = C199579fY.A0C;
            r10.A05 = -9223372036854775807L;
            r10.A06 = -9223372036854775807L;
            r10.A04 = -9223372036854775807L;
            r10.A0A = z;
            r10.A09 = false;
            r10.A02 = 0;
            r10.A03 = j2;
            r10.A00 = 0;
            r10.A01 = 0;
            return r10;
        } else if (this instanceof AnonymousClass82M) {
            return ((AnonymousClass82M) this).A00.A09(r10, i, j);
        } else {
            if (this instanceof AnonymousClass82L) {
                Object obj2 = C199579fY.A0D;
                long j3 = 0;
                if (j > 0) {
                    j3 = -9223372036854775807L;
                }
                r10.A08 = obj2;
                r10.A07 = C199579fY.A0C;
                r10.A05 = -9223372036854775807L;
                r10.A06 = -9223372036854775807L;
                r10.A04 = -9223372036854775807L;
                r10.A0A = false;
                r10.A09 = true;
                r10.A02 = j3;
                r10.A03 = -9223372036854775807L;
                r10.A00 = 0;
                r10.A01 = 0;
                return r10;
            } else if (this instanceof AnonymousClass82K) {
                throw new IndexOutOfBoundsException();
            } else {
                AnonymousClass82N r5 = (AnonymousClass82N) this;
                boolean z2 = r5 instanceof AnonymousClass82C;
                if (z2) {
                    binarySearch = i / ((AnonymousClass82C) r5).A01;
                } else {
                    int[] iArr = ((AnonymousClass82D) r5).A04;
                    int i3 = i + 1;
                    binarySearch = Arrays.binarySearch(iArr, i3);
                    if (binarySearch < 0) {
                        binarySearch = -(binarySearch + 2);
                    } else {
                        do {
                            binarySearch--;
                            if (binarySearch < 0) {
                                break;
                            }
                        } while (iArr[binarySearch] != i3);
                    }
                }
                int A0A = r5.A0A(binarySearch);
                if (z2) {
                    i2 = binarySearch * ((AnonymousClass82C) r5).A00;
                } else {
                    i2 = ((AnonymousClass82D) r5).A03[binarySearch];
                }
                r5.A0B(binarySearch).A09(r10, i - A0A, j);
                if (z2) {
                    valueOf = Integer.valueOf(binarySearch);
                } else {
                    valueOf = Integer.valueOf(((AnonymousClass82D) r5).A05[binarySearch]);
                }
                if (!C199579fY.A0D.equals(r10.A08)) {
                    valueOf = Pair.create(valueOf, r10.A08);
                }
                r10.A08 = valueOf;
                r10.A00 += i2;
                r10.A01 += i2;
                return r10;
            }
        }
    }

    public int hashCode() {
        int i;
        C199579fY r4 = new C199579fY();
        C195889Wr r7 = new C195889Wr();
        int A01 = A01();
        int i2 = 217 + A01;
        int i3 = 0;
        while (true) {
            i = i2 * 31;
            if (i3 >= A01) {
                break;
            }
            i2 = C36401kF.A02(A09(r4, i3, 0), i);
            i3++;
        }
        int A002 = A00();
        int i4 = i + A002;
        for (int i5 = 0; i5 < A002; i5++) {
            i4 = C36401kF.A02(A08(r7, i5, true), i4 * 31);
        }
        int A05 = A05(true);
        while (A05 != -1) {
            i4 = (i4 * 31) + A05;
            A05 = A02(A05, 0, true);
        }
        return i4;
    }

    public final Pair A07(C195889Wr r9, C199579fY r10, int i, long j, long j2) {
        C200319h9.A00(i, A01());
        A09(r10, i, j2);
        if (j == -9223372036854775807L) {
            j = r10.A02;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = r10.A00;
        long j3 = 0 + j;
        while (true) {
            long j4 = A08(r9, i2, false).A01;
            if (j4 != -9223372036854775807L && j3 >= j4 && i2 < r10.A01) {
                j3 -= j4;
                i2++;
            }
        }
        return Pair.create(Integer.valueOf(i2), Long.valueOf(j3));
    }
}
