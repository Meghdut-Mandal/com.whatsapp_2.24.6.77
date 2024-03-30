package X;

/* renamed from: X.9VZ  reason: invalid class name */
public final class AnonymousClass9VZ {
    public final long A00;
    public final long A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass9VZ) {
                AnonymousClass9VZ r8 = (AnonymousClass9VZ) obj;
                if (!(this.A01 == r8.A01 && this.A00 == r8.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36341k9.A02(this.A00, C90464aC.A08(this.A01));
    }

    public AnonymousClass9VZ(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("NewsletterEditMetaNode(newsletterOriginalMessageMs=");
        A0u.append(this.A01);
        A0u.append(", newsletterMessageEditMs=");
        return C36331k8.A0j(A0u, this.A00);
    }
}
