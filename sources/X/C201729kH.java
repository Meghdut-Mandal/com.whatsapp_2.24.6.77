package X;

import java.text.BreakIterator;

/* renamed from: X.9kH  reason: invalid class name and case insensitive filesystem */
public abstract class C201729kH {
    public static boolean A01(int i) {
        if (i < 48) {
            return false;
        }
        if (i <= 57) {
            return true;
        }
        if (i < 65) {
            return false;
        }
        if (i > 70) {
            return i >= 97 && i <= 102;
        }
        return true;
    }

    public static boolean A02(int i) {
        if (i == 33 || i == 36 || i == 59 || i == 61) {
            return true;
        }
        switch (i) {
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
                return true;
            default:
                return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0024 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002d A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A03(int r2) {
        /*
            r0 = 65
            if (r2 < r0) goto L_0x0028
            r0 = 90
            if (r2 <= r0) goto L_0x0010
            r0 = 97
            r1 = 122(0x7a, float:1.71E-43)
        L_0x000c:
            if (r2 < r0) goto L_0x0026
            if (r2 > r1) goto L_0x0026
        L_0x0010:
            r0 = 1
        L_0x0011:
            r1 = 1
            if (r0 != 0) goto L_0x002d
            r0 = 45
            if (r2 == r0) goto L_0x002d
            r0 = 46
            if (r2 == r0) goto L_0x002d
            r0 = 95
            if (r2 == r0) goto L_0x002d
            r0 = 126(0x7e, float:1.77E-43)
            if (r2 == r0) goto L_0x002d
            r0 = 0
            return r0
        L_0x0026:
            r0 = 0
            goto L_0x0011
        L_0x0028:
            r0 = 48
            r1 = 57
            goto L_0x000c
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C201729kH.A03(int):boolean");
    }

    public static void A00(String str, BreakIterator breakIterator) {
        int length = str.length();
        int current = breakIterator.current();
        if (current >= length || current == -1) {
            throw AnonymousClass001.A08("Hex string must have 2 characters, found 0");
        }
        int codePointAt = str.codePointAt(current);
        if (A01(codePointAt)) {
            int next = breakIterator.next();
            if (next >= length || next == -1) {
                throw AnonymousClass001.A08("Hex string must have 2 characters, found 1");
            }
            int codePointAt2 = str.codePointAt(next);
            if (!A01(codePointAt2)) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("Second hex string character ");
                C165577te.A1P(A0u, codePointAt2);
                throw AnonymousClass000.A0c(" is not a valid hex digit", A0u);
            }
            return;
        }
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("First hex string character ");
        C165577te.A1P(A0u2, codePointAt);
        throw AnonymousClass000.A0c(" is not a valid hex digit", A0u2);
    }
}
