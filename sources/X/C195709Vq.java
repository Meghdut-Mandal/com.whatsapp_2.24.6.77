package X;

import android.text.SpannableString;

/* renamed from: X.9Vq  reason: invalid class name and case insensitive filesystem */
public final class C195709Vq {
    public final SpannableString A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195709Vq) {
                C195709Vq r5 = (C195709Vq) obj;
                if (this.A01 != r5.A01 || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (C36341k9.A01(this.A01 ? 1 : 0) * 31) + AnonymousClass000.A0H(this.A00);
    }

    public C195709Vq(SpannableString spannableString, boolean z) {
        this.A01 = z;
        this.A00 = spannableString;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PaymentOptionRichSubtext(shouldShowOptionSubtext=");
        A0u.append(this.A01);
        A0u.append(", subtextContent=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
