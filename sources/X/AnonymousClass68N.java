package X;

/* renamed from: X.68N  reason: invalid class name */
public final class AnonymousClass68N {
    public final long A00;

    public boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof AnonymousClass68N) || j != ((AnonymousClass68N) obj).A00) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A08(this.A00);
    }

    public String toString() {
        long j = this.A00;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PointerId(value=");
        return C36331k8.A0j(A0u, j);
    }

    public /* synthetic */ AnonymousClass68N(long j) {
        this.A00 = j;
    }
}
