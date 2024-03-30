package X;

/* renamed from: X.3HT  reason: invalid class name */
public final class AnonymousClass3HT {
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass3HT) && this.A00 == ((AnonymousClass3HT) obj).A00);
    }

    public int hashCode() {
        return this.A00 * 31;
    }

    public AnonymousClass3HT(int i) {
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ScrollByState(distancePx=");
        A0u.append(this.A00);
        A0u.append(", durationMs=");
        return C36321k7.A0G(A0u, 0);
    }
}
