package X;

/* renamed from: X.2FI  reason: invalid class name */
public final class AnonymousClass2FI extends AnonymousClass2FD {
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass2FI) && this.A00 == ((AnonymousClass2FI) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    public AnonymousClass2FI(int i) {
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("RejectSuccess(successCount=");
        return C36321k7.A0G(A0u, this.A00);
    }
}
