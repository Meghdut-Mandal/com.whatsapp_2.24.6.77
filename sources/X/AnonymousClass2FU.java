package X;

/* renamed from: X.2FU  reason: invalid class name */
public final class AnonymousClass2FU extends C53682ri {
    public final boolean A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass2FU) && this.A00 == ((AnonymousClass2FU) obj).A00);
    }

    public int hashCode() {
        return C36341k9.A01(this.A00 ? 1 : 0);
    }

    public AnonymousClass2FU(boolean z) {
        this.A00 = z;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("QrDataExpiredState(expired=");
        return C36321k7.A0H(A0u, this.A00);
    }
}
