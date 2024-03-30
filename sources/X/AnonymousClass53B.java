package X;

/* renamed from: X.53B  reason: invalid class name */
public final class AnonymousClass53B extends AnonymousClass66I {
    public final boolean A00;

    public AnonymousClass53B(boolean z) {
        super(z, false);
        this.A00 = z;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass53B) && this.A00 == ((AnonymousClass53B) obj).A00);
    }

    public int hashCode() {
        return C36341k9.A01(this.A00 ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Leave(canLeaveCall=");
        return C36321k7.A0H(A0u, this.A00);
    }
}
