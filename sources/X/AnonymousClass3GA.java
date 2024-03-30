package X;

import android.text.TextUtils;

/* renamed from: X.3GA  reason: invalid class name */
public final class AnonymousClass3GA {
    public final CharSequence A00;
    public final CharSequence A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass3GA r5 = (AnonymousClass3GA) obj;
            if (!TextUtils.equals(this.A00, r5.A00) || !TextUtils.equals(this.A01, r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A0J = AnonymousClass000.A0J(this.A00) * 31;
        CharSequence charSequence = this.A01;
        if (charSequence != null) {
            i = charSequence.hashCode();
        }
        return A0J + i;
    }

    public AnonymousClass3GA(CharSequence charSequence, CharSequence charSequence2) {
        this.A00 = charSequence;
        this.A01 = charSequence2;
    }
}
