package X;

/* renamed from: X.3Ht  reason: invalid class name and case insensitive filesystem */
public final class C62843Ht {
    public final C51162nN A00;
    public final C51742oJ A01;

    public C62843Ht(C51162nN r2, C51742oJ r3) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
        this.A01 = r3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C62843Ht) {
                C62843Ht r5 = (C62843Ht) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static void A00(C001600r r1, C51162nN r2, C51742oJ r3) {
        r1.A0C(new C62843Ht(r2, r3));
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, C36391kE.A0A(this.A00));
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AllowNonAdminSubgroupCreationUiState(permission=");
        A0u.append(this.A00);
        A0u.append(", requestStatus=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
