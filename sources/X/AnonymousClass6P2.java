package X;

/* renamed from: X.6P2  reason: invalid class name */
public final class AnonymousClass6P2 {
    public final boolean A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6P2) {
                AnonymousClass6P2 r5 = (AnonymousClass6P2) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (C36341k9.A01(this.A01 ? 1 : 0) * 31) + C36341k9.A01(this.A00 ? 1 : 0);
    }

    public AnonymousClass6P2(boolean z, boolean z2) {
        this.A01 = z;
        this.A00 = z2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("DialogConfig(shouldReshowAfterResume=");
        A0u.append(this.A01);
        A0u.append(", shouldDismissOnAvSwitch=");
        return C36321k7.A0H(A0u, this.A00);
    }

    public AnonymousClass6P2() {
        this(false, true);
    }
}
