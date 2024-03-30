package X;

/* renamed from: X.9kb  reason: invalid class name and case insensitive filesystem */
public abstract class C201879kb {
    public static final int[] A00 = {6, 5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};
    public static final int[] A01 = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2};

    public static boolean A00(String str) {
        int[] iArr;
        int i;
        int i2;
        String replaceAll = str.replaceAll("[^\\d]", "");
        int length = replaceAll.length();
        if (length == 11) {
            iArr = A01;
        } else {
            if (length == 14) {
                iArr = A00;
            }
            return false;
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = length - 2;
            if (i3 >= i) {
                break;
            }
            int i5 = i3 + 1;
            i4 += iArr[i5] * C165607th.A09(replaceAll, i3);
            i3 = i5;
        }
        int i6 = 11 - (i4 % 11);
        if (i6 > 9) {
            i6 = 0;
        }
        if (C165607th.A09(replaceAll, i) == i6) {
            int i7 = 0;
            int i8 = 0;
            while (true) {
                i2 = length - 1;
                if (i7 >= i2) {
                    break;
                }
                i8 += iArr[i7] * C165607th.A09(replaceAll, i7);
                i7++;
            }
            int i9 = 11 - (i8 % 11);
            if (i9 > 9) {
                i9 = 0;
            }
            if (C165607th.A09(replaceAll, i2) == i9) {
                int i10 = 1;
                while (replaceAll.charAt(i10 - 1) == replaceAll.charAt(i10)) {
                    i10++;
                    if (i10 >= length) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static boolean A01(String str) {
        String replaceAll = str.replaceAll("\\s", "");
        int i = 0;
        boolean z = false;
        for (int length = replaceAll.length() - 1; length >= 0; length--) {
            int parseInt = Integer.parseInt(replaceAll.substring(length, length + 1));
            if (z && (parseInt = parseInt * 2) > 9) {
                parseInt = (parseInt % 10) + 1;
            }
            i += parseInt;
            z = !z;
        }
        if (i % 10 != 0) {
            return false;
        }
        return true;
    }

    public static boolean A02(String str) {
        int length = str.length();
        int[] iArr = new int[length];
        int i = 9;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            int A09 = C165607th.A09(str, i3);
            iArr[i3] = A09;
            i = Math.min(i, A09);
            i2 = Math.max(i2, A09);
        }
        if (i != i2) {
            boolean z = true;
            boolean z2 = true;
            for (int i4 = 0; i4 < length; i4++) {
                z &= AnonymousClass000.A1S(iArr[i4], i + i4);
                z2 &= AnonymousClass000.A1S(iArr[i4], i2 - i4);
                if (!z2 && !z) {
                    return true;
                }
            }
        }
        return false;
    }
}
