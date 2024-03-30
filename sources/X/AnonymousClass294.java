package X;

/* renamed from: X.294  reason: invalid class name */
public final class AnonymousClass294 extends C53262r2 {
    public final boolean A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass294) && this.A00 == ((AnonymousClass294) obj).A00);
    }

    public int hashCode() {
        return C36341k9.A01(this.A00 ? 1 : 0);
    }

    public AnonymousClass294(boolean z) {
        this.A00 = z;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("NewUser(isDeleted=");
        return C36321k7.A0H(A0u, this.A00);
    }

    public AnonymousClass294() {
        this(false);
    }
}
