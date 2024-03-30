package X;

/* renamed from: X.2FB  reason: invalid class name */
public final class AnonymousClass2FB extends AnonymousClass2FD {
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass2FB) && this.A00 == ((AnonymousClass2FB) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    public AnonymousClass2FB(int i) {
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ApproveSuccess(successCount=");
        return C36321k7.A0G(A0u, this.A00);
    }
}
