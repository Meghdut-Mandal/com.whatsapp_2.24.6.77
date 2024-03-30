package X;

import java.util.List;

/* renamed from: X.56Z  reason: invalid class name */
public final class AnonymousClass56Z extends C110745bA {
    public final String A00;
    public final List A01;
    public final boolean A02;

    public AnonymousClass56Z(String str, List list, boolean z) {
        AnonymousClass00C.A0D(str, 2);
        this.A01 = list;
        this.A00 = str;
        this.A02 = z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass56Z) {
                AnonymousClass56Z r5 = (AnonymousClass56Z) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00) || this.A02 != r5.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36381kD.A08(this.A00, C36391kE.A0A(this.A01)) + C36341k9.A01(this.A02 ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ShowSearchResults(funStickers=");
        A0u.append(this.A01);
        A0u.append(", prompt=");
        A0u.append(this.A00);
        A0u.append(", cached=");
        return C36321k7.A0H(A0u, this.A02);
    }
}
