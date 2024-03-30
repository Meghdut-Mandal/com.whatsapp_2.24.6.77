package X;

import java.util.List;

/* renamed from: X.6Gh  reason: invalid class name and case insensitive filesystem */
public abstract class C129286Gh {
    public static String A00(Integer num, List list) {
        char c = '|';
        if (num == C023109s.A00) {
            c = '/';
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        for (Object next : list) {
            A0u.append(c);
            A0u.append(next);
        }
        return A0u.toString();
    }

    public static String A01(String str, String str2) {
        if (str2 == null || str2.equals("")) {
            return str;
        }
        return AnonymousClass000.A0p("#", str2, AnonymousClass000.A0v(str));
    }
}
