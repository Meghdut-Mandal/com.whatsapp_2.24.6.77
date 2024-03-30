package X;

/* renamed from: X.9WE  reason: invalid class name */
public final class AnonymousClass9WE {
    public final long A00;
    public final long A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass9WE) {
                AnonymousClass9WE r8 = (AnonymousClass9WE) obj;
                if (!(AnonymousClass00C.A0J(this.A02, r8.A02) && this.A01 == r8.A01 && this.A00 == r8.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36341k9.A02(this.A00, C36321k7.A00(this.A01, C36421kH.A04(this.A02)));
    }

    public AnonymousClass9WE(long j, String str, long j2) {
        this.A02 = str;
        this.A01 = j;
        this.A00 = j2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("InternationalActivationDetails(activationStatus=");
        A0u.append(this.A02);
        A0u.append(", startTs=");
        A0u.append(this.A01);
        A0u.append(", endTs=");
        return C36331k8.A0j(A0u, this.A00);
    }
}
