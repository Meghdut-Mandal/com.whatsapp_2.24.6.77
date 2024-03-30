package X;

import android.os.Build;

/* renamed from: X.3TB  reason: invalid class name */
public abstract class AnonymousClass3TB {
    public static int A00(CharSequence charSequence) {
        AnonymousClass2MA r8 = new AnonymousClass2MA(charSequence);
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            r8.A00 = i;
            long A00 = C1898996a.A00(r8, false);
            if (A00 != -1) {
                i += r8.A02(A00, i);
                i2++;
                if (i2 > 3) {
                }
            }
            return 0;
        }
        return i2;
    }

    public static String A02(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        AnonymousClass2MA r6 = new AnonymousClass2MA(charSequence);
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            r6.A00 = i;
            long A00 = C1898996a.A00(r6, false);
            int A03 = r6.A03(A00, i);
            if (Build.VERSION.SDK_INT >= 23 || A00 == -1 || ((int) (A00 & 15)) <= 1) {
                A0u.append(charSequence.subSequence(i, i + A03));
            } else {
                A0u.append(9633);
            }
            i += A03;
        }
        return A0u.toString();
    }

    public static void A04(String str, int i) {
        AnonymousClass2MA r8 = new AnonymousClass2MA(str);
        int i2 = 0;
        int i3 = 0;
        while (i2 < str.length() && i3 < i) {
            r8.A00 = i2;
            long A00 = C1898996a.A00(r8, false);
            if (A00 != -1) {
                i3++;
            }
            i2 += r8.A03(A00, i2);
        }
        str.substring(0, i2);
    }

    public static CharSequence A01(CharSequence charSequence, int i, int i2, int i3) {
        int length = charSequence.length();
        if (i < 0 || i2 > length || i > i2) {
            throw new IndexOutOfBoundsException();
        }
        AnonymousClass2MA r4 = new AnonymousClass2MA(charSequence);
        int i4 = 0;
        int i5 = i;
        while (i5 < i2) {
            r4.A00 = i5;
            i5 += r4.A03(C1898996a.A00(r4, false), i5);
            i4++;
            if (i4 >= i3) {
                return charSequence.subSequence(i, i5);
            }
        }
        return null;
    }

    public static String A03(CharSequence charSequence) {
        StringBuilder A0u = AnonymousClass000.A0u();
        AnonymousClass2MA r10 = new AnonymousClass2MA(charSequence);
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            r10.A00 = i;
            long A00 = C1898996a.A00(r10, false);
            int A03 = r10.A03(A00, i);
            if (A00 != -1) {
                for (int i2 = 0; i2 < ((int) (A00 & 15)); i2++) {
                    A0u.append(' ');
                }
            } else {
                A0u.append(charSequence.subSequence(i, i + A03));
            }
            i += A03;
        }
        return A0u.toString();
    }
}
