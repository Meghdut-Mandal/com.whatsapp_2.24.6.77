package X;

/* renamed from: X.6Bj  reason: invalid class name and case insensitive filesystem */
public final class C128216Bj {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C128216Bj) {
                C128216Bj r5 = (C128216Bj) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((C36341k9.A01(this.A00 ? 1 : 0) * 31) + C36341k9.A01(this.A01 ? 1 : 0)) * 31) + C36341k9.A01(this.A02 ? 1 : 0);
    }

    public C128216Bj(boolean z, boolean z2, boolean z3) {
        this.A00 = z;
        this.A01 = z2;
        this.A02 = z3;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PausedStateStatus(isPaused=");
        A0u.append(this.A00);
        A0u.append(", ndc=");
        A0u.append(this.A01);
        A0u.append(", npr=");
        return C36321k7.A0H(A0u, this.A02);
    }
}
