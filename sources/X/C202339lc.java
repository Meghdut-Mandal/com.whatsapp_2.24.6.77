package X;

/* renamed from: X.9lc  reason: invalid class name and case insensitive filesystem */
public abstract class C202339lc {
    public static long A00(String[] strArr, int i) {
        if (strArr.length > i) {
            return AnonymousClass6R8.A01(strArr[i], 0);
        }
        return 0;
    }

    public static Boolean A01(String[] strArr, int i) {
        if (strArr.length > i) {
            String str = strArr[i];
            if (!"null".equals(str)) {
                return Boolean.valueOf(Boolean.parseBoolean(str));
            }
        }
        return null;
    }

    public static Integer A02(String[] strArr) {
        if (strArr.length > 1) {
            String str = strArr[1];
            if (!"null".equals(str)) {
                return Integer.valueOf(AnonymousClass6R8.A00(str, 0));
            }
        }
        return null;
    }

    public static Long A04(String[] strArr, int i) {
        if (strArr.length > i) {
            String str = strArr[i];
            if (!"null".equals(str)) {
                return C165597tg.A0f(str);
            }
        }
        return null;
    }

    public static Long A03(Long l) {
        long longValue;
        if (l == null) {
            longValue = 0;
        } else {
            longValue = l.longValue();
        }
        return Long.valueOf(longValue + 1);
    }
}
