package X;

/* renamed from: X.6Oe  reason: invalid class name and case insensitive filesystem */
public final class C131216Oe {
    public int A00;

    public C131216Oe(int i) {
        this.A00 = 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C131216Oe) && this.A00 == ((C131216Oe) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("DeltaCounter(count=");
        return C36321k7.A0G(A0u, this.A00);
    }

    public C131216Oe() {
        this(0);
    }
}
