package X;

import android.text.TextUtils;

/* renamed from: X.3La  reason: invalid class name and case insensitive filesystem */
public abstract class C63693La {
    public static char A00(String str) {
        int length;
        char charAt = str.charAt(0);
        if ((charAt != '+' && charAt != '-') || (length = str.length()) < 2) {
            return charAt;
        }
        int i = 1;
        do {
            char charAt2 = str.charAt(i);
            if (charAt2 != '+' && charAt2 != '-') {
                return str.charAt(i);
            }
            i++;
        } while (i < length);
        return charAt;
    }

    public static Integer A01(String str, String str2) {
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            return C36381kD.A0m();
        }
        if (!TextUtils.isEmpty(str)) {
            if (!TextUtils.isEmpty(str2)) {
                char A00 = A00(str);
                char A002 = A00(str2);
                if (!Character.isDigit(A00) || Character.isDigit(A002)) {
                    if (Character.isDigit(A00) || !Character.isDigit(A002)) {
                        return null;
                    }
                }
            }
            return -1;
        }
        return 1;
    }
}
