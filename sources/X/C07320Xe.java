package X;

/* renamed from: X.0Xe  reason: invalid class name and case insensitive filesystem */
public abstract class C07320Xe {
    public static String A00(int i, int i2, String str) {
        Object[] objArr;
        String str2;
        if (i < 0) {
            objArr = new Object[2];
            objArr[0] = str;
            AnonymousClass000.A1L(objArr, i, 1);
            str2 = "%s (%s) must not be negative";
        } else if (i2 >= 0) {
            objArr = new Object[3];
            objArr[0] = str;
            AnonymousClass000.A1L(objArr, i, 1);
            AnonymousClass000.A1L(objArr, i2, 2);
            str2 = "%s (%s) must not be greater than size (%s)";
        } else {
            throw AnonymousClass000.A0d("negative size: ", AnonymousClass000.A0u(), i2);
        }
        return AnonymousClass0QX.A00(str2, objArr);
    }

    public static void A01(int i, int i2) {
        Object[] objArr;
        String str;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                objArr = new Object[2];
                objArr[0] = "index";
                AnonymousClass000.A1L(objArr, i, 1);
                str = "%s (%s) must not be negative";
            } else if (i2 < 0) {
                throw AnonymousClass000.A0d("negative size: ", AnonymousClass000.A0u(), i2);
            } else {
                objArr = new Object[3];
                objArr[0] = "index";
                AnonymousClass000.A1L(objArr, i, 1);
                AnonymousClass000.A1L(objArr, i2, 2);
                str = "%s (%s) must be less than size (%s)";
            }
            throw new IndexOutOfBoundsException(AnonymousClass0QX.A00(str, objArr));
        }
    }

    public static void A02(int i, int i2, int i3) {
        String str;
        if (i >= 0) {
            if (i2 >= i && i2 <= i3) {
                return;
            }
            if (i <= i3) {
                if (i2 < 0 || i2 > i3) {
                    str = A00(i2, i3, "end index");
                } else {
                    Object[] A0M = AnonymousClass001.A0M();
                    AnonymousClass000.A1L(A0M, i2, 0);
                    AnonymousClass000.A1L(A0M, i, 1);
                    str = AnonymousClass0QX.A00("end index (%s) must not be less than start index (%s)", A0M);
                }
                throw new IndexOutOfBoundsException(str);
            }
        }
        str = A00(i, i3, "start index");
        throw new IndexOutOfBoundsException(str);
    }
}
