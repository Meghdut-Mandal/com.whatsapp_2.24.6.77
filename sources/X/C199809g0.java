package X;

/* renamed from: X.9g0  reason: invalid class name and case insensitive filesystem */
public final class C199809g0 {
    public final AnonymousClass9WH A00;
    public final C207049uT A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C199809g0) {
                C199809g0 r5 = (C199809g0) obj;
                if (this.A02 != r5.A02 || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((C36341k9.A01(this.A02 ? 1 : 0) * 31) + AnonymousClass000.A0H(this.A00)) * 31) + C36411kG.A09(this.A01);
    }

    public C199809g0(AnonymousClass9WH r1, C207049uT r2, boolean z) {
        this.A02 = z;
        this.A00 = r1;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ViewState(isLoading=");
        A0u.append(this.A02);
        A0u.append(", errorMessage=");
        A0u.append(this.A00);
        A0u.append(", methodDetailsState=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }

    public C199809g0() {
        this((AnonymousClass9WH) null, (C207049uT) null, false);
    }
}
