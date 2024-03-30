package X;

import com.google.protobuf.CodedOutputStream;
import java.util.Arrays;

/* renamed from: X.9lJ  reason: invalid class name and case insensitive filesystem */
public final class C202229lJ {
    public static final C202229lJ A04 = new C202229lJ(0, new int[0], new Object[0], false);
    public int A00;
    public boolean A01;
    public int[] A02;
    public Object[] A03;
    public int count;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof C202229lJ)) {
                C202229lJ r9 = (C202229lJ) obj;
                int i = this.count;
                if (i == r9.count) {
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

    public static void A00(C202229lJ r3, int i) {
        int[] iArr = r3.A02;
        if (i > iArr.length) {
            int i2 = r3.count;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            r3.A02 = Arrays.copyOf(iArr, i);
            r3.A03 = Arrays.copyOf(r3.A03, i);
        }
    }

    public int A01() {
        int i;
        int i2;
        int i3;
        int i4 = this.A00;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.count; i6++) {
            int i7 = this.A02[i6];
            int i8 = i7 >>> 3;
            int i9 = i7 & 7;
            if (i9 == 0) {
                long A0C = C165587tf.A0C(this.A03, i6);
                i = C1897895p.A05(i8);
                i2 = CodedOutputStream.A01(A0C);
                i3 = i + i2;
            } else if (i9 != 1) {
                if (i9 == 2) {
                    boolean z = CodedOutputStream.A01;
                    i = C1897895p.A05(i8);
                    int A022 = ((C21674AUx) this.A03[i6]).A02();
                    i2 = C165567td.A00(A022) + A022;
                } else if (i9 == 3) {
                    i = C1897895p.A05(i8) * 2;
                    i2 = ((C202229lJ) this.A03[i6]).A01();
                } else if (i9 == 5) {
                    i3 = C1897895p.A05(i8) + 4;
                } else {
                    throw new IllegalStateException(new AnonymousClass8SZ());
                }
                i3 = i + i2;
            } else {
                i3 = C1897895p.A05(i8) + 8;
            }
            i5 += i3;
        }
        this.A00 = i5;
        return i5;
    }

    public void A02(int i, Object obj) {
        if (this.A01) {
            A00(this, this.count + 1);
            int[] iArr = this.A02;
            int i2 = this.count;
            iArr[i2] = i;
            this.A03[i2] = obj;
            this.count = i2 + 1;
            return;
        }
        throw AnonymousClass001.A0D();
    }

    public void A03(AnonymousClass9TV r7) {
        if (this.count != 0) {
            for (int i = 0; i < this.count; i++) {
                int i2 = this.A02[i];
                Object obj = this.A03[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    r7.A00.A0D(i3, C36431kI.A09(obj));
                } else if (i4 == 1) {
                    r7.A00.A0C(i3, C36431kI.A09(obj));
                } else if (i4 == 2) {
                    CodedOutputStream codedOutputStream = r7.A00;
                    C1897895p.A07(codedOutputStream, i3);
                    codedOutputStream.A0H((C21674AUx) obj);
                } else if (i4 == 3) {
                    CodedOutputStream codedOutputStream2 = r7.A00;
                    int i5 = i3 << 3;
                    codedOutputStream2.A08(i5 | 3);
                    ((C202229lJ) obj).A03(r7);
                    codedOutputStream2.A08(i5 | 4);
                } else if (i4 == 5) {
                    r7.A00.A09(i3, AnonymousClass000.A0I(obj));
                } else {
                    throw AnonymousClass001.A0B(new AnonymousClass8SZ());
                }
            }
        }
    }

    public int hashCode() {
        int i = this.count;
        int A012 = C165617ti.A01(i);
        int[] iArr = this.A02;
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + iArr[i3];
        }
        int i4 = (A012 + i2) * 31;
        Object[] objArr = this.A03;
        int i5 = 17;
        for (int i6 = 0; i6 < i; i6++) {
            i5 = C36401kF.A02(objArr[i6], i5 * 31);
        }
        return i4 + i5;
    }

    public C202229lJ(int i, int[] iArr, Object[] objArr, boolean z) {
        this.A00 = -1;
        this.count = i;
        this.A02 = iArr;
        this.A03 = objArr;
        this.A01 = z;
    }

    public C202229lJ() {
        this(0, new int[8], new Object[8], true);
    }
}
