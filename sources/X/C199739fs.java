package X;

/* renamed from: X.9fs  reason: invalid class name and case insensitive filesystem */
public final class C199739fs {
    public final AnonymousClass9WI A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C199739fs) {
                C199739fs r5 = (C199739fs) obj;
                if (this.A01 != r5.A01 || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (C36341k9.A01(this.A01 ? 1 : 0) * 31) + AnonymousClass000.A0H(this.A00);
    }

    public C199739fs(AnonymousClass9WI r1, boolean z) {
        this.A01 = z;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ViewState(isLoading=");
        A0u.append(this.A01);
        A0u.append(", errorMessage=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }

    public C199739fs() {
        this((AnonymousClass9WI) null, false);
    }
}
