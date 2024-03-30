package X;

/* renamed from: X.6BH  reason: invalid class name */
public final class AnonymousClass6BH {
    public final int A00;
    public final C1278769z A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6BH) {
                AnonymousClass6BH r5 = (AnonymousClass6BH) obj;
                if (!(this.A00 == r5.A00 && AnonymousClass00C.A0J(this.A01, r5.A01) && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36351kA.A05(this.A01, this.A00 * 31) + C36341k9.A01(this.A02 ? 1 : 0);
    }

    public AnonymousClass6BH(C1278769z r1, int i, boolean z) {
        this.A00 = i;
        this.A01 = r1;
        this.A02 = z;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ButtonState(res=");
        A0u.append(this.A00);
        A0u.append(", accessibilityProvider=");
        A0u.append(this.A01);
        A0u.append(", enabled=");
        return C36321k7.A0H(A0u, this.A02);
    }
}
