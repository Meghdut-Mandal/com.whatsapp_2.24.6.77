package X;

/* renamed from: X.6Ap  reason: invalid class name and case insensitive filesystem */
public final class C128036Ap {
    public final int A00;
    public final C134876bk A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C128036Ap) {
                C128036Ap r5 = (C128036Ap) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (AnonymousClass000.A0H(this.A01) * 31) + this.A00;
    }

    public C128036Ap(C134876bk r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("XFamilyCrosspostEligibilityCheckPayload(enforcedEncryptedUniqueId=");
        A0u.append(this.A01);
        A0u.append(", expTimeSec=");
        return C36321k7.A0G(A0u, this.A00);
    }
}
