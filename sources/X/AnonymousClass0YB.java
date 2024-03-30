package X;

import java.util.Arrays;

/* renamed from: X.0YB  reason: invalid class name */
public final class AnonymousClass0YB {
    public static final AnonymousClass0YB A04 = new AnonymousClass0YB(0, new int[0], new Object[0], false);
    public int A00;
    public boolean A01;
    public int[] A02;
    public Object[] A03;

    public AnonymousClass0YB(int i, int[] iArr, Object[] objArr, boolean z) {
        this.A00 = i;
        this.A02 = iArr;
        this.A03 = objArr;
        this.A01 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof AnonymousClass0YB)) {
                AnonymousClass0YB r9 = (AnonymousClass0YB) obj;
                int i = this.A00;
                if (i == r9.A00) {
                    int[] iArr = this.A02;
                    int[] iArr2 = r9.A02;
                    int i2 = 0;
                    while (true) {
                        if (i2 < i) {
                            if (iArr[i2] != iArr2[i2]) {
                                break;
                            }
                            i2++;
                        } else {
                            Object[] objArr = this.A03;
                            Object[] objArr2 = r9.A03;
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

    public AnonymousClass0YB() {
        this(0, new int[8], new Object[8], true);
    }

    public static AnonymousClass0YB A00() {
        return new AnonymousClass0YB(0, new int[8], new Object[8], true);
    }

    public final void A01(int i, Object obj) {
        if (this.A01) {
            int i2 = this.A00;
            int[] iArr = this.A02;
            if (i2 == iArr.length) {
                int i3 = i2 >> 1;
                if (i2 < 4) {
                    i3 = 8;
                }
                int i4 = i2 + i3;
                this.A02 = Arrays.copyOf(iArr, i4);
                this.A03 = Arrays.copyOf(this.A03, i4);
            }
            int[] iArr2 = this.A02;
            int i5 = this.A00;
            iArr2[i5] = i;
            this.A03[i5] = obj;
            this.A00 = i5 + 1;
            return;
        }
        throw AnonymousClass001.A0D();
    }

    public final int hashCode() {
        int i = this.A00;
        int i2 = (i + 527) * 31;
        int[] iArr = this.A02;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.A03;
        for (int i7 = 0; i7 < i; i7++) {
            i3 = (i3 * 31) + objArr[i7].hashCode();
        }
        return i6 + i3;
    }
}
