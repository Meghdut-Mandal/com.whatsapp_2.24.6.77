package X;

/* renamed from: X.5zW  reason: invalid class name and case insensitive filesystem */
public final class C125225zW {
    public final boolean A00(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        int length = str.length();
        if (length != 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i < length) {
                    char charAt = str.charAt(i);
                    int i4 = i3 + 1;
                    if (i3 == 0) {
                        if (charAt != '(') {
                            break;
                        }
                    } else if (charAt != '(') {
                        if (charAt == ')' && i2 - 1 == 0 && i3 != length - 1) {
                            return false;
                        }
                        i++;
                        i3 = i4;
                    }
                    i2++;
                    i++;
                    i3 = i4;
                } else if (i2 == 0) {
                    return AnonymousClass00C.A0J(C36371kC.A0y(C36431kI.A16(1, length - 1, str)), str2);
                }
            }
        }
        return false;
    }
}
