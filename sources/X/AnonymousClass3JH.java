package X;

/* renamed from: X.3JH  reason: invalid class name */
public final class AnonymousClass3JH {
    public String A00 = null;
    public final C52622pt A01;
    public final boolean A02;

    public AnonymousClass3JH(C52622pt r3, boolean z) {
        AnonymousClass00C.A0D(r3, 1);
        this.A01 = r3;
        this.A02 = z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3JH) {
                AnonymousClass3JH r5 = (AnonymousClass3JH) obj;
                if (!(this.A01 == r5.A01 && this.A02 == r5.A02 && AnonymousClass00C.A0J(this.A00, r5.A00))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C36391kE.A0A(this.A01) + C36341k9.A01(this.A02 ? 1 : 0)) * 31) + C36341k9.A09(this.A00);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("NewsletterFilterViewItem(type=");
        A0u.append(this.A01);
        A0u.append(", isSelected=");
        A0u.append(this.A02);
        A0u.append(", countryIso=");
        return C36321k7.A0E(this.A00, A0u);
    }
}
