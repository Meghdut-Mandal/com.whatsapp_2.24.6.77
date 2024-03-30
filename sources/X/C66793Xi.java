package X;

import android.text.InputFilter;
import android.text.Spanned;

/* renamed from: X.3Xi  reason: invalid class name and case insensitive filesystem */
public final class C66793Xi implements InputFilter {
    public final int A00;
    public final int A01;

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        boolean z;
        C36341k9.A1E(charSequence, 0, spanned);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(spanned.subSequence(0, i3));
        A0u.append(charSequence.subSequence(i, i2));
        String A0o = AnonymousClass000.A0o(spanned.subSequence(i4, spanned.length()), A0u);
        Integer A03 = AnonymousClass097.A03(A0o);
        int i5 = this.A01;
        C15020mZ r2 = new C15020mZ(i5, this.A00);
        if (A03 == null) {
            z = false;
        } else if (!r2.A02(A03.intValue())) {
            return "";
        } else {
            z = true;
        }
        if (z || (A03 == null && A0o.length() == 1 && i5 < 0 && A0o.charAt(0) == '-')) {
            return null;
        }
        return "";
    }

    public C66793Xi(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public C66793Xi() {
        this(Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
}
