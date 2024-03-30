package X;

import android.text.TextUtils;

/* renamed from: X.3Lu  reason: invalid class name and case insensitive filesystem */
public abstract class C63883Lu {
    public static int A00(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return 0;
        }
        return A01(charSequence, 0, charSequence.length());
    }

    public static int A01(CharSequence charSequence, int i, int i2) {
        int length = charSequence.length();
        if (i < 0 || i2 > length || i > i2) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = 0;
        if (length != 0) {
            AnonymousClass2MA r2 = new AnonymousClass2MA(charSequence);
            while (i < i2) {
                r2.A00 = i;
                i += r2.A03(C1898996a.A00(r2, false), i);
                i3++;
            }
        }
        return i3;
    }
}
