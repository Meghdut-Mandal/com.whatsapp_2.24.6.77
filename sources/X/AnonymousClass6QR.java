package X;

import java.util.ArrayList;

/* renamed from: X.6QR  reason: invalid class name */
public abstract class AnonymousClass6QR {
    public static final int A00(int i) {
        switch (i) {
            case 0:
                return 0;
            case 1:
            case 2:
            case 4:
                return 1;
            case 3:
            case 5:
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    public static int A02(int[] iArr, int i) {
        int i2 = i * 5;
        return iArr[i2 + 4] + A00(iArr[i2 + 1] >> 28);
    }

    public static final boolean A03(int[] iArr, int i) {
        if ((iArr[(i * 5) + 1] & 1073741824) == 0) {
            return false;
        }
        return true;
    }

    public static final int A01(ArrayList arrayList, int i, int i2) {
        int A0C = C90504aG.A0C(arrayList);
        int i3 = 0;
        while (i3 <= A0C) {
            int i4 = (i3 + A0C) >>> 1;
            int i5 = ((AnonymousClass606) arrayList.get(i4)).A00;
            if (i5 < 0) {
                i5 += i2;
            }
            int A00 = AnonymousClass00C.A00(i5, i);
            if (A00 < 0) {
                i3 = i4 + 1;
            } else if (A00 <= 0) {
                return i4;
            } else {
                A0C = i4 - 1;
            }
        }
        return -(i3 + 1);
    }
}
