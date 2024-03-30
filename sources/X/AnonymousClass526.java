package X;

/* renamed from: X.526  reason: invalid class name */
public final class AnonymousClass526 extends C1511278i {
    public final AnonymousClass5UX error;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass526) && AnonymousClass00C.A0J(this.error, ((AnonymousClass526) obj).error));
    }

    public int hashCode() {
        return this.error.hashCode();
    }

    public AnonymousClass526(AnonymousClass5UX r1) {
        this.error = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("MetadataFetchFailed(error=");
        return AnonymousClass000.A0m(this.error, A0u);
    }
}
