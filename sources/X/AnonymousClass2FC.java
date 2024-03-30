package X;

/* renamed from: X.2FC  reason: invalid class name */
public final class AnonymousClass2FC extends AnonymousClass2FD {
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass2FC) && this.A00 == ((AnonymousClass2FC) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    public AnonymousClass2FC(int i) {
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CancelSuccess(successCount=");
        return C36321k7.A0G(A0u, this.A00);
    }
}
