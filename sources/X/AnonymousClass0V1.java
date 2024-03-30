package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.0V1  reason: invalid class name */
public class AnonymousClass0V1 {
    public List A00;
    public int[] A01;

    public static C08810bM A00(AnonymousClass0V1 r0, int i) {
        return (C08810bM) r0.A00.get(i);
    }

    public C08810bM A01(int i) {
        C08810bM A002;
        List list = this.A00;
        if (list != null) {
            int size = list.size();
            do {
                size--;
                if (size >= 0) {
                    A002 = A00(this, size);
                }
            } while (A002.A01 != i);
            return A002;
        }
        return null;
    }

    public void A02(int i) {
        List list = this.A00;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else if (A00(this, size).A01 >= i) {
                    this.A00.remove(size);
                }
            }
        }
        A03(i);
    }

    public void A03(int i) {
        int[] iArr;
        int length;
        int[] iArr2 = this.A01;
        if (iArr2 != null && i < iArr2.length) {
            if (this.A00 != null) {
                C08810bM A012 = A01(i);
                if (A012 != null) {
                    this.A00.remove(A012);
                }
                int size = this.A00.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    } else if (A00(this, i2).A01 < i) {
                        i2++;
                    } else if (i2 != -1) {
                        C08810bM A002 = A00(this, i2);
                        this.A00.remove(i2);
                        int i3 = A002.A01;
                        if (i3 != -1) {
                            iArr = this.A01;
                            length = i3 + 1;
                        }
                    }
                }
            }
            iArr = this.A01;
            length = iArr.length;
            Arrays.fill(iArr, i, length, -1);
        }
    }

    public void A04(int i) {
        int[] iArr = this.A01;
        if (iArr == null) {
            int[] iArr2 = new int[(Math.max(i, 10) + 1)];
            this.A01 = iArr2;
            Arrays.fill(iArr2, -1);
            return;
        }
        int length = iArr.length;
        if (i >= length) {
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.A01 = iArr3;
            int length2 = iArr.length;
            System.arraycopy(iArr, 0, iArr3, 0, length2);
            int[] iArr4 = this.A01;
            Arrays.fill(iArr4, length2, iArr4.length, -1);
        }
    }

    public void A05(int i, int i2) {
        int[] iArr = this.A01;
        if (iArr != null && i < iArr.length) {
            int i3 = i + i2;
            A04(i3);
            int[] iArr2 = this.A01;
            System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
            Arrays.fill(this.A01, i, i3, -1);
            List list = this.A00;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        C08810bM A002 = A00(this, size);
                        int i4 = A002.A01;
                        if (i4 >= i) {
                            A002.A01 = i4 + i2;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public void A06(int i, int i2) {
        int[] iArr = this.A01;
        if (iArr != null && i < iArr.length) {
            int i3 = i + i2;
            A04(i3);
            int[] iArr2 = this.A01;
            System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
            int[] iArr3 = this.A01;
            int length = iArr3.length;
            Arrays.fill(iArr3, length - i2, length, -1);
            List list = this.A00;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        C08810bM A002 = A00(this, size);
                        int i4 = A002.A01;
                        if (i4 >= i) {
                            if (i4 < i3) {
                                this.A00.remove(size);
                            } else {
                                A002.A01 = i4 - i2;
                            }
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }
}
