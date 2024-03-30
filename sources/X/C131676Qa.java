package X;

import android.text.TextUtils;

/* renamed from: X.6Qa  reason: invalid class name and case insensitive filesystem */
public abstract class C131676Qa {
    public static int[] A02(String str) {
        int i;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int indexOf = str.indexOf(35);
        if (indexOf != -1) {
            length = indexOf;
        }
        int indexOf2 = str.indexOf(63);
        if (indexOf2 == -1 || indexOf2 > length) {
            indexOf2 = length;
        }
        int indexOf3 = str.indexOf(47);
        if (indexOf3 == -1 || indexOf3 > indexOf2) {
            indexOf3 = indexOf2;
        }
        int indexOf4 = str.indexOf(58);
        if (indexOf4 > indexOf3) {
            indexOf4 = -1;
        }
        int i2 = indexOf4 + 2;
        if (i2 < indexOf2 && str.charAt(indexOf4 + 1) == '/' && str.charAt(i2) == '/') {
            i = str.indexOf(47, indexOf4 + 3);
            if (i == -1 || i > indexOf2) {
                i = indexOf2;
            }
        } else {
            i = indexOf4 + 1;
        }
        iArr[0] = indexOf4;
        C90474aD.A1R(iArr, i, indexOf2, length);
        return iArr;
    }

    public static String A01(StringBuilder sb, int i, int i2) {
        int i3;
        int i4;
        if (i < i2) {
            if (sb.charAt(i) == '/') {
                i++;
            }
            int i5 = i;
            int i6 = i;
            while (i5 <= i2) {
                if (i5 == i2) {
                    i3 = i5;
                } else if (sb.charAt(i5) == '/') {
                    i3 = i5 + 1;
                } else {
                    i5++;
                }
                int i7 = i6 + 1;
                if (i5 == i7 && sb.charAt(i6) == '.') {
                    sb.delete(i6, i3);
                    i4 = i3 - i6;
                } else if (i5 == i6 + 2 && sb.charAt(i6) == '.' && sb.charAt(i7) == '.') {
                    i6 = sb.lastIndexOf("/", i6 - 2) + 1;
                    int i8 = i;
                    if (i6 > i) {
                        i8 = i6;
                    }
                    sb.delete(i8, i3);
                    i4 = i3 - i8;
                } else {
                    i6 = i5 + 1;
                    i5 = i6;
                }
                i2 -= i4;
                i5 = i6;
            }
        }
        return sb.toString();
    }

    public static String A00(String str, String str2) {
        StringBuilder A0u = AnonymousClass000.A0u();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] A02 = A02(str2);
        if (A02[0] != -1) {
            A0u.append(str2);
            A01(A0u, A02[1], A02[2]);
            return A0u.toString();
        }
        int[] A022 = A02(str);
        if (A02[3] == 0) {
            A0u.append(str, 0, A022[3]);
            return AnonymousClass000.A0q(str2, A0u);
        } else if (A02[2] == 0) {
            A0u.append(str, 0, A022[2]);
            return AnonymousClass000.A0q(str2, A0u);
        } else {
            int i = A02[1];
            if (i != 0) {
                int i2 = A022[0] + 1;
                A0u.append(str, 0, i2);
                A0u.append(str2);
                return A01(A0u, A02[1] + i2, i2 + A02[2]);
            } else if (str2.charAt(i) == '/') {
                A0u.append(str, 0, A022[1]);
                A0u.append(str2);
                int i3 = A022[1];
                return A01(A0u, i3, A02[2] + i3);
            } else {
                int i4 = A022[0] + 2;
                int i5 = A022[1];
                if (i4 >= i5 || i5 != A022[2]) {
                    int lastIndexOf = str.lastIndexOf(47, A022[2] - 1);
                    if (lastIndexOf != -1) {
                        i5 = lastIndexOf + 1;
                    }
                    A0u.append(str, 0, i5);
                    A0u.append(str2);
                    return A01(A0u, A022[1], i5 + A02[2]);
                }
                A0u.append(str, 0, i5);
                A0u.append('/');
                A0u.append(str2);
                int i6 = A022[1];
                return A01(A0u, i6, A02[2] + i6 + 1);
            }
        }
    }
}
