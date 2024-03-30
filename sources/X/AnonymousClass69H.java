package X;

import android.content.res.Resources;

/* renamed from: X.69H  reason: invalid class name */
public final class AnonymousClass69H {
    public final int A00;
    public final Resources.Theme A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass69H) {
                AnonymousClass69H r5 = (AnonymousClass69H) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36391kE.A0A(this.A01) + this.A00;
    }

    public AnonymousClass69H(Resources.Theme theme, int i) {
        this.A01 = theme;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Key(theme=");
        A0u.append(this.A01);
        A0u.append(", id=");
        return C36321k7.A0G(A0u, this.A00);
    }
}
