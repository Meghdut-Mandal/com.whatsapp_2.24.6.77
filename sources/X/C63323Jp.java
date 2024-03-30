package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.3Jp  reason: invalid class name and case insensitive filesystem */
public final class C63323Jp {
    public final Drawable A00;
    public final C51372ni A01;
    public final CharSequence A02;
    public final CharSequence A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C63323Jp) {
                C63323Jp r5 = (C63323Jp) obj;
                if (this.A01 != r5.A01 || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((C36391kE.A0A(this.A01) + AnonymousClass000.A0H(this.A00)) * 31) + AnonymousClass000.A0H(this.A03)) * 31) + C36411kG.A09(this.A02);
    }

    public C63323Jp(Drawable drawable, C51372ni r2, CharSequence charSequence, CharSequence charSequence2) {
        this.A01 = r2;
        this.A00 = drawable;
        this.A03 = charSequence;
        this.A02 = charSequence2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("HeaderViewState(headerSize=");
        A0u.append(this.A01);
        A0u.append(", headerImage=");
        A0u.append(this.A00);
        A0u.append(", headline=");
        A0u.append(this.A03);
        A0u.append(", description=");
        return AnonymousClass000.A0m(this.A02, A0u);
    }
}
