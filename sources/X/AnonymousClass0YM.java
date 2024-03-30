package X;

import java.util.Locale;

/* renamed from: X.0YM  reason: invalid class name */
public abstract class AnonymousClass0YM {
    public static void A01(int i, int i2, String str, int i3) {
        if (i < i2) {
            Locale locale = Locale.US;
            Object[] objArr = new Object[3];
            objArr[0] = str;
            AnonymousClass000.A1L(objArr, i2, 1);
            AnonymousClass000.A1L(objArr, i3, 2);
            throw AnonymousClass001.A08(String.format(locale, "%s is out of range of [%d, %d] (too low)", objArr));
        } else if (i > i3) {
            Locale locale2 = Locale.US;
            Object[] objArr2 = new Object[3];
            objArr2[0] = str;
            AnonymousClass000.A1L(objArr2, i2, 1);
            AnonymousClass000.A1L(objArr2, i3, 2);
            throw AnonymousClass001.A08(String.format(locale2, "%s is out of range of [%d, %d] (too high)", objArr2));
        }
    }

    public static void A00(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void A02(Object obj, Object obj2) {
        if (obj == null) {
            throw AnonymousClass001.A0A(String.valueOf(obj2));
        }
    }

    public static void A03(boolean z, Object obj) {
        if (!z) {
            throw AnonymousClass001.A08(String.valueOf(obj));
        }
    }
}
