package X;

import android.graphics.Typeface;

/* renamed from: X.6hI  reason: invalid class name and case insensitive filesystem */
public final class C138096hI implements C158877iO {
    public static final Typeface A00(AnonymousClass72W r1, String str, int i) {
        if (i == 0 && AnonymousClass00C.A0J(r1, AnonymousClass72W.A03) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int A00 = AnonymousClass5XW.A00(r1, i);
        if (str == null || str.length() == 0) {
            return Typeface.defaultFromStyle(A00);
        }
        return Typeface.create(str, A00);
    }

    public Typeface B4T(AnonymousClass72W r2, int i) {
        return A00(r2, (String) null, i);
    }

    public Typeface B4k(AnonymousClass72W r6, C95074jk r7, int i) {
        StringBuilder A0v;
        String str;
        String str2 = "sans-serif";
        int i2 = r6.A00 / 100;
        if (i2 >= 0) {
            if (i2 < 2) {
                A0v = AnonymousClass000.A0v("sans-serif");
                str = "-thin";
            } else if (i2 < 4) {
                A0v = AnonymousClass000.A0v("sans-serif");
                str = "-light";
            } else if (i2 != 4) {
                if (i2 == 5) {
                    A0v = AnonymousClass000.A0v("sans-serif");
                    str = "-medium";
                } else if (i2 >= 8 && i2 < 11) {
                    A0v = AnonymousClass000.A0v("sans-serif");
                    str = "-black";
                }
            }
            str2 = AnonymousClass000.A0q(str, A0v);
        }
        if (str2.length() != 0) {
            Typeface A00 = A00(r6, str2, i);
            if (!AnonymousClass00C.A0J(A00, Typeface.create(Typeface.DEFAULT, AnonymousClass5XW.A00(r6, i))) && !AnonymousClass00C.A0J(A00, A00(r6, (String) null, i)) && A00 != null) {
                return A00;
            }
        }
        return A00(r6, "sans-serif", i);
    }
}
