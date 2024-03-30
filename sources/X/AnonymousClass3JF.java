package X;

import java.util.List;

/* renamed from: X.3JF  reason: invalid class name */
public final class AnonymousClass3JF {
    public final long A00;
    public final String A01;
    public final List A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3JF) {
                AnonymousClass3JF r8 = (AnonymousClass3JF) obj;
                if (!AnonymousClass00C.A0J(this.A02, r8.A02) || !AnonymousClass00C.A0J(this.A01, r8.A01) || this.A00 != r8.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36341k9.A02(this.A00, (C36391kE.A0A(this.A02) + C36341k9.A09(this.A01)) * 31);
    }

    public AnonymousClass3JF(String str, List list, long j) {
        this.A02 = list;
        this.A01 = str;
        this.A00 = j;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CachedDirectoryResults(newsletters=");
        A0u.append(this.A02);
        A0u.append(", nextPage=");
        A0u.append(this.A01);
        A0u.append(", validUntil=");
        return C36331k8.A0j(A0u, this.A00);
    }
}
