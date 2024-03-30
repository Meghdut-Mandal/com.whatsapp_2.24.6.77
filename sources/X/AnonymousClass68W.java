package X;

/* renamed from: X.68W  reason: invalid class name */
public final class AnonymousClass68W {
    public final long A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass68W) && this.A00 == ((AnonymousClass68W) obj).A00);
    }

    public int hashCode() {
        return AnonymousClass000.A08(this.A00);
    }

    public AnonymousClass68W(long j) {
        this.A00 = j;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("RenderSummary(createdAt=");
        return C36331k8.A0j(A0u, this.A00);
    }
}
