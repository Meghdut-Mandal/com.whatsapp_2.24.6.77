package X;

import java.util.Arrays;

/* renamed from: X.9jt  reason: invalid class name and case insensitive filesystem */
public final class C201569jt {
    public static final C201569jt A05 = new C201569jt(0, new int[0], new Object[0], false);
    public int A00;
    public int A01;
    public boolean A02;
    public int[] A03;
    public Object[] A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof C201569jt)) {
                C201569jt r9 = (C201569jt) obj;
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
                i = AnonymousClass95R.A04(i8);
                i2 = C170568Dy.A02(A0C);
                i3 = i + i2;
            } else if (i9 == 1) {
                i3 = AnonymousClass95R.A04(i8) + 8;
            } else if (i9 == 2) {
                i3 = C170568Dy.A03((C21673AUw) this.A04[i6], i8);
            } else if (i9 == 3) {
                i = AnonymousClass95R.A04(i8) << 1;
                i2 = ((C201569jt) this.A04[i6]).A00();
                i3 = i + i2;
            } else if (i9 == 5) {
                i3 = AnonymousClass95R.A04(i8) + 4;
            } else {
                throw new IllegalStateException(new AnonymousClass8EY());
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

    public final void A02(B3O b3o) {
        if (this.A00 != 0) {
            for (int i = 0; i < this.A00; i++) {
                int i2 = this.A03[i];
                Object obj = this.A04[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    AnonymousClass95R.A09(b3o, i3, C36431kI.A09(obj));
                } else if (i4 == 1) {
                    AnonymousClass95R.A08(b3o, i3, C36431kI.A09(obj));
                } else if (i4 == 2) {
                    ((A44) b3o).A00.A0B((C21673AUw) obj, i3);
                } else if (i4 == 3) {
                    C170568Dy r2 = ((A44) b3o).A00;
                    int i5 = i3 << 3;
                    r2.A05(i5 | 3);
                    ((C201569jt) obj).A02(b3o);
                    r2.A05(i5 | 4);
                } else if (i4 == 5) {
                    AnonymousClass95R.A07(b3o, i3, AnonymousClass000.A0I(obj));
                } else {
                    throw AnonymousClass001.A0B(new AnonymousClass8EY());
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

    public C201569jt(int i, int[] iArr, Object[] objArr, boolean z) {
        this.A01 = -1;
        this.A00 = i;
        this.A03 = iArr;
        this.A04 = objArr;
        this.A02 = z;
    }

    public C201569jt() {
        this(0, new int[8], new Object[8], true);
    }
}
