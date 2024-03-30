package X;

/* renamed from: X.9fn  reason: invalid class name and case insensitive filesystem */
public final class C199689fn {
    public final C187938ym A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C199689fn) {
                C199689fn r5 = (C199689fn) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36391kE.A0A(this.A00) + C36341k9.A01(this.A01 ? 1 : 0);
    }

    public C199689fn(C187938ym r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CartRefreshDialogsConfig(cartRefreshResult=");
        A0u.append(this.A00);
        A0u.append(", promotionRemoved=");
        return C36321k7.A0H(A0u, this.A01);
    }

    public C199689fn() {
        this(C187938ym.NO_CHANGES, false);
    }
}
