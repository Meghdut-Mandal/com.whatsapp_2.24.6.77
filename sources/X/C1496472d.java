package X;

import androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.72d  reason: invalid class name and case insensitive filesystem */
public final class C1496472d implements Iterable, AnonymousClass00W {
    public static final C1496472d A04 = new C1496472d((int[]) null, 0, 0, 0);
    public final int A00;
    public final long A01;
    public final long A02;
    public final int[] A03;

    public static final int A00(int[] iArr, int i) {
        int length = iArr.length - 1;
        int i2 = 0;
        while (i2 <= length) {
            int i3 = (i2 + length) >>> 1;
            int i4 = iArr[i3];
            if (i > i4) {
                i2 = i3 + 1;
            } else if (i >= i4) {
                return i3;
            } else {
                length = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public final C1496472d A04(C1496472d r10) {
        int[] iArr;
        C1496472d r2 = r10;
        C1496472d r0 = A04;
        if (r10 == r0) {
            return this;
        }
        if (this == r0) {
            return r2;
        }
        int i = r10.A00;
        int i2 = this.A00;
        if (i == i2 && r10.A03 == (iArr = this.A03)) {
            return new C1496472d(iArr, i2, r10.A02 | this.A02, r10.A01 | this.A01);
        } else if (this.A03 == null) {
            Iterator it = iterator();
            while (it.hasNext()) {
                r2 = r2.A02(C36341k9.A0A(it));
            }
            return r2;
        } else {
            Iterator it2 = r10.iterator();
            C1496472d r22 = this;
            while (it2.hasNext()) {
                r22 = r22.A02(C36341k9.A0A(it2));
            }
            return r22;
        }
    }

    public Iterator iterator() {
        return new C18650tV(new SnapshotIdSet$iterator$1(this, (C023509x) null), 1).iterator();
    }

    public final C1496472d A01(int i) {
        int A002;
        int[] iArr;
        long j;
        long j2;
        int i2 = this.A00;
        int i3 = i - i2;
        if (i3 >= 0) {
            if (i3 < 64) {
                long j3 = 1 << i3;
                long j4 = this.A01;
                if ((j4 & j3) != 0) {
                    j = this.A02;
                    j2 = j4 & (~j3);
                }
                return this;
            }
            if (i3 < 128) {
                long j5 = 1 << (i3 - 64);
                long j6 = this.A02;
                if ((j6 & j5) != 0) {
                    j = j6 & (~j5);
                    j2 = this.A01;
                }
            }
            return this;
            iArr = this.A03;
        } else {
            int[] iArr2 = this.A03;
            if (iArr2 != null && (A002 = A00(iArr2, i)) >= 0) {
                int length = iArr2.length - 1;
                if (length == 0) {
                    j = this.A02;
                    j2 = this.A01;
                    iArr = null;
                } else {
                    iArr = new int[length];
                    if (A002 > 0) {
                        AnonymousClass02Q.A03(0, 0, A002, iArr2, iArr);
                    }
                    if (A002 < length) {
                        AnonymousClass02Q.A03(A002, A002 + 1, length + 1, iArr2, iArr);
                    }
                    j = this.A02;
                    j2 = this.A01;
                }
            }
            return this;
        }
        return new C1496472d(iArr, i2, j, j2);
    }

    public final C1496472d A02(int i) {
        int[] iArr;
        long j;
        long j2;
        int i2 = this.A00;
        int i3 = i;
        int i4 = i - i2;
        if (i4 >= 0) {
            if (i4 < 64) {
                long j3 = 1 << i4;
                long j4 = this.A01;
                if ((j4 & j3) != 0) {
                    return this;
                }
                j = this.A02;
                j2 = j4 | j3;
            } else if (i4 < 128) {
                long j5 = 1 << (i4 - 64);
                long j6 = this.A02;
                if ((j6 & j5) != 0) {
                    return this;
                }
                j = j6 | j5;
                j2 = this.A01;
            } else if (A05(i3)) {
                return this;
            } else {
                long j7 = this.A02;
                long j8 = this.A01;
                ArrayList arrayList = null;
                int i5 = ((i + 1) / 64) * 64;
                while (true) {
                    if (i2 >= i5) {
                        i5 = i2;
                        break;
                    }
                    if (j8 != 0) {
                        if (arrayList == null) {
                            arrayList = AnonymousClass001.A0I();
                            int[] iArr2 = this.A03;
                            if (iArr2 != null) {
                                for (int A1F : iArr2) {
                                    AnonymousClass000.A1F(arrayList, A1F);
                                }
                            }
                        }
                        int i6 = 0;
                        do {
                            if (((1 << i6) & j8) != 0) {
                                AnonymousClass000.A1F(arrayList, i6 + i2);
                            }
                            i6++;
                        } while (i6 < 64);
                    }
                    if (j7 == 0) {
                        j8 = 0;
                        break;
                    }
                    i2 += 64;
                    j8 = j7;
                    j7 = 0;
                }
                if (arrayList != null) {
                    iArr = C007103b.A0m(arrayList);
                } else {
                    iArr = this.A03;
                }
                return new C1496472d(iArr, i5, j7, j8).A02(i3);
            }
            return new C1496472d(this.A03, i2, j, j2);
        }
        int[] iArr3 = this.A03;
        if (iArr3 == null) {
            return new C1496472d(new int[]{i}, i2, this.A02, this.A01);
        }
        int A002 = A00(iArr3, i3);
        if (A002 >= 0) {
            return this;
        }
        int i7 = -(A002 + 1);
        int length = iArr3.length + 1;
        int[] iArr4 = new int[length];
        AnonymousClass02Q.A03(0, 0, i7, iArr3, iArr4);
        AnonymousClass02Q.A03(i7 + 1, i7, length - 1, iArr3, iArr4);
        iArr4[i7] = i;
        return new C1496472d(iArr4, i2, this.A02, this.A01);
    }

    public final C1496472d A03(C1496472d r11) {
        int[] iArr;
        C1496472d r3 = A04;
        if (r11 == r3) {
            return this;
        }
        if (this == r3) {
            return r3;
        }
        int i = r11.A00;
        int i2 = this.A00;
        if (i == i2 && r11.A03 == (iArr = this.A03)) {
            return new C1496472d(iArr, i2, (~r11.A02) & this.A02, (~r11.A01) & this.A01);
        }
        Iterator it = r11.iterator();
        C1496472d r32 = this;
        while (it.hasNext()) {
            r32 = r32.A01(C36341k9.A0A(it));
        }
        return r32;
    }

    public final boolean A05(int i) {
        long j;
        long j2;
        int i2 = i - this.A00;
        if (i2 >= 0) {
            if (i2 < 64) {
                j = 1 << i2;
                j2 = this.A01;
            } else if (i2 < 128) {
                j = 1 << (i2 - 64);
                j2 = this.A02;
            }
            if ((j & j2) == 0) {
                return false;
            }
            return true;
        }
        int[] iArr = this.A03;
        if (iArr == null || A00(iArr, i) < 0) {
            return false;
        }
        return true;
        return false;
    }

    public C1496472d(int[] iArr, int i, long j, long j2) {
        this.A02 = j;
        this.A01 = j2;
        this.A00 = i;
        this.A03 = iArr;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(super.toString());
        A0u.append(" [");
        ArrayList A0J = C36321k7.A0J(this);
        Iterator it = iterator();
        while (it.hasNext()) {
            A0J.add(String.valueOf(C36341k9.A0A(it)));
        }
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("");
        int size = A0J.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = A0J.get(i2);
            i++;
            if (i > 1) {
                A0u2.append(", ");
            }
            if (obj != null && !(obj instanceof CharSequence)) {
                if (obj instanceof Character) {
                    A0u2.append(((Character) obj).charValue());
                } else {
                    obj = String.valueOf(obj);
                }
            }
            A0u2.append((CharSequence) obj);
        }
        A0u2.append("");
        C36351kA.A1K(A0u2, A0u);
        return AnonymousClass000.A0t(A0u, ']');
    }
}
