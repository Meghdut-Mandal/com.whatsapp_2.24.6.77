package X;

import android.text.SpannableStringBuilder;

/* renamed from: X.1lz  reason: invalid class name and case insensitive filesystem */
public final class C37201lz extends SpannableStringBuilder {
    public char charAt(int i) {
        if (i < 0 || i >= length()) {
            return ' ';
        }
        return super.charAt(i);
    }

    public void getChars(int i, int i2, char[] cArr, int i3) {
        int length;
        if (i2 >= i && i <= (length = length()) && i2 <= length && i >= 0 && i2 >= 0) {
            super.getChars(i, i2, cArr, i3);
        }
    }

    public C37201lz(CharSequence charSequence) {
        super(charSequence);
    }
}
