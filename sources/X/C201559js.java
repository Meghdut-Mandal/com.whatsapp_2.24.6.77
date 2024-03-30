package X;

import java.util.Arrays;

/* renamed from: X.9js  reason: invalid class name and case insensitive filesystem */
public final class C201559js {
    public static final C201559js A05 = new C201559js(0, new int[0], new Object[0], false);
    public int A00;
    public int A01;
    public boolean A02;
    public int[] A03;
    public Object[] A04;

    public C201559js() {
        this(0, new int[8], new Object[8], true);
    }

    public C201559js(int i, int[] iArr, Object[] objArr, boolean z) {
        this.A01 = -1;
        this.A00 = i;
        this.A03 = iArr;
        this.A04 = objArr;
        this.A02 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof C201559js)) {
                C201559js r9 = (C201559js) obj;
                int i = this.A00;
                if (i == r9.A00) {
                    int[] iArr = this.A03;
                    int[] iArr2 = r9.A03;
                    int i2 = 0;
                    while (true) {
                        if (i2 < i) {
                            if (iArr[i2] != iArr2[i2]) {
                                break;
                            }
                            i2++;
                        } else {
                            Object[] objArr = this.A04;
                            Object[] objArr2 = r9.A04;
                            int i3 = 0;
                            while (i3 < i) {
                                if (objArr[i3].equals(objArr2[i3])) {
                                    i3++;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int A00() {
        int i;
        int i2;
        int i3;
        int i4 = this.A01;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.A00; i6++) {
            int i7 = this.A03[i6];
            int i8 = i7 >>> 3;
            int i9 = i7 & 7;
            if (i9 == 0) {
                long A0C = C165587tf.A0C(this.A04, i6);
                i = C194279Ox.A02(i8);
                i2 = AnonymousClass8D7.A01(A0C);
                i3 = i + i2;
            } else if (i9 != 1) {
                if (i9 == 2) {
                    i = C194279Ox.A02(i8);
                    int A022 = ((AUv) this.A04[i6]).A02();
                    boolean z = AnonymousClass8D7.A01;
                    i2 = C165567td.A00(A022) + A022;
                } else if (i9 == 3) {
                    i = C194279Ox.A02(i8) << 1;
                    i2 = ((C201559js) this.A04[i6]).A00();
                } else if (i9 == 5) {
                    i3 = C194279Ox.A02(i8) + 4;
                } else {
                    throw new IllegalStateException(new AnonymousClass8DH());
                }
                i3 = i + i2;
            } else {
                i3 = C194279Ox.A02(i8) + 8;
            }
            i5 += i3;
        }
        this.A01 = i5;
        return i5;
    }

    public final void A01(int i, Object obj) {
        if (this.A02) {
            int i2 = this.A00;
            int[] iArr = this.A03;
            if (i2 == iArr.length) {
                int i3 = i2 >> 1;
                if (i2 < 4) {
                    i3 = 8;
                }
                int i4 = i2 + i3;
                this.A03 = Arrays.copyOf(iArr, i4);
                this.A04 = Arrays.copyOf(this.A04, i4);
            }
            int[] iArr2 = this.A03;
            int i5 = this.A00;
            iArr2[i5] = i;
            this.A04[i5] = obj;
            this.A00 = i5 + 1;
            return;
        }
        throw AnonymousClass001.A0D();
    }

    public final void A02(C22890Axl axl) {
        if (this.A00 != 0) {
            for (int i = 0; i < this.A00; i++) {
                int i2 = this.A03[i];
                Object obj = this.A04[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    C194279Ox.A06(((C21017A3g) axl).A00, i3, C36431kI.A09(obj));
                } else if (i4 == 1) {
                    ((C21017A3g) axl).A00.A07(i3, C36431kI.A09(obj));
                } else if (i4 == 2) {
                    ((C21017A3g) axl).A00.A0B((AUv) obj, i3);
                } else if (i4 == 3) {
                    AnonymousClass8D7 r2 = ((C21017A3g) axl).A00;
                    int i5 = i3 << 3;
                    r2.A03(i5 | 3);
                    ((C201559js) obj).A02(axl);
                    r2.A03(i5 | 4);
                } else if (i4 == 5) {
                    ((C21017A3g) axl).A00.A06(i3, AnonymousClass000.A0I(obj));
                } else {
                    throw AnonymousClass001.A0B(new AnonymousClass8DH());
                }
            }
        }
    }

    public final int hashCode() {
        int i = this.A00;
        int i2 = (i + 527) * 31;
        int[] iArr = this.A03;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.A04;
        for (int i7 = 0; i7 < i; i7++) {
            i3 = C36401kF.A02(objArr[i7], i3 * 31);
        }
        return i6 + i3;
    }
}
