package X;

/* renamed from: X.52D  reason: invalid class name */
public final class AnonymousClass52D extends AnonymousClass5UX {
    public final Throwable throwable;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass52D) && AnonymousClass00C.A0J(this.throwable, ((AnonymousClass52D) obj).throwable));
    }

    public int hashCode() {
        return this.throwable.hashCode();
    }

    public AnonymousClass52D(Throwable th) {
        this.throwable = th;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Error(throwable=");
        return AnonymousClass000.A0m(this.throwable, A0u);
    }
}
