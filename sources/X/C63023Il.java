package X;

/* renamed from: X.3Il  reason: invalid class name and case insensitive filesystem */
public final class C63023Il {
    public boolean A00;
    public boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C63023Il) {
                C63023Il r5 = (C63023Il) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (C36341k9.A01(this.A00 ? 1 : 0) * 31) + C36341k9.A01(this.A01 ? 1 : 0);
    }

    public C63023Il(boolean z, boolean z2) {
        this.A00 = z;
        this.A01 = z2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("XFamilyCrosspostContextualViewState(isVisible=");
        A0u.append(this.A00);
        A0u.append(", shouldAnimate=");
        return C36321k7.A0H(A0u, this.A01);
    }
}
