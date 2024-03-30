package X;

/* renamed from: X.3JS  reason: invalid class name */
public final class AnonymousClass3JS {
    public final int A00;
    public final CharSequence A01;
    public final CharSequence A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3JS) {
                AnonymousClass3JS r5 = (AnonymousClass3JS) obj;
                if (this.A00 != r5.A00 || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36351kA.A05(this.A02, this.A00 * 31) + AnonymousClass000.A0H(this.A01);
    }

    public AnonymousClass3JS(CharSequence charSequence, CharSequence charSequence2, int i) {
        this.A00 = i;
        this.A02 = charSequence;
        this.A01 = charSequence2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BulletItemViewState(icon=");
        A0u.append(this.A00);
        A0u.append(", title=");
        A0u.append(this.A02);
        A0u.append(", subtitle=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
