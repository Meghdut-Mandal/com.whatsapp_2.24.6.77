package X;

import android.text.InputFilter;
import android.text.Spanned;

/* renamed from: X.3Xf  reason: invalid class name and case insensitive filesystem */
public final class C66763Xf implements InputFilter {
    public final int A00;

    public C66763Xf(int i) {
        this.A00 = i;
    }

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int A01 = C63883Lu.A01(spanned, 0, spanned.length());
        int A012 = C63883Lu.A01(spanned, i3, i4);
        int A013 = C63883Lu.A01(charSequence, i, i2);
        int i5 = (this.A00 - A01) + A012;
        if (i5 <= 0) {
            return "";
        }
        if (i5 >= A013) {
            return null;
        }
        return AnonymousClass3TB.A01(charSequence, i, i2, i5);
    }
}
