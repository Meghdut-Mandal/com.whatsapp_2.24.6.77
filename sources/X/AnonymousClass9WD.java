package X;

/* renamed from: X.9WD  reason: invalid class name */
public final class AnonymousClass9WD {
    public final C135086c7 A00;
    public final C135086c7 A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass9WD) {
                AnonymousClass9WD r5 = (AnonymousClass9WD) obj;
                if (!AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A00, C36351kA.A05(this.A01, C36421kH.A04(this.A02)));
    }

    public AnonymousClass9WD(C135086c7 r1, C135086c7 r2, String str) {
        this.A02 = str;
        this.A01 = r1;
        this.A00 = r2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("InternationalActivationDateRange(credentialId=");
        A0u.append(this.A02);
        A0u.append(", startTs=");
        A0u.append(this.A01);
        A0u.append(", endTs=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
