package X;

/* renamed from: X.53C  reason: invalid class name */
public final class AnonymousClass53C extends AnonymousClass66I {
    public final boolean A00;

    public AnonymousClass53C(boolean z) {
        super(z, false);
        this.A00 = z;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass53C) && this.A00 == ((AnonymousClass53C) obj).A00);
    }

    public int hashCode() {
        return C36341k9.A01(this.A00 ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Start(canStartCall=");
        return C36321k7.A0H(A0u, this.A00);
    }
}
