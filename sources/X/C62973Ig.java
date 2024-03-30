package X;

/* renamed from: X.3Ig  reason: invalid class name and case insensitive filesystem */
public final class C62973Ig {
    public final C188188zB A00;
    public final Throwable A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C62973Ig) {
                C62973Ig r5 = (C62973Ig) obj;
                if (this.A00 != r5.A00 || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, C36391kE.A0A(this.A00));
    }

    public C62973Ig(C188188zB r1, Throwable th) {
        this.A00 = r1;
        this.A01 = th;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("LoginWithPasskeyError(kind=");
        A0u.append(this.A00);
        A0u.append(", throwable=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
