package X;

/* renamed from: X.5Hh  reason: invalid class name */
public final class AnonymousClass5Hh extends C108665Uk {
    public final Throwable throwable;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass5Hh) && AnonymousClass00C.A0J(this.throwable, ((AnonymousClass5Hh) obj).throwable));
    }

    public int hashCode() {
        return this.throwable.hashCode();
    }

    public AnonymousClass5Hh(Throwable th) {
        this.throwable = th;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Error(throwable=");
        return AnonymousClass000.A0m(this.throwable, A0u);
    }
}
