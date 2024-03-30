package X;

import com.google.common.base.Strings;

/* renamed from: X.0y5  reason: invalid class name and case insensitive filesystem */
public abstract class C20740y5 {
    public static String A00(int i, int i2, String str) {
        Object[] objArr;
        String str2;
        if (i < 0) {
            objArr = new Object[]{str, Integer.valueOf(i)};
            str2 = "%s (%s) must not be negative";
        } else if (i2 >= 0) {
            objArr = new Object[]{str, Integer.valueOf(i), Integer.valueOf(i2)};
            str2 = "%s (%s) must not be greater than size (%s)";
        } else {
            StringBuilder sb = new StringBuilder(26);
            sb.append("negative size: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
        return Strings.A00(str2, objArr);
    }

    public static void A01(int i, int i2) {
        Object[] objArr;
        String str;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                objArr = new Object[]{"index", Integer.valueOf(i)};
                str = "%s (%s) must not be negative";
            } else if (i2 >= 0) {
                objArr = new Object[]{"index", Integer.valueOf(i), Integer.valueOf(i2)};
                str = "%s (%s) must be less than size (%s)";
            } else {
                StringBuilder sb = new StringBuilder(26);
                sb.append("negative size: ");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
            }
            throw new IndexOutOfBoundsException(Strings.A00(str, objArr));
        }
    }

    public static void A02(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(A00(i, i2, "index"));
        }
    }

    public static void A03(int i, int i2, int i3) {
        String str;
        if (i >= 0) {
            if (i2 >= i && i2 <= i3) {
                return;
            }
            if (i <= i3) {
                if (i2 < 0 || i2 > i3) {
                    str = A00(i2, i3, "end index");
                } else {
                    str = Strings.A00("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
                }
                throw new IndexOutOfBoundsException(str);
            }
        }
        str = A00(i, i3, "start index");
        throw new IndexOutOfBoundsException(str);
    }

    public static void A04(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException(String.valueOf(obj2));
        }
    }

    public static void A05(Object obj, String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(Strings.A00(str, obj));
        }
    }

    public static void A06(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }
}
