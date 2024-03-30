package X;

/* renamed from: X.6Oy  reason: invalid class name and case insensitive filesystem */
public final class C131416Oy {
    public final boolean A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C131416Oy) {
                C131416Oy r5 = (C131416Oy) obj;
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

    public C131416Oy(boolean z, boolean z2) {
        this.A00 = z;
        this.A01 = z2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("MultiDestinationAutoCrosspostingSetting(isFBAutoCrosspostOn=");
        A0u.append(this.A00);
        A0u.append(", isIGAutoCrosspostOn=");
        return C36321k7.A0H(A0u, this.A01);
    }

    public C131416Oy() {
        this(false, false);
    }
}
